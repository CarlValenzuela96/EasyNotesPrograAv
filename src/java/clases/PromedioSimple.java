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

public class PromedioSimple {
	public PromedioSimple() {
	}
	
	private int idPromedioSimple;
	
	private Double promFinal;
	
	private clases.Ramo ramoidRamo;
	
	private void setIdPromedioSimple(int value) {
		this.idPromedioSimple = value;
	}
	
	public int getIdPromedioSimple() {
		return idPromedioSimple;
	}
	
	public int getORMID() {
		return getIdPromedioSimple();
	}
	
	public void setPromFinal(double value) {
		setPromFinal(new Double(value));
	}
	
	public void setPromFinal(Double value) {
		this.promFinal = value;
	}
	
	public Double getPromFinal() {
		return promFinal;
	}
	
	public void setRamoidRamo(clases.Ramo value) {
		if (this.ramoidRamo != value) {
			clases.Ramo lramoidRamo = this.ramoidRamo;
			this.ramoidRamo = value;
			if (value != null) {
				ramoidRamo.setPromedioSimple(this);
			}
			if (lramoidRamo != null && lramoidRamo.getPromedioSimple() == this) {
				lramoidRamo.setPromedioSimple(null);
			}
		}
	}
	
	public clases.Ramo getRamoidRamo() {
		return ramoidRamo;
	}
	
	public String toString() {
		return String.valueOf(getIdPromedioSimple());
	}
	
}
