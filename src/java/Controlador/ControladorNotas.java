/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Querys.GetDatos;
import Querys.InsertarDatos;
import Querys.UpdateData;
import clases.NotasPractico;
import clases.NotasTeorico;
import clases.NotasTeoricoDAO;
import clases.Ramo;
import clases.RamoDAO;
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
import javax.xml.ws.WebServiceRef;
import org.hibernate.LockMode;
import org.orm.PersistentException;
import promedio.CalcPromedios_Service;

/**
 *
 * @author Carlos
 */
public class ControladorNotas extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/PromediosAplication/CalcPromedios.wsdl")
    private CalcPromedios_Service service;

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
        GetDatos g;

        NotasTeorico[] nt;
        NotasPractico[] np;

        Ramo r;
        switch (ruta) {
            case "/guardarNotas":
                g = new GetDatos();
                session = (HttpSession) request.getSession();
                r = (Ramo) session.getAttribute("asign");
                String pos = request.getParameter("opc");

                if (pos.equals("0")) {
                    response.sendRedirect("Principal.jsp");
                } else {

                    if (r.getTipoAprobacion().equals("Solo Teórico")) {

                        nt = g.getNotasTeorica(r.getIdRamo());
                        for (int i = 0; i < nt.length; i++) {
                            System.out.println(nt[i].getIdNotaTeorica());

                            guardarNotaT(nt[i], request.getParameter("nota" + i), request.getParameter("pond" + i));

                        }
                    } else if (r.getTipoAprobacion().equals("Solo Práctico")) {
                        np = g.getNotasPracticas(r.getIdRamo());
                        for (int i = 0; i < np.length; i++) {
                            guardarNotaP(np[i], request.getParameter("nota" + i), request.getParameter("pond" + i));

                        }
                    } else if (r.getTipoAprobacion().equals("Teórico - Práctico en conjunto") || r.getTipoAprobacion().equals("Teórico - Práctico por separado")) {
                        nt = g.getNotasTeorica(r.getIdRamo());
                        for (int i = 0; i < nt.length; i++) {
                            System.out.println(request.getParameter("notaT" + i));
                            guardarNotaT(nt[i], request.getParameter("notaT" + i), request.getParameter("pondT" + i));

                        }
                        np = g.getNotasPracticas(r.getIdRamo());
                        for (int i = 0; i < np.length; i++) {
                            guardarNotaP(np[i], request.getParameter("notaP" + i), request.getParameter("pondP" + i));

                        }

                    }

                    response.sendRedirect("Principal.jsp");

                }

                ;
                break;
            case "/calcularProm":
                session = (HttpSession) request.getSession();
                String vista = "";
                r = (Ramo) session.getAttribute("asign");

                //notas y pond ramoSimple
                ArrayList<Double> ListaNotas = new ArrayList<>();
                ArrayList<Double> ListaPond = new ArrayList<>();
                //notas y pond ramoMixto
                ArrayList<Double> ListaNotasT = new ArrayList<>();
                ArrayList<Double> ListaPondT = new ArrayList<>();
                ArrayList<Double> ListaNotasP = new ArrayList<>();
                ArrayList<Double> ListaPondP = new ArrayList<>();

                if (r.getTipoAprobacion().equals("Solo Teórico")) {
                    for (int i = 0; i < r.getCantNotasTeoricas(); i++) {
                        ListaNotas.add(Double.valueOf(request.getParameter("nota" + i)));
                        ListaPond.add(Double.valueOf(request.getParameter("pond" + i)));

                    }
                    Double prom = calcProm(ListaNotas, ListaPond);

                    request.setAttribute("notas", ListaNotas);
                    request.setAttribute("pond", ListaPond);
                    request.setAttribute("tip", "Teórico");
                    request.setAttribute("prom", prom);

                    vista = "RamoSimple.jsp";

                } else if (r.getTipoAprobacion().equals("Solo Práctico")) {
                    for (int i = 0; i < r.getCantNotasPracticas(); i++) {
                        ListaNotas.add(Double.valueOf(request.getParameter("nota" + i)));
                        ListaPond.add(Double.valueOf(request.getParameter("pond" + i)));

                    }

                    Double prom = calcProm(ListaNotas, ListaPond);

                    request.setAttribute("notas", ListaNotas);
                    request.setAttribute("pond", ListaPond);
                    request.setAttribute("tip", "Práctico");
                    request.setAttribute("prom", prom);

                    vista = "RamoSimple.jsp";

                } else if (r.getTipoAprobacion().equals("Teórico - Práctico en conjunto") || r.getTipoAprobacion().equals("Teórico - Práctico por separado")) {

                    String promT = request.getParameter("promTeo");
                    String promP = request.getParameter("promPra");
                    
                    System.out.println(promT);
                    System.out.println(promP);

                    for (int i = 0; i < r.getCantNotasTeoricas(); i++) {
                        ListaNotasT.add(Double.valueOf(request.getParameter("notaT" + i)));
                        ListaPondT.add(Double.valueOf(request.getParameter("pondT" + i)));
                    }

                    for (int i = 0; i < r.getCantNotasPracticas(); i++) {
                        ListaNotasP.add(Double.valueOf(request.getParameter("notaP" + i)));
                        ListaPondP.add(Double.valueOf(request.getParameter("pondP" + i)));

                    }
                    Double prom;

                    if (request.getParameter("tipo").equals("teorico")) {

                        prom = calcProm(ListaNotasT, ListaPondT);
                        request.setAttribute("promT", prom);
                        request.setAttribute("promP", promP);

                    } else if (request.getParameter("tipo").equals("practico")) {

                        prom = calcProm(ListaNotasP, ListaPondP);
                        request.setAttribute("promP", prom);
                        request.setAttribute("promT", promT);

                    }

                    request.setAttribute("notasT", ListaNotasT);
                    request.setAttribute("pondT", ListaPondT);

                    request.setAttribute("notasP", ListaNotasP);
                    request.setAttribute("pondP", ListaPondP);

                    vista = "RamoMixto.jsp";

                }

                dispatcher = request.getRequestDispatcher(vista);
                dispatcher.forward(request, response);

                ;
                break;
        }

    }

    public void guardarNotaT(NotasTeorico nt, String nota, String pond) {
        UpdateData up = new UpdateData();
        up.updateNotasTeorico(nt.getIdNotaTeorica(), nota, pond, null);

    }

    public void guardarNotaP(NotasPractico np, String nota, String pond) {
        UpdateData up = new UpdateData();
        up.updateNotasPractica(np.getIdNotaPractica(), nota, pond, null);

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

    private double calcProm(java.util.List<java.lang.Double> listaNotas, java.util.List<java.lang.Double> listaPond) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        promedio.CalcPromedios port = service.getCalcPromediosPort();
        return port.calcProm(listaNotas, listaPond);
    }

    private double calcNotaFaltante(java.util.List<java.lang.Double> listaNotas, java.util.List<java.lang.Double> listaPond) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        promedio.CalcPromedios port = service.getCalcPromediosPort();
        return port.calcNotaFaltante(listaNotas, listaPond);
    }

    private double calcNotaExamen(java.util.List<java.lang.Double> listaNotas, java.util.List<java.lang.Double> listaPond) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        promedio.CalcPromedios port = service.getCalcPromediosPort();
        return port.calcNotaExamen(listaNotas, listaPond);
    }

}
