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

public class Carrera {
	public Carrera() {
	}
	
	private int idCarrera;
	
	private String nombreCarrera;
	
	private Integer cantSemestres;
	
	private String universidad;
	
	private clases.Usuario usuarioidUsuario;
	
	private void setIdCarrera(int value) {
		this.idCarrera = value;
	}
	
	public int getIdCarrera() {
		return idCarrera;
	}
	
	public int getORMID() {
		return getIdCarrera();
	}
	
	public void setNombreCarrera(String value) {
		this.nombreCarrera = value;
	}
	
	public String getNombreCarrera() {
		return nombreCarrera;
	}
	
	public void setCantSemestres(int value) {
		setCantSemestres(new Integer(value));
	}
	
	public void setCantSemestres(Integer value) {
		this.cantSemestres = value;
	}
	
	public Integer getCantSemestres() {
		return cantSemestres;
	}
	
	public void setUniversidad(String value) {
		this.universidad = value;
	}
	
	public String getUniversidad() {
		return universidad;
	}
	
	public void setUsuarioidUsuario(clases.Usuario value) {
		if (this.usuarioidUsuario != value) {
			clases.Usuario lusuarioidUsuario = this.usuarioidUsuario;
			this.usuarioidUsuario = value;
			if (value != null) {
				usuarioidUsuario.setCarrera(this);
			}
			if (lusuarioidUsuario != null && lusuarioidUsuario.getCarrera() == this) {
				lusuarioidUsuario.setCarrera(null);
			}
		}
	}
	
	public clases.Usuario getUsuarioidUsuario() {
		return usuarioidUsuario;
	}
	
	public String toString() {
		return String.valueOf(getIdCarrera());
	}
	
}
