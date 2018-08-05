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
    
    public void updateSemestre(int idSemestre, String numeroSemestre, String añoSemestre, String cantRamos,
            String cantHorasSem,String estado, Usuario user) {
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
                if (estado !=null) {
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
    
    public void updatePromedioMixto(String idPromedioMixto, String promPractico, String promTeorico, String promFinal,
            Ramo ramo) {
        try {
            PersistentTransaction t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
            try {
                t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
                PromedioMixto promM = PromedioMixtoDAO.loadPromedioMixtoByORMID(Integer.parseInt(idPromedioMixto));
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
    
    public void updatePromedioSimple(String idPromedioSimple, String promFinal, Ramo ramo) {
        try {
            PersistentTransaction t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
            try {
                t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
                PromedioSimple promS = PromedioSimpleDAO.loadPromedioSimpleByORMID(Integer.parseInt(idPromedioSimple));
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
