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
import java.util.logging.Level;
import java.util.logging.Logger;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

/**
 *
 * @author Sebastian Gonzalez
 */
public class UpdateData {

    public UpdateData() {
    }

    /**
     * Método que carga mediante id un objeto Login. Se le ingresaran los nuevos
     * datos, ingresados mediante parametros.
     *
     * @param idLogin parametro id del objeto Login a actualizar.
     * @param password nueva password a ingresar.
     */
    public void updateLogin(String idLogin, String password) {
        try {
            PersistentTransaction t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
            try {
                t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
                Login login = LoginDAO.loadLoginByORMID(idLogin);
                if (password != null) {
                    login.setPassword(password);
                }
                LoginDAO.save(login);
                t.commit();
            } catch (PersistentException ex) {
                t.rollback();
            }
        } catch (PersistentException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Método que carga mediante id un objeto Usuario. Se le ingresaran los
     * nuevos datos, ingresados mediante parametros.
     *
     * @param idUsuario parametro id del objeto Usuario a actualizar.
     * @param nombre nuevo nombre a ingresar.
     * @param apellido nuevo apellido a ingresar.
     * @param matricula nueva matricula a ingresar.
     * @param run nuevo run a ingresar.
     * @param pga nuevo pga(promedio general acumulado) a ingresar.
     * @param sexo nuevo parametro de género a ingresar.
     * @param edad nueva edad a ingresar.
     * @param fechaNacimiento nueva fecha de nacimiento a ingresar.
     * @param nacionalidad nueva nacionalidad a ingresar.
     * @param telefono nuevo número de telefono a ingresar.
     * @param email nuevo correo electrónico a ingresasr.
     * @param login nueva id de objeto Login relacionado a Usuario.
     */
    public void updateUsuario(String idUsuario, String nombre, String apellido, String matricula, String run,
            String pga, String sexo, String edad, String fechaNacimiento, String nacionalidad, String telefono,
            String email, Login login) {
        try {
            PersistentTransaction t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
            try {
                t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
                Usuario user = UsuarioDAO.loadUsuarioByORMID(Integer.parseInt(idUsuario));
                if (nombre != null) {
                    user.setNombre(nombre);
                }
                if (apellido != null) {
                    user.setApellido(apellido);
                }
                if (matricula != null) {
                    user.setMatricula(matricula);
                }
                if (run != null) {
                    user.setRun(run);
                }
                if (pga != null) {
                    user.setPga(Double.parseDouble(pga));
                }
                if (sexo != null) {
                    user.setSexo(sexo);
                }
                if (edad != null) {
                    user.setEdad(edad);
                }
                if (fechaNacimiento != null) {
                    user.setFechaNacimiento(fechaNacimiento);
                }
                if (nacionalidad != null) {
                    user.setNacionalidad(nacionalidad);
                }
                if (telefono != null) {
                    user.setTelefono(telefono);
                }
                if (email != null) {
                    user.setEmail(email);
                }
                if (login != null) {
                    user.setLoginidLogin(login);

                }
                UsuarioDAO.save(user);
                t.commit();
            } catch (PersistentException ex) {
                t.rollback();
            }
        } catch (PersistentException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Método que carga mediante id un objeto Semestre. Se le ingresaran los
     * nuevos datos, ingresados mediante parametros.
     *
     * @param idSemestre id del objeto Semestre a actualizar.
     * @param numeroSemestre nuevo número del semestre a ingresar.
     * @param añoSemestre nuevo año al cual pertenecera el semestre.
     * @param cantRamos nueva cantidad de ramos que tendra el semestre.
     * @param cantHorasSem nueva cantidad de horas a ingresar.
     * @param estado nuevo estado de semestre a ingresar.
     * @param user nueva id del Usuario relacionado a Semestre a modificar.
     */
    public void updateSemestre(int idSemestre, String numeroSemestre, String añoSemestre, String cantRamos,
            String cantHorasSem, String estado, Usuario user) {
        try {
            PersistentTransaction t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
            try {
                t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
                Semestre semestre = SemestreDAO.loadSemestreByORMID(idSemestre);
                if (numeroSemestre != null) {
                    semestre.setNumeroSemestre(Integer.parseInt(numeroSemestre));
                }
                if (añoSemestre != null) {
                    semestre.setAñoSemestre(Integer.parseInt(añoSemestre));
                }
                if (cantRamos != null) {
                    semestre.setCantRamos(Integer.parseInt(cantRamos));
                }
                if (cantHorasSem != null) {
                    semestre.setCantHorasSemanalesTotales(Integer.parseInt(cantHorasSem));
                }
                if (estado != null) {
                    semestre.setEstadoSemestre(Integer.parseInt(estado));
                }
                if (user != null) {
                    semestre.setUsuarioidUsuario(user);
                }
                SemestreDAO.save(semestre);
                t.commit();
            } catch (PersistentException ex) {
                t.rollback();
            }
        } catch (PersistentException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Método que carga mediante id un objeto Evento. Se le ingresaran los
     * nuevos datos, ingresados mediante parametros.
     *
     * @param idEvento id del Evento a actualizar.
     * @param content nuevo contenido a actualizar.
     * @param año nuevo año al que pertencera el evento.
     * @param mes nuevo mes al que pertenecera el evento.
     * @param dia nuevo día al que pertenecera el evento.
     * @param color nuevo color a ingresar.
     * @param semestre nueva id del Semestre relacionado al Evento.
     */
    public void updateEvento(String idEvento, String content, String año, String mes, String dia, String color,
            Semestre semestre) {
        try {
            PersistentTransaction t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
            try {
                t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
                Evento evento = EventoDAO.loadEventoByORMID(Integer.parseInt(idEvento));
                if (content != null) {
                    evento.setContent(content);
                }
                if (año != null) {
                    evento.setAño(Integer.parseInt(año));
                }
                if (mes != null) {
                    evento.setMes(Integer.parseInt(mes));
                }
                if (dia != null) {
                    evento.setDia(Integer.parseInt(dia));
                }
                if (semestre != null) {
                    evento.setSemestreidSemestre(semestre);
                }
                EventoDAO.save(evento);
                t.commit();

            } catch (PersistentException ex) {
                t.rollback();
            }
        } catch (PersistentException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Método que carga mediante id un objeto Ramo. Se le ingresaran los nuevos
     * datos, ingresados mediante parametros.
     *
     * @param idRamo id del Ramo a actualizar.
     * @param nombre nuevo nombre del ramo.
     * @param codigo nuevo código del ramo.
     * @param tipoAproba nuevo tipo de aprobación del ramo.
     * @param cantNotasTeoricas nueva cantidad de notas teóricas a ingresar.
     * @param cantNotasPracticas nueva cantidad de notas prácticas a ingresar.
     * @param pondTeorica nueva ponderación teórica a ingresar.
     * @param pondPractica nueva ponderación práctica a ingresar.
     * @param horasSeman nueva canidad de horas semenales del ramo a actualizar.
     * @param semestre nueva id del Semestre relacionado a Ramo.
     */
    public void updateRamo(String idRamo, String nombre, String codigo, String tipoAproba, String cantNotasTeoricas,
            String cantNotasPracticas, String pondTeorica, String pondPractica, String horasSeman, Semestre semestre) {
        try {
            PersistentTransaction t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
            try {
                t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
                Ramo ramo = RamoDAO.loadRamoByORMID(Integer.parseInt(idRamo));
                if (nombre != null) {
                    ramo.setNombreRamo(nombre);
                }
                if (codigo != null) {
                    ramo.setCodigoRamo(Integer.parseInt(codigo));
                }
                if (tipoAproba != null) {
                    ramo.setTipoAprobacion(tipoAproba);
                }
                if (cantNotasTeoricas != null) {
                    ramo.setCantNotasTeoricas(Integer.parseInt(cantNotasTeoricas));
                }
                if (cantNotasPracticas != null) {
                    ramo.setCantNotasPracticas(Integer.parseInt(cantNotasPracticas));
                }
                if (pondTeorica != null) {
                    ramo.setPonderacionTeorica(Double.parseDouble(pondTeorica));
                }
                if (pondPractica != null) {
                    ramo.setPoderacionPractica(Double.parseDouble(pondPractica));
                }
                if (horasSeman != null) {
                    ramo.setHorasSemanales(Integer.parseInt(horasSeman));
                }
                if (semestre != null) {
                    ramo.setSemestreidSemestre(semestre);
                }
                SemestreDAO.save(semestre);
                t.commit();
            } catch (PersistentException ex) {
                t.rollback();
            }
        } catch (PersistentException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Método que carga mediante id un objeto Horario. Se le ingresaran los
     * nuevos datos, ingresados mediante parametros.
     *
     * @param idHorario id del Horario a actualizar.
     * @param dia nuevo día que tendra el horario.
     * @param horaInicio nueva hora de incio del horario.
     * @param horaFin nueva hora de fin del horario.
     * @param sala nueva sala a ingresar.
     * @param docente nuevo docente a ingresar.
     * @param ramo nueva id del Ramo relacionado a Horario.
     */
    public void updateHorario(String idHorario, String dia, String horaInicio, String horaFin, String sala, String docente,
            Ramo ramo) {
        try {
            PersistentTransaction t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
            try {
                t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
                Horario horario = HorarioDAO.loadHorarioByORMID(Integer.parseInt(idHorario));
                if (dia != null) {
                    horario.setDiaImpartido(dia);
                }
                if (horaInicio != null) {
                    horario.setHoraInicio(horaInicio);
                }
                if (horaFin != null) {
                    horario.setHoraFIn(horaFin);
                }
                if (sala != null) {
                    horario.setSala(sala);
                }
                if (docente != null) {
                    horario.setDocente(docente);
                }
                if (ramo != null) {
                    horario.setRamoidRamo(ramo);
                }
                HorarioDAO.save(horario);
                t.commit();
            } catch (PersistentException ex) {
                t.rollback();
            }
        } catch (PersistentException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Método que carga mediante id un objeto PromedioMixto. Se le ingresaran
     * los nuevos datos, ingresados mediante parametros.
     *
     * @param idPromedioMixto id del PromedioMixto a actualizar.
     * @param promPractico nuevo promedio práctico del promedio.
     * @param promTeorico nuevo promedio teórico del promedio.
     * @param promFinal nuevo promedio final del promedio mixto.
     * @param ramo nueva id del Ramo relacionado al PromedioMixto.
     */
    public void updatePromedioMixto(int idPromedioMixto, String promPractico, String promTeorico, String promFinal,
            Ramo ramo) {
        try {
            PersistentTransaction t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
            try {
                t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
                PromedioMixto promM = PromedioMixtoDAO.loadPromedioMixtoByORMID(idPromedioMixto);
                if (promPractico != null) {
                    promM.setPromPractico(Double.parseDouble(promPractico));
                }
                if (promTeorico != null) {
                    promM.setPromTeorico(Double.parseDouble(promTeorico));
                }
                if (promFinal != null) {
                    promM.setPromFinal(Double.parseDouble(promFinal));
                }
                if (ramo != null) {
                    promM.setRamoidRamo(ramo);
                }
                PromedioMixtoDAO.save(promM);
                t.commit();
            } catch (PersistentException ex) {
                t.rollback();
            }
        } catch (PersistentException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Método que carga mediante id un objeto PromedioSimple. Se le ingresaran
     * los nuevos datos, ingresados mediante parametros.
     *
     * @param idPromedioSimple id del PromedioSimple a actualizar.
     * @param promFinal nuevo promedio final a ingresar.
     * @param ramo nueva id del Ramo relacionado a PromedioSimple.
     */
    public void updatePromedioSimple(int idPromedioSimple, String promFinal, Ramo ramo) {
        try {
            PersistentTransaction t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
            try {
                t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
                PromedioSimple promS = PromedioSimpleDAO.loadPromedioSimpleByORMID(idPromedioSimple);
                if (promFinal != null) {
                    promS.setPromFinal(Double.parseDouble(promFinal));
                }
                if (ramo != null) {
                    promS.setRamoidRamo(ramo);
                }
                PromedioSimpleDAO.save(promS);
                t.commit();
            } catch (PersistentException ex) {
                t.rollback();
            }
        } catch (PersistentException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Método que carga mediante id un objeto NotasTeorico. Se le ingresaran los
     * nuevos datos, ingresados mediante parametros.
     *
     * @param idNotasTeorico id de objeto NotasTeorico a actualizar.
     * @param notaTeorico nueva nota a ingresar.
     * @param pondTeorico nueva ponderación a ingresar.
     * @param ramo nueva id del Ramos relacionado a NotasTeorico.
     */
    public void updateNotasTeorico(int idNotasTeorico, String notaTeorico, String pondTeorico, Ramo ramo) {
        try {
            PersistentTransaction t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
            try {
                t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
                NotasTeorico notasT = NotasTeoricoDAO.loadNotasTeoricoByORMID(idNotasTeorico);
                if (notaTeorico != null) {
                    notasT.setNotaTeorica(Double.parseDouble(notaTeorico));
                }
                if (pondTeorico != null) {
                    notasT.setPondTeorica(Double.parseDouble(pondTeorico));
                }
                if (ramo != null) {
                    notasT.setRamoidRamo(ramo);
                }
                NotasTeoricoDAO.save(notasT);

                t.commit();

            } catch (PersistentException ex) {
                t.rollback();
            }

        } catch (PersistentException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Método que carga mediante id un objeto NotasPractica. Se le ingresaran
     * los nuevos datos, ingresados mediante parametros.
     *
     * @param idNotasPractica id del objeto NotasPracticas a actualizar.
     * @param notaPractica nueva nota a ingresar.
     * @param pondPractico nueva ponderación a ingresar.
     * @param ramo nueva id del objeto Ramo relacionado a NotasPracticas.
     */
    public void updateNotasPractica(int idNotasPractica, String notaPractica, String pondPractico, Ramo ramo) {
        try {
            PersistentTransaction t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
            try {
                t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
                NotasPractico notasP = NotasPracticoDAO.loadNotasPracticoByORMID(idNotasPractica);
                if (notaPractica != null) {
                    notasP.setNotaPractica(Double.parseDouble(notaPractica));
                }
                if (pondPractico != null) {
                    notasP.setPondPractico(Double.parseDouble(pondPractico));
                }
                if (ramo != null) {
                    notasP.setRamoidRamo(ramo);
                }
                NotasPracticoDAO.save(notasP);
                t.commit();
            } catch (PersistentException ex) {
                t.rollback();
            }
        } catch (PersistentException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Método que carga mediante id un objeto Carrera. Se le ingresaran los
     * nuevos datos, ingresados mediante parametros.
     *
     * @param idCarrera id de objeto Carrera a actualizar.
     * @param nombre nuevo nombre de la carrera.
     * @param cantSemestre nueva cantidad de semestres, de duracion que tiene la
     * carrera.
     * @param universidad nuevo nombre de la universidad de la carrera.
     * @param user nueva id del objeto Usuario relacionado a Carrera.
     */
    public void updateCarrera(String idCarrera, String nombre, String cantSemestre, String universidad, Usuario user) {
        try {
            PersistentTransaction t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
            try {
                t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
                Carrera carrera = CarreraDAO.loadCarreraByORMID(Integer.parseInt(idCarrera));
                if (nombre != null) {
                    carrera.setNombreCarrera(nombre);
                }
                if (cantSemestre != null) {
                    carrera.setCantSemestres(Integer.parseInt(cantSemestre));
                }
                if (universidad != null) {
                    carrera.setUniversidad(universidad);
                }
                if (user != null) {
                    carrera.setUsuarioidUsuario(user);
                }
                CarreraDAO.save(carrera);
                t.commit();
            } catch (PersistentException ex) {
                t.rollback();
            }
        } catch (PersistentException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Método que carga mediante id un objeto Direccion. Se le ingresaran los
     * nuevos datos, ingresados mediante parametros.
     *
     * @param idDireccion id del objeto Direccion a actualizar.
     * @param pais nuevo país a ingresar.
     * @param ciudad nueva ciudad a ingresar.
     * @param comuna nueva comuna a ingresar.
     * @param user nueva id del objeto Usuario relacionado a Direccion.
     */
    public void updateDireccion(String idDireccion, String pais, String ciudad, String comuna, Usuario user) {
        try {
            PersistentTransaction t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
            try {
                t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
                Direccion direccion = DireccionDAO.loadDireccionByORMID(Integer.parseInt(idDireccion));
                if (pais != null) {
                    direccion.setPaisRecidencia(pais);
                }
                if (ciudad != null) {
                    direccion.setCiudad(ciudad);
                }
                if (comuna != null) {
                    direccion.setComuna(comuna);
                }
                if (user != null) {
                    direccion.setUsuarioidUsuario(user);
                }
                DireccionDAO.save(direccion);
                t.commit();
            } catch (PersistentException ex) {
                t.rollback();
            }
        } catch (PersistentException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Método que carga mediante id un objeto Domicilio. Se le ingresaran los
     * nuevos datos, ingresados mediante parametros.
     *
     * @param idDomicilio id del objeto Domicilio a actualizar.
     * @param calle nueva calle a ingresar.
     * @param numeracion nueva numeración a ingresar.
     * @param depto nuevo número de departamento a ingresar.
     * @param direccion nueva id del objeto Direccion relacionado a Domicilio.
     */
    public void updateDomicilio(String idDomicilio, String calle, String numeracion, String depto, Direccion direccion) {
        try {
            PersistentTransaction t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
            try {
                t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
                Domicilio domicilio = DomicilioDAO.loadDomicilioByORMID(Integer.parseInt(idDomicilio));
                if (calle != null) {
                    domicilio.setCalle(calle);
                }
                if (numeracion != null) {
                    domicilio.setNumeracion(Integer.parseInt(numeracion));
                }
                if (depto != null) {
                    domicilio.setDepto(Integer.parseInt(depto));
                }
                if (direccion != null) {
                    domicilio.setDireccionidDireccion(direccion);
                }
                DomicilioDAO.save(domicilio);
                t.commit();
            } catch (PersistentException ex) {
                t.rollback();
            }
        } catch (PersistentException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Método que carga mediante id un objeto Historial. Se le ingresaran los
     * nuevos datos, ingresados mediante parametros.
     *
     * @param idHistorial id del objeto Historial a actualizar.
     * @param semestre nuevo semestre a ingresar.
     * @param año nuevo año a ingresar.
     * @param semes nueva id del objeto Semestre relacionado con Historial.
     */
    public void updateHistorial(String idHistorial, String semestre, String año, Semestre semes) {
        try {
            PersistentTransaction t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
            try {
                t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
                Historial historial = HistorialDAO.loadHistorialByORMID(Integer.parseInt(idHistorial));
                if (semestre != null) {
                    historial.setSemestre(Integer.parseInt(semestre));
                }
                if (año != null) {
                    historial.setAño(Integer.parseInt(año));
                }
                if (semes != null) {
                    historial.setSemestreidSemestre(semes);
                }
                HistorialDAO.save(historial);
                t.commit();
            } catch (PersistentException ex) {
                t.rollback();
            }
        } catch (PersistentException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Método que carga mediante id un objeto RamoAprobado. Se le ingresaran los
     * nuevos datos, ingresados mediante parametros.
     *
     * @param idRamoAprobado id del objeto RamoAprobado a actualizar.
     * @param nombre nuevo nombre del ramo.
     * @param nota nueva nota del ramo.
     * @param historial nueva id del objeto Historial relacionado con
     * RamoAprobado.
     */
    public void updateRamoAprobado(String idRamoAprobado, String nombre, String nota, Historial historial) {
        try {
            PersistentTransaction t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
            try {
                t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
                RamoAprobado ramo = RamoAprobadoDAO.loadRamoAprobadoByORMID(Integer.parseInt(idRamoAprobado));
                if (nombre != null) {
                    ramo.setNombreRamo(nombre);
                }
                if (nota != null) {
                    ramo.setNombreRamo(nota);
                }
                if (historial != null) {
                    ramo.setHistorialidHistorial(historial);
                }
                RamoAprobadoDAO.save(ramo);
                t.commit();
            } catch (PersistentException ex) {
                t.rollback();
            }
        } catch (PersistentException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Método que carga mediante id un objeto RamoReprobado. Se le ingresaran
     * los nuevos datos, ingresados mediante parametros.
     *
     * @param idRamoReprobado id del objeto RamoReprobado a actualizar.
     * @param nombre nuevo nombre del ramo.
     * @param nota nueva nota del ramo.
     * @param historial nueva id del objeto Historial relacionado con
     * RamoAprobado.
     */
    public void updateRamoReprobado(String idRamoReprobado, String nombre, String nota, Historial historial) {
        try {
            PersistentTransaction t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
            try {
                t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
                RamoReprobado ramo = RamoReprobadoDAO.loadRamoReprobadoByORMID(Integer.parseInt(idRamoReprobado));
                if (nombre != null) {
                    ramo.setNombreRamo(nombre);
                }
                if (nota != null) {
                    ramo.setNombreRamo(nota);
                }
                if (historial != null) {
                    ramo.setHistorialidHistorial(historial);
                }
                RamoReprobadoDAO.save(ramo);
                t.commit();
            } catch (PersistentException ex) {
                t.rollback();
            }
        } catch (PersistentException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
