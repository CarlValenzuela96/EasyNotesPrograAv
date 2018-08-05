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
import clases.Ramo;
import clases.RamoDAO;
import clases.Semestre;
import clases.SemestreDAO;
import clases.Usuario;
import clases.UsuarioDAO;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.orm.PersistentException;

/**
 *
 * @author Carlos
 */
public class GetDatos {

    public GetDatos() {
    }

    public Login getLogin(String valorMatricula, String valorPassword) {
        Login login = new Login();
        Login logins = null;
        try {
            String query = " idLogin='" + valorMatricula + "' and password='" + valorPassword + "'";
            logins = LoginDAO.loadLoginByQuery(query, null);
            if (logins != null) {
                login.setIdLogin(logins.getIdLogin());
                login.setPassword(logins.getPassword());

            }

        } catch (PersistentException ex) {
            Logger.getLogger(ListData.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (logins == null) {
            return null;
        } else {
            return login;
        }

    }

    public Usuario getUsuario(String valorMatricula, String valorPassword) {
        Usuario usuario = new Usuario();
        Usuario usuarios = null;
        try {

            String query = " matricula='" + valorMatricula + "' and loginidLogin.password='" + valorPassword + "'";

            usuarios = UsuarioDAO.loadUsuarioByQuery(query, null);
            if (usuarios != null) {
                usuario.setNombre(usuarios.getNombre());
                usuario.setApellido(usuarios.getApellido());
                usuario.setMatricula(usuarios.getMatricula());
                usuario.setRun(usuarios.getRun());
                usuario.setPga(usuarios.getPga());
                usuario.setSexo(usuarios.getSexo());
                usuario.setEdad(usuarios.getEdad());
                usuario.setFechaNacimiento(usuarios.getFechaNacimiento());
                usuario.setNacionalidad(usuarios.getNacionalidad());
                usuario.setTelefono(usuarios.getTelefono());
                usuario.setEmail(usuarios.getEmail());
                usuario.setLoginidLogin(usuarios.getLoginidLogin());
                usuario.setIdUsuario(usuarios.getIdUsuario());

            }

        } catch (PersistentException ex) {
            Logger.getLogger(GetDatos.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (usuarios == null) {
            return null;
        } else {
            return usuario;
        }

    }

    public Ramo getRamoPorNombre(int idSemestre, String nombre) {
        Ramo ramo = new Ramo();
        Ramo ramos = null;

        try {
            String query = "semestreidSemestre='" + idSemestre + "' and nombreRamo='" + nombre + "'";
            ramos = RamoDAO.loadRamoByQuery(query, null);
            if (ramos != null) {
                ramo.setNombreRamo(ramos.getNombreRamo());
                ramo.setCodigoRamo(ramos.getCodigoRamo());
                ramo.setTipoAprobacion(ramos.getTipoAprobacion());
                ramo.setCantNotasTeoricas(ramos.getCantNotasTeoricas());
                ramo.setCantNotasPracticas(ramos.getCantNotasPracticas());
                ramo.setPonderacionTeorica(ramos.getPonderacionTeorica());
                ramo.setPoderacionPractica(ramos.getPoderacionPractica());
                ramo.setHorasSemanales(ramos.getHorasSemanales());
                ramo.setSemestreidSemestre(ramos.getSemestreidSemestre());
                ramo.setIdRamo(ramos.getIdRamo());

            }

        } catch (PersistentException ex) {
            Logger.getLogger(GetDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         if (ramos == null) {
            return null;
        } else {
            return ramo;
        }
    }

    public ArrayList<Ramo> getRamosUser(int idSemestre) {
        ArrayList<Ramo> r = new ArrayList<>();
        Ramo[] ramos;
        try {
            String query = "semestreidSemestre='" + idSemestre + "'";
            ramos = RamoDAO.listRamoByQuery(query, null);

            if (ramos != null) {
                for (int i = 0; i < ramos.length; i++) {
                    Ramo ramo = new Ramo();
                    ramo.setNombreRamo(ramos[i].getNombreRamo());
                    ramo.setCodigoRamo(ramos[i].getCodigoRamo());
                    ramo.setTipoAprobacion(ramos[i].getTipoAprobacion());
                    ramo.setCantNotasTeoricas(ramos[i].getCantNotasTeoricas());
                    ramo.setCantNotasPracticas(ramos[i].getCantNotasPracticas());
                    ramo.setPonderacionTeorica(ramos[i].getPonderacionTeorica());
                    ramo.setPoderacionPractica(ramos[i].getPonderacionTeorica());
                    ramo.setHorasSemanales(ramos[i].getHorasSemanales());
                    ramo.setIdRamo(ramos[i].getIdRamo());
                    ramo.setSemestreidSemestre(ramos[i].getSemestreidSemestre());

                    r.add(ramo);

                }
            }
        } catch (PersistentException ex) {
            Logger.getLogger(GetDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }

    public ArrayList<Evento> getEventosUser(int idSemestre) {
        ArrayList<Evento> e = new ArrayList<>();
        Evento[] eventos;

        try {
            String query = "semestreidSemestre='" + idSemestre + "'";
            eventos = EventoDAO.listEventoByQuery(query, null);
            if (eventos != null) {

                for (int i = 0; i < eventos.length; i++) {
                    Evento evento = new Evento();
                    evento.setContent(eventos[i].getContent());
                    evento.setAño(eventos[i].getAño());
                    evento.setMes(eventos[i].getMes());
                    evento.setDia(eventos[i].getDia());
                    evento.setColor(eventos[i].getColor());
                    evento.setSemestreidSemestre(eventos[i].getSemestreidSemestre());
                    evento.setIdEvento(eventos[i].getIdEvento());

                    e.add(evento);

                }
            }
        } catch (PersistentException ex) {
            Logger.getLogger(ListData.class.getName()).log(Level.SEVERE, null, ex);
        }

        return e;
    }

    public Direccion getDireccion(int idUsuario) {
        Direccion direccion = new Direccion();
        Direccion dir = null;
        try {

            String query = " usuarioidUsuario='" + idUsuario + "'";

            dir = DireccionDAO.loadDireccionByQuery(query, null);
            if (dir != null) {
                direccion.setIdDireccion(dir.getIdDireccion());
                direccion.setPaisRecidencia(dir.getPaisRecidencia());
                direccion.setCiudad(dir.getCiudad());
                direccion.setComuna(dir.getComuna());
                direccion.setUsuarioidUsuario(dir.getUsuarioidUsuario());
            }

        } catch (PersistentException ex) {
            Logger.getLogger(GetDatos.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (dir == null) {
            return null;
        } else {
            return direccion;
        }
    }

    public Domicilio getDomicilio(int idDireccion) {
        Domicilio domicilio = new Domicilio();
        Domicilio dom = null;

        try {
            String query = "direccionidDireccion='" + idDireccion + "'";
            dom = DomicilioDAO.loadDomicilioByQuery(query, null);

            if (dom != null) {
                domicilio.setCalle(dom.getCalle());
                domicilio.setDepto(dom.getDepto());
                domicilio.setNumeracion(dom.getNumeracion());
            }
        } catch (PersistentException ex) {
            Logger.getLogger(GetDatos.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (dom == null) {
            return null;
        } else {
            return domicilio;
        }
    }

    public Carrera getCarrera(int idUser) {
        Carrera carrera = new Carrera();
        Carrera car = null;

        try {
            String query = "usuarioidUsuario='" + idUser + "'";
            car = CarreraDAO.loadCarreraByQuery(query, null);

            if (car != null) {
                carrera.setNombreCarrera(car.getNombreCarrera());
                carrera.setUniversidad(car.getUniversidad());
                carrera.setCantSemestres(car.getCantSemestres());
            }
        } catch (PersistentException ex) {
            Logger.getLogger(GetDatos.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (car == null) {
            return null;
        } else {
            return carrera;
        }
    }

    public Semestre getSemActivo(int idUser) {
        Semestre semestre = new Semestre();
        Semestre sem = null;
        try {
            String query = "usuarioidUsuario='" + idUser + "' and estadoSemestre=1";
            sem = SemestreDAO.loadSemestreByQuery(query, null);

            if (sem != null) {
                semestre.setAñoSemestre(sem.getAñoSemestre());
                semestre.setNumeroSemestre(sem.getNumeroSemestre());
                semestre.setCantRamos(sem.getCantRamos());
                semestre.setCantHorasSemanalesTotales(sem.getCantHorasSemanalesTotales());
                semestre.setEstadoSemestre(sem.getEstadoSemestre());
                semestre.setIdSemestre(sem.getIdSemestre());
                semestre.setUsuarioidUsuario(sem.getUsuarioidUsuario());
            }
        } catch (PersistentException ex) {
            Logger.getLogger(GetDatos.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (sem == null) {
            return null;
        } else {
            return semestre;
        }

    }

    public ArrayList<Historial> getHistorialUser(int idUser) {
        ArrayList<Historial> h = new ArrayList<Historial>();
        Historial hist[];
        try {
            String query = "semestreidSemestre.usuarioidUsuario.idUsuario='" + idUser + "'";
            hist = HistorialDAO.listHistorialByQuery(query, null);
            if (hist != null) {
                for (int i = 0; i < hist.length; i++) {
                    Historial historial = new Historial();
                    historial.setAño(hist[i].getAño());
                    historial.setSemestre(hist[i].getSemestre());
                    historial.setSemestreidSemestre(hist[i].getSemestreidSemestre());
                    historial.setIdHistorial(hist[i].getIdHistorial());

                    h.add(historial);
                }
            }

        } catch (PersistentException ex) {
            Logger.getLogger(GetDatos.class.getName()).log(Level.SEVERE, null, ex);
        }

        return h;
    }

    public ArrayList<NotasPractico> getNotasPracticas(int idRamo) {
        ArrayList<NotasPractico> np = new ArrayList<>();
        NotasPractico n[];
        try {
            String query = "ramoidRamo='" + idRamo + "'";
            n = NotasPracticoDAO.listNotasPracticoByQuery(query, null);
            if (n != null) {

                for (int i = 0; i < n.length; i++) {
                    NotasPractico notaP = new NotasPractico();
                    notaP.setNotaPractica(n[i].getNotaPractica());
                    notaP.setPondPractico(n[i].getPondPractico());
                    notaP.setRamoidRamo(n[i].getRamoidRamo());
                    notaP.setIdNotaPractica(n[i].getIdNotaPractica());
                    np.add(notaP);
                }

            }
        } catch (PersistentException ex) {
            Logger.getLogger(GetDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return np;
    }

    public ArrayList<NotasTeorico> getNotasTeorica(int idRamo) {
        ArrayList<NotasTeorico> nT = new ArrayList<>();
        NotasTeorico n[];
        try {
            String query = "ramoidRamo='" + idRamo + "'";
            
            n = NotasTeoricoDAO.listNotasTeoricoByQuery(query, null);
            if (n != null) {

                for (int i = 0; i < n.length; i++) {
                    NotasTeorico notaT = new NotasTeorico();
                    notaT.setNotaTeorica(n[i].getNotaTeorica());
                    notaT.setPondTeorica(n[i].getPondTeorica());
                    notaT.setRamoidRamo(n[i].getRamoidRamo());
                    notaT.setIdNotaTeorica(n[i].getIdNotaTeorica());
                    nT.add(notaT);
                }

            }
        } catch (PersistentException ex) {
            Logger.getLogger(GetDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nT;
    }

}
