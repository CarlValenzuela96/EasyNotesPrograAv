/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Querys.DropByID;
import Querys.InsertarDatos;
import clases.Semestre;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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

                String tipo = "";
                switch (Integer.valueOf(tipoRamo)) {
                    case 1:
                        tipo = "Teórico - Práctico en conjunto";
                        break;
                    case 2:
                        tipo = "Teórico - Practico por separado";
                        break;
                    case 3:
                        tipo = "Solo Teórico";
                        break;
                    case 4:
                        tipo = "Solo Práctico";
                        break;
                }

                agregarRamo(nombreR, codRamo, tipo, cantNT, cantNP, pondNT, pondNP, horasSem, sem);
                response.sendRedirect("Principal.jsp");
                ;
                break;
            case "/borrarRamo":
                String pos = request.getParameter("ramo");
                borrarRamo(pos);
                
                response.sendRedirect("Principal.jsp");
                ;
                break;
            case "/infoRamos":;
                break;
        }

    }

    public void agregarRamo(String nombre, String cod, String tipo, String cantNT, String cantNP, String pondNT, String pondNP, String horasSem, Semestre sem) {
        InsertarDatos ins = new InsertarDatos();
        ins.addRamo(nombre, Integer.parseInt(cod), tipo, Integer.parseInt(cantNT), Integer.parseInt(cantNP), Double.parseDouble(pondNT),
                Double.parseDouble(pondNP), Integer.parseInt(horasSem), sem);
    }

    public void borrarRamo(String idRamo){
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
