/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Carlos
 */
@WebServlet(name = "DatosUsuario", urlPatterns = {"/DatosUsuario"})
public class DatosUsuario extends HttpServlet {

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
            
            //datos usuario
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String matricula = request.getParameter("matricula");
            String run = request.getParameter("run");
            String pga = request.getParameter("pga");
            String sexo = request.getParameter("sexo");
            String nacionalidad = request.getParameter("nacionalidad");
            String telefono = request.getParameter("telefono");
            String fechaNac = request.getParameter("fechaNac");
            String email = request.getParameter("email");
            //datos domicilio
            String paisResidencia= request.getParameter("paisRes");
            String ciudad = request.getParameter("ciudad");
            String comuna = request.getParameter("comuna");
            String calle = request.getParameter("calle");
            String tipoDom = request.getParameter("tipoVivienda");
            String num = request.getParameter("numDom");
            //datos academicos
            String nomUniv = request.getParameter("nombreUniv");
            String nomCarr = request.getParameter("nombreCarr");
            String cantSem = request.getParameter("cantSem");
            
            System.out.println(nombre);
            System.out.println(apellido);
            System.out.println(matricula);
            System.out.println(run);
            System.out.println(pga);
            System.out.println(sexo);
            System.out.println(nacionalidad);
            System.out.println(telefono);
            System.out.println(fechaNac);
            System.out.println(email);
            System.out.println("");
            System.out.println(paisResidencia);
            System.out.println(ciudad);
            System.out.println(comuna);
            System.out.println(calle);
            System.out.println(tipoDom);
            System.out.println(num);
            System.out.println("");
            System.out.println(nomUniv);
            System.out.println(nomCarr);
            System.out.println(cantSem);
            
            RequestDispatcher dispatcher = request.getRequestDispatcher("Principal.html");
            dispatcher.forward(request, response);
            
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
