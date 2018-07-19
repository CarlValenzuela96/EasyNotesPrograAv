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

public class SemestreDAO {
	public static Semestre loadSemestreByORMID(int idSemestre) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return loadSemestreByORMID(session, idSemestre);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Semestre getSemestreByORMID(int idSemestre) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return getSemestreByORMID(session, idSemestre);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Semestre loadSemestreByORMID(int idSemestre, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return loadSemestreByORMID(session, idSemestre, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Semestre getSemestreByORMID(int idSemestre, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return getSemestreByORMID(session, idSemestre, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Semestre loadSemestreByORMID(PersistentSession session, int idSemestre) throws PersistentException {
		try {
			return (Semestre) session.load(clases.Semestre.class, new Integer(idSemestre));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Semestre getSemestreByORMID(PersistentSession session, int idSemestre) throws PersistentException {
		try {
			return (Semestre) session.get(clases.Semestre.class, new Integer(idSemestre));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Semestre loadSemestreByORMID(PersistentSession session, int idSemestre, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Semestre) session.load(clases.Semestre.class, new Integer(idSemestre), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Semestre getSemestreByORMID(PersistentSession session, int idSemestre, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Semestre) session.get(clases.Semestre.class, new Integer(idSemestre), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySemestre(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return querySemestre(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySemestre(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return querySemestre(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Semestre[] listSemestreByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return listSemestreByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Semestre[] listSemestreByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return listSemestreByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySemestre(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From clases.Semestre as Semestre");
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
	
	public static List querySemestre(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From clases.Semestre as Semestre");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Semestre", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Semestre[] listSemestreByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = querySemestre(session, condition, orderBy);
			return (Semestre[]) list.toArray(new Semestre[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Semestre[] listSemestreByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = querySemestre(session, condition, orderBy, lockMode);
			return (Semestre[]) list.toArray(new Semestre[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Semestre loadSemestreByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return loadSemestreByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Semestre loadSemestreByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return loadSemestreByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Semestre loadSemestreByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Semestre[] semestres = listSemestreByQuery(session, condition, orderBy);
		if (semestres != null && semestres.length > 0)
			return semestres[0];
		else
			return null;
	}
	
	public static Semestre loadSemestreByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Semestre[] semestres = listSemestreByQuery(session, condition, orderBy, lockMode);
		if (semestres != null && semestres.length > 0)
			return semestres[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateSemestreByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return iterateSemestreByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSemestreByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return iterateSemestreByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSemestreByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From clases.Semestre as Semestre");
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
	
	public static java.util.Iterator iterateSemestreByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From clases.Semestre as Semestre");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Semestre", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Semestre createSemestre() {
		return new clases.Semestre();
	}
	
	public static boolean save(clases.Semestre semestre) throws PersistentException {
		try {
			clases.PrograAvanzadaPersistentManager.instance().saveObject(semestre);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(clases.Semestre semestre) throws PersistentException {
		try {
			clases.PrograAvanzadaPersistentManager.instance().deleteObject(semestre);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(clases.Semestre semestre)throws PersistentException {
		try {
			if (semestre.getUsuarioidUsuario() != null) {
				semestre.getUsuarioidUsuario().semestre.remove(semestre);
			}
			
			clases.Ramo[] lRamos = semestre.ramo.toArray();
			for(int i = 0; i < lRamos.length; i++) {
				lRamos[i].setSemestreidSemestre(null);
			}
			if (semestre.getHistorial() != null) {
				semestre.getHistorial().setSemestreidSemestre(null);
			}
			
			return delete(semestre);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(clases.Semestre semestre, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (semestre.getUsuarioidUsuario() != null) {
				semestre.getUsuarioidUsuario().semestre.remove(semestre);
			}
			
			clases.Ramo[] lRamos = semestre.ramo.toArray();
			for(int i = 0; i < lRamos.length; i++) {
				lRamos[i].setSemestreidSemestre(null);
			}
			if (semestre.getHistorial() != null) {
				semestre.getHistorial().setSemestreidSemestre(null);
			}
			
			try {
				session.delete(semestre);
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
	
	public static boolean refresh(clases.Semestre semestre) throws PersistentException {
		try {
			clases.PrograAvanzadaPersistentManager.instance().getSession().refresh(semestre);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(clases.Semestre semestre) throws PersistentException {
		try {
			clases.PrograAvanzadaPersistentManager.instance().getSession().evict(semestre);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
