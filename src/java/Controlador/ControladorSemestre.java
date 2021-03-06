/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Querys.DropByID;
import Querys.GetDatos;
import Querys.InsertarDatos;
import Querys.UpdateData;
import clases.Evento;
import clases.Ramo;
import clases.Semestre;
import clases.SemestreDAO;
import clases.Usuario;
import clases.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.orm.PersistentException;

/**
 *
 * @author Carlos
 */
public class ControladorSemestre extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String ruta = request.getServletPath();
        HttpSession session;
        RequestDispatcher dispatcher;
        Usuario user;
        GetDatos g;
        Semestre sem;

//        ArrayList<Evento> eUser;
        Evento[] eUser;
        ArrayList<String> listaAños;
        ArrayList<String> listaHoras;
        //ArrayList<Ramo> ramos;
        Ramo[] ramos;

        switch (ruta) {
            case "/agregarSemestre":
                session = (HttpSession) request.getSession();

                user = (Usuario) session.getAttribute("usuario");

                String año = request.getParameter("anio");
                String numSem = request.getParameter("numSem");
                String cantRamos = request.getParameter("cantRamos");
                String cantHoras = request.getParameter("cantHoras");
                int estado = 1;

                 {
                    try {
                        agregarSemestre(user, numSem, año, cantRamos, cantHoras, estado);
                    } catch (PersistentException ex) {
                        Logger.getLogger(ControladorSemestre.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                g = new GetDatos();

                sem = g.getSemActivo(user.getIdUsuario());
                session.setAttribute("semestreActivo", sem);

                eUser = g.getEventosUser(sem.getIdSemestre());
                request.setAttribute("jsonFechas", eUser);

                response.sendRedirect("Principal.jsp");
                break;
            case "/borrarSemestre":
                session = (HttpSession) request.getSession();
                sem = (Semestre) session.getAttribute("semestreActivo");
                borrarSemestre(String.valueOf(sem.getIdSemestre()));

                listaAños = listaAños();
                listaHoras = listaHoras();
                request.setAttribute("años", listaAños);
                request.setAttribute("horas", listaHoras);
                request.setAttribute("msg", "");
                dispatcher = request.getRequestDispatcher("AgregarSemestre.jsp");
                dispatcher.forward(request, response);
                ;
                break;

            case "/reiniciarSemestre":
                session = (HttpSession) request.getSession();
                sem = (Semestre) session.getAttribute("semestreActivo");
                g = new GetDatos();

                ramos = g.getRamosUser(sem.getIdSemestre());
                eUser = g.getEventosUser(sem.getIdSemestre());

                borrarRamos(ramos);
                borrarEventos(eUser);

                response.sendRedirect("Principal.jsp");
                ;
                break;
            case "/archivarSemestre":
                session = (HttpSession) request.getSession();

                sem = (Semestre) session.getAttribute("semestreActivo");

                 {
                    try {
                        archivarSem(sem);
                    } catch (PersistentException ex) {
                        Logger.getLogger(ControladorSemestre.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                listaAños = listaAños();
                listaHoras = listaHoras();
                request.setAttribute("años", listaAños);
                request.setAttribute("horas", listaHoras);
                request.setAttribute("msg", "");
                dispatcher = request.getRequestDispatcher("AgregarSemestre.jsp");
                dispatcher.forward(request, response);
                break;
        }
    }

    /**
     * Método para agregar un nuevo semestre al usuario de la sesión.
     *
     * @param user id del usuario de la sesión.
     * @param numSem número del semestre.
     * @param año año del semestre.
     * @param cantRamos cantidad de ramos impartidos en el semestre.
     * @param cantHoras cantidad de horas semanales del semestre.
     * @param estado estado del semestre (por defecto = 1).
     * @throws PersistentException
     */
    public void agregarSemestre(Usuario user, String numSem, String año, String cantRamos, String cantHoras, int estado) throws PersistentException {
        InsertarDatos ins = new InsertarDatos();
        ins.addSemestre(Integer.valueOf(numSem), Integer.valueOf(año), Integer.valueOf(cantRamos), Integer.valueOf(cantHoras), estado, UsuarioDAO.getUsuarioByORMID(user.getIdUsuario()));
    }

    /**
     * Método para eliminar semestre por id.
     *
     * @param id id del semestre a eliminar.
     */
    public void borrarSemestre(String id) {
        DropByID d = new DropByID();
        d.dropSemestre(id);
    }

    /**
     * Método para archivar semestre actual, actualizando el valor actual de su
     * estado.
     *
     * @param sem semestre a archivar.
     * @throws PersistentException excepción del caso.
     */
    public void archivarSem(Semestre sem) throws PersistentException {

        UpdateData u = new UpdateData();
        u.updateSemestre(sem.getIdSemestre(), null, null, null, null, "0", null);

        InsertarDatos i = new InsertarDatos();
        i.addHistorial(sem.getNumeroSemestre(), sem.getAñoSemestre(), SemestreDAO.getSemestreByORMID(sem.getIdSemestre()));

    }

    /**
     * Método para listar año.
     *
     * @return arreglo de años.
     */
    public ArrayList<String> listaAños() {
        ArrayList<String> list = new ArrayList<>();
        LocalDate ahora = LocalDate.now();

        for (int i = 0; i < 100; i++) {
            list.add(String.valueOf(ahora.getYear() + i));
        }

        return list;
    }

    /**
     * Método para listar horas.
     *
     * @return arreglo de horas de ramos.
     */
    public ArrayList<String> listaHoras() {
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            list.add(String.valueOf(i));
        }
        return list;
    }
    
     /**
     * Método para borrar ramos del semestre actual.
     *
     * @param ramos arreglo de ramos a eliminar.
     */
    public void borrarRamos(Ramo[] ramos) {
        DropByID drop = new DropByID();
        for (int i = 0; i < ramos.length; i++) {

            drop.dropRamo(String.valueOf(ramos[i].getIdRamo()));
        }

    }
    
    /**
     *Método para borrar eventos del semestre actual
     * 
     * @param eUser arreglo de eventos a eliminar
     */
    public void borrarEventos(Evento[] eUser) {
        DropByID drop = new DropByID();
        for (int i = 0; i < eUser.length; i++) {
            drop.dropEvento(String.valueOf(eUser[i].getIdEvento()));
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
