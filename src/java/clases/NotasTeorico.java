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

public class NotasTeorico {
	public NotasTeorico() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_NOTASTEORICO_RAMOIDRAMO) {
			this.ramoidRamo = (clases.Ramo) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int idNotaTeorica;
	
	private Double notaTeorica;
	
	private Double pondTeorica;
	
	private clases.Ramo ramoidRamo;
	
	public void setIdNotaTeorica(int value) {
		this.idNotaTeorica = value;
	}
	
	public int getIdNotaTeorica() {
		return idNotaTeorica;
	}
	
	public int getORMID() {
		return getIdNotaTeorica();
	}
	
	public void setNotaTeorica(double value) {
		setNotaTeorica(new Double(value));
	}
	
	public void setNotaTeorica(Double value) {
		this.notaTeorica = value;
	}
	
	public Double getNotaTeorica() {
		return notaTeorica;
	}
	
	public void setPondTeorica(double value) {
		setPondTeorica(new Double(value));
	}
	
	public void setPondTeorica(Double value) {
		this.pondTeorica = value;
	}
	
	public Double getPondTeorica() {
		return pondTeorica;
	}
	
	public void setRamoidRamo(clases.Ramo value) {
		if (ramoidRamo != null) {
			ramoidRamo.notasTeorico.remove(this);
		}
		if (value != null) {
			value.notasTeorico.add(this);
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
		return String.valueOf(getIdNotaTeorica());
	}
	
}
