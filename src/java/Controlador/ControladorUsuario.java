/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Querys.GetDatos;
import Querys.InsertarDatos;
import clases.Carrera;
import clases.Direccion;
import clases.DireccionDAO;
import clases.Domicilio;
import clases.Evento;
import clases.Historial;
import clases.Login;
import clases.LoginDAO;
import clases.Ramo;
import clases.Semestre;
import clases.Usuario;
import clases.UsuarioDAO;
import java.io.IOException;
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
public class ControladorUsuario extends HttpServlet {

    String matLog;

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
//        processRequest(request, response);
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
        Controlador c;
        GetDatos g;
        HttpSession session;
        RequestDispatcher dispatcher;
        Direccion dir;
        Usuario user;
        Login log;
        String matLog;
//        ArrayList<Ramo> ramos;
        Ramo[] ramos;
        Semestre semestre;

        switch (ruta) {
            case "/Registro":
                String matricula = request.getParameter("matricula");
                String pass = request.getParameter("pass");
                g = new GetDatos();
                try {
                    registrarUsuario(g, matricula, pass, request, response);
                } catch (PersistentException ex) {
                    Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }

                break;
            case "/LoginUsuario":
                c = new Controlador();
                g = new GetDatos();
                matLog = request.getParameter("matricula");
                String passLog = request.getParameter("pass");
                 {
                    try {
                        LoginUser(g, c, matLog, passLog, request, response);
                    } catch (PersistentException ex) {
                        Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
            case "/DatosUsuario":
                System.out.println("a");
                session = (HttpSession) request.getSession();

                log = (Login) session.getAttribute("login");

                c = new Controlador();
                g = new GetDatos();

                //datos usuario
                String nombre = request.getParameter("nombre");
                String apellido = request.getParameter("apellido");
                matLog = request.getParameter("matricula");
                String run = request.getParameter("run");
                String pga = request.getParameter("pga");
                String sexo = request.getParameter("sexo");
                String nacionalidad = request.getParameter("nacionalidad");
                String telefono = request.getParameter("telefono");
                String fechaNac = request.getParameter("fechaNac");
                String email = request.getParameter("email");
                //datos domicilio
                String paisResidencia = request.getParameter("paisRes");
                String ciudad = request.getParameter("ciudad");
                String comuna = request.getParameter("comuna");
                String calle = request.getParameter("calle");
                String tipoDom = request.getParameter("tipoVivienda");
                String num = request.getParameter("numDom");
                //datos academicos
                String nomUniv = request.getParameter("nombreUniv");
                String nomCarr = request.getParameter("nombreCarr");
                String cantSem = request.getParameter("cantSem");

                String edad = c.edadUsuario(fechaNac);
                String genero;
                if (sexo.equals("1")) {
                    genero = "Femenino";
                } else {
                    genero = "Masculino";
                }

                Login userLogin = g.getLogin(log.getIdLogin(), log.getPassword());
                 {
                    try {
                        datosUser(userLogin, nombre, apellido, matLog, run, pga, genero, nacionalidad, telefono, edad, fechaNac, email);
                    } catch (PersistentException ex) {
                        Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                user = g.getUsuario(log.getIdLogin(), log.getPassword());

                 {
                    try {
                        datosAcademicos(user, nomUniv, nomCarr, cantSem);
                    } catch (PersistentException ex) {
                        Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                 {
                    try {

                        datosDomicilio(user, g, paisResidencia, ciudad, comuna, calle, tipoDom, num);
                    } catch (PersistentException ex) {
                        Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                session.setAttribute("usuario", user);

                ArrayList<String> listaAños = listaAños();
                ArrayList<String> listaHoras = listaHoras();
                request.setAttribute("msg", "Como es tu primer acceso, debes crear un semestre activo");
                request.setAttribute("años", listaAños);
                request.setAttribute("horas", listaHoras);

                dispatcher = request.getRequestDispatcher("AgregarSemestre.jsp");
                dispatcher.forward(request, response);
                break;

            case "/EnviarDatosUsuario":

                session = (HttpSession) request.getSession();

                g = new GetDatos();

                user = (Usuario) session.getAttribute("usuario");
                dir = g.getDireccion(user.getIdUsuario());

                Domicilio dom = g.getDomicilio(dir.getIdDireccion());
                Carrera car = g.getCarrera(user.getIdUsuario());

                request.setAttribute("user", user);
                request.setAttribute("dir", dir);
                request.setAttribute("dom", dom);
                request.setAttribute("car", car);
                String tipoViv;
                String numViv;
                if (dom.getNumeracion() == 0) {
                    tipoViv = "Departamento";
                    numViv = String.valueOf(dom.getDepto());
                } else {
                    tipoViv = "Casa";
                    numViv = String.valueOf(dom.getNumeracion());
                }

                request.setAttribute("tipoViv", tipoViv);
                request.setAttribute("numViv", numViv);

                dispatcher = request.getRequestDispatcher("PerfilUsuario.jsp");
                dispatcher.forward(request, response);

                ;
                break;

            case "/PerfilUsuario":
                String value = request.getParameter("opc");
                session = (HttpSession) request.getSession();
                if (value.equals("0")) {

                    response.sendRedirect("Principal.jsp");

                } else {
                    dispatcher = request.getRequestDispatcher("Datos_Usuario.jsp");
                    dispatcher.forward(request, response);
                }

                ;
                break;
            case "/EnviarOpcMain":
                String opc = request.getParameter("opcMain");

                switch (opc) {
                    case "1":
                        session = (HttpSession) request.getSession();
                        g = new GetDatos();

                        semestre = (Semestre) session.getAttribute("semestreActivo");

                        ramos = g.getRamosUser(semestre.getIdSemestre());

                        request.setAttribute("verRamos", ramos);
                        dispatcher = request.getRequestDispatcher("Ramos.jsp");
                        dispatcher.forward(request, response);

                        ;
                        break;
                    case "2":
                        dispatcher = request.getRequestDispatcher("Agregar_Asignatura.jsp");
                        dispatcher.forward(request, response);
                        ;
                        break;
                    case "3":
                        session = (HttpSession) request.getSession();
                        g = new GetDatos();

                        semestre = (Semestre) session.getAttribute("semestreActivo");

                        ramos = g.getRamosUser(semestre.getIdSemestre());

                        request.setAttribute("ramos", ramos);
                        dispatcher = request.getRequestDispatcher("EliminarRamo.jsp");
                        dispatcher.forward(request, response);

                        ;
                        break;
                    case "4":
                        dispatcher = request.getRequestDispatcher("GestionSemestres.jsp");
                        dispatcher.forward(request, response);
                        // response.sendRedirect("GestionSemestres.jsp");
                        ;
                        break;
                    case "5":
                        session = (HttpSession) request.getSession();
                        g = new GetDatos();
                        user = (Usuario) session.getAttribute("usuario");

//                        ArrayList<Historial> historial = g.getHistorialUser(user.getIdUsuario());
                        Historial[] historial = g.getHistorialUser(user.getIdUsuario());

                        request.setAttribute("hist", historial);
                        dispatcher = request.getRequestDispatcher("selectHistorial.jsp");
                        dispatcher.forward(request, response);
                        ;
                        break;
                    case "6":;
                        break;
                }
                ;
                break;
            case "/logOut":
                
                ;
                break;
        }

    }

    /**
     * Método para registrar un nuevo usuario.
     *
     * @param g variable de la clase GetDatos, para obtener valores del login.
     * del usuario.
     * @param matricula id (matricula usuario) del login.
     * @param pass password del login.
     * @param request
     * @param response
     * @throws PersistentException
     * @throws ServletException
     * @throws IOException
     */
    public void registrarUsuario(GetDatos g, String matricula, String pass, HttpServletRequest request, HttpServletResponse response) throws PersistentException, ServletException, IOException {

        Login log = g.getLogin(matricula, pass);
        boolean exist = false;

        if (log != null) {
            exist = true;
        }

        if (!exist) {
            InsertarDatos i = new InsertarDatos();
            i.addLogin(matricula, pass);

            RequestDispatcher dispatcher = request.getRequestDispatcher("Login.jsp");
            dispatcher.forward(request, response);
        } else {
            RequestDispatcher dispatcher = request.getRequestDispatcher("Registrar.jsp");
            dispatcher.forward(request, response);
        }

    }

    /**
     * Método de ingreso(log) del usuario.
     *
     * @param g variable de la clase GetDatos, para obtener valores del login.
     * @param c variable de la clase Controlador, para hacer uso de métodos.
     * @param matricula matricula (id) del log del usuario.
     * @param pass password del login.
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     * @throws PersistentException
     */
    public void LoginUser(GetDatos g, Controlador c, String matricula, String pass, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, PersistentException {
        HttpSession session = request.getSession(true);

        //ArrayList<Usuario> u = l.listUsuario();
        boolean exist = false;
        //verifica si el userLogin existe en base de datos
        //de ser asi crea cookie con ese objeto
        Login login = g.getLogin(matricula, pass);

        if (login != null) {
            exist = true;
            session.setAttribute("login", login);

        }

        if (exist) {
            //verifica si existe un usuario para el userLogin
            boolean existUser = false;

            Usuario usu = g.getUsuario(matricula, pass);

            if (usu != null) {
                existUser = true;
                session.setAttribute("usuario", usu);

            }

            if (!existUser) {

                RequestDispatcher dispatcher = request.getRequestDispatcher("Datos_Usuario.jsp");
                dispatcher.forward(request, response);
            } else {

                Semestre sem = g.getSemActivo(usu.getIdUsuario());
                boolean existSem = false;
                if (sem != null) {
                    existSem = true;
                }

                if (!existSem) {

                    ArrayList<String> listaAños = listaAños();
                    ArrayList<String> listaHoras = listaHoras();
                    request.setAttribute("msg", "Como es tu primer acceso, debes crear un semestre activo");
                    request.setAttribute("años", listaAños);
                    request.setAttribute("horas", listaHoras);

                    RequestDispatcher dispatcher = request.getRequestDispatcher("AgregarSemestre.jsp");
                    dispatcher.forward(request, response);

                } else {
//                    ArrayList<Evento> eUser = g.getEventosUser(sem.getIdSemestre());
                    Evento[] eUser = g.getEventosUser(sem.getIdSemestre());
                    String fechas = c.generarJsonFechas(eUser);
                    session.setAttribute("semestreActivo", sem);
                    session.setAttribute("jsonFechas", fechas);
                    response.sendRedirect("Principal.jsp");
                }

            }

        } else {
            RequestDispatcher dispatcher = request.getRequestDispatcher("Login.jsp");
            dispatcher.forward(request, response);

        }
    }

    /**
     * Método para el ingreso de los datos del usuario.
     *
     * @param userLogin valor de la id del login del usuario.
     * @param nombre nombre del usuario.
     * @param apellido apellido del usuario.
     * @param matricula matricula del usuario.
     * @param run run del usuario.
     * @param pga pag (promedio general acumulado) del usuario.
     * @param sexo género del usuario.
     * @param nacionalidad nacionalidad del usuario.
     * @param telefono teléfono del usuario.
     * @param edad edad del usuario.
     * @param fechaNac fecha de nacimiento del usuario, con la cual se calculara
     * su edad.
     * @param email correo electrónico del usuario.
     * @throws ServletException
     * @throws PersistentException
     */
    public void datosUser(Login userLogin, String nombre, String apellido, String matricula, String run, String pga, String sexo, String nacionalidad, String telefono, String edad, String fechaNac, String email) throws ServletException, PersistentException {

        InsertarDatos ins = new InsertarDatos();
        //agrega usuario
        ins.addUsuario(nombre, apellido, matricula, run, Double.parseDouble(pga), sexo, edad, fechaNac, nacionalidad, telefono, email, LoginDAO.getLoginByORMID(userLogin.getIdLogin()));

    }

    /**
     * Método para ingresar datos de la carrera del usuario.
     *
     * @param user valor Usuario del cual se obtendra su id (usuario actual de
     * la sesión).
     * @param nomUniv nombre de la universidad de la carrera del usuario.
     * @param nomCarr nombre de la carrera.
     * @param cantSem cantidad de semestres de la carrera.
     * @throws PersistentException
     */
    public void datosAcademicos(Usuario user, String nomUniv, String nomCarr, String cantSem) throws PersistentException {
        InsertarDatos ins = new InsertarDatos();
        //agrega carrera al usuario
        ins.addCarrera(nomCarr, Integer.valueOf(cantSem), nomUniv, UsuarioDAO.getUsuarioByORMID(user.getIdUsuario()));

    }

    /**
     * Método para ingresar dirección y domicilio del usuario de la sesión
     *
     * @param user valor Usuario del cual se obtendra su id.
     * @param g objeto de la clase GetDatos, para utilización de métodos.
     * @param paisResidencia país de residencia de la dirección.
     * @param ciudad ciudad de la dirección.
     * @param comuna comuna de la dirección.
     * @param calle calle del domicilio.
     * @param tipoDom tipo de domiclio a ingresar.
     * @param num número de domicilio.
     * @throws PersistentException
     */
    public void datosDomicilio(Usuario user, GetDatos g, String paisResidencia, String ciudad, String comuna, String calle, String tipoDom, String num) throws PersistentException {
        InsertarDatos ins = new InsertarDatos();
        //agrega direccion al usuario
        ins.addDireccion(paisResidencia, ciudad, comuna, UsuarioDAO.getUsuarioByORMID(user.getIdUsuario()));
        Direccion dir = g.getDireccion(user.getIdUsuario());
        int numCasa = 0, numDpto = 0;
        if (tipoDom.equals("0")) {
            numCasa = Integer.valueOf(num);
            numDpto = 0;

        } else if (tipoDom.equals("1")) {
            numCasa = 0;
            numDpto = Integer.valueOf(num);
        }
        //agrega domicilio a la direccion
        ins.addDomicilio(calle, numCasa, numDpto, DireccionDAO.getDireccionByORMID(dir.getIdDireccion()));
    }

    /**
     * Método para listar años.
     *
     * @return arreglo de String con años.
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
     * Métodos para listar horas.
     *
     * @return arreglo de String con horas.
     */
    public ArrayList<String> listaHoras() {
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            list.add(String.valueOf(i));
        }
        return list;
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
