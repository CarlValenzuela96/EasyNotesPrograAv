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

public class PromedioMixto {
	public PromedioMixto() {
	}
	
	private int idPromedioMixto;
	
	private Double promPractico;
	
	private Double promTeorico;
	
	private Double promFinal;
	
	private clases.Ramo ramoidRamo;
	
	private void setIdPromedioMixto(int value) {
		this.idPromedioMixto = value;
	}
	
	public int getIdPromedioMixto() {
		return idPromedioMixto;
	}
	
	public int getORMID() {
		return getIdPromedioMixto();
	}
	
	public void setPromPractico(double value) {
		setPromPractico(new Double(value));
	}
	
	public void setPromPractico(Double value) {
		this.promPractico = value;
	}
	
	public Double getPromPractico() {
		return promPractico;
	}
	
	public void setPromTeorico(double value) {
		setPromTeorico(new Double(value));
	}
	
	public void setPromTeorico(Double value) {
		this.promTeorico = value;
	}
	
	public Double getPromTeorico() {
		return promTeorico;
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
				ramoidRamo.setPromedioMixto(this);
			}
			if (lramoidRamo != null && lramoidRamo.getPromedioMixto() == this) {
				lramoidRamo.setPromedioMixto(null);
			}
		}
	}
	
	public clases.Ramo getRamoidRamo() {
		return ramoidRamo;
	}
	
	public String toString() {
		return String.valueOf(getIdPromedioMixto());
	}
	
}
