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
	
	private java.util.Set this_getSet (int key) {
		if (key == clases.ORMConstants.KEY_CARRERA_USUARIO) {
			return ORM_usuario;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int idCarrera;
	
	private String nombreCarrera;
	
	private Integer cantSemestres;
	
	private String universidad;
	
	private java.util.Set ORM_usuario = new java.util.HashSet();
	
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
	
	private void setORM_Usuario(java.util.Set value) {
		this.ORM_usuario = value;
	}
	
	private java.util.Set getORM_Usuario() {
		return ORM_usuario;
	}
	
	public final clases.UsuarioSetCollection usuario = new clases.UsuarioSetCollection(this, _ormAdapter, clases.ORMConstants.KEY_CARRERA_USUARIO, clases.ORMConstants.KEY_USUARIO_CARRERAIDCARRERA, clases.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdCarrera());
	}
	
}
