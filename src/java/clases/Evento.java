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

public class Evento {
	public Evento() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == clases.ORMConstants.KEY_EVENTO_RAMOIDRAMO) {
			this.ramoidRamo = (clases.Ramo) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int idEvento;
	
	private String fecha;
	
	private String anotacion;
	
	private clases.Ramo ramoidRamo;
	
	private void setIdEvento(int value) {
		this.idEvento = value;
	}
	
	public int getIdEvento() {
		return idEvento;
	}
	
	public int getORMID() {
		return getIdEvento();
	}
	
	public void setFecha(String value) {
		this.fecha = value;
	}
	
	public String getFecha() {
		return fecha;
	}
	
	public void setAnotacion(String value) {
		this.anotacion = value;
	}
	
	public String getAnotacion() {
		return anotacion;
	}
	
	public void setRamoidRamo(clases.Ramo value) {
		if (ramoidRamo != null) {
			ramoidRamo.evento.remove(this);
		}
		if (value != null) {
			value.evento.add(this);
		}
	}
	
	public clases.Ramo getRamoidRamo() {
		return ramoidRamo;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_RamoidRamo(clases.Ramo value) {
		this.ramoidRamo = value;
	}
	
	private clases.Ramo getORM_RamoidRamo() {
		return ramoidRamo;
	}
	
	public String toString() {
		return String.valueOf(getIdEvento());
	}
	
}
