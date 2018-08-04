
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
 * Clase de eliminacion de datos
 *
 * @author Sebastian Gozalez
 */
public class DropByID {

    public DropByID() {
    }

    public void dropLogin(String idLogin) {
        try {
            PersistentTransaction t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
            try {
                Login login = LoginDAO.loadLoginByQuery("idLogin = " + idLogin, null);
                LoginDAO.delete(login);
                t.commit();
            } catch (PersistentException e) {
                t.rollback();
            }
        } catch (PersistentException ex) {
            Logger.getLogger(DropByID.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void dropUsuario(String id) {
        try {
            PersistentTransaction t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
            try {
                Usuario user = UsuarioDAO.loadUsuarioByQuery("idUsuario = " + id, null);
                UsuarioDAO.delete(user);
                t.commit();
            } catch (PersistentException e) {
                t.rollback();
            }
        } catch (PersistentException ex) {
            Logger.getLogger(DropByID.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void dropSemestre(String id) {
        try {
            PersistentTransaction t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
            try {
                Semestre semestre = SemestreDAO.loadSemestreByQuery("idSemestre = " + id, null);
                SemestreDAO.delete(semestre);
                t.commit();
            } catch (PersistentException e) {
                t.rollback();
            }
        } catch (PersistentException ex) {
            Logger.getLogger(DropByID.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void dropEvento(String id) {
        try {
            PersistentTransaction t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
            try {
                Evento evento = EventoDAO.loadEventoByQuery("idEvento = " + id, null);
                EventoDAO.delete(evento);
                t.commit();
            } catch (PersistentException e) {
                t.rollback();
            }
        } catch (PersistentException ex) {
            Logger.getLogger(DropByID.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void dropRamo(String id) {
        try {
            PersistentTransaction t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
            try {
                Ramo ramo = RamoDAO.loadRamoByQuery("idRamo = " + id, null);
                RamoDAO.delete(ramo);
                t.commit();
            } catch (PersistentException e) {
                t.rollback();
            }
        } catch (PersistentException ex) {
            Logger.getLogger(DropByID.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void dropHorario(String id) {
        try {
            PersistentTransaction t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
            try {
                Horario horario = HorarioDAO.loadHorarioByQuery("idHorario = " + id, null);
                HorarioDAO.delete(horario);
                t.commit();
            } catch (PersistentException e) {
                t.rollback();
            }
        } catch (PersistentException ex) {
            Logger.getLogger(DropByID.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void dropPromedioMixto(String id) {
        try {
            PersistentTransaction t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
            try {
                PromedioMixto promMixto = PromedioMixtoDAO.loadPromedioMixtoByQuery("idPromedioMixto = " + id, null);
                PromedioMixtoDAO.delete(promMixto);
                t.commit();
            } catch (PersistentException e) {
                t.rollback();
            }
        } catch (PersistentException ex) {
            Logger.getLogger(DropByID.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void dropPromedioSimple(String id) {
        try {
            PersistentTransaction t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
            try {
                PromedioSimple promSimple = PromedioSimpleDAO.loadPromedioSimpleByQuery("idPromedioSimple = " + id, null);
                PromedioSimpleDAO.delete(promSimple);
                t.commit();
            } catch (PersistentException e) {
                t.rollback();
            }
        } catch (PersistentException ex) {
            Logger.getLogger(DropByID.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void dropNotasTeorico(String id) {
        try {
            PersistentTransaction t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
            try {
                NotasTeorico notasTeorico = NotasTeoricoDAO.loadNotasTeoricoByQuery("idNotaTeorica = " + id, null);
                NotasTeoricoDAO.delete(notasTeorico);
                t.commit();
            } catch (PersistentException e) {
                t.rollback();
            }
        } catch (PersistentException ex) {
            Logger.getLogger(DropByID.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void dropNotasPractico(String id) {
        try {
            PersistentTransaction t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
            try {
                NotasPractico notasPractico = NotasPracticoDAO.loadNotasPracticoByQuery("idNotaPractica = " + id, null);
                NotasPracticoDAO.delete(notasPractico);
                t.commit();
            } catch (PersistentException e) {
                t.rollback();
            }
        } catch (PersistentException ex) {
            Logger.getLogger(DropByID.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void dropCarrera(String id) {
        try {
            PersistentTransaction t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
            try {
                Carrera carrera = CarreraDAO.loadCarreraByQuery("idCarrera = " + id, null);
                CarreraDAO.delete(carrera);
                t.commit();
            } catch (PersistentException e) {
                t.rollback();
            }
        } catch (PersistentException ex) {
            Logger.getLogger(DropByID.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void dropDireccion(String id) {
        try {
            PersistentTransaction t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
            try {
                Direccion direccion = DireccionDAO.loadDireccionByQuery("idDireccion = " + id, null);
                DireccionDAO.delete(direccion);
                t.commit();
            } catch (PersistentException e) {
                t.rollback();
            }
        } catch (PersistentException ex) {
            Logger.getLogger(DropByID.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void dropDomicilio(String id) {
        try {
            PersistentTransaction t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
            try {
                Domicilio domicilio = DomicilioDAO.loadDomicilioByQuery("idDomicilio = " + id, null);
                DomicilioDAO.delete(domicilio);
                t.commit();
            } catch (PersistentException e) {
                t.rollback();
            }
        } catch (PersistentException ex) {
            Logger.getLogger(DropByID.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void dropHistorial(String id) {
        try {
            PersistentTransaction t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
            try {
                Historial historial = HistorialDAO.loadHistorialByQuery("idHistorial = " + id, null);
                HistorialDAO.delete(historial);
                t.commit();
            } catch (PersistentException e) {
                t.rollback();
            }
        } catch (PersistentException ex) {
            Logger.getLogger(DropByID.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void dropRamoAprobado(String id) {
        try {
            PersistentTransaction t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
            try {
                RamoAprobado ramoAprobado = RamoAprobadoDAO.loadRamoAprobadoByQuery("idRamoAprobado = " + id, null);
                RamoAprobadoDAO.delete(ramoAprobado);
                t.commit();
            } catch (PersistentException e) {
                t.rollback();
            }
        } catch (PersistentException ex) {
            Logger.getLogger(DropByID.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void dropRamoReprobado(String id) {
        try {
            PersistentTransaction t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
            try {
                RamoReprobado ramoReprobado = RamoReprobadoDAO.loadRamoReprobadoByQuery("idRamoReprobacion = " + id, null);
                RamoReprobadoDAO.delete(ramoReprobado);
                t.commit();
            } catch (PersistentException e) {
                t.rollback();
            }
        } catch (PersistentException ex) {
            Logger.getLogger(DropByID.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
