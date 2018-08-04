/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package clases;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class HistorialDAO {
	public static Historial loadHistorialByORMID(int idHistorial) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return loadHistorialByORMID(session, idHistorial);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historial getHistorialByORMID(int idHistorial) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return getHistorialByORMID(session, idHistorial);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historial loadHistorialByORMID(int idHistorial, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return loadHistorialByORMID(session, idHistorial, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historial getHistorialByORMID(int idHistorial, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return getHistorialByORMID(session, idHistorial, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historial loadHistorialByORMID(PersistentSession session, int idHistorial) throws PersistentException {
		try {
			return (Historial) session.load(clases.Historial.class, new Integer(idHistorial));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historial getHistorialByORMID(PersistentSession session, int idHistorial) throws PersistentException {
		try {
			return (Historial) session.get(clases.Historial.class, new Integer(idHistorial));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historial loadHistorialByORMID(PersistentSession session, int idHistorial, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Historial) session.load(clases.Historial.class, new Integer(idHistorial), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historial getHistorialByORMID(PersistentSession session, int idHistorial, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Historial) session.get(clases.Historial.class, new Integer(idHistorial), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryHistorial(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return queryHistorial(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryHistorial(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return queryHistorial(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historial[] listHistorialByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return listHistorialByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historial[] listHistorialByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return listHistorialByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryHistorial(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From clases.Historial as Historial");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryHistorial(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From clases.Historial as Historial");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Historial", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historial[] listHistorialByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryHistorial(session, condition, orderBy);
			return (Historial[]) list.toArray(new Historial[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historial[] listHistorialByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryHistorial(session, condition, orderBy, lockMode);
			return (Historial[]) list.toArray(new Historial[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historial loadHistorialByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return loadHistorialByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historial loadHistorialByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return loadHistorialByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historial loadHistorialByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Historial[] historials = listHistorialByQuery(session, condition, orderBy);
		if (historials != null && historials.length > 0)
			return historials[0];
		else
			return null;
	}
	
	public static Historial loadHistorialByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Historial[] historials = listHistorialByQuery(session, condition, orderBy, lockMode);
		if (historials != null && historials.length > 0)
			return historials[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateHistorialByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return iterateHistorialByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHistorialByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return iterateHistorialByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHistorialByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From clases.Historial as Historial");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHistorialByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From clases.Historial as Historial");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Historial", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historial createHistorial() {
		return new clases.Historial();
	}
	
	public static boolean save(clases.Historial historial) throws PersistentException {
		try {
			PrograAvanzadaPersistentManager.instance().saveObject(historial);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(clases.Historial historial) throws PersistentException {
		try {
			PrograAvanzadaPersistentManager.instance().deleteObject(historial);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(clases.Historial historial)throws PersistentException {
		try {
			if (historial.getSemestreidSemestre() != null) {
				historial.getSemestreidSemestre().setHistorial(null);
			}
			
			clases.RamoAprobado[] lRamoAprobados = historial.ramoAprobado.toArray();
			for(int i = 0; i < lRamoAprobados.length; i++) {
				lRamoAprobados[i].setHistorialidHistorial(null);
			}
			clases.RamoReprobado[] lRamoReprobados = historial.ramoReprobado.toArray();
			for(int i = 0; i < lRamoReprobados.length; i++) {
				lRamoReprobados[i].setHistorialidHistorial(null);
			}
			return delete(historial);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(clases.Historial historial, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (historial.getSemestreidSemestre() != null) {
				historial.getSemestreidSemestre().setHistorial(null);
			}
			
			clases.RamoAprobado[] lRamoAprobados = historial.ramoAprobado.toArray();
			for(int i = 0; i < lRamoAprobados.length; i++) {
				lRamoAprobados[i].setHistorialidHistorial(null);
			}
			clases.RamoReprobado[] lRamoReprobados = historial.ramoReprobado.toArray();
			for(int i = 0; i < lRamoReprobados.length; i++) {
				lRamoReprobados[i].setHistorialidHistorial(null);
			}
			try {
				session.delete(historial);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(clases.Historial historial) throws PersistentException {
		try {
			PrograAvanzadaPersistentManager.instance().getSession().refresh(historial);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(clases.Historial historial) throws PersistentException {
		try {
			PrograAvanzadaPersistentManager.instance().getSession().evict(historial);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
