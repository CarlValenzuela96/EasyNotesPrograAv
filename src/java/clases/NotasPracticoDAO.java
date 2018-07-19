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

public class NotasPracticoDAO {
	public static NotasPractico loadNotasPracticoByORMID(int idNotaPractica) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return loadNotasPracticoByORMID(session, idNotaPractica);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotasPractico getNotasPracticoByORMID(int idNotaPractica) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return getNotasPracticoByORMID(session, idNotaPractica);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotasPractico loadNotasPracticoByORMID(int idNotaPractica, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return loadNotasPracticoByORMID(session, idNotaPractica, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotasPractico getNotasPracticoByORMID(int idNotaPractica, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return getNotasPracticoByORMID(session, idNotaPractica, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotasPractico loadNotasPracticoByORMID(PersistentSession session, int idNotaPractica) throws PersistentException {
		try {
			return (NotasPractico) session.load(clases.NotasPractico.class, new Integer(idNotaPractica));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotasPractico getNotasPracticoByORMID(PersistentSession session, int idNotaPractica) throws PersistentException {
		try {
			return (NotasPractico) session.get(clases.NotasPractico.class, new Integer(idNotaPractica));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotasPractico loadNotasPracticoByORMID(PersistentSession session, int idNotaPractica, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (NotasPractico) session.load(clases.NotasPractico.class, new Integer(idNotaPractica), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotasPractico getNotasPracticoByORMID(PersistentSession session, int idNotaPractica, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (NotasPractico) session.get(clases.NotasPractico.class, new Integer(idNotaPractica), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryNotasPractico(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return queryNotasPractico(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryNotasPractico(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return queryNotasPractico(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotasPractico[] listNotasPracticoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return listNotasPracticoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotasPractico[] listNotasPracticoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return listNotasPracticoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryNotasPractico(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From clases.NotasPractico as NotasPractico");
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
	
	public static List queryNotasPractico(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From clases.NotasPractico as NotasPractico");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("NotasPractico", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotasPractico[] listNotasPracticoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryNotasPractico(session, condition, orderBy);
			return (NotasPractico[]) list.toArray(new NotasPractico[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotasPractico[] listNotasPracticoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryNotasPractico(session, condition, orderBy, lockMode);
			return (NotasPractico[]) list.toArray(new NotasPractico[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotasPractico loadNotasPracticoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return loadNotasPracticoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotasPractico loadNotasPracticoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return loadNotasPracticoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotasPractico loadNotasPracticoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		NotasPractico[] notasPracticos = listNotasPracticoByQuery(session, condition, orderBy);
		if (notasPracticos != null && notasPracticos.length > 0)
			return notasPracticos[0];
		else
			return null;
	}
	
	public static NotasPractico loadNotasPracticoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		NotasPractico[] notasPracticos = listNotasPracticoByQuery(session, condition, orderBy, lockMode);
		if (notasPracticos != null && notasPracticos.length > 0)
			return notasPracticos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateNotasPracticoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return iterateNotasPracticoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateNotasPracticoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return iterateNotasPracticoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateNotasPracticoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From clases.NotasPractico as NotasPractico");
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
	
	public static java.util.Iterator iterateNotasPracticoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From clases.NotasPractico as NotasPractico");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("NotasPractico", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotasPractico createNotasPractico() {
		return new clases.NotasPractico();
	}
	
	public static boolean save(clases.NotasPractico notasPractico) throws PersistentException {
		try {
			clases.PrograAvanzadaPersistentManager.instance().saveObject(notasPractico);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(clases.NotasPractico notasPractico) throws PersistentException {
		try {
			clases.PrograAvanzadaPersistentManager.instance().deleteObject(notasPractico);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(clases.NotasPractico notasPractico)throws PersistentException {
		try {
			if (notasPractico.getRamoidRamo() != null) {
				notasPractico.getRamoidRamo().notasPractico.remove(notasPractico);
			}
			
			return delete(notasPractico);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(clases.NotasPractico notasPractico, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (notasPractico.getRamoidRamo() != null) {
				notasPractico.getRamoidRamo().notasPractico.remove(notasPractico);
			}
			
			try {
				session.delete(notasPractico);
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
	
	public static boolean refresh(clases.NotasPractico notasPractico) throws PersistentException {
		try {
			clases.PrograAvanzadaPersistentManager.instance().getSession().refresh(notasPractico);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(clases.NotasPractico notasPractico) throws PersistentException {
		try {
			clases.PrograAvanzadaPersistentManager.instance().getSession().evict(notasPractico);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
