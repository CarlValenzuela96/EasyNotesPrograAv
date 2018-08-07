/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Querys;

import clases.Carrera;
import clases.CarreraDAO;
import clases.Direccion;
import clases.DireccionDAO;
import clases.Domicilio;
import clases.DomicilioDAO;
import clases.Evento;
import clases.EventoDAO;
import clases.Historial;
import clases.HistorialDAO;
import clases.Login;
import clases.LoginDAO;
import clases.NotasPractico;
import clases.NotasPracticoDAO;
import clases.NotasTeorico;
import clases.NotasTeoricoDAO;
import clases.PromedioMixto;
import clases.PromedioMixtoDAO;
import clases.PromedioSimple;
import clases.PromedioSimpleDAO;
import clases.Ramo;
import clases.RamoDAO;
import clases.Semestre;
import clases.SemestreDAO;
import clases.Usuario;
import clases.UsuarioDAO;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.LockMode;
import org.orm.PersistentException;

/**
 *
 * @author Carlos
 */
public class GetDatos {

    public GetDatos() {
    }

    /**
     * Metodo que retorna objeto Login.
     *
     * @param valorMatricula valor de la id del objeto a buscar.
     * @param valorPassword valor de la password del objeto a buscar.
     * @return objeto Login obtenido mediante query.
     */
    public Login getLogin(String valorMatricula, String valorPassword) {

        Login logins = null;
        try {
            String query = " idLogin='" + valorMatricula + "' and password='" + valorPassword + "'";
            logins = LoginDAO.loadLoginByQuery(query, null);

        } catch (PersistentException ex) {
            Logger.getLogger(ListData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return logins;

    }

    /**
     * Metodo que retorna objeto Usuario.
     *
     * @param valorMatricula valor de la matricula del objeto a buscar.
     * @param valorPassword valor de la password del objeto a buscar.
     * @return objeto Usuario obtenido mediante query.
     */
    public Usuario getUsuario(String valorMatricula, String valorPassword) {
        Usuario usuarios = null;
        try {
            String query = " matricula='" + valorMatricula + "' and loginidLogin.password='" + valorPassword + "'";
            usuarios = UsuarioDAO.loadUsuarioByQuery(query, null);
        } catch (PersistentException ex) {
            Logger.getLogger(GetDatos.class.getName()).log(Level.SEVERE, null, ex);
        }

        return usuarios;

    }

    /**
     * Metodo que retorna objeto Ramo.
     *
     * @param idSemestre id del Semestre al cual recosponde el Ramo que se
     * busca.
     * @param nombre nombre del ramo.
     * @return objeto ramo obtenido mediante query.
     */
    public Ramo getRamoPorNombre(int idSemestre, String nombre) {
        Ramo ramos = null;

        try {
            String query = "semestreidSemestre='" + idSemestre + "' and nombreRamo='" + nombre + "'";
            ramos = RamoDAO.loadRamoByQuery(query, null);

        } catch (PersistentException ex) {
            Logger.getLogger(GetDatos.class.getName()).log(Level.SEVERE, null, ex);
        }

        return ramos;
    }

    /**
     * Metodo que regresa arreglo de Ramos.
     *
     * @param idSemestre id del Semestre al cual pertenecen los ramos que se
     * buscan.
     * @return arreglo de Ramos obtenidos mediante query.
     */
    public Ramo[] getRamosUser(int idSemestre) {
        ArrayList<Ramo> r = new ArrayList<>();
        Ramo[] ramos = null;
        try {
            String query = "semestreidSemestre='" + idSemestre + "'";
            ramos = RamoDAO.listRamoByQuery(query, null);

        } catch (PersistentException ex) {
            Logger.getLogger(GetDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ramos;
    }

    /**
     * Metodo que regresa arreglo de Eventos.
     *
     * @param idSemestre id del Semestre al cual pertenecen los Eventos.
     * @return arreglo de Eventos obtenidos mediante query.
     */
    public Evento[] getEventosUser(int idSemestre) {
        ArrayList<Evento> e = new ArrayList<>();
        Evento[] eventos = null;

        try {
            String query = "semestreidSemestre='" + idSemestre + "'";
            eventos = EventoDAO.listEventoByQuery(query, null);

        } catch (PersistentException ex) {
            Logger.getLogger(ListData.class.getName()).log(Level.SEVERE, null, ex);
        }

        return eventos;
    }

    /**
     * Metodo que retorna objeto Dirección.
     *
     * @param idUsuario id del Usuario relacionado a Dirección.
     * @return objeto Dirección obtenida mediante query.
     */
    public Direccion getDireccion(int idUsuario) {

        Direccion dir = null;
        try {

            String query = " usuarioidUsuario='" + idUsuario + "'";

            dir = DireccionDAO.loadDireccionByQuery(query, null);

        } catch (PersistentException ex) {
            Logger.getLogger(GetDatos.class.getName()).log(Level.SEVERE, null, ex);
        }

        return dir;
    }

    /**
     * Metodo que retorna objeto Domicilio.
     *
     * @param idDireccion id del la Dirección relacinada a Domicilio.
     * @return objeto Domicilio obtenido mediante query.
     */
    public Domicilio getDomicilio(int idDireccion) {

        Domicilio dom = null;

        try {
            String query = "direccionidDireccion='" + idDireccion + "'";
            dom = DomicilioDAO.loadDomicilioByQuery(query, null);

        } catch (PersistentException ex) {
            Logger.getLogger(GetDatos.class.getName()).log(Level.SEVERE, null, ex);
        }

        return dom;
    }

    /**
     * Metodo que retorna objeto Carrera.
     *
     * @param idUser id(matricula) del Usuario relacionado al objeto Carrera.
     * @return objeto Carrera obtenido mediante query.
     */
    public Carrera getCarrera(int idUser) {
        Carrera car = null;

        try {
            String query = "usuarioidUsuario='" + idUser + "'";
            car = CarreraDAO.loadCarreraByQuery(query, null);

        } catch (PersistentException ex) {
            Logger.getLogger(GetDatos.class.getName()).log(Level.SEVERE, null, ex);
        }

        return car;
    }

    /**
     * Metodo que retorna objeto Semestre.
     *
     * @param idUser id(matricula) del Usuario relacionado al objeto Semestre
     * actual.
     * @return objeto Semestre obtenido mediante query.
     */
    public Semestre getSemActivo(int idUser) {
        Semestre sem = null;
        try {
            String query = "usuarioidUsuario='" + idUser + "' and estadoSemestre=1";
            sem = SemestreDAO.loadSemestreByQuery(query, null);

        } catch (PersistentException ex) {
            Logger.getLogger(GetDatos.class.getName()).log(Level.SEVERE, null, ex);
        }

        return sem;

    }

    /**
     * Metodo que retorna arreglo de objetos Historial.
     *
     * @param idUser id(matricula) del Usuario relacion con el Historial.
     * @return arreglo de objetos Historial obtenidos mediante query.
     */
    public Historial[] getHistorialUser(int idUser) {

        Historial hist[] = null;
        try {
            String query = "semestreidSemestre.usuarioidUsuario.idUsuario='" + idUser + "'";
            hist = HistorialDAO.listHistorialByQuery(query, null);

        } catch (PersistentException ex) {
            Logger.getLogger(GetDatos.class.getName()).log(Level.SEVERE, null, ex);
        }

        return hist;
    }

    /**
     * Metodod que retorna arreglo de objetos NotasPractico.
     *
     * @param idRamo id del Ramo relacionado a NotasPractico.
     * @return arreglo de objetos NotasPractico obtenidos mediante query.
     */
    public NotasPractico[] getNotasPracticas(int idRamo) {

        NotasPractico n[] = null;
        try {
            String query = "ramoidRamo='" + idRamo + "'";
            n = NotasPracticoDAO.listNotasPracticoByQuery(query, null);
        } catch (PersistentException ex) {
            Logger.getLogger(GetDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }

    
      /**
     * Metodo que retorna arreglo de NotasTeorico.
     *
     * @param idRamo id del Ramo relacionado a NotasTeorico.
     * @return arreglo de objetos NotasTeorico obtenidos mediante query.
     */
    public NotasTeorico[] getNotasTeorica(int idRamo) {

        NotasTeorico n[] = null;
        try {
            String query = "ramoidRamo='" + idRamo + "'";

            n = NotasTeoricoDAO.listNotasTeoricoByQuery(query, null);

        } catch (PersistentException ex) {
            Logger.getLogger(GetDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }
    
    
    /**
     * Metodo que retorna el promedio de un ramo simple
     * 
     * @param idRamo
     * @return objeto PromedioSimple obtenido por query
     */
    public PromedioSimple getPromSimple(int idRamo) {
        PromedioSimple ps = null;
        try {
            String query = "ramoidRamo=" + idRamo + "";
            ps = PromedioSimpleDAO.loadPromedioSimpleByQuery(query, null);
        } catch (PersistentException ex) {
            Logger.getLogger(GetDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ps;
    }
    
    
    /**
     * Metodo que retorna el promedio de un ramo mixto
     * 
     * @param idRamo
     * @return objeto PromedioMixto obtenido por query
     */
    public PromedioMixto getPromedioMixto(int idRamo) {
        PromedioMixto pm = null;

        try {
            String query = "ramoidRamo=" + idRamo + "";
            pm = PromedioMixtoDAO.loadPromedioMixtoByQuery(query, null);
        } catch (PersistentException ex) {
            Logger.getLogger(GetDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pm;
    }

}
