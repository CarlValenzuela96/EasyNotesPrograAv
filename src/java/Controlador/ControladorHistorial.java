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
            throws ServletException, IOException {
        String ruta = request.getServletPath();
        RequestDispatcher dispatcher;
        GetDatos g;

        switch (ruta) {
            case "/mostrarHistorial":
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
//                ArrayList<Ramo> r = g.getRamosUser(hist.getSemestreidSemestre().getIdSemestre());
                Ramo[] r = g.getRamosUser(hist.getSemestreidSemestre().getIdSemestre());
                
                request.setAttribute("año", hist.getAño());
                request.setAttribute("sem", hist.getSemestre());
                request.setAttribute("ramosHist", r);
                dispatcher = request.getRequestDispatcher("Historial.jsp");
                dispatcher.forward(request, response);
                break;
            case "/convertirPDF":;
                break;
            case "/graficar":;
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
