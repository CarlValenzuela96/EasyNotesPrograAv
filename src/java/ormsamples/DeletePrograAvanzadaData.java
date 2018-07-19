/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeletePrograAvanzadaData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
		try {
			clases.Domicilio clasesDomicilio = clases.DomicilioDAO.loadDomicilioByQuery(null, null);
			// Delete the persistent object
			clases.DomicilioDAO.delete(clasesDomicilio);
			clases.Historial clasesHistorial = clases.HistorialDAO.loadHistorialByQuery(null, null);
			// Delete the persistent object
			clases.HistorialDAO.delete(clasesHistorial);
			clases.Semestre clasesSemestre = clases.SemestreDAO.loadSemestreByQuery(null, null);
			// Delete the persistent object
			clases.SemestreDAO.delete(clasesSemestre);
			clases.Usuario clasesUsuario = clases.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Delete the persistent object
			clases.UsuarioDAO.delete(clasesUsuario);
			clases.RamoAprobado clasesRamoAprobado = clases.RamoAprobadoDAO.loadRamoAprobadoByQuery(null, null);
			// Delete the persistent object
			clases.RamoAprobadoDAO.delete(clasesRamoAprobado);
			clases.Login clasesLogin = clases.LoginDAO.loadLoginByQuery(null, null);
			// Delete the persistent object
			clases.LoginDAO.delete(clasesLogin);
			clases.Ramo clasesRamo = clases.RamoDAO.loadRamoByQuery(null, null);
			// Delete the persistent object
			clases.RamoDAO.delete(clasesRamo);
			clases.NotasTeorico clasesNotasTeorico = clases.NotasTeoricoDAO.loadNotasTeoricoByQuery(null, null);
			// Delete the persistent object
			clases.NotasTeoricoDAO.delete(clasesNotasTeorico);
			clases.Horario clasesHorario = clases.HorarioDAO.loadHorarioByQuery(null, null);
			// Delete the persistent object
			clases.HorarioDAO.delete(clasesHorario);
			clases.PromedioSimple clasesPromedioSimple = clases.PromedioSimpleDAO.loadPromedioSimpleByQuery(null, null);
			// Delete the persistent object
			clases.PromedioSimpleDAO.delete(clasesPromedioSimple);
			clases.Carrera clasesCarrera = clases.CarreraDAO.loadCarreraByQuery(null, null);
			// Delete the persistent object
			clases.CarreraDAO.delete(clasesCarrera);
			clases.PromedioMixto clasesPromedioMixto = clases.PromedioMixtoDAO.loadPromedioMixtoByQuery(null, null);
			// Delete the persistent object
			clases.PromedioMixtoDAO.delete(clasesPromedioMixto);
			clases.RamoReprobado clasesRamoReprobado = clases.RamoReprobadoDAO.loadRamoReprobadoByQuery(null, null);
			// Delete the persistent object
			clases.RamoReprobadoDAO.delete(clasesRamoReprobado);
			clases.Direccion clasesDireccion = clases.DireccionDAO.loadDireccionByQuery(null, null);
			// Delete the persistent object
			clases.DireccionDAO.delete(clasesDireccion);
			clases.NotasPractico clasesNotasPractico = clases.NotasPracticoDAO.loadNotasPracticoByQuery(null, null);
			// Delete the persistent object
			clases.NotasPracticoDAO.delete(clasesNotasPractico);
			clases.Evento clasesEvento = clases.EventoDAO.loadEventoByQuery(null, null);
			// Delete the persistent object
			clases.EventoDAO.delete(clasesEvento);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeletePrograAvanzadaData deletePrograAvanzadaData = new DeletePrograAvanzadaData();
			try {
				deletePrograAvanzadaData.deleteTestData();
			}
			finally {
				clases.PrograAvanzadaPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
