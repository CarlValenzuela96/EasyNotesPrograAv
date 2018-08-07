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

        ArrayList<Double> ListaNotasT;
        ArrayList<Double> ListaPondT;
        ArrayList<Double> ListaNotasP;
        ArrayList<Double> ListaPondP;

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

                            guardarNotaT(nt[i], request.getParameter("nota" + i), request.getParameter("pond" + i));

                        }

                        guardarPromSimple(g.getPromSimple(r.getIdRamo()).getIdPromedioSimple(), request.getParameter("prom"));

                    } else if (r.getTipoAprobacion().equals("Solo Práctico")) {
                        np = g.getNotasPracticas(r.getIdRamo());
                        for (int i = 0; i < np.length; i++) {
                            guardarNotaP(np[i], request.getParameter("nota" + i), request.getParameter("pond" + i));

                        }

                        guardarPromSimple(g.getPromSimple(r.getIdRamo()).getIdPromedioSimple(), request.getParameter("prom"));

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

                        if (r.getTipoAprobacion().equals("Teórico - Práctico en conjunto")) {
                            guardarPromMixto(g.getPromedioMixto(r.getIdRamo()).getIdPromedioMixto(), request.getParameter("promTeo"),
                                    request.getParameter("promPra"), request.getParameter("promFinal"));
                        } else {
                            double promF = truncarNum(calcPromFinal(Double.valueOf(request.getParameter("promTeo")), r.getPonderacionTeorica()/100,
                                    Double.valueOf(request.getParameter("promPra")), r.getPoderacionPractica()/100));

                            guardarPromMixto(g.getPromedioMixto(r.getIdRamo()).getIdPromedioMixto(), request.getParameter("promTeo"),
                                    request.getParameter("promPra"), String.valueOf(promF));
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
                ListaNotasT = new ArrayList<>();
                ListaPondT = new ArrayList<>();
                ListaNotasP = new ArrayList<>();
                ListaPondP = new ArrayList<>();

                if (r.getTipoAprobacion().equals("Solo Teórico") || r.getTipoAprobacion().equals("Solo Práctico")) {

                    if (r.getTipoAprobacion().equals("Solo Teórico")) {
                        for (int i = 0; i < r.getCantNotasTeoricas(); i++) {
                            ListaNotas.add(Double.valueOf(request.getParameter("nota" + i)));
                            ListaPond.add(Double.valueOf(request.getParameter("pond" + i)));

                        }
                    } else {
                        for (int i = 0; i < r.getCantNotasPracticas(); i++) {
                            ListaNotas.add(Double.valueOf(request.getParameter("nota" + i)));
                            ListaPond.add(Double.valueOf(request.getParameter("pond" + i)));

                        }

                    }

                    double prom = 0;
                    double notaFalt = 0;
                    double notaExam = 0;
                    System.out.println("a");
                    System.out.println(request.getParameter("seleccion"));
                    if (request.getParameter("seleccion").equals("calcProm")) {
                        prom = truncarNum(calcProm(ListaNotas, ListaPond));
                        request.setAttribute("msg", "");

                    } else if (request.getParameter("seleccion").equals("notaFalt")) {
                        prom = truncarNum(calcProm(ListaNotas, ListaPond));

                        notaFalt = truncarNum(calcNotaFaltante(ListaNotas, ListaPond));

                        notaExam = truncarNum(calcNotaExamen(ListaNotas, ListaPond));

                        String msg = msgNf(notaFalt, notaExam);

                        request.setAttribute("msg", msg);

                    }

                    request.setAttribute("notas", ListaNotas);
                    request.setAttribute("pond", ListaPond);

                    if (r.getTipoAprobacion().equals("Solo Teórico")) {
                        request.setAttribute("tip", "Teórico");
                    } else {
                        request.setAttribute("tip", "Práctico");
                    }

                    request.setAttribute("prom", prom);

                    vista = "RamoSimple.jsp";

                } else if (r.getTipoAprobacion().equals("Teórico - Práctico en conjunto") || r.getTipoAprobacion().equals("Teórico - Práctico por separado")) {

                    for (int i = 0; i < r.getCantNotasTeoricas(); i++) {
                        ListaNotasT.add(Double.valueOf(request.getParameter("notaT" + i)));
                        ListaPondT.add(Double.valueOf(request.getParameter("pondT" + i)));
                    }

                    for (int i = 0; i < r.getCantNotasPracticas(); i++) {
                        ListaNotasP.add(Double.valueOf(request.getParameter("notaP" + i)));
                        ListaPondP.add(Double.valueOf(request.getParameter("pondP" + i)));

                    }
                    double promT;
                    double promP;

                    double notaFalt = 0;
                    double notaExam = 0;

                    if (request.getParameter("seleccion").equals("calcPromT")) {

                        promT = truncarNum(calcProm(ListaNotasT, ListaPondT));
                        request.setAttribute("promT", promT);

                        promP = truncarNum(calcProm(ListaNotasP, ListaPondP));
                        request.setAttribute("promP", promP);

                        request.setAttribute("msgNFT", "");
                        request.setAttribute("msgNFP", "");

                    } else if (request.getParameter("seleccion").equals("calcPromP")) {

                        promP = truncarNum(calcProm(ListaNotasP, ListaPondP));
                        request.setAttribute("promP", promP);

                        promT = truncarNum(calcProm(ListaNotasT, ListaPondT));
                        request.setAttribute("promT", promT);

                        request.setAttribute("msgNFT", "");
                        request.setAttribute("msgNFP", "");

                    } else if (request.getParameter("seleccion").equals("notaFaltT")) {

                        notaFalt = truncarNum(calcNotaFaltante(ListaNotasT, ListaPondT));
                        notaExam = truncarNum(calcNotaExamen(ListaNotasT, ListaPondT));

                        promP = truncarNum(calcProm(ListaNotasP, ListaPondP));
                        request.setAttribute("promP", promP);

                        promT = truncarNum(calcProm(ListaNotasT, ListaPondT));
                        request.setAttribute("promT", promT);

                        String msg = msgNf(notaFalt, notaExam);

                        request.setAttribute("msgNFT", msg);
                        request.setAttribute("msgNFP", "");

                    } else if (request.getParameter("seleccion").equals("notaFaltP")) {

                        notaFalt = truncarNum(calcNotaFaltante(ListaNotasP, ListaPondP));
                        notaExam = truncarNum(calcNotaExamen(ListaNotasP, ListaPondP));

                        promP = truncarNum(calcProm(ListaNotasP, ListaPondP));
                        request.setAttribute("promP", promP);

                        promT = truncarNum(calcProm(ListaNotasT, ListaPondT));
                        request.setAttribute("promT", promT);

                        String msg = msgNf(notaFalt, notaExam);

                        request.setAttribute("msgNFT", "");
                        request.setAttribute("msgNFP", msg);

                    }

                    request.setAttribute("notaFalt", notaFalt);
                    request.setAttribute("notaExam", notaExam);

                    request.setAttribute("notasT", ListaNotasT);
                    request.setAttribute("pondT", ListaPondT);

                    request.setAttribute("notasP", ListaNotasP);
                    request.setAttribute("pondP", ListaPondP);

                    if (r.getTipoAprobacion().equals("Teórico - Práctico por separado")) {
                        request.setAttribute("visible", "visibility:hidden;");
                    } else {
                        request.setAttribute("visible", "");
                    }

                    vista = "RamoMixto.jsp";

                }

                dispatcher = request.getRequestDispatcher(vista);
                dispatcher.forward(request, response);

                ;
                break;
            case "/calcPromFinal":
                g = new GetDatos();
                session = (HttpSession) request.getSession();
                r = (Ramo) session.getAttribute("asign");

                double pondT = r.getPonderacionTeorica() / 100;
                double pondP = r.getPoderacionPractica() / 100;

                String promT = request.getParameter("promTeo");
                String promP = request.getParameter("promPra");

                double promFinal = calcPromFinal(Double.valueOf(promT), pondT, Double.valueOf(promP), pondP);

                ListaNotasT = new ArrayList<>();
                ListaPondT = new ArrayList<>();
                ListaNotasP = new ArrayList<>();
                ListaPondP = new ArrayList<>();

                for (int i = 0; i < r.getCantNotasTeoricas(); i++) {
                    ListaNotasT.add(Double.valueOf(request.getParameter("notaT" + i)));
                    ListaPondT.add(Double.valueOf(request.getParameter("pondT" + i)));
                }

                for (int i = 0; i < r.getCantNotasPracticas(); i++) {
                    ListaNotasP.add(Double.valueOf(request.getParameter("notaP" + i)));
                    ListaPondP.add(Double.valueOf(request.getParameter("pondP" + i)));

                }

                request.setAttribute("asign", r);
                request.setAttribute("notasT", ListaNotasT);
                request.setAttribute("pondT", ListaPondT);
                request.setAttribute("notasP", ListaNotasP);
                request.setAttribute("pondP", ListaPondP);

                request.setAttribute("promT", promT);
                request.setAttribute("promP", promP);

                request.setAttribute("promFinal", promFinal);

                dispatcher = request.getRequestDispatcher("RamoMixto.jsp");
                dispatcher.forward(request, response);
                ;
                break;
        }

    }

    public void guardarNotaT(NotasTeorico nt, String nota, String pond) {
        UpdateData up = new UpdateData();
        up.updateNotasTeorico(nt.getIdNotaTeorica(), nota, pond, null);

    }

    public void guardarPromSimple(int idProm, String promFinal) {
        UpdateData up = new UpdateData();
        up.updatePromedioSimple(idProm, promFinal, null);
    }

    public void guardarPromMixto(int idProm, String promT, String promP, String promF) {
        UpdateData up = new UpdateData();
        up.updatePromedioMixto(idProm, promP, promT, promF, null);
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

    public double calcPromFinal(double promT, double pondT, double promP, double pondP) {
        double pf = (promT * pondT) + (promP * pondP);

        return pf;
    }

    public double truncarNum(double a) {
        double aux = Math.rint(a * 100) / 100;
        a = aux;
        return a;
    }

    public String msgNf(double a, double b) {
        String msg = "";
        if ((a <= 7 && b <= 7) && (a > 1 && b > 1)) {
            msg = "Para aprobar la asignatura con nota minima necesitas un " + a
                    + ", En la última evaluacion\n y \n Para poder rendir examen necesitas un: " + b + ", En la última evaluacion";

        } else if (a > 7 && b <= 7) {
            msg = "No puedes Aprobar este Ramo, solo puedes ir a Examen\n y"
                    + " \n Para poder rendir examen necesitas un: " + b + ", En la última evaluacion";

        } else if (a > 7 && b > 7) {
            msg = "Notas insuficientes para aprobar o para rendir examen ";

        } else if (a <= 1 && b <= 1) {
            msg = "Con la nota minima (1.0) En la última evaluación se aprueba ramo";

        } else if (a > 1 && b <= 1) {
            msg = "Para aprobar la asignatura con un 4 necesitas un : " + a
                    + ", En la última evaluacion\n y \n con la nota minima (1.0) En la última evaluacion pudes dar examen";
        }
        return msg;
    }

}
