/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreatePrograAvanzadaData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = clases.PrograAvanzadaPersistentManager.instance().getSession().beginTransaction();
		try {
			clases.Domicilio lclasesDomicilio = clases.DomicilioDAO.createDomicilio();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : direccionidDireccion
			clases.DomicilioDAO.save(lclasesDomicilio);
			clases.Historial lclasesHistorial = clases.HistorialDAO.createHistorial();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : ramoReprobado, ramoAprobado, semestreidSemestre
			clases.HistorialDAO.save(lclasesHistorial);
			clases.Semestre lclasesSemestre = clases.SemestreDAO.createSemestre();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : historial, evento, ramo, usuarioidUsuario
			clases.SemestreDAO.save(lclasesSemestre);
			clases.Usuario lclasesUsuario = clases.UsuarioDAO.createUsuario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : direccion, carrera, semestre, loginidLogin
			clases.UsuarioDAO.save(lclasesUsuario);
			clases.RamoAprobado lclasesRamoAprobado = clases.RamoAprobadoDAO.createRamoAprobado();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : historialidHistorial
			clases.RamoAprobadoDAO.save(lclasesRamoAprobado);
			clases.Login lclasesLogin = clases.LoginDAO.createLogin();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : usuario
			clases.LoginDAO.save(lclasesLogin);
			clases.Ramo lclasesRamo = clases.RamoDAO.createRamo();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : promedioSimple, promedioMixto, notasPractico, notasTeorico, horario, semestreidSemestre
			clases.RamoDAO.save(lclasesRamo);
			clases.NotasTeorico lclasesNotasTeorico = clases.NotasTeoricoDAO.createNotasTeorico();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : ramoidRamo
			clases.NotasTeoricoDAO.save(lclasesNotasTeorico);
			clases.Horario lclasesHorario = clases.HorarioDAO.createHorario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : ramoidRamo
			clases.HorarioDAO.save(lclasesHorario);
			clases.PromedioSimple lclasesPromedioSimple = clases.PromedioSimpleDAO.createPromedioSimple();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : ramoidRamo
			clases.PromedioSimpleDAO.save(lclasesPromedioSimple);
			clases.Carrera lclasesCarrera = clases.CarreraDAO.createCarrera();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : usuarioidUsuario
			clases.CarreraDAO.save(lclasesCarrera);
			clases.PromedioMixto lclasesPromedioMixto = clases.PromedioMixtoDAO.createPromedioMixto();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : ramoidRamo
			clases.PromedioMixtoDAO.save(lclasesPromedioMixto);
			clases.RamoReprobado lclasesRamoReprobado = clases.RamoReprobadoDAO.createRamoReprobado();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : historialidHistorial
			clases.RamoReprobadoDAO.save(lclasesRamoReprobado);
			clases.Direccion lclasesDireccion = clases.DireccionDAO.createDireccion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : domicilio, usuarioidUsuario
			clases.DireccionDAO.save(lclasesDireccion);
			clases.NotasPractico lclasesNotasPractico = clases.NotasPracticoDAO.createNotasPractico();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : ramoidRamo
			clases.NotasPracticoDAO.save(lclasesNotasPractico);
			clases.Evento lclasesEvento = clases.EventoDAO.createEvento();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : semestreidSemestre
			clases.EventoDAO.save(lclasesEvento);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreatePrograAvanzadaData createPrograAvanzadaData = new CreatePrograAvanzadaData();
			try {
				createPrograAvanzadaData.createTestData();
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
