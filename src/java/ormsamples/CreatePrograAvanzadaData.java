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
			clases.Domicilio clasesDomicilio = clases.DomicilioDAO.createDomicilio();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : direccionidDireccion
			clases.DomicilioDAO.save(clasesDomicilio);
			clases.Historial clasesHistorial = clases.HistorialDAO.createHistorial();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : ramoReprobado, ramoAprobado, semestreidSemestre
			clases.HistorialDAO.save(clasesHistorial);
			clases.Semestre clasesSemestre = clases.SemestreDAO.createSemestre();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : historial, ramo, usuarioidUsuario
			clases.SemestreDAO.save(clasesSemestre);
			clases.Usuario clasesUsuario = clases.UsuarioDAO.createUsuario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : direccion, semestre, carreraidCarrera, loginusuario
			clases.UsuarioDAO.save(clasesUsuario);
			clases.RamoAprobado clasesRamoAprobado = clases.RamoAprobadoDAO.createRamoAprobado();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : historialidHistorial
			clases.RamoAprobadoDAO.save(clasesRamoAprobado);
			clases.Login clasesLogin = clases.LoginDAO.createLogin();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : usuario
			clases.LoginDAO.save(clasesLogin);
			clases.Ramo clasesRamo = clases.RamoDAO.createRamo();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : evento, promedioSimple, promedioMixto, notasPractico, notasTeorico, horario, semestreidSemestre
			clases.RamoDAO.save(clasesRamo);
			clases.NotasTeorico clasesNotasTeorico = clases.NotasTeoricoDAO.createNotasTeorico();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : ramoidRamo
			clases.NotasTeoricoDAO.save(clasesNotasTeorico);
			clases.Horario clasesHorario = clases.HorarioDAO.createHorario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : ramoidRamo
			clases.HorarioDAO.save(clasesHorario);
			clases.PromedioSimple clasesPromedioSimple = clases.PromedioSimpleDAO.createPromedioSimple();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : ramoidRamo
			clases.PromedioSimpleDAO.save(clasesPromedioSimple);
			clases.Carrera clasesCarrera = clases.CarreraDAO.createCarrera();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : usuario
			clases.CarreraDAO.save(clasesCarrera);
			clases.PromedioMixto clasesPromedioMixto = clases.PromedioMixtoDAO.createPromedioMixto();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : ramoidRamo
			clases.PromedioMixtoDAO.save(clasesPromedioMixto);
			clases.RamoReprobado clasesRamoReprobado = clases.RamoReprobadoDAO.createRamoReprobado();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : historialidHistorial
			clases.RamoReprobadoDAO.save(clasesRamoReprobado);
			clases.Direccion clasesDireccion = clases.DireccionDAO.createDireccion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : domicilio, usuarioidUsuario
			clases.DireccionDAO.save(clasesDireccion);
			clases.NotasPractico clasesNotasPractico = clases.NotasPracticoDAO.createNotasPractico();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : ramoidRamo
			clases.NotasPracticoDAO.save(clasesNotasPractico);
			clases.Evento clasesEvento = clases.EventoDAO.createEvento();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : ramoidRamo
			clases.EventoDAO.save(clasesEvento);
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
