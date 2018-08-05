/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Querys.DropByID;
import Querys.GetDatos;
import Querys.InsertarDatos;
import clases.NotasPractico;
import clases.NotasTeorico;
import clases.Ramo;
import clases.RamoDAO;
import clases.Semestre;
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
public class ControladorRamo extends HttpServlet {

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
        String ruta = request.getServletPath();
        Semestre sem;
        RequestDispatcher dispatcher;
        GetDatos g;

        //notas y ponderaciones ramosimple
        ArrayList<Double> listaNotas;
        ArrayList<Double> listaPond;

        //notas y ponderaciones ramoMixto
        ArrayList<Double> listaNotasT;
        ArrayList<Double> listaPondT;
        ArrayList<Double> listaNotasP;
        ArrayList<Double> listaPondP;

        switch (ruta) {
            case "/agregarRamo":

                String nombreR = request.getParameter("nomAsign");
                String codRamo = request.getParameter("cod");
                String tipoRamo = request.getParameter("tipoAprob");
                String pondNT = request.getParameter("pondNT");
                String pondNP = request.getParameter("pondNP");
                String cantNT = request.getParameter("cantNT");
                String cantNP = request.getParameter("cantNP");
                String horasSem = request.getParameter("horasSem");

                session = (HttpSession) request.getSession();
                sem = (Semestre) session.getAttribute("semestreActivo");
                g = new GetDatos();
                String tipo = "";
                switch (Integer.valueOf(tipoRamo)) {
                    case 1:
                        tipo = "Teórico - Práctico en conjunto";
                        break;
                    case 2:
                        tipo = "Teórico - Práctico por separado";
                        break;
                    case 3:
                        tipo = "Solo Teórico";
                        break;
                    case 4:
                        tipo = "Solo Práctico";
                        break;
                }

                Ramo ramoUser = g.getRamoPorNombre(sem.getIdSemestre(), nombreR);
                boolean exist = false;
                if (ramoUser != null) {
                    exist = true;
                }

                if (!exist) {
                    agregarRamo(nombreR, codRamo, tipo, cantNT, cantNP, pondNT, pondNP, horasSem, sem);

                    Ramo notasRamo = g.getRamoPorNombre(sem.getIdSemestre(), nombreR);

                    for (int i = 0; i < Integer.valueOf(cantNP); i++) {
                        try {
                            agregarNotas("P", 1, 1, notasRamo);
                        } catch (PersistentException ex) {
                            Logger.getLogger(ControladorRamo.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                    for (int i = 0; i < Integer.valueOf(cantNT); i++) {
                        try {
                            agregarNotas("T", 1, 1, notasRamo);
                        } catch (PersistentException ex) {
                            Logger.getLogger(ControladorRamo.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                    response.sendRedirect("Principal.jsp");
                } else {
                    //validar que pasa si existe el ramo
                    response.sendRedirect("Principal.jsp");
                }

                ;
                break;
            case "/borrarRamo":
                String pos = request.getParameter("ramo");
                borrarRamo(pos);

                response.sendRedirect("Principal.jsp");
                ;
                break;
            case "/infoRamos":
                String opcRamo = request.getParameter("opcRamo");
                session = (HttpSession) request.getSession();
                listaNotas = new ArrayList<>();
                listaPond = new ArrayList<>();

                listaNotasT = new ArrayList<>();
                listaPondT = new ArrayList<>();
                listaNotasP = new ArrayList<>();
                listaPondP = new ArrayList<>();

                if (opcRamo.equals("0")) {
                    response.sendRedirect("Principal.jsp");
                } else {
                    String ramo = request.getParameter("ramo");
                    g = new GetDatos();
                    Ramo r = null;
                    {
                        try {
                            r = RamoDAO.getRamoByORMID(Integer.parseInt(ramo));

                        } catch (PersistentException ex) {
                            Logger.getLogger(ControladorRamo.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                    request.setAttribute("asign", r);
                    session.setAttribute("asign", r);
                    ArrayList<NotasPractico> np;
                    ArrayList<NotasTeorico> nt;

                    if (r.getTipoAprobacion().equals("Teórico - Práctico en conjunto") || r.getTipoAprobacion().equals("Teórico - Práctico por separado")) {
                        nt = g.getNotasTeorica(r.getIdRamo());

                        for (int i = 0; i < nt.size(); i++) {
                            listaNotasT.add(nt.get(i).getNotaTeorica());
                            listaPondT.add(nt.get(i).getPondTeorica());
                        }

                        request.setAttribute("notasT", listaNotasT);
                        request.setAttribute("pondT", listaPondT);

                        np = g.getNotasPracticas(r.getIdRamo());

                        for (int i = 0; i < np.size(); i++) {
                            listaNotasP.add(np.get(i).getNotaPractica());
                            listaPondP.add(np.get(i).getPondPractico());
                        }

                        request.setAttribute("notasP", listaNotasP);
                        request.setAttribute("pondP", listaPondP);

                        if (r.getTipoAprobacion().equals("Teórico - Práctico por separado")) {
                            request.setAttribute("visible", "visibility:hidden;");
                        } else {
                            request.setAttribute("visible", "");
                        }

                        dispatcher = request.getRequestDispatcher("RamoMixto.jsp");
                        dispatcher.forward(request, response);

                    } else {

                        if (r.getTipoAprobacion().equals("Solo Teórico")) {

                            nt = g.getNotasTeorica(r.getIdRamo());

                            for (int i = 0; i < nt.size(); i++) {
                                listaNotas.add(nt.get(i).getNotaTeorica());
                                listaPond.add(nt.get(i).getPondTeorica());
                            }

                            request.setAttribute("notas", listaNotas);
                            request.setAttribute("pond", listaPond);

                            request.setAttribute("tip", "Teórico");
                            request.setAttribute("cantN", r.getCantNotasTeoricas());

                        } else {

                            np = g.getNotasPracticas(r.getIdRamo());

                            for (int i = 0; i < np.size(); i++) {
                                listaNotas.add(np.get(i).getNotaPractica());
                                listaPond.add(np.get(i).getPondPractico());
                            }

                            request.setAttribute("notas", listaNotas);
                            request.setAttribute("pond", listaPond);

                            request.setAttribute("tip", "Practico");
                            request.setAttribute("cantN", r.getCantNotasPracticas());

                        }

                        dispatcher = request.getRequestDispatcher("RamoSimple.jsp");
                        dispatcher.forward(request, response);
                    }
                }
                break;
        }

    }

    public void agregarRamo(String nombre, String cod, String tipo, String cantNT, String cantNP, String pondNT, String pondNP, String horasSem, Semestre sem) {
        InsertarDatos ins = new InsertarDatos();
        ins.addRamo(nombre, Integer.parseInt(cod), tipo, Integer.parseInt(cantNT), Integer.parseInt(cantNP), Double.parseDouble(pondNT),
                Double.parseDouble(pondNP), Integer.parseInt(horasSem), sem);
    }

    public void agregarNotas(String tipo, double nota, double pond, Ramo ramo) throws PersistentException {
        InsertarDatos ins = new InsertarDatos();
        if (tipo.equals("T")) {
            ins.addNotasTeorico(nota, pond, RamoDAO.getRamoByORMID(ramo.getIdRamo()));
        } else if (tipo.equals("P")) {
            ins.addNotasPractico(nota, pond, RamoDAO.getRamoByORMID(ramo.getIdRamo()));
        }

    }

    public void borrarRamo(String idRamo) {
        DropByID drop = new DropByID();
        drop.dropRamo(idRamo);
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
