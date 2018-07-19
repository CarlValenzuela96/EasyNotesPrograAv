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

public class PromedioMixtoDAO {
	public static PromedioMixto loadPromedioMixtoByORMID(int idPromedioMixto) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return loadPromedioMixtoByORMID(session, idPromedioMixto);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PromedioMixto getPromedioMixtoByORMID(int idPromedioMixto) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return getPromedioMixtoByORMID(session, idPromedioMixto);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PromedioMixto loadPromedioMixtoByORMID(int idPromedioMixto, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return loadPromedioMixtoByORMID(session, idPromedioMixto, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PromedioMixto getPromedioMixtoByORMID(int idPromedioMixto, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return getPromedioMixtoByORMID(session, idPromedioMixto, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PromedioMixto loadPromedioMixtoByORMID(PersistentSession session, int idPromedioMixto) throws PersistentException {
		try {
			return (PromedioMixto) session.load(clases.PromedioMixto.class, new Integer(idPromedioMixto));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PromedioMixto getPromedioMixtoByORMID(PersistentSession session, int idPromedioMixto) throws PersistentException {
		try {
			return (PromedioMixto) session.get(clases.PromedioMixto.class, new Integer(idPromedioMixto));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PromedioMixto loadPromedioMixtoByORMID(PersistentSession session, int idPromedioMixto, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (PromedioMixto) session.load(clases.PromedioMixto.class, new Integer(idPromedioMixto), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PromedioMixto getPromedioMixtoByORMID(PersistentSession session, int idPromedioMixto, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (PromedioMixto) session.get(clases.PromedioMixto.class, new Integer(idPromedioMixto), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPromedioMixto(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return queryPromedioMixto(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPromedioMixto(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return queryPromedioMixto(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PromedioMixto[] listPromedioMixtoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return listPromedioMixtoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PromedioMixto[] listPromedioMixtoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return listPromedioMixtoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPromedioMixto(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From clases.PromedioMixto as PromedioMixto");
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
	
	public static List queryPromedioMixto(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From clases.PromedioMixto as PromedioMixto");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("PromedioMixto", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PromedioMixto[] listPromedioMixtoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPromedioMixto(session, condition, orderBy);
			return (PromedioMixto[]) list.toArray(new PromedioMixto[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PromedioMixto[] listPromedioMixtoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPromedioMixto(session, condition, orderBy, lockMode);
			return (PromedioMixto[]) list.toArray(new PromedioMixto[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PromedioMixto loadPromedioMixtoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return loadPromedioMixtoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PromedioMixto loadPromedioMixtoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return loadPromedioMixtoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PromedioMixto loadPromedioMixtoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		PromedioMixto[] promedioMixtos = listPromedioMixtoByQuery(session, condition, orderBy);
		if (promedioMixtos != null && promedioMixtos.length > 0)
			return promedioMixtos[0];
		else
			return null;
	}
	
	public static PromedioMixto loadPromedioMixtoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		PromedioMixto[] promedioMixtos = listPromedioMixtoByQuery(session, condition, orderBy, lockMode);
		if (promedioMixtos != null && promedioMixtos.length > 0)
			return promedioMixtos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePromedioMixtoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return iteratePromedioMixtoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePromedioMixtoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return iteratePromedioMixtoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePromedioMixtoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From clases.PromedioMixto as PromedioMixto");
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
	
	public static java.util.Iterator iteratePromedioMixtoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From clases.PromedioMixto as PromedioMixto");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("PromedioMixto", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PromedioMixto createPromedioMixto() {
		return new clases.PromedioMixto();
	}
	
	public static boolean save(clases.PromedioMixto promedioMixto) throws PersistentException {
		try {
			clases.PrograAvanzadaPersistentManager.instance().saveObject(promedioMixto);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(clases.PromedioMixto promedioMixto) throws PersistentException {
		try {
			clases.PrograAvanzadaPersistentManager.instance().deleteObject(promedioMixto);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(clases.PromedioMixto promedioMixto)throws PersistentException {
		try {
			if (promedioMixto.getRamoidRamo() != null) {
				promedioMixto.getRamoidRamo().setPromedioMixto(null);
			}
			
			return delete(promedioMixto);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(clases.PromedioMixto promedioMixto, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (promedioMixto.getRamoidRamo() != null) {
				promedioMixto.getRamoidRamo().setPromedioMixto(null);
			}
			
			try {
				session.delete(promedioMixto);
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
	
	public static boolean refresh(clases.PromedioMixto promedioMixto) throws PersistentException {
		try {
			clases.PrograAvanzadaPersistentManager.instance().getSession().refresh(promedioMixto);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(clases.PromedioMixto promedioMixto) throws PersistentException {
		try {
			clases.PrograAvanzadaPersistentManager.instance().getSession().evict(promedioMixto);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
