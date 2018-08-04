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
			clases.Domicilio lclasesDomicilio = clases.DomicilioDAO.loadDomicilioByQuery(null, null);
			// Delete the persistent object
			clases.DomicilioDAO.delete(lclasesDomicilio);
			clases.Historial lclasesHistorial = clases.HistorialDAO.loadHistorialByQuery(null, null);
			// Delete the persistent object
			clases.HistorialDAO.delete(lclasesHistorial);
			clases.Semestre lclasesSemestre = clases.SemestreDAO.loadSemestreByQuery(null, null);
			// Delete the persistent object
			clases.SemestreDAO.delete(lclasesSemestre);
			clases.Usuario lclasesUsuario = clases.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Delete the persistent object
			clases.UsuarioDAO.delete(lclasesUsuario);
			clases.RamoAprobado lclasesRamoAprobado = clases.RamoAprobadoDAO.loadRamoAprobadoByQuery(null, null);
			// Delete the persistent object
			clases.RamoAprobadoDAO.delete(lclasesRamoAprobado);
			clases.Login lclasesLogin = clases.LoginDAO.loadLoginByQuery(null, null);
			// Delete the persistent object
			clases.LoginDAO.delete(lclasesLogin);
			clases.Ramo lclasesRamo = clases.RamoDAO.loadRamoByQuery(null, null);
			// Delete the persistent object
			clases.RamoDAO.delete(lclasesRamo);
			clases.NotasTeorico lclasesNotasTeorico = clases.NotasTeoricoDAO.loadNotasTeoricoByQuery(null, null);
			// Delete the persistent object
			clases.NotasTeoricoDAO.delete(lclasesNotasTeorico);
			clases.Horario lclasesHorario = clases.HorarioDAO.loadHorarioByQuery(null, null);
			// Delete the persistent object
			clases.HorarioDAO.delete(lclasesHorario);
			clases.PromedioSimple lclasesPromedioSimple = clases.PromedioSimpleDAO.loadPromedioSimpleByQuery(null, null);
			// Delete the persistent object
			clases.PromedioSimpleDAO.delete(lclasesPromedioSimple);
			clases.Carrera lclasesCarrera = clases.CarreraDAO.loadCarreraByQuery(null, null);
			// Delete the persistent object
			clases.CarreraDAO.delete(lclasesCarrera);
			clases.PromedioMixto lclasesPromedioMixto = clases.PromedioMixtoDAO.loadPromedioMixtoByQuery(null, null);
			// Delete the persistent object
			clases.PromedioMixtoDAO.delete(lclasesPromedioMixto);
			clases.RamoReprobado lclasesRamoReprobado = clases.RamoReprobadoDAO.loadRamoReprobadoByQuery(null, null);
			// Delete the persistent object
			clases.RamoReprobadoDAO.delete(lclasesRamoReprobado);
			clases.Direccion lclasesDireccion = clases.DireccionDAO.loadDireccionByQuery(null, null);
			// Delete the persistent object
			clases.DireccionDAO.delete(lclasesDireccion);
			clases.NotasPractico lclasesNotasPractico = clases.NotasPracticoDAO.loadNotasPracticoByQuery(null, null);
			// Delete the persistent object
			clases.NotasPracticoDAO.delete(lclasesNotasPractico);
			clases.Evento lclasesEvento = clases.EventoDAO.loadEventoByQuery(null, null);
			// Delete the persistent object
			clases.EventoDAO.delete(lclasesEvento);
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
