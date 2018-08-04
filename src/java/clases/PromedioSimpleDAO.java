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

public class PromedioSimpleDAO {
	public static PromedioSimple loadPromedioSimpleByORMID(int idPromedioSimple) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return loadPromedioSimpleByORMID(session, idPromedioSimple);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PromedioSimple getPromedioSimpleByORMID(int idPromedioSimple) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return getPromedioSimpleByORMID(session, idPromedioSimple);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PromedioSimple loadPromedioSimpleByORMID(int idPromedioSimple, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return loadPromedioSimpleByORMID(session, idPromedioSimple, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PromedioSimple getPromedioSimpleByORMID(int idPromedioSimple, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return getPromedioSimpleByORMID(session, idPromedioSimple, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PromedioSimple loadPromedioSimpleByORMID(PersistentSession session, int idPromedioSimple) throws PersistentException {
		try {
			return (PromedioSimple) session.load(clases.PromedioSimple.class, new Integer(idPromedioSimple));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PromedioSimple getPromedioSimpleByORMID(PersistentSession session, int idPromedioSimple) throws PersistentException {
		try {
			return (PromedioSimple) session.get(clases.PromedioSimple.class, new Integer(idPromedioSimple));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PromedioSimple loadPromedioSimpleByORMID(PersistentSession session, int idPromedioSimple, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (PromedioSimple) session.load(clases.PromedioSimple.class, new Integer(idPromedioSimple), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PromedioSimple getPromedioSimpleByORMID(PersistentSession session, int idPromedioSimple, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (PromedioSimple) session.get(clases.PromedioSimple.class, new Integer(idPromedioSimple), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPromedioSimple(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return queryPromedioSimple(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPromedioSimple(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return queryPromedioSimple(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PromedioSimple[] listPromedioSimpleByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return listPromedioSimpleByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PromedioSimple[] listPromedioSimpleByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return listPromedioSimpleByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPromedioSimple(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From clases.PromedioSimple as PromedioSimple");
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
	
	public static List queryPromedioSimple(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From clases.PromedioSimple as PromedioSimple");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("PromedioSimple", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PromedioSimple[] listPromedioSimpleByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPromedioSimple(session, condition, orderBy);
			return (PromedioSimple[]) list.toArray(new PromedioSimple[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PromedioSimple[] listPromedioSimpleByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPromedioSimple(session, condition, orderBy, lockMode);
			return (PromedioSimple[]) list.toArray(new PromedioSimple[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PromedioSimple loadPromedioSimpleByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return loadPromedioSimpleByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PromedioSimple loadPromedioSimpleByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return loadPromedioSimpleByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PromedioSimple loadPromedioSimpleByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		PromedioSimple[] promedioSimples = listPromedioSimpleByQuery(session, condition, orderBy);
		if (promedioSimples != null && promedioSimples.length > 0)
			return promedioSimples[0];
		else
			return null;
	}
	
	public static PromedioSimple loadPromedioSimpleByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		PromedioSimple[] promedioSimples = listPromedioSimpleByQuery(session, condition, orderBy, lockMode);
		if (promedioSimples != null && promedioSimples.length > 0)
			return promedioSimples[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePromedioSimpleByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return iteratePromedioSimpleByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePromedioSimpleByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return iteratePromedioSimpleByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePromedioSimpleByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From clases.PromedioSimple as PromedioSimple");
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
	
	public static java.util.Iterator iteratePromedioSimpleByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From clases.PromedioSimple as PromedioSimple");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("PromedioSimple", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PromedioSimple createPromedioSimple() {
		return new clases.PromedioSimple();
	}
	
	public static boolean save(clases.PromedioSimple promedioSimple) throws PersistentException {
		try {
			PrograAvanzadaPersistentManager.instance().saveObject(promedioSimple);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(clases.PromedioSimple promedioSimple) throws PersistentException {
		try {
			PrograAvanzadaPersistentManager.instance().deleteObject(promedioSimple);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(clases.PromedioSimple promedioSimple)throws PersistentException {
		try {
			if (promedioSimple.getRamoidRamo() != null) {
				promedioSimple.getRamoidRamo().setPromedioSimple(null);
			}
			
			return delete(promedioSimple);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(clases.PromedioSimple promedioSimple, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (promedioSimple.getRamoidRamo() != null) {
				promedioSimple.getRamoidRamo().setPromedioSimple(null);
			}
			
			try {
				session.delete(promedioSimple);
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
	
	public static boolean refresh(clases.PromedioSimple promedioSimple) throws PersistentException {
		try {
			PrograAvanzadaPersistentManager.instance().getSession().refresh(promedioSimple);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(clases.PromedioSimple promedioSimple) throws PersistentException {
		try {
			PrograAvanzadaPersistentManager.instance().getSession().evict(promedioSimple);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
