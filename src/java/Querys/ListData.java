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
import clases.Horario;
import clases.HorarioDAO;
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
import clases.RamoAprobado;
import clases.RamoAprobadoDAO;
import clases.RamoDAO;
import clases.RamoReprobado;
import clases.RamoReprobadoDAO;
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
 * @author Sebastian Gonzalez
 */
public class ListData {

    private static final int ROW_COUNT = 100;

    public ListData() {
    }

    /**
     *
     * @return
     */
    public ArrayList<Login> listLogin() {
        ArrayList<Login> log = new ArrayList<>();
        try {
            Login[] logins = LoginDAO.listLoginByQuery(null, null);
            int length = Math.min(logins.length, ROW_COUNT);
            for (int i = 0; i < length; i++) {
                Login login = new Login();
                login.setIdLogin(logins[i].getIdLogin());
                login.setPassword(logins[i].getPassword());
                log.add(login);
            }
        } catch (PersistentException ex) {
            Logger.getLogger(ListData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return log;
    }

    /**
     *
     * @return
     */
    public ArrayList<Usuario> listUsuario() {
        ArrayList<Usuario> usu = new ArrayList<>();
        try {

            Usuario[] usuarios = UsuarioDAO.listUsuarioByQuery(null, null);

            int length = Math.min(usuarios.length, ROW_COUNT);
            for (int i = 0; i < length; i++) {
                Usuario usuario = new Usuario();

                usuario.setNombre(usuarios[i].getNombre());
                usuario.setApellido(usuarios[i].getApellido());
                usuario.setMatricula(usuarios[i].getMatricula());
                usuario.setRun(usuarios[i].getRun());
                usuario.setPga(usuarios[i].getPga());
                usuario.setSexo(usuarios[i].getSexo());
                usuario.setEdad(usuarios[i].getEdad());
                usuario.setFechaNacimiento(usuarios[i].getFechaNacimiento());
                usuario.setNacionalidad(usuarios[i].getNacionalidad());
                usuario.setTelefono(usuarios[i].getTelefono());
                usuario.setEmail(usuarios[i].getEmail());
                usuario.setLoginidLogin(usuarios[i].getLoginidLogin());
                usuario.setIdUsuario(usuarios[i].getIdUsuario());

                usu.add(usuario);
            }
        } catch (PersistentException ex) {
            Logger.getLogger(ListData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usu;
    }

    /**
     *
     * @return
     */
    public ArrayList<Semestre> listSemestre() {
        ArrayList<Semestre> s = new ArrayList<>();
        try {
            Semestre[] semestres = SemestreDAO.listSemestreByQuery(null, null);
            int length = Math.min(semestres.length, ROW_COUNT);
            for (int i = 0; i < length; i++) {
                Semestre semestre = new Semestre();
                semestre.setNumeroSemestre(semestres[i].getNumeroSemestre());
                semestre.setAñoSemestre(semestres[i].getAñoSemestre());
                semestre.setCantRamos(semestres[i].getCantRamos());
                semestre.setCantHorasSemanalesTotales(semestres[i].getCantHorasSemanalesTotales());
                semestre.setEstadoSemestre(semestres[i].getEstadoSemestre());
                semestre.setUsuarioidUsuario(semestres[i].getUsuarioidUsuario());
                s.add(semestre);
            }
        } catch (PersistentException ex) {
            Logger.getLogger(ListData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }

    /**
     *
     * @return
     */
    public ArrayList<Evento> listEvento() {
        ArrayList<Evento> e = new ArrayList<>();
        Evento[] eventos;
        try {
            eventos = EventoDAO.listEventoByQuery(null, null);
            int length = Math.min(eventos.length, ROW_COUNT);
            for (int i = 0; i < length; i++) {
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
        } catch (PersistentException ex) {
            Logger.getLogger(ListData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return e;
    }

    /**
     *
     * @return
     */
    public ArrayList<Ramo> listRamo() {
        ArrayList<Ramo> r = new ArrayList<>();
        try {
            Ramo[] ramos = RamoDAO.listRamoByQuery(null, null);
            int length = Math.min(ramos.length, ROW_COUNT);
            for (int i = 0; i < length; i++) {
                Ramo ramo = new Ramo();
                ramo.setNombreRamo(ramos[i].getNombreRamo());
                ramo.setCodigoRamo(ramos[i].getCodigoRamo());
                ramo.setTipoAprobacion(ramos[i].getTipoAprobacion());
                ramo.setCantNotasTeoricas(ramos[i].getCantNotasTeoricas());
                ramo.setCantNotasPracticas(ramos[i].getCantNotasPracticas());
                ramo.setPonderacionTeorica(ramos[i].getPonderacionTeorica());
                ramo.setPoderacionPractica(ramos[i].getPoderacionPractica());
                ramo.setHorasSemanales(ramos[i].getHorasSemanales());
                ramo.setSemestreidSemestre(ramos[i].getSemestreidSemestre());
                r.add(ramo);
            }
        } catch (PersistentException ex) {
            Logger.getLogger(ListData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }

    /**
     *
     * @return
     */
    public ArrayList<Horario> listHorario() {
        ArrayList<Horario> h = new ArrayList<>();
        try {
            Horario[] horarios = HorarioDAO.listHorarioByQuery(null, null);
            int length = Math.min(horarios.length, ROW_COUNT);
            for (int i = 0; i < length; i++) {
                Horario horario = new Horario();
                horario.setDiaImpartido(horarios[i].getDiaImpartido());
                horario.setHoraInicio(horarios[i].getHoraInicio());
                horario.setHoraFIn(horarios[i].getHoraFIn());
                horario.setSala(horarios[i].getSala());
                horario.setDocente(horarios[i].getDocente());
                horario.setRamoidRamo(horarios[i].getRamoidRamo());
                h.add(horario);
            }
        } catch (PersistentException ex) {
            Logger.getLogger(ListData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return h;
    }

    /**
     *
     * @return
     */
    public ArrayList<PromedioMixto> listPromedioMixto() {
        ArrayList<PromedioMixto> promM = new ArrayList<>();
        try {
            PromedioMixto[] promedios = PromedioMixtoDAO.listPromedioMixtoByQuery(null, null);
            int length = Math.min(promedios.length, ROW_COUNT);
            for (int i = 0; i < length; i++) {
                PromedioMixto promMixto = new PromedioMixto();
                promMixto.setPromPractico(promedios[i].getPromPractico());
                promMixto.setPromTeorico(promedios[i].getPromTeorico());
                promMixto.setPromFinal(promedios[i].getPromFinal());
                promMixto.setRamoidRamo(promedios[i].getRamoidRamo());
                promM.add(promMixto);
            }
        } catch (PersistentException ex) {
            Logger.getLogger(ListData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return promM;
    }

    /**
     *
     * @return
     */
    public ArrayList<PromedioSimple> listPromedioSimple() {
        ArrayList<PromedioSimple> promS = new ArrayList<>();
        try {
            PromedioSimple[] promedios = PromedioSimpleDAO.listPromedioSimpleByQuery(null, null);
            int length = Math.min(promedios.length, ROW_COUNT);
            for (int i = 0; i < length; i++) {
                PromedioSimple promSimple = new PromedioSimple();
                promSimple.setPromFinal(promedios[i].getPromFinal());
                promSimple.setRamoidRamo(promedios[i].getRamoidRamo());
                promS.add(promSimple);
            }
        } catch (PersistentException ex) {
            Logger.getLogger(ListData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return promS;
    }

    /**
     *
     * @return
     */
    public ArrayList<NotasTeorico> listNotasTeorico() {
        ArrayList<NotasTeorico> n = new ArrayList<>();
        try {
            NotasTeorico[] notas = NotasTeoricoDAO.listNotasTeoricoByQuery(null, null);
            int length = Math.min(notas.length, ROW_COUNT);
            for (int i = 0; i < length; i++) {
                NotasTeorico notasTeo = new NotasTeorico();
                notasTeo.setNotaTeorica(notas[i].getNotaTeorica());
                notasTeo.setPondTeorica(notas[i].getPondTeorica());
                notasTeo.setRamoidRamo(notas[i].getRamoidRamo());
                n.add(notasTeo);
            }
        } catch (PersistentException ex) {
            Logger.getLogger(ListData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }

    public ArrayList<NotasPractico> listNotasPractico() {
        ArrayList<NotasPractico> n = new ArrayList<>();
        try {
            NotasPractico[] notas = NotasPracticoDAO.listNotasPracticoByQuery(null, null);
            int length = Math.min(notas.length, ROW_COUNT);
            for (int i = 0; i < length; i++) {
                NotasPractico notasPract = new NotasPractico();
                notasPract.setNotaPractica(notas[i].getNotaPractica());
                notasPract.setPondPractico(notas[i].getPondPractico());
                notasPract.setRamoidRamo(notas[i].getRamoidRamo());
                n.add(notasPract);
            }
        } catch (PersistentException ex) {
            Logger.getLogger(ListData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }

    public ArrayList<Carrera> listCarrera() {
        ArrayList<Carrera> c = new ArrayList<>();
        try {
            Carrera[] carreras = CarreraDAO.listCarreraByQuery(null, null);
            int length = Math.min(carreras.length, ROW_COUNT);
            for (int i = 0; i < length; i++) {
                Carrera carrera = new Carrera();
                carrera.setNombreCarrera(carreras[i].getNombreCarrera());
                carrera.setCantSemestres(carreras[i].getCantSemestres());
                carrera.setUniversidad(carreras[i].getUniversidad());
                carrera.setUsuarioidUsuario(carreras[i].getUsuarioidUsuario());
                c.add(carrera);
            }
        } catch (PersistentException ex) {
            Logger.getLogger(ListData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }

    public ArrayList<Direccion> listDireccion() {
        ArrayList<Direccion> d = new ArrayList<>();
        try {
            Direccion[] direcciones = DireccionDAO.listDireccionByQuery(null, null);
            int length = Math.min(direcciones.length, ROW_COUNT);
            for (int i = 0; i < length; i++) {
                Direccion direccion = new Direccion();
                direccion.setPaisRecidencia(direcciones[i].getPaisRecidencia());
                direccion.setCiudad(direcciones[i].getCiudad());
                direccion.setComuna(direcciones[i].getComuna());
                direccion.setUsuarioidUsuario(direcciones[i].getUsuarioidUsuario());
                direccion.setIdDireccion(direcciones[i].getIdDireccion());
                d.add(direccion);
            }
        } catch (PersistentException ex) {
            Logger.getLogger(ListData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return d;
    }

    public ArrayList<Domicilio> listDomicilio() {
        ArrayList<Domicilio> d = new ArrayList<>();
        try {
            Domicilio[] domicilios = DomicilioDAO.listDomicilioByQuery(null, null);
            int length = Math.min(domicilios.length, ROW_COUNT);
            for (int i = 0; i < length; i++) {
                Domicilio domicilio = new Domicilio();
                domicilio.setCalle(domicilios[i].getCalle());
                domicilio.setNumeracion(domicilios[i].getNumeracion());
                domicilio.setDepto(domicilios[i].getDepto());
                domicilio.setDireccionidDireccion(domicilios[i].getDireccionidDireccion());
                d.add(domicilio);
            }
        } catch (PersistentException ex) {
            Logger.getLogger(ListData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return d;
    }

    public ArrayList<Historial> listHistorial() {
        ArrayList<Historial> h = new ArrayList<>();
        try {
            Historial[] historiales = HistorialDAO.listHistorialByQuery(null, null);
            int length = Math.min(historiales.length, ROW_COUNT);
            for (int i = 0; i < length; i++) {
                Historial historial = new Historial();
                historial.setSemestre(historiales[i].getSemestre());
                historial.setAño(historiales[i].getAño());
                historial.setSemestreidSemestre(historiales[i].getSemestreidSemestre());
                h.add(historial);
            }
        } catch (PersistentException ex) {
            Logger.getLogger(ListData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return h;
    }

    public ArrayList<RamoAprobado> listRamoAprobado() {
        ArrayList<RamoAprobado> ra = new ArrayList<>();
        try {
            RamoAprobado[] ramos = RamoAprobadoDAO.listRamoAprobadoByQuery(null, null);
            int length = Math.min(ramos.length, ROW_COUNT);
            for (int i = 0; i < length; i++) {
                RamoAprobado ramoAprobado = new RamoAprobado();
                ramoAprobado.setNombreRamo(ramos[i].getNombreRamo());
                ramoAprobado.setNotaAprobacion(ramos[i].getNotaAprobacion());
                ramoAprobado.setHistorialidHistorial(ramos[i].getHistorialidHistorial());
                ra.add(ramoAprobado);
            }
        } catch (PersistentException ex) {
            Logger.getLogger(ListData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ra;
    }

    public ArrayList<RamoReprobado> listRamoReprobado() {
        ArrayList<RamoReprobado> rr = new ArrayList<>();
        try {
            RamoReprobado[] ramos = RamoReprobadoDAO.listRamoReprobadoByQuery(null, null);
            int length = Math.min(ramos.length, ROW_COUNT);
            for (int i = 0; i < length; i++) {
                RamoReprobado ramoReprobado = new RamoReprobado();
                ramoReprobado.setNombreRamo(ramos[i].getNombreRamo());
                ramoReprobado.setNotaReprobacion(ramos[i].getNotaReprobacion());
                ramoReprobado.setHistorialidHistorial(ramos[i].getHistorialidHistorial());
                rr.add(ramoReprobado);
            }
        } catch (PersistentException ex) {
            Logger.getLogger(ListData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rr;
    }
}
