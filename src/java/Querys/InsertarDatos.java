
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
import java.util.logging.Level;
import java.util.logging.Logger;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

/**
 * Clase de ingresos a la base de datos
 * @author Sebastian Gonzalez
 * @version 1.2.0
 */
public class InsertarDatos {
    
    public InsertarDatos() {
    }

    /**
     *Agregar Login a la base de datos 
     * @param idLogin
     * @param password clave de ingreso
     * @throws org.orm.PersistentException
     */
    public void addLogin(String idLogin, String password) throws PersistentException {
//        try {
            PersistentTransaction t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
            try {
                Login login = LoginDAO.createLogin();
                login.setIdLogin(idLogin);
                login.setPassword(password);
                LoginDAO.save(login);
               
                t.commit();
                
               
            } catch (PersistentException e) {
                t.rollback();
            }
//        } catch (PersistentException ex) {
//            Logger.getLogger(InsertarDatos.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    /**
     * Agrega Usuario a la base de datos
     * @param nombre nombre del usuario
     * @param apellido apellido del usuario
     * @param matricula matricula del usuario
     * @param run run del usuario
     * @param pga pga del usuario
     * @param sexo sexo del usuario
     * @param edad edad del usuario
     * @param fechaNacimiento fecha de nacimiento del usuario
     * @param nacionalidad nacionalidad del usuario
     * @param telefono telefono del usuario
     * @param email email del usuario
     * @param login datos de login del usuario
     */
    public void addUsuario(String nombre, String apellido, String matricula, String run, double pga, String sexo,
            String edad, String fechaNacimiento, String nacionalidad, String telefono, String email, Login login) {
        try {
            PersistentTransaction t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
            try {
                
                Usuario user = UsuarioDAO.createUsuario();
                
                user.setNombre(nombre);
                user.setApellido(apellido);
                user.setMatricula(matricula);
                user.setRun(run);
                user.setPga(pga);
                user.setSexo(sexo);
                user.setEdad(edad);
                user.setFechaNacimiento(fechaNacimiento);
                user.setNacionalidad(nacionalidad);
                user.setTelefono(telefono);
                user.setEmail(email);
                user.setLoginidLogin(login);
                
                
                UsuarioDAO.save(user);
                t.commit();
            } catch (PersistentException e) {
                t.rollback();
            }
        } catch (PersistentException ex) {
            Logger.getLogger(InsertarDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Agrega Smestre a la base de datos
     * @param numSemestre semestre que se cursa
     * @param anioSemestre año del semestre que se cursa
     * @param cantRamos cantidad de ramos del semestre
     * @param cantHoras cantidad de horas semanales del semestre 
     * @param estado 
     * @param user usuario relacionado al semestre
     */
    public void addSemestre(int numSemestre, int anioSemestre, int cantRamos, int cantHoras,int estado ,Usuario user) {
        try {
            PersistentTransaction t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
            try {
                Semestre semestre = SemestreDAO.createSemestre();
                semestre.setNumeroSemestre(numSemestre);
                semestre.setAñoSemestre(anioSemestre);
                semestre.setCantRamos(cantRamos);
                semestre.setCantHorasSemanalesTotales(cantHoras);
                semestre.setEstadoSemestre(estado);
                semestre.setUsuarioidUsuario(user);
                SemestreDAO.save(semestre);
                t.commit();
            } catch (PersistentException e) {
                t.rollback();
            }
        } catch (PersistentException ex) {
            Logger.getLogger(InsertarDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Agrega Evento a la base de datos
     * @param content descripcion del evento
     * @param anio año en el que ocurre el evento
     * @param mes mes en el que ocurre el evento
     * @param dia dia en el que ocurre el evento
     * @param color color con el que aparecera el evento
     * @param semestre semestre relacionado al evento
     */
    public void addEvento(String content, int anio, int mes, int dia, String color, Semestre semestre) {
        try {
            PersistentTransaction t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
            try {
                Evento evento = EventoDAO.createEvento();
                evento.setContent(content);
                evento.setAño(anio);
                evento.setMes(mes);
                evento.setDia(dia);
                evento.setColor(color);
                evento.setSemestreidSemestre(semestre);
               
                EventoDAO.save(evento);
                t.commit();
            } catch (PersistentException e) {
                t.rollback();
            }
        } catch (PersistentException ex) {
            Logger.getLogger(InsertarDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Agrega Ramo a la base de datos
     * @param nombre nombre del ramo
     * @param codigo codigo del ramo
     * @param tipoAprobacion tipo de aprobacion del ramo
     * @param cantNotasTeo cantidad de notas teoricas que posee el ramo
     * @param cantNotasPract cantiddad de notas practicas que posee el ramo
     * @param pondTeo ponderacion de la parte teorica del ramo
     * @param pondPract ponderacion de la parte practica del ramo
     * @param horasSem horas semanales del ramo
     * @param semestre semestre o nivel al que pertenece el ramo
     */
    public void addRamo(String nombre, int codigo, String tipoAprobacion, int cantNotasTeo, int cantNotasPract,
            double pondTeo, double pondPract, int horasSem, Semestre semestre) {
        try {
            PersistentTransaction t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
            try {
                Ramo ramo = RamoDAO.createRamo();
                ramo.setNombreRamo(nombre);
                ramo.setCodigoRamo(codigo);
                ramo.setTipoAprobacion(tipoAprobacion);
                ramo.setCantNotasTeoricas(cantNotasTeo);
                ramo.setCantNotasPracticas(cantNotasPract);
                ramo.setPonderacionTeorica(pondTeo);
                ramo.setPoderacionPractica(pondPract);
                ramo.setHorasSemanales(horasSem);
                ramo.setSemestreidSemestre(semestre);
                RamoDAO.save(ramo);
                t.commit();
            } catch (PersistentException e) {
                t.rollback();
            }
        } catch (PersistentException ex) {
            Logger.getLogger(InsertarDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Agrega Horario a la base de datos
     * @param dia dia en el que se imparte el ramo
     * @param inicio hora de inicio del ramo
     * @param fin hora de finalización del ramo
     * @param sala sala del ramo
     * @param docente docente que imparte el ramo
     * @param ramo ramo relacionado al horario
     */
    public void addHorario(String dia, String inicio, String fin, String sala, String docente, Ramo ramo) {
        try {
            PersistentTransaction t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
            try {
                Horario horario = HorarioDAO.createHorario();
                horario.setDiaImpartido(dia);
                horario.setHoraInicio(inicio);
                horario.setHoraFIn(fin);
                horario.setSala(sala);
                horario.setDocente(docente);
                horario.setRamoidRamo(ramo);
                HorarioDAO.save(horario);
                t.commit();
            } catch (PersistentException e) {
                t.rollback();
            }
        } catch (PersistentException ex) {
            Logger.getLogger(InsertarDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Agregar Promedio Mixto a la base de datos
     * @param promPract 
     * @param promTeo
     * @param promFinal
     * @param ramo
     */
    public void addPromedioMixto(double promPract, double promTeo, double promFinal, Ramo ramo) {
        try {
            PersistentTransaction t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
            try {
                PromedioMixto promMixto = PromedioMixtoDAO.createPromedioMixto();
                promMixto.setPromPractico(promPract);
                promMixto.setPromTeorico(promTeo);
                promMixto.setPromFinal(promFinal);
                promMixto.setRamoidRamo(ramo);
                PromedioMixtoDAO.save(promMixto);
                t.commit();
            } catch (PersistentException e) {
                t.rollback();
            }
        } catch (PersistentException ex) {
            Logger.getLogger(InsertarDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * 
     * @param promFinal
     * @param ramo 
     */
    public void addPromedioSimple(double promFinal, Ramo ramo) {
        try {
            PersistentTransaction t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
            try {
                PromedioSimple promSimple = PromedioSimpleDAO.createPromedioSimple();
                promSimple.setPromFinal(promFinal);
                promSimple.setRamoidRamo(ramo);
                PromedioSimpleDAO.save(promSimple);
                t.commit();
            } catch (PersistentException e) {
                t.rollback();
            }
        } catch (PersistentException ex) {
            Logger.getLogger(InsertarDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Agrega Notas Teoricas a la base de datos
     * @param notaTeo nota de la evaluacion teorica
     * @param pondTeo ponderacion de la nota
     * @param ramo ramo relacionado
     */
    public void addNotasTeorico(double notaTeo, double pondTeo, Ramo ramo){
        try {
            PersistentTransaction t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
            try {
                NotasTeorico notasTeo = NotasTeoricoDAO.createNotasTeorico();
                notasTeo.setNotaTeorica(notaTeo);
                notasTeo.setPondTeorica(pondTeo);
                notasTeo.setRamoidRamo(ramo);
                notasTeo.setORM_RamoidRamo(ramo);
                NotasTeoricoDAO.save(notasTeo);
                t.commit();
            } catch (PersistentException e) {
                t.rollback();
            }
        } catch (PersistentException ex) {
            Logger.getLogger(InsertarDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Agrega Nota Practica a la base de datos
     * @param notaPract nota de la evaluación practica
     * @param pondPract ponderacion de la evaluación
     * @param ramo ramo relacionado
     */
    public void addNotasPractico(double notaPract, double pondPract, Ramo ramo){
        try {
            PersistentTransaction t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
            try {
                NotasPractico notasPract = NotasPracticoDAO.createNotasPractico();
                notasPract.setNotaPractica(notaPract);
                notasPract.setPondPractico(pondPract);
                notasPract.setRamoidRamo(ramo);
                notasPract.setORM_RamoidRamo(ramo);
                NotasPracticoDAO.save(notasPract);
                t.commit();
            } catch (PersistentException e) {
                t.rollback();
            }
        } catch (PersistentException ex) {
            Logger.getLogger(InsertarDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Agrega Carrera a la base de datos
     * @param nombre nombre de la carrera
     * @param cantSemestres cantidad de semestres de la carrera
     * @param universidad  universidad a la que pertenece la carrera
     * @param user
     */
    public void addCarrera(String nombre,int cantSemestres,String universidad,Usuario user){
        try {
            PersistentTransaction t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
            try {
                Carrera carrera = CarreraDAO.createCarrera();
                carrera.setNombreCarrera(nombre);
                carrera.setCantSemestres(cantSemestres);
                carrera.setUniversidad(universidad);
                carrera.setUsuarioidUsuario(user);
                CarreraDAO.save(carrera);
                t.commit();
            } catch (PersistentException e) {
                t.rollback();
            }
        } catch (PersistentException ex) {
            Logger.getLogger(InsertarDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Agrega Dirección a la base de datos
     * @param pais pais de la dirección
     * @param ciudad ciudad de la dirección
     * @param comuna comuna de la dirección
     * @param user usuario relacionado a la dirección
     */
    public void addDireccion(String pais,String ciudad,String comuna,Usuario user){
        try {
            PersistentTransaction t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
            try {
                Direccion direccion = DireccionDAO.createDireccion();
                direccion.setPaisRecidencia(pais);
                direccion.setCiudad(ciudad);
                direccion.setComuna(comuna);
                direccion.setUsuarioidUsuario(user);
                DireccionDAO.save(direccion);
                t.commit();
            } catch (PersistentException e) {
                t.rollback();
            }
        } catch (PersistentException ex) {
            Logger.getLogger(InsertarDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Agrega Domicilio a la base de datos
     * @param calle calle del domicilio
     * @param numeracion numeración del domicilio
     * @param depto departamento del domicilio
     * @param direccion dirección relacionada al domicilio
     */
    public void addDomicilio(String calle,int numeracion, int depto,Direccion direccion){
        try {
            PersistentTransaction t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
            try {
                Domicilio domicilio = DomicilioDAO.createDomicilio();
                domicilio.setCalle(calle);
                domicilio.setNumeracion(numeracion);
                domicilio.setDepto(depto);
                domicilio.setDireccionidDireccion(direccion);
                DomicilioDAO.save(domicilio);
                t.commit();
            } catch (PersistentException e) {
                t.rollback();
            }
        } catch (PersistentException ex) {
            Logger.getLogger(InsertarDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Agrega Historial a la base de datos
     * @param semestre nivel del semestre que se cura
     * @param anio año del semestre que se cura
     * @param idSemestre semestre relacionado
     */
    public void addHistorial(int semestre, int anio, Semestre idSemestre){
        try {
            PersistentTransaction t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
            try {
                Historial historial = HistorialDAO.createHistorial();
                historial.setSemestre(semestre);
                historial.setAño(anio);
                historial.setSemestreidSemestre(idSemestre);
                HistorialDAO.save(historial);
                t.commit();
            } catch (PersistentException e) {
                t.rollback();
            }
        } catch (PersistentException ex) {
            Logger.getLogger(InsertarDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Agrega RamoAprobado a la base de datos
     * @param nombre nombre del ramo
     * @param nota promedio final del ramo
     * @param historial historial relacionado
     */
    public void addRamoAprobado(String nombre,double nota,Historial historial){
        try {
            PersistentTransaction t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
            try {
                RamoAprobado ramoAprobado = RamoAprobadoDAO.createRamoAprobado();
                ramoAprobado.setNombreRamo(nombre);
                ramoAprobado.setNotaAprobacion(nota);
                ramoAprobado.setHistorialidHistorial(historial);
                ramoAprobado.setORM_HistorialidHistorial(historial);
                RamoAprobadoDAO.save(ramoAprobado);
                t.commit();
            } catch (PersistentException e) {
                t.rollback();
            }
        } catch (PersistentException ex) {
            Logger.getLogger(InsertarDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Agrega RamoReprobado a la base de datos
     * @param nombre nombre del ramo
     * @param nota nota final del ramo
     * @param historial historial relacionado
     */
    public void addRamoReprobado(String nombre, double nota,Historial historial){
        try {
            PersistentTransaction t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
            try {
                RamoReprobado ramoReprobado = RamoReprobadoDAO.createRamoReprobado();
                ramoReprobado.setNombreRamo(nombre);
                ramoReprobado.setNotaReprobacion(nota);
                ramoReprobado.setHistorialidHistorial(historial);
                ramoReprobado.setORM_HistorialidHistorial(historial);
                RamoReprobadoDAO.save(ramoReprobado);
                t.commit();
            } catch (PersistentException e) {
                t.rollback();
            }
        } catch (PersistentException ex) {
            Logger.getLogger(InsertarDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
