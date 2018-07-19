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

public class RamoReprobadoDAO {
	public static RamoReprobado loadRamoReprobadoByORMID(int idRamoReprobacion) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return loadRamoReprobadoByORMID(session, idRamoReprobacion);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RamoReprobado getRamoReprobadoByORMID(int idRamoReprobacion) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return getRamoReprobadoByORMID(session, idRamoReprobacion);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RamoReprobado loadRamoReprobadoByORMID(int idRamoReprobacion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return loadRamoReprobadoByORMID(session, idRamoReprobacion, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RamoReprobado getRamoReprobadoByORMID(int idRamoReprobacion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return getRamoReprobadoByORMID(session, idRamoReprobacion, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RamoReprobado loadRamoReprobadoByORMID(PersistentSession session, int idRamoReprobacion) throws PersistentException {
		try {
			return (RamoReprobado) session.load(clases.RamoReprobado.class, new Integer(idRamoReprobacion));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RamoReprobado getRamoReprobadoByORMID(PersistentSession session, int idRamoReprobacion) throws PersistentException {
		try {
			return (RamoReprobado) session.get(clases.RamoReprobado.class, new Integer(idRamoReprobacion));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RamoReprobado loadRamoReprobadoByORMID(PersistentSession session, int idRamoReprobacion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (RamoReprobado) session.load(clases.RamoReprobado.class, new Integer(idRamoReprobacion), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RamoReprobado getRamoReprobadoByORMID(PersistentSession session, int idRamoReprobacion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (RamoReprobado) session.get(clases.RamoReprobado.class, new Integer(idRamoReprobacion), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryRamoReprobado(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return queryRamoReprobado(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryRamoReprobado(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return queryRamoReprobado(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RamoReprobado[] listRamoReprobadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return listRamoReprobadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RamoReprobado[] listRamoReprobadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return listRamoReprobadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryRamoReprobado(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From clases.RamoReprobado as RamoReprobado");
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
	
	public static List queryRamoReprobado(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From clases.RamoReprobado as RamoReprobado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("RamoReprobado", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RamoReprobado[] listRamoReprobadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryRamoReprobado(session, condition, orderBy);
			return (RamoReprobado[]) list.toArray(new RamoReprobado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RamoReprobado[] listRamoReprobadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryRamoReprobado(session, condition, orderBy, lockMode);
			return (RamoReprobado[]) list.toArray(new RamoReprobado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RamoReprobado loadRamoReprobadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return loadRamoReprobadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RamoReprobado loadRamoReprobadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return loadRamoReprobadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RamoReprobado loadRamoReprobadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		RamoReprobado[] ramoReprobados = listRamoReprobadoByQuery(session, condition, orderBy);
		if (ramoReprobados != null && ramoReprobados.length > 0)
			return ramoReprobados[0];
		else
			return null;
	}
	
	public static RamoReprobado loadRamoReprobadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		RamoReprobado[] ramoReprobados = listRamoReprobadoByQuery(session, condition, orderBy, lockMode);
		if (ramoReprobados != null && ramoReprobados.length > 0)
			return ramoReprobados[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateRamoReprobadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return iterateRamoReprobadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateRamoReprobadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = clases.PrograAvanzadaPersistentManager.instance().getSession();
			return iterateRamoReprobadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateRamoReprobadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From clases.RamoReprobado as RamoReprobado");
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
	
	public static java.util.Iterator iterateRamoReprobadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From clases.RamoReprobado as RamoReprobado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("RamoReprobado", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RamoReprobado createRamoReprobado() {
		return new clases.RamoReprobado();
	}
	
	public static boolean save(clases.RamoReprobado ramoReprobado) throws PersistentException {
		try {
			clases.PrograAvanzadaPersistentManager.instance().saveObject(ramoReprobado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(clases.RamoReprobado ramoReprobado) throws PersistentException {
		try {
			clases.PrograAvanzadaPersistentManager.instance().deleteObject(ramoReprobado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(clases.RamoReprobado ramoReprobado)throws PersistentException {
		try {
			if (ramoReprobado.getHistorialidHistorial() != null) {
				ramoReprobado.getHistorialidHistorial().ramoReprobado.remove(ramoReprobado);
			}
			
			return delete(ramoReprobado);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(clases.RamoReprobado ramoReprobado, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (ramoReprobado.getHistorialidHistorial() != null) {
				ramoReprobado.getHistorialidHistorial().ramoReprobado.remove(ramoReprobado);
			}
			
			try {
				session.delete(ramoReprobado);
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
	
	public static boolean refresh(clases.RamoReprobado ramoReprobado) throws PersistentException {
		try {
			clases.PrograAvanzadaPersistentManager.instance().getSession().refresh(ramoReprobado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(clases.RamoReprobado ramoReprobado) throws PersistentException {
		try {
			clases.PrograAvanzadaPersistentManager.instance().getSession().evict(ramoReprobado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
