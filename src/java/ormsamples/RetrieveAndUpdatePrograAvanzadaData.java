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
			clases.Domicilio clasesDomicilio = clases.DomicilioDAO.loadDomicilioByQuery(null, null);
			// Update the properties of the persistent object
			clases.DomicilioDAO.save(clasesDomicilio);
			clases.Historial clasesHistorial = clases.HistorialDAO.loadHistorialByQuery(null, null);
			// Update the properties of the persistent object
			clases.HistorialDAO.save(clasesHistorial);
			clases.Semestre clasesSemestre = clases.SemestreDAO.loadSemestreByQuery(null, null);
			// Update the properties of the persistent object
			clases.SemestreDAO.save(clasesSemestre);
			clases.Usuario clasesUsuario = clases.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Update the properties of the persistent object
			clases.UsuarioDAO.save(clasesUsuario);
			clases.RamoAprobado clasesRamoAprobado = clases.RamoAprobadoDAO.loadRamoAprobadoByQuery(null, null);
			// Update the properties of the persistent object
			clases.RamoAprobadoDAO.save(clasesRamoAprobado);
			clases.Login clasesLogin = clases.LoginDAO.loadLoginByQuery(null, null);
			// Update the properties of the persistent object
			clases.LoginDAO.save(clasesLogin);
			clases.Ramo clasesRamo = clases.RamoDAO.loadRamoByQuery(null, null);
			// Update the properties of the persistent object
			clases.RamoDAO.save(clasesRamo);
			clases.NotasTeorico clasesNotasTeorico = clases.NotasTeoricoDAO.loadNotasTeoricoByQuery(null, null);
			// Update the properties of the persistent object
			clases.NotasTeoricoDAO.save(clasesNotasTeorico);
			clases.Horario clasesHorario = clases.HorarioDAO.loadHorarioByQuery(null, null);
			// Update the properties of the persistent object
			clases.HorarioDAO.save(clasesHorario);
			clases.PromedioSimple clasesPromedioSimple = clases.PromedioSimpleDAO.loadPromedioSimpleByQuery(null, null);
			// Update the properties of the persistent object
			clases.PromedioSimpleDAO.save(clasesPromedioSimple);
			clases.Carrera clasesCarrera = clases.CarreraDAO.loadCarreraByQuery(null, null);
			// Update the properties of the persistent object
			clases.CarreraDAO.save(clasesCarrera);
			clases.PromedioMixto clasesPromedioMixto = clases.PromedioMixtoDAO.loadPromedioMixtoByQuery(null, null);
			// Update the properties of the persistent object
			clases.PromedioMixtoDAO.save(clasesPromedioMixto);
			clases.RamoReprobado clasesRamoReprobado = clases.RamoReprobadoDAO.loadRamoReprobadoByQuery(null, null);
			// Update the properties of the persistent object
			clases.RamoReprobadoDAO.save(clasesRamoReprobado);
			clases.Direccion clasesDireccion = clases.DireccionDAO.loadDireccionByQuery(null, null);
			// Update the properties of the persistent object
			clases.DireccionDAO.save(clasesDireccion);
			clases.NotasPractico clasesNotasPractico = clases.NotasPracticoDAO.loadNotasPracticoByQuery(null, null);
			// Update the properties of the persistent object
			clases.NotasPracticoDAO.save(clasesNotasPractico);
			clases.Evento clasesEvento = clases.EventoDAO.loadEventoByQuery(null, null);
			// Update the properties of the persistent object
			clases.EventoDAO.save(clasesEvento);
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
