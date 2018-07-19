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

public class RamoAprobadoDAO {
	public static RamoAprobado loadRamoAprobadoByORMID(int idRamoAprobado) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return loadRamoAprobadoByORMID(session, idRamoAprobado);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RamoAprobado getRamoAprobadoByORMID(int idRamoAprobado) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return getRamoAprobadoByORMID(session, idRamoAprobado);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RamoAprobado loadRamoAprobadoByORMID(int idRamoAprobado, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return loadRamoAprobadoByORMID(session, idRamoAprobado, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RamoAprobado getRamoAprobadoByORMID(int idRamoAprobado, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return getRamoAprobadoByORMID(session, idRamoAprobado, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RamoAprobado loadRamoAprobadoByORMID(PersistentSession session, int idRamoAprobado) throws PersistentException {
		try {
			return (RamoAprobado) session.load(clases.RamoAprobado.class, new Integer(idRamoAprobado));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RamoAprobado getRamoAprobadoByORMID(PersistentSession session, int idRamoAprobado) throws PersistentException {
		try {
			return (RamoAprobado) session.get(clases.RamoAprobado.class, new Integer(idRamoAprobado));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RamoAprobado loadRamoAprobadoByORMID(PersistentSession session, int idRamoAprobado, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (RamoAprobado) session.load(clases.RamoAprobado.class, new Integer(idRamoAprobado), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RamoAprobado getRamoAprobadoByORMID(PersistentSession session, int idRamoAprobado, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (RamoAprobado) session.get(clases.RamoAprobado.class, new Integer(idRamoAprobado), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryRamoAprobado(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return queryRamoAprobado(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryRamoAprobado(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return queryRamoAprobado(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RamoAprobado[] listRamoAprobadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return listRamoAprobadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RamoAprobado[] listRamoAprobadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return listRamoAprobadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryRamoAprobado(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From clases.RamoAprobado as RamoAprobado");
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
	
	public static List queryRamoAprobado(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From clases.RamoAprobado as RamoAprobado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("RamoAprobado", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RamoAprobado[] listRamoAprobadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryRamoAprobado(session, condition, orderBy);
			return (RamoAprobado[]) list.toArray(new RamoAprobado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RamoAprobado[] listRamoAprobadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryRamoAprobado(session, condition, orderBy, lockMode);
			return (RamoAprobado[]) list.toArray(new RamoAprobado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RamoAprobado loadRamoAprobadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return loadRamoAprobadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RamoAprobado loadRamoAprobadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return loadRamoAprobadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RamoAprobado loadRamoAprobadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		RamoAprobado[] ramoAprobados = listRamoAprobadoByQuery(session, condition, orderBy);
		if (ramoAprobados != null && ramoAprobados.length > 0)
			return ramoAprobados[0];
		else
			return null;
	}
	
	public static RamoAprobado loadRamoAprobadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		RamoAprobado[] ramoAprobados = listRamoAprobadoByQuery(session, condition, orderBy, lockMode);
		if (ramoAprobados != null && ramoAprobados.length > 0)
			return ramoAprobados[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateRamoAprobadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return iterateRamoAprobadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateRamoAprobadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return iterateRamoAprobadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateRamoAprobadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From clases.RamoAprobado as RamoAprobado");
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
	
	public static java.util.Iterator iterateRamoAprobadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From clases.RamoAprobado as RamoAprobado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("RamoAprobado", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RamoAprobado createRamoAprobado() {
		return new clases.RamoAprobado();
	}
	
	public static boolean save(clases.RamoAprobado ramoAprobado) throws PersistentException {
		try {
			clases.PrograAvanzadaPersistentManager.instance().saveObject(ramoAprobado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(clases.RamoAprobado ramoAprobado) throws PersistentException {
		try {
			clases.PrograAvanzadaPersistentManager.instance().deleteObject(ramoAprobado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(clases.RamoAprobado ramoAprobado)throws PersistentException {
		try {
			if (ramoAprobado.getHistorialidHistorial() != null) {
				ramoAprobado.getHistorialidHistorial().ramoAprobado.remove(ramoAprobado);
			}
			
			return delete(ramoAprobado);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(clases.RamoAprobado ramoAprobado, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (ramoAprobado.getHistorialidHistorial() != null) {
				ramoAprobado.getHistorialidHistorial().ramoAprobado.remove(ramoAprobado);
			}
			
			try {
				session.delete(ramoAprobado);
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
	
	public static boolean refresh(clases.RamoAprobado ramoAprobado) throws PersistentException {
		try {
			clases.PrograAvanzadaPersistentManager.instance().getSession().refresh(ramoAprobado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(clases.RamoAprobado ramoAprobado) throws PersistentException {
		try {
			clases.PrograAvanzadaPersistentManager.instance().getSession().evict(ramoAprobado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
