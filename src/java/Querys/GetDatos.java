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

//    public ArrayList<Ramo> getRamosUser(int idSemestre) {
    public Ramo[] getRamosUser(int idSemestre) {
        ArrayList<Ramo> r = new ArrayList<>();
        Ramo[] ramos = null;
        try {
            String query = "semestreidSemestre='" + idSemestre + "'";
            ramos = RamoDAO.listRamoByQuery(query, null);

//            if (ramos != null) {
//                for (int i = 0; i < ramos.length; i++) {
//                    Ramo ramo = new Ramo();
//                    ramo.setNombreRamo(ramos[i].getNombreRamo());
//                    ramo.setCodigoRamo(ramos[i].getCodigoRamo());
//                    ramo.setTipoAprobacion(ramos[i].getTipoAprobacion());
//                    ramo.setCantNotasTeoricas(ramos[i].getCantNotasTeoricas());
//                    ramo.setCantNotasPracticas(ramos[i].getCantNotasPracticas());
//                    ramo.setPonderacionTeorica(ramos[i].getPonderacionTeorica());
//                    ramo.setPoderacionPractica(ramos[i].getPonderacionTeorica());
//                    ramo.setHorasSemanales(ramos[i].getHorasSemanales());
//                    ramo.setIdRamo(ramos[i].getIdRamo());
//                    ramo.setSemestreidSemestre(ramos[i].getSemestreidSemestre());
//
//                    r.add(ramo);
//
//                }
//            }
        } catch (PersistentException ex) {
            Logger.getLogger(GetDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ramos;
    }

//     public ArrayList<Evento> getEventosUser(int idSemestre) {
    public Evento[] getEventosUser(int idSemestre) {
        ArrayList<Evento> e = new ArrayList<>();
        Evento[] eventos = null;

        try {
            String query = "semestreidSemestre='" + idSemestre + "'";
            eventos = EventoDAO.listEventoByQuery(query, null);
//            if (eventos != null) {
//
//                for (int i = 0; i < eventos.length; i++) {
//                    Evento evento = new Evento();
//                    evento.setContent(eventos[i].getContent());
//                    evento.setAño(eventos[i].getAño());
//                    evento.setMes(eventos[i].getMes());
//                    evento.setDia(eventos[i].getDia());
//                    evento.setColor(eventos[i].getColor());
//                    evento.setSemestreidSemestre(eventos[i].getSemestreidSemestre());
//                    evento.setIdEvento(eventos[i].getIdEvento());
//
//                    e.add(evento);
//
//                }
//            }
        } catch (PersistentException ex) {
            Logger.getLogger(ListData.class.getName()).log(Level.SEVERE, null, ex);
        }

        return eventos;
    }

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
//public ArrayList<Historial> getHistorialUser(int idUser) {

    public Historial[] getHistorialUser(int idUser) {
        ArrayList<Historial> h = new ArrayList<Historial>();
        Historial hist[] = null;
        try {
            String query = "semestreidSemestre.usuarioidUsuario.idUsuario='" + idUser + "'";
            hist = HistorialDAO.listHistorialByQuery(query, null);
//            if (hist != null) {
//                for (int i = 0; i < hist.length; i++) {
//
//                    Historial historial = new Historial();
//                    historial.setAño(hist[i].getAño());
//                    historial.setSemestre(hist[i].getSemestre());
//                    historial.setSemestreidSemestre(hist[i].getSemestreidSemestre());
//                    historial.setIdHistorial(hist[i].getIdHistorial());
//
//                    h.add(historial);
//                }
//            }

        } catch (PersistentException ex) {
            Logger.getLogger(GetDatos.class.getName()).log(Level.SEVERE, null, ex);
        }

        return hist;
    }

//public ArrayList<NotasPractico> getNotasPracticas(int idRamo) {
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

//     public ArrayList<NotasTeorico> getNotasTeorica(int idRamo) {
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
