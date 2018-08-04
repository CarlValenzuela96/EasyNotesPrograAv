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

public class Semestre {
	public Semestre() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_SEMESTRE_RAMO) {
			return ORM_ramo;
		}
		else if (key == ORMConstants.KEY_SEMESTRE_EVENTO) {
			return ORM_evento;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_SEMESTRE_USUARIOIDUSUARIO) {
			this.usuarioidUsuario = (clases.Usuario) owner;
		}
		
		else if (key == ORMConstants.KEY_SEMESTRE_HISTORIAL) {
			this.historial = (clases.Historial) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int idSemestre;
	
	private Integer numeroSemestre;
	
	private Integer añoSemestre;
	
	private Integer cantRamos;
	
	private Integer cantHorasSemanalesTotales;
	
	private Integer estadoSemestre;
	
	private clases.Usuario usuarioidUsuario;
	
	private java.util.Set ORM_ramo = new java.util.HashSet();
	
	private java.util.Set ORM_evento = new java.util.HashSet();
	
	private clases.Historial historial;
	
	public void setIdSemestre(int value) {
		this.idSemestre = value;
	}
	
	public int getIdSemestre() {
		return idSemestre;
	}
	
	public int getORMID() {
		return getIdSemestre();
	}
	
	public void setNumeroSemestre(int value) {
		setNumeroSemestre(new Integer(value));
	}
	
	public void setNumeroSemestre(Integer value) {
		this.numeroSemestre = value;
	}
	
	public Integer getNumeroSemestre() {
		return numeroSemestre;
	}
	
	public void setAñoSemestre(int value) {
		setAñoSemestre(new Integer(value));
	}
	
	public void setAñoSemestre(Integer value) {
		this.añoSemestre = value;
	}
	
	public Integer getAñoSemestre() {
		return añoSemestre;
	}
	
	public void setCantRamos(int value) {
		setCantRamos(new Integer(value));
	}
	
	public void setCantRamos(Integer value) {
		this.cantRamos = value;
	}
	
	public Integer getCantRamos() {
		return cantRamos;
	}
	
	public void setCantHorasSemanalesTotales(int value) {
		setCantHorasSemanalesTotales(new Integer(value));
	}
	
	public void setCantHorasSemanalesTotales(Integer value) {
		this.cantHorasSemanalesTotales = value;
	}
	
	public Integer getCantHorasSemanalesTotales() {
		return cantHorasSemanalesTotales;
	}
	
	public void setEstadoSemestre(int value) {
		setEstadoSemestre(new Integer(value));
	}
	
	public void setEstadoSemestre(Integer value) {
		this.estadoSemestre = value;
	}
	
	public Integer getEstadoSemestre() {
		return estadoSemestre;
	}
	
	public void setUsuarioidUsuario(clases.Usuario value) {
		if (usuarioidUsuario != null) {
			usuarioidUsuario.semestre.remove(this);
		}
		if (value != null) {
			value.semestre.add(this);
		}
	}
	
	public clases.Usuario getUsuarioidUsuario() {
		return usuarioidUsuario;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_UsuarioidUsuario(clases.Usuario value) {
		this.usuarioidUsuario = value;
	}
	
	private clases.Usuario getORM_UsuarioidUsuario() {
		return usuarioidUsuario;
	}
	
	private void setORM_Ramo(java.util.Set value) {
		this.ORM_ramo = value;
	}
	
	private java.util.Set getORM_Ramo() {
		return ORM_ramo;
	}
	
	public final clases.RamoSetCollection ramo = new clases.RamoSetCollection(this, _ormAdapter, ORMConstants.KEY_SEMESTRE_RAMO, ORMConstants.KEY_RAMO_SEMESTREIDSEMESTRE, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Evento(java.util.Set value) {
		this.ORM_evento = value;
	}
	
	private java.util.Set getORM_Evento() {
		return ORM_evento;
	}
	
	public final clases.EventoSetCollection evento = new clases.EventoSetCollection(this, _ormAdapter, ORMConstants.KEY_SEMESTRE_EVENTO, ORMConstants.KEY_EVENTO_SEMESTREIDSEMESTRE, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setHistorial(clases.Historial value) {
		if (this.historial != value) {
			clases.Historial lhistorial = this.historial;
			this.historial = value;
			if (value != null) {
				historial.setSemestreidSemestre(this);
			}
			if (lhistorial != null && lhistorial.getSemestreidSemestre() == this) {
				lhistorial.setSemestreidSemestre(null);
			}
		}
	}
	
	public clases.Historial getHistorial() {
		return historial;
	}
	
	public String toString() {
		return String.valueOf(getIdSemestre());
	}
	
}
