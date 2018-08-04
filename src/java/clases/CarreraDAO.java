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

public class CarreraDAO {
	public static Carrera loadCarreraByORMID(int idCarrera) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return loadCarreraByORMID(session, idCarrera);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Carrera getCarreraByORMID(int idCarrera) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return getCarreraByORMID(session, idCarrera);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Carrera loadCarreraByORMID(int idCarrera, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return loadCarreraByORMID(session, idCarrera, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Carrera getCarreraByORMID(int idCarrera, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return getCarreraByORMID(session, idCarrera, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Carrera loadCarreraByORMID(PersistentSession session, int idCarrera) throws PersistentException {
		try {
			return (Carrera) session.load(clases.Carrera.class, new Integer(idCarrera));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Carrera getCarreraByORMID(PersistentSession session, int idCarrera) throws PersistentException {
		try {
			return (Carrera) session.get(clases.Carrera.class, new Integer(idCarrera));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Carrera loadCarreraByORMID(PersistentSession session, int idCarrera, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Carrera) session.load(clases.Carrera.class, new Integer(idCarrera), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Carrera getCarreraByORMID(PersistentSession session, int idCarrera, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Carrera) session.get(clases.Carrera.class, new Integer(idCarrera), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCarrera(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return queryCarrera(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCarrera(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return queryCarrera(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Carrera[] listCarreraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return listCarreraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Carrera[] listCarreraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return listCarreraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCarrera(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From clases.Carrera as Carrera");
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
	
	public static List queryCarrera(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From clases.Carrera as Carrera");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Carrera", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Carrera[] listCarreraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCarrera(session, condition, orderBy);
			return (Carrera[]) list.toArray(new Carrera[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Carrera[] listCarreraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCarrera(session, condition, orderBy, lockMode);
			return (Carrera[]) list.toArray(new Carrera[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Carrera loadCarreraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return loadCarreraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Carrera loadCarreraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return loadCarreraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Carrera loadCarreraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Carrera[] carreras = listCarreraByQuery(session, condition, orderBy);
		if (carreras != null && carreras.length > 0)
			return carreras[0];
		else
			return null;
	}
	
	public static Carrera loadCarreraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Carrera[] carreras = listCarreraByQuery(session, condition, orderBy, lockMode);
		if (carreras != null && carreras.length > 0)
			return carreras[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCarreraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return iterateCarreraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCarreraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return iterateCarreraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCarreraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From clases.Carrera as Carrera");
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
	
	public static java.util.Iterator iterateCarreraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From clases.Carrera as Carrera");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Carrera", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Carrera createCarrera() {
		return new clases.Carrera();
	}
	
	public static boolean save(clases.Carrera carrera) throws PersistentException {
		try {
			PrograAvanzadaPersistentManager.instance().saveObject(carrera);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(clases.Carrera carrera) throws PersistentException {
		try {
			PrograAvanzadaPersistentManager.instance().deleteObject(carrera);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(clases.Carrera carrera)throws PersistentException {
		try {
			if (carrera.getUsuarioidUsuario() != null) {
				carrera.getUsuarioidUsuario().setCarrera(null);
			}
			
			return delete(carrera);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(clases.Carrera carrera, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (carrera.getUsuarioidUsuario() != null) {
				carrera.getUsuarioidUsuario().setCarrera(null);
			}
			
			try {
				session.delete(carrera);
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
	
	public static boolean refresh(clases.Carrera carrera) throws PersistentException {
		try {
			PrograAvanzadaPersistentManager.instance().getSession().refresh(carrera);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(clases.Carrera carrera) throws PersistentException {
		try {
			PrograAvanzadaPersistentManager.instance().getSession().evict(carrera);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
