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

public class RamoDAO {
	public static Ramo loadRamoByORMID(int idRamo) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return loadRamoByORMID(session, idRamo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ramo getRamoByORMID(int idRamo) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return getRamoByORMID(session, idRamo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ramo loadRamoByORMID(int idRamo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return loadRamoByORMID(session, idRamo, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ramo getRamoByORMID(int idRamo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return getRamoByORMID(session, idRamo, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ramo loadRamoByORMID(PersistentSession session, int idRamo) throws PersistentException {
		try {
			return (Ramo) session.load(clases.Ramo.class, new Integer(idRamo));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ramo getRamoByORMID(PersistentSession session, int idRamo) throws PersistentException {
		try {
			return (Ramo) session.get(clases.Ramo.class, new Integer(idRamo));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ramo loadRamoByORMID(PersistentSession session, int idRamo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Ramo) session.load(clases.Ramo.class, new Integer(idRamo), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ramo getRamoByORMID(PersistentSession session, int idRamo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Ramo) session.get(clases.Ramo.class, new Integer(idRamo), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryRamo(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return queryRamo(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryRamo(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return queryRamo(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ramo[] listRamoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return listRamoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ramo[] listRamoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return listRamoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryRamo(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From clases.Ramo as Ramo");
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
	
	public static List queryRamo(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From clases.Ramo as Ramo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Ramo", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ramo[] listRamoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryRamo(session, condition, orderBy);
			return (Ramo[]) list.toArray(new Ramo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ramo[] listRamoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryRamo(session, condition, orderBy, lockMode);
			return (Ramo[]) list.toArray(new Ramo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ramo loadRamoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return loadRamoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ramo loadRamoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return loadRamoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ramo loadRamoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Ramo[] ramos = listRamoByQuery(session, condition, orderBy);
		if (ramos != null && ramos.length > 0)
			return ramos[0];
		else
			return null;
	}
	
	public static Ramo loadRamoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Ramo[] ramos = listRamoByQuery(session, condition, orderBy, lockMode);
		if (ramos != null && ramos.length > 0)
			return ramos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateRamoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return iterateRamoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateRamoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PrograAvanzadaPersistentManager.instance().getSession();
			return iterateRamoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateRamoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From clases.Ramo as Ramo");
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
	
	public static java.util.Iterator iterateRamoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From clases.Ramo as Ramo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Ramo", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ramo createRamo() {
		return new clases.Ramo();
	}
	
	public static boolean save(clases.Ramo ramo) throws PersistentException {
		try {
			PrograAvanzadaPersistentManager.instance().saveObject(ramo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(clases.Ramo ramo) throws PersistentException {
		try {
			PrograAvanzadaPersistentManager.instance().deleteObject(ramo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(clases.Ramo ramo)throws PersistentException {
		try {
			if (ramo.getSemestreidSemestre() != null) {
				ramo.getSemestreidSemestre().ramo.remove(ramo);
			}
			
			clases.Horario[] lHorarios = ramo.horario.toArray();
			for(int i = 0; i < lHorarios.length; i++) {
				lHorarios[i].setRamoidRamo(null);
			}
			clases.NotasTeorico[] lNotasTeoricos = ramo.notasTeorico.toArray();
			for(int i = 0; i < lNotasTeoricos.length; i++) {
				lNotasTeoricos[i].setRamoidRamo(null);
			}
			clases.NotasPractico[] lNotasPracticos = ramo.notasPractico.toArray();
			for(int i = 0; i < lNotasPracticos.length; i++) {
				lNotasPracticos[i].setRamoidRamo(null);
			}
			if (ramo.getPromedioMixto() != null) {
				ramo.getPromedioMixto().setRamoidRamo(null);
			}
			
			if (ramo.getPromedioSimple() != null) {
				ramo.getPromedioSimple().setRamoidRamo(null);
			}
			
			return delete(ramo);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(clases.Ramo ramo, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (ramo.getSemestreidSemestre() != null) {
				ramo.getSemestreidSemestre().ramo.remove(ramo);
			}
			
			clases.Horario[] lHorarios = ramo.horario.toArray();
			for(int i = 0; i < lHorarios.length; i++) {
				lHorarios[i].setRamoidRamo(null);
			}
			clases.NotasTeorico[] lNotasTeoricos = ramo.notasTeorico.toArray();
			for(int i = 0; i < lNotasTeoricos.length; i++) {
				lNotasTeoricos[i].setRamoidRamo(null);
			}
			clases.NotasPractico[] lNotasPracticos = ramo.notasPractico.toArray();
			for(int i = 0; i < lNotasPracticos.length; i++) {
				lNotasPracticos[i].setRamoidRamo(null);
			}
			if (ramo.getPromedioMixto() != null) {
				ramo.getPromedioMixto().setRamoidRamo(null);
			}
			
			if (ramo.getPromedioSimple() != null) {
				ramo.getPromedioSimple().setRamoidRamo(null);
			}
			
			try {
				session.delete(ramo);
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
	
	public static boolean refresh(clases.Ramo ramo) throws PersistentException {
		try {
			PrograAvanzadaPersistentManager.instance().getSession().refresh(ramo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(clases.Ramo ramo) throws PersistentException {
		try {
			PrograAvanzadaPersistentManager.instance().getSession().evict(ramo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
