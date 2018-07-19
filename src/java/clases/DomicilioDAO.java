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

public class DomicilioDAO {
	public static Domicilio loadDomicilioByORMID(int idDomicilio) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return loadDomicilioByORMID(session, idDomicilio);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Domicilio getDomicilioByORMID(int idDomicilio) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return getDomicilioByORMID(session, idDomicilio);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Domicilio loadDomicilioByORMID(int idDomicilio, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return loadDomicilioByORMID(session, idDomicilio, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Domicilio getDomicilioByORMID(int idDomicilio, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return getDomicilioByORMID(session, idDomicilio, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Domicilio loadDomicilioByORMID(PersistentSession session, int idDomicilio) throws PersistentException {
		try {
			return (Domicilio) session.load(clases.Domicilio.class, new Integer(idDomicilio));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Domicilio getDomicilioByORMID(PersistentSession session, int idDomicilio) throws PersistentException {
		try {
			return (Domicilio) session.get(clases.Domicilio.class, new Integer(idDomicilio));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Domicilio loadDomicilioByORMID(PersistentSession session, int idDomicilio, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Domicilio) session.load(clases.Domicilio.class, new Integer(idDomicilio), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Domicilio getDomicilioByORMID(PersistentSession session, int idDomicilio, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Domicilio) session.get(clases.Domicilio.class, new Integer(idDomicilio), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDomicilio(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return queryDomicilio(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDomicilio(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return queryDomicilio(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Domicilio[] listDomicilioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return listDomicilioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Domicilio[] listDomicilioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return listDomicilioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDomicilio(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From clases.Domicilio as Domicilio");
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
	
	public static List queryDomicilio(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From clases.Domicilio as Domicilio");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Domicilio", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Domicilio[] listDomicilioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryDomicilio(session, condition, orderBy);
			return (Domicilio[]) list.toArray(new Domicilio[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Domicilio[] listDomicilioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryDomicilio(session, condition, orderBy, lockMode);
			return (Domicilio[]) list.toArray(new Domicilio[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Domicilio loadDomicilioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return loadDomicilioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Domicilio loadDomicilioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return loadDomicilioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Domicilio loadDomicilioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Domicilio[] domicilios = listDomicilioByQuery(session, condition, orderBy);
		if (domicilios != null && domicilios.length > 0)
			return domicilios[0];
		else
			return null;
	}
	
	public static Domicilio loadDomicilioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Domicilio[] domicilios = listDomicilioByQuery(session, condition, orderBy, lockMode);
		if (domicilios != null && domicilios.length > 0)
			return domicilios[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateDomicilioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return iterateDomicilioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDomicilioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return iterateDomicilioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDomicilioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From clases.Domicilio as Domicilio");
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
	
	public static java.util.Iterator iterateDomicilioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From clases.Domicilio as Domicilio");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Domicilio", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Domicilio createDomicilio() {
		return new clases.Domicilio();
	}
	
	public static boolean save(clases.Domicilio domicilio) throws PersistentException {
		try {
			clases.PrograAvanzadaPersistentManager.instance().saveObject(domicilio);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(clases.Domicilio domicilio) throws PersistentException {
		try {
			clases.PrograAvanzadaPersistentManager.instance().deleteObject(domicilio);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(clases.Domicilio domicilio)throws PersistentException {
		try {
			if (domicilio.getDireccionidDireccion() != null) {
				domicilio.getDireccionidDireccion().setDomicilio(null);
			}
			
			return delete(domicilio);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(clases.Domicilio domicilio, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (domicilio.getDireccionidDireccion() != null) {
				domicilio.getDireccionidDireccion().setDomicilio(null);
			}
			
			try {
				session.delete(domicilio);
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
	
	public static boolean refresh(clases.Domicilio domicilio) throws PersistentException {
		try {
			clases.PrograAvanzadaPersistentManager.instance().getSession().refresh(domicilio);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(clases.Domicilio domicilio) throws PersistentException {
		try {
			clases.PrograAvanzadaPersistentManager.instance().getSession().evict(domicilio);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
