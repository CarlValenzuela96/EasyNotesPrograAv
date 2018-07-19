/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListPrograAvanzadaData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Domicilio...");
		clases.Domicilio[] clasesDomicilios = clases.DomicilioDAO.listDomicilioByQuery(null, null);
		int length = Math.min(clasesDomicilios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(clasesDomicilios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Historial...");
		clases.Historial[] clasesHistorials = clases.HistorialDAO.listHistorialByQuery(null, null);
		length = Math.min(clasesHistorials.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(clasesHistorials[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Semestre...");
		clases.Semestre[] clasesSemestres = clases.SemestreDAO.listSemestreByQuery(null, null);
		length = Math.min(clasesSemestres.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(clasesSemestres[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Usuario...");
		clases.Usuario[] clasesUsuarios = clases.UsuarioDAO.listUsuarioByQuery(null, null);
		length = Math.min(clasesUsuarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(clasesUsuarios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing RamoAprobado...");
		clases.RamoAprobado[] clasesRamoAprobados = clases.RamoAprobadoDAO.listRamoAprobadoByQuery(null, null);
		length = Math.min(clasesRamoAprobados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(clasesRamoAprobados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Login...");
		clases.Login[] clasesLogins = clases.LoginDAO.listLoginByQuery(null, null);
		length = Math.min(clasesLogins.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(clasesLogins[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Ramo...");
		clases.Ramo[] clasesRamos = clases.RamoDAO.listRamoByQuery(null, null);
		length = Math.min(clasesRamos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(clasesRamos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing NotasTeorico...");
		clases.NotasTeorico[] clasesNotasTeoricos = clases.NotasTeoricoDAO.listNotasTeoricoByQuery(null, null);
		length = Math.min(clasesNotasTeoricos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(clasesNotasTeoricos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Horario...");
		clases.Horario[] clasesHorarios = clases.HorarioDAO.listHorarioByQuery(null, null);
		length = Math.min(clasesHorarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(clasesHorarios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing PromedioSimple...");
		clases.PromedioSimple[] clasesPromedioSimples = clases.PromedioSimpleDAO.listPromedioSimpleByQuery(null, null);
		length = Math.min(clasesPromedioSimples.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(clasesPromedioSimples[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Carrera...");
		clases.Carrera[] clasesCarreras = clases.CarreraDAO.listCarreraByQuery(null, null);
		length = Math.min(clasesCarreras.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(clasesCarreras[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing PromedioMixto...");
		clases.PromedioMixto[] clasesPromedioMixtos = clases.PromedioMixtoDAO.listPromedioMixtoByQuery(null, null);
		length = Math.min(clasesPromedioMixtos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(clasesPromedioMixtos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing RamoReprobado...");
		clases.RamoReprobado[] clasesRamoReprobados = clases.RamoReprobadoDAO.listRamoReprobadoByQuery(null, null);
		length = Math.min(clasesRamoReprobados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(clasesRamoReprobados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Direccion...");
		clases.Direccion[] clasesDireccions = clases.DireccionDAO.listDireccionByQuery(null, null);
		length = Math.min(clasesDireccions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(clasesDireccions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing NotasPractico...");
		clases.NotasPractico[] clasesNotasPracticos = clases.NotasPracticoDAO.listNotasPracticoByQuery(null, null);
		length = Math.min(clasesNotasPracticos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(clasesNotasPracticos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Evento...");
		clases.Evento[] clasesEventos = clases.EventoDAO.listEventoByQuery(null, null);
		length = Math.min(clasesEventos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(clasesEventos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public static void main(String[] args) {
		try {
			ListPrograAvanzadaData listPrograAvanzadaData = new ListPrograAvanzadaData();
			try {
				listPrograAvanzadaData.listTestData();
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
