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

public class Direccion {
	public Direccion() {
	}
	
	private int idDireccion;
	
	private String paisRecidencia;
	
	private String ciudad;
	
	private String comuna;
	
	private clases.Usuario usuarioidUsuario;
	
	private clases.Domicilio domicilio;
	
	public void setIdDireccion(int value) {
		this.idDireccion = value;
	}
	
	public int getIdDireccion() {
		return idDireccion;
	}
	
	public int getORMID() {
		return getIdDireccion();
	}
	
	public void setPaisRecidencia(String value) {
		this.paisRecidencia = value;
	}
	
	public String getPaisRecidencia() {
		return paisRecidencia;
	}
	
	public void setCiudad(String value) {
		this.ciudad = value;
	}
	
	public String getCiudad() {
		return ciudad;
	}
	
	public void setComuna(String value) {
		this.comuna = value;
	}
	
	public String getComuna() {
		return comuna;
	}
	
	public void setUsuarioidUsuario(clases.Usuario value) {
		if (this.usuarioidUsuario != value) {
			clases.Usuario lusuarioidUsuario = this.usuarioidUsuario;
			this.usuarioidUsuario = value;
			if (value != null) {
				usuarioidUsuario.setDireccion(this);
			}
			if (lusuarioidUsuario != null && lusuarioidUsuario.getDireccion() == this) {
				lusuarioidUsuario.setDireccion(null);
			}
		}
	}
	
	public clases.Usuario getUsuarioidUsuario() {
		return usuarioidUsuario;
	}
	
	public void setDomicilio(clases.Domicilio value) {
		if (this.domicilio != value) {
			clases.Domicilio ldomicilio = this.domicilio;
			this.domicilio = value;
			if (value != null) {
				domicilio.setDireccionidDireccion(this);
			}
			if (ldomicilio != null && ldomicilio.getDireccionidDireccion() == this) {
				ldomicilio.setDireccionidDireccion(null);
			}
		}
	}
	
	public clases.Domicilio getDomicilio() {
		return domicilio;
	}
	
	public String toString() {
		return String.valueOf(getIdDireccion());
	}
	
}
