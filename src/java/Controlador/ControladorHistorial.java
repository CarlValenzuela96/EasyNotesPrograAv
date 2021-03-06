/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Querys.GetDatos;
import clases.Historial;
import clases.HistorialDAO;
import clases.Ramo;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import org.apache.fop.apps.FOPException;
//import org.apache.fop.apps.FOPException;
import org.orm.PersistentException;

/**
 *
 * @author Carlos
 */
public class ControladorHistorial extends HttpServlet {

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
            throws ServletException, IOException, FileNotFoundException {
        String ruta = request.getServletPath();
        RequestDispatcher dispatcher;
        GetDatos g;
        Ramo[] r;
        Controlador c;
        HttpSession session;
        switch (ruta) {
            case "/mostrarHistorial":
                session = (HttpSession) request.getSession();
                String pos = request.getParameter("pos");
                Historial hist = null;
                 {
                    try {
                        hist = HistorialDAO.getHistorialByORMID(Integer.parseInt(pos));
                    } catch (PersistentException ex) {
                        Logger.getLogger(ControladorHistorial.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                g = new GetDatos();

                r = g.getRamosUser(hist.getSemestreidSemestre().getIdSemestre());

                request.setAttribute("año", hist.getAño());
                request.setAttribute("sem", hist.getSemestre());
                request.setAttribute("ramosHist", r);

                session.setAttribute("hist", hist);

                dispatcher = request.getRequestDispatcher("Historial.jsp");
                dispatcher.forward(request, response);
                break;
            case "/funcHistorial":
                String opc = request.getParameter("opc");
                g = new GetDatos();

                c = new Controlador();
                session = (HttpSession) request.getSession();
                hist = (Historial) session.getAttribute("hist");

                switch (opc) {
                    case "0":
                        response.sendRedirect("Principal.jsp");
                        break;
                    case "1":
                        r = g.getRamosUser(hist.getSemestreidSemestre().getIdSemestre());
//                      
                        //tread para crear pdf
                        Thread hilo = new ProcesoPDF("procesoPDF", r);
                        hilo.start();
                        response.sendRedirect("Principal.jsp");
                       
                        break;
                    case "2":
                        response.sendRedirect("Grafico.jsp");
                        ;
                        break;
                }

                ;
                break;
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
