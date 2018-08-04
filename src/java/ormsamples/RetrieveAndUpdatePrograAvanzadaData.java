/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdatePrograAvanzadaData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
		try {
			clases.Domicilio lclasesDomicilio = clases.DomicilioDAO.loadDomicilioByQuery(null, null);
			// Update the properties of the persistent object
			clases.DomicilioDAO.save(lclasesDomicilio);
			clases.Historial lclasesHistorial = clases.HistorialDAO.loadHistorialByQuery(null, null);
			// Update the properties of the persistent object
			clases.HistorialDAO.save(lclasesHistorial);
			clases.Semestre lclasesSemestre = clases.SemestreDAO.loadSemestreByQuery(null, null);
			// Update the properties of the persistent object
			clases.SemestreDAO.save(lclasesSemestre);
			clases.Usuario lclasesUsuario = clases.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Update the properties of the persistent object
			clases.UsuarioDAO.save(lclasesUsuario);
			clases.RamoAprobado lclasesRamoAprobado = clases.RamoAprobadoDAO.loadRamoAprobadoByQuery(null, null);
			// Update the properties of the persistent object
			clases.RamoAprobadoDAO.save(lclasesRamoAprobado);
			clases.Login lclasesLogin = clases.LoginDAO.loadLoginByQuery(null, null);
			// Update the properties of the persistent object
			clases.LoginDAO.save(lclasesLogin);
			clases.Ramo lclasesRamo = clases.RamoDAO.loadRamoByQuery(null, null);
			// Update the properties of the persistent object
			clases.RamoDAO.save(lclasesRamo);
			clases.NotasTeorico lclasesNotasTeorico = clases.NotasTeoricoDAO.loadNotasTeoricoByQuery(null, null);
			// Update the properties of the persistent object
			clases.NotasTeoricoDAO.save(lclasesNotasTeorico);
			clases.Horario lclasesHorario = clases.HorarioDAO.loadHorarioByQuery(null, null);
			// Update the properties of the persistent object
			clases.HorarioDAO.save(lclasesHorario);
			clases.PromedioSimple lclasesPromedioSimple = clases.PromedioSimpleDAO.loadPromedioSimpleByQuery(null, null);
			// Update the properties of the persistent object
			clases.PromedioSimpleDAO.save(lclasesPromedioSimple);
			clases.Carrera lclasesCarrera = clases.CarreraDAO.loadCarreraByQuery(null, null);
			// Update the properties of the persistent object
			clases.CarreraDAO.save(lclasesCarrera);
			clases.PromedioMixto lclasesPromedioMixto = clases.PromedioMixtoDAO.loadPromedioMixtoByQuery(null, null);
			// Update the properties of the persistent object
			clases.PromedioMixtoDAO.save(lclasesPromedioMixto);
			clases.RamoReprobado lclasesRamoReprobado = clases.RamoReprobadoDAO.loadRamoReprobadoByQuery(null, null);
			// Update the properties of the persistent object
			clases.RamoReprobadoDAO.save(lclasesRamoReprobado);
			clases.Direccion lclasesDireccion = clases.DireccionDAO.loadDireccionByQuery(null, null);
			// Update the properties of the persistent object
			clases.DireccionDAO.save(lclasesDireccion);
			clases.NotasPractico lclasesNotasPractico = clases.NotasPracticoDAO.loadNotasPracticoByQuery(null, null);
			// Update the properties of the persistent object
			clases.NotasPracticoDAO.save(lclasesNotasPractico);
			clases.Evento lclasesEvento = clases.EventoDAO.loadEventoByQuery(null, null);
			// Update the properties of the persistent object
			clases.EventoDAO.save(lclasesEvento);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdatePrograAvanzadaData retrieveAndUpdatePrograAvanzadaData = new RetrieveAndUpdatePrograAvanzadaData();
			try {
				retrieveAndUpdatePrograAvanzadaData.retrieveAndUpdateTestData();
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
