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

public class NotasPractico {
	public NotasPractico() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_NOTASPRACTICO_RAMOIDRAMO) {
			this.ramoidRamo = (clases.Ramo) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int idNotaPractica;
	
	private Double notaPractica;
	
	private Double pondPractico;
	
	private clases.Ramo ramoidRamo;
	
	public void setIdNotaPractica(int value) {
		this.idNotaPractica = value;
	}
	
	public int getIdNotaPractica() {
		return idNotaPractica;
	}
	
	public int getORMID() {
		return getIdNotaPractica();
	}
	
	public void setNotaPractica(double value) {
		setNotaPractica(new Double(value));
	}
	
	public void setNotaPractica(Double value) {
		this.notaPractica = value;
	}
	
	public Double getNotaPractica() {
		return notaPractica;
	}
	
	public void setPondPractico(double value) {
		setPondPractico(new Double(value));
	}
	
	public void setPondPractico(Double value) {
		this.pondPractico = value;
	}
	
	public Double getPondPractico() {
		return pondPractico;
	}
	
	public void setRamoidRamo(clases.Ramo value) {
		if (ramoidRamo != null) {
			ramoidRamo.notasPractico.remove(this);
		}
		if (value != null) {
			value.notasPractico.add(this);
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
		return String.valueOf(getIdNotaPractica());
	}
	
}
