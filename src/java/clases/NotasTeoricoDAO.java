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

public class NotasTeoricoDAO {
	public static NotasTeorico loadNotasTeoricoByORMID(int idNotaTeorica) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return loadNotasTeoricoByORMID(session, idNotaTeorica);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotasTeorico getNotasTeoricoByORMID(int idNotaTeorica) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return getNotasTeoricoByORMID(session, idNotaTeorica);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotasTeorico loadNotasTeoricoByORMID(int idNotaTeorica, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return loadNotasTeoricoByORMID(session, idNotaTeorica, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotasTeorico getNotasTeoricoByORMID(int idNotaTeorica, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return getNotasTeoricoByORMID(session, idNotaTeorica, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotasTeorico loadNotasTeoricoByORMID(PersistentSession session, int idNotaTeorica) throws PersistentException {
		try {
			return (NotasTeorico) session.load(clases.NotasTeorico.class, new Integer(idNotaTeorica));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotasTeorico getNotasTeoricoByORMID(PersistentSession session, int idNotaTeorica) throws PersistentException {
		try {
			return (NotasTeorico) session.get(clases.NotasTeorico.class, new Integer(idNotaTeorica));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotasTeorico loadNotasTeoricoByORMID(PersistentSession session, int idNotaTeorica, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (NotasTeorico) session.load(clases.NotasTeorico.class, new Integer(idNotaTeorica), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotasTeorico getNotasTeoricoByORMID(PersistentSession session, int idNotaTeorica, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (NotasTeorico) session.get(clases.NotasTeorico.class, new Integer(idNotaTeorica), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryNotasTeorico(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return queryNotasTeorico(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryNotasTeorico(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return queryNotasTeorico(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotasTeorico[] listNotasTeoricoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return listNotasTeoricoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotasTeorico[] listNotasTeoricoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return listNotasTeoricoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryNotasTeorico(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From clases.NotasTeorico as NotasTeorico");
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
	
	public static List queryNotasTeorico(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From clases.NotasTeorico as NotasTeorico");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("NotasTeorico", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotasTeorico[] listNotasTeoricoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryNotasTeorico(session, condition, orderBy);
			return (NotasTeorico[]) list.toArray(new NotasTeorico[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotasTeorico[] listNotasTeoricoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryNotasTeorico(session, condition, orderBy, lockMode);
			return (NotasTeorico[]) list.toArray(new NotasTeorico[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotasTeorico loadNotasTeoricoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return loadNotasTeoricoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotasTeorico loadNotasTeoricoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return loadNotasTeoricoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotasTeorico loadNotasTeoricoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		NotasTeorico[] notasTeoricos = listNotasTeoricoByQuery(session, condition, orderBy);
		if (notasTeoricos != null && notasTeoricos.length > 0)
			return notasTeoricos[0];
		else
			return null;
	}
	
	public static NotasTeorico loadNotasTeoricoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		NotasTeorico[] notasTeoricos = listNotasTeoricoByQuery(session, condition, orderBy, lockMode);
		if (notasTeoricos != null && notasTeoricos.length > 0)
			return notasTeoricos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateNotasTeoricoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return iterateNotasTeoricoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateNotasTeoricoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return iterateNotasTeoricoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateNotasTeoricoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From clases.NotasTeorico as NotasTeorico");
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
	
	public static java.util.Iterator iterateNotasTeoricoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From clases.NotasTeorico as NotasTeorico");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("NotasTeorico", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static NotasTeorico createNotasTeorico() {
		return new clases.NotasTeorico();
	}
	
	public static boolean save(clases.NotasTeorico notasTeorico) throws PersistentException {
		try {
			clases.PrograAvanzadaPersistentManager.instance().saveObject(notasTeorico);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(clases.NotasTeorico notasTeorico) throws PersistentException {
		try {
			clases.PrograAvanzadaPersistentManager.instance().deleteObject(notasTeorico);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(clases.NotasTeorico notasTeorico)throws PersistentException {
		try {
			if (notasTeorico.getRamoidRamo() != null) {
				notasTeorico.getRamoidRamo().notasTeorico.remove(notasTeorico);
			}
			
			return delete(notasTeorico);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(clases.NotasTeorico notasTeorico, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (notasTeorico.getRamoidRamo() != null) {
				notasTeorico.getRamoidRamo().notasTeorico.remove(notasTeorico);
			}
			
			try {
				session.delete(notasTeorico);
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
	
	public static boolean refresh(clases.NotasTeorico notasTeorico) throws PersistentException {
		try {
			clases.PrograAvanzadaPersistentManager.instance().getSession().refresh(notasTeorico);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(clases.NotasTeorico notasTeorico) throws PersistentException {
		try {
			clases.PrograAvanzadaPersistentManager.instance().getSession().evict(notasTeorico);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
