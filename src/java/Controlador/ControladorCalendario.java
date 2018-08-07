/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Querys.DropByID;
import Querys.GetDatos;
import Querys.InsertarDatos;
import clases.Evento;
import clases.Semestre;
import clases.SemestreDAO;
import clases.Usuario;
import clases.UsuarioDAO;
import java.io.IOException;
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
public class ControladorCalendario extends HttpServlet {

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

        HttpSession session;
        GetDatos g;
        Controlador c;
        Usuario user;
//        ArrayList<Evento> eUser;
        Evento[] eUser;
        Semestre semestre;

        String ruta = request.getServletPath();
        switch (ruta) {
            case "/agregarFecha":
                String opcAdd = request.getParameter("opc");

                if (opcAdd.equals("0")) {
                    response.sendRedirect("Principal.jsp");
                } else {
                    c = new Controlador();
                    g = new GetDatos();

                    session = (HttpSession) request.getSession();

                    String color = request.getParameter("color");
                    String anotacion = request.getParameter("asunt");
                    String fecha = request.getParameter("fecha");

                    Evento f = new Evento();

                    f.setColor(color);
                    f.setContent(anotacion);
                    f.setAño(Integer.valueOf(fecha.substring(0, 4)));
                    f.setMes(Integer.valueOf(fecha.substring(5, 7)));
                    f.setDia(Integer.valueOf(fecha.substring(8, 10)));

                    semestre = (Semestre) session.getAttribute("semestreActivo");
                    {
                        try {
                            agregarEvento(semestre, f);

                            eUser = g.getEventosUser(semestre.getIdSemestre());
                            String fechas = c.generarJsonFechas(eUser);

                            session.setAttribute("jsonFechas", fechas);
                            response.sendRedirect("Principal.jsp");
                        } catch (PersistentException ex) {
                            Logger.getLogger(ControladorCalendario.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                }

                break;

            case "/BorrarFecha":

                String pos = request.getParameter("fechas");
                c = new Controlador();
                session = (HttpSession) request.getSession();
                g = new GetDatos();

                borrarEvento(pos);

                semestre = (Semestre) session.getAttribute("semestreActivo");
                eUser = g.getEventosUser(semestre.getIdSemestre());

                String fechas = c.generarJsonFechas(eUser);

                session.setAttribute("jsonFechas", fechas);
                response.sendRedirect("Principal.jsp");
                ;
                break;

            case "/enviarEventos":

                String value = request.getParameter("add");

                if (value.equals("0")) {
                    response.sendRedirect("Agregar_Fecha.jsp");
                } else {

                    session = (HttpSession) request.getSession();
                    g = new GetDatos();

                    semestre = (Semestre) session.getAttribute("semestreActivo");

                    eUser = g.getEventosUser(semestre.getIdSemestre());

                    request.setAttribute("fechas", eUser);
                    RequestDispatcher dispatcher = request.getRequestDispatcher("EliminarFecha.jsp");
                    dispatcher.forward(request, response);
                }

                ;
                break;
        }
    }

    /**
     * Método para agregar eventos al semestre actual.
     *
     * @param semestre semestre actual del usuario.
     * @param f evento a ingresar.
     * @throws PersistentException excepción del caso.
     */
    public void agregarEvento(Semestre semestre, Evento f) throws PersistentException {
        InsertarDatos i = new InsertarDatos();

        i.addEvento(f.getContent(), f.getAño(), f.getMes(), f.getDia(), f.getColor(), SemestreDAO.getSemestreByORMID(semestre.getIdSemestre()));
    }

    /**
     * Método para la eliminacion de evento.
     *
     * @param pos id de la columna de la tabla evento, a eliminar.
     */
    public void borrarEvento(String pos) {
        DropByID drop = new DropByID();
        drop.dropEvento(pos);

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
