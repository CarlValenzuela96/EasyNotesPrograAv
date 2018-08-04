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

public class Historial {
	public Historial() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_HISTORIAL_RAMOAPROBADO) {
			return ORM_ramoAprobado;
		}
		else if (key == ORMConstants.KEY_HISTORIAL_RAMOREPROBADO) {
			return ORM_ramoReprobado;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int idHistorial;
	
	private Integer semestre;
	
	private Integer año;
	
	private clases.Semestre semestreidSemestre;
	
	private java.util.Set ORM_ramoAprobado = new java.util.HashSet();
	
	private java.util.Set ORM_ramoReprobado = new java.util.HashSet();
	
	public void setIdHistorial(int value) {
		this.idHistorial = value;
	}
	
	public int getIdHistorial() {
		return idHistorial;
	}
	
	public int getORMID() {
		return getIdHistorial();
	}
	
	public void setSemestre(int value) {
		setSemestre(new Integer(value));
	}
	
	public void setSemestre(Integer value) {
		this.semestre = value;
	}
	
	public Integer getSemestre() {
		return semestre;
	}
	
	public void setAño(int value) {
		setAño(new Integer(value));
	}
	
	public void setAño(Integer value) {
		this.año = value;
	}
	
	public Integer getAño() {
		return año;
	}
	
	public void setSemestreidSemestre(clases.Semestre value) {
		if (this.semestreidSemestre != value) {
			clases.Semestre lsemestreidSemestre = this.semestreidSemestre;
			this.semestreidSemestre = value;
			if (value != null) {
				semestreidSemestre.setHistorial(this);
			}
			if (lsemestreidSemestre != null && lsemestreidSemestre.getHistorial() == this) {
				lsemestreidSemestre.setHistorial(null);
			}
		}
	}
	
	public clases.Semestre getSemestreidSemestre() {
		return semestreidSemestre;
	}
	
	private void setORM_RamoAprobado(java.util.Set value) {
		this.ORM_ramoAprobado = value;
	}
	
	private java.util.Set getORM_RamoAprobado() {
		return ORM_ramoAprobado;
	}
	
	public final clases.RamoAprobadoSetCollection ramoAprobado = new clases.RamoAprobadoSetCollection(this, _ormAdapter, ORMConstants.KEY_HISTORIAL_RAMOAPROBADO, ORMConstants.KEY_RAMOAPROBADO_HISTORIALIDHISTORIAL, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_RamoReprobado(java.util.Set value) {
		this.ORM_ramoReprobado = value;
	}
	
	private java.util.Set getORM_RamoReprobado() {
		return ORM_ramoReprobado;
	}
	
	public final clases.RamoReprobadoSetCollection ramoReprobado = new clases.RamoReprobadoSetCollection(this, _ormAdapter, ORMConstants.KEY_HISTORIAL_RAMOREPROBADO, ORMConstants.KEY_RAMOREPROBADO_HISTORIALIDHISTORIAL, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdHistorial());
	}
	
}
