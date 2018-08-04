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

public class DireccionDAO {
	public static Direccion loadDireccionByORMID(int idDireccion) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return loadDireccionByORMID(session, idDireccion);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Direccion getDireccionByORMID(int idDireccion) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return getDireccionByORMID(session, idDireccion);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Direccion loadDireccionByORMID(int idDireccion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return loadDireccionByORMID(session, idDireccion, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Direccion getDireccionByORMID(int idDireccion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return getDireccionByORMID(session, idDireccion, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Direccion loadDireccionByORMID(PersistentSession session, int idDireccion) throws PersistentException {
		try {
			return (Direccion) session.load(clases.Direccion.class, new Integer(idDireccion));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Direccion getDireccionByORMID(PersistentSession session, int idDireccion) throws PersistentException {
		try {
			return (Direccion) session.get(clases.Direccion.class, new Integer(idDireccion));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Direccion loadDireccionByORMID(PersistentSession session, int idDireccion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Direccion) session.load(clases.Direccion.class, new Integer(idDireccion), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Direccion getDireccionByORMID(PersistentSession session, int idDireccion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Direccion) session.get(clases.Direccion.class, new Integer(idDireccion), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDireccion(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return queryDireccion(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDireccion(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return queryDireccion(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Direccion[] listDireccionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return listDireccionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Direccion[] listDireccionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return listDireccionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDireccion(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From clases.Direccion as Direccion");
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
	
	public static List queryDireccion(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From clases.Direccion as Direccion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Direccion", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Direccion[] listDireccionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryDireccion(session, condition, orderBy);
			return (Direccion[]) list.toArray(new Direccion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Direccion[] listDireccionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryDireccion(session, condition, orderBy, lockMode);
			return (Direccion[]) list.toArray(new Direccion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Direccion loadDireccionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return loadDireccionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Direccion loadDireccionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return loadDireccionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Direccion loadDireccionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Direccion[] direccions = listDireccionByQuery(session, condition, orderBy);
		if (direccions != null && direccions.length > 0)
			return direccions[0];
		else
			return null;
	}
	
	public static Direccion loadDireccionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Direccion[] direccions = listDireccionByQuery(session, condition, orderBy, lockMode);
		if (direccions != null && direccions.length > 0)
			return direccions[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateDireccionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return iterateDireccionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDireccionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return iterateDireccionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDireccionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From clases.Direccion as Direccion");
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
	
	public static java.util.Iterator iterateDireccionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From clases.Direccion as Direccion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Direccion", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Direccion createDireccion() {
		return new clases.Direccion();
	}
	
	public static boolean save(clases.Direccion direccion) throws PersistentException {
		try {
			PrograAvanzadaPersistentManager.instance().saveObject(direccion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(clases.Direccion direccion) throws PersistentException {
		try {
			PrograAvanzadaPersistentManager.instance().deleteObject(direccion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(clases.Direccion direccion)throws PersistentException {
		try {
			if (direccion.getUsuarioidUsuario() != null) {
				direccion.getUsuarioidUsuario().setDireccion(null);
			}
			
			if (direccion.getDomicilio() != null) {
				direccion.getDomicilio().setDireccionidDireccion(null);
			}
			
			return delete(direccion);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(clases.Direccion direccion, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (direccion.getUsuarioidUsuario() != null) {
				direccion.getUsuarioidUsuario().setDireccion(null);
			}
			
			if (direccion.getDomicilio() != null) {
				direccion.getDomicilio().setDireccionidDireccion(null);
			}
			
			try {
				session.delete(direccion);
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
	
	public static boolean refresh(clases.Direccion direccion) throws PersistentException {
		try {
			PrograAvanzadaPersistentManager.instance().getSession().refresh(direccion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(clases.Direccion direccion) throws PersistentException {
		try {
			PrograAvanzadaPersistentManager.instance().getSession().evict(direccion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
