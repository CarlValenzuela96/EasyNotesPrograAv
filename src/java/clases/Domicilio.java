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

public class Domicilio {
	public Domicilio() {
	}
	
	private int idDomicilio;
	
	private String calle;
	
	private Integer numeracion;
	
	private Integer depto;
	
	private clases.Direccion direccionidDireccion;
	
	private void setIdDomicilio(int value) {
		this.idDomicilio = value;
	}
	
	public int getIdDomicilio() {
		return idDomicilio;
	}
	
	public int getORMID() {
		return getIdDomicilio();
	}
	
	public void setCalle(String value) {
		this.calle = value;
	}
	
	public String getCalle() {
		return calle;
	}
	
	public void setNumeracion(int value) {
		setNumeracion(new Integer(value));
	}
	
	public void setNumeracion(Integer value) {
		this.numeracion = value;
	}
	
	public Integer getNumeracion() {
		return numeracion;
	}
	
	public void setDepto(int value) {
		setDepto(new Integer(value));
	}
	
	public void setDepto(Integer value) {
		this.depto = value;
	}
	
	public Integer getDepto() {
		return depto;
	}
	
	public void setDireccionidDireccion(clases.Direccion value) {
		if (this.direccionidDireccion != value) {
			clases.Direccion ldireccionidDireccion = this.direccionidDireccion;
			this.direccionidDireccion = value;
			if (value != null) {
				direccionidDireccion.setDomicilio(this);
			}
			if (ldireccionidDireccion != null && ldireccionidDireccion.getDomicilio() == this) {
				ldireccionidDireccion.setDomicilio(null);
			}
		}
	}
	
	public clases.Direccion getDireccionidDireccion() {
		return direccionidDireccion;
	}
	
	public String toString() {
		return String.valueOf(getIdDomicilio());
	}
	
}
