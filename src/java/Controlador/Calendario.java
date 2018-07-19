/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import clases.Evento;
import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Carlos
 */
@WebServlet(name = "calendario", urlPatterns = {"/calendario"})
public class Calendario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
         
            String color = request.getParameter("color");
            String anotacion = request.getParameter("content");
            String año = request.getParameter("anio");
            String mes = request.getParameter("mes");
            String dia = request.getParameter("dia");

            Evento f = new Evento();
            
            f.setColor(color);
            f.setContent(anotacion);  
            f.setAño(Integer.valueOf(año));
            f.setMes(Integer.valueOf(mes));
            f.setDia(Integer.valueOf(dia));

            
        }
    }
    
    public void generarJsonFechas(ArrayList<Evento> a) {
        Gson g = new Gson();
        try {
            FileWriter file = new FileWriter("fechas.json");
            file.write("var fechas='[");
            for (int i = 0; i < a.size(); i++) {
                if (i != a.size() - 1) {
                    file.write(g.toJson(a.get(i)) + ",");
                } else {
                    file.write(g.toJson(a.get(i)) + "]';");
                }
                file.flush();
            }

            file.close();
        } catch (IOException ex) {

        }
    }

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
        processRequest(request, response);
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
        processRequest(request, response);
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