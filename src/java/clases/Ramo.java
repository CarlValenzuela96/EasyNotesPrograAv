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

public class Ramo {
	public Ramo() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_RAMO_HORARIO) {
			return ORM_horario;
		}
		else if (key == ORMConstants.KEY_RAMO_NOTASTEORICO) {
			return ORM_notasTeorico;
		}
		else if (key == ORMConstants.KEY_RAMO_NOTASPRACTICO) {
			return ORM_notasPractico;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_RAMO_SEMESTREIDSEMESTRE) {
			this.semestreidSemestre = (clases.Semestre) owner;
		}
		
		else if (key == ORMConstants.KEY_RAMO_PROMEDIOMIXTO) {
			this.promedioMixto = (clases.PromedioMixto) owner;
		}
		
		else if (key == ORMConstants.KEY_RAMO_PROMEDIOSIMPLE) {
			this.promedioSimple = (clases.PromedioSimple) owner;
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
	
	private int idRamo;
	
	private String nombreRamo;
	
	private Integer codigoRamo;
	
	private String tipoAprobacion;
	
	private Integer cantNotasTeoricas;
	
	private Integer cantNotasPracticas;
	
	private Double ponderacionTeorica;
	
	private Double poderacionPractica;
	
	private Integer horasSemanales;
	
	private clases.Semestre semestreidSemestre;
	
	private java.util.Set ORM_horario = new java.util.HashSet();
	
	private java.util.Set ORM_notasTeorico = new java.util.HashSet();
	
	private java.util.Set ORM_notasPractico = new java.util.HashSet();
	
	private clases.PromedioMixto promedioMixto;
	
	private clases.PromedioSimple promedioSimple;
	
	public void setIdRamo(int value) {
		this.idRamo = value;
	}
	
	public int getIdRamo() {
		return idRamo;
	}
	
	public int getORMID() {
		return getIdRamo();
	}
	
	public void setNombreRamo(String value) {
		this.nombreRamo = value;
	}
	
	public String getNombreRamo() {
		return nombreRamo;
	}
	
	public void setCodigoRamo(int value) {
		setCodigoRamo(new Integer(value));
	}
	
	public void setCodigoRamo(Integer value) {
		this.codigoRamo = value;
	}
	
	public Integer getCodigoRamo() {
		return codigoRamo;
	}
	
	public void setTipoAprobacion(String value) {
		this.tipoAprobacion = value;
	}
	
	public String getTipoAprobacion() {
		return tipoAprobacion;
	}
	
	public void setCantNotasTeoricas(int value) {
		setCantNotasTeoricas(new Integer(value));
	}
	
	public void setCantNotasTeoricas(Integer value) {
		this.cantNotasTeoricas = value;
	}
	
	public Integer getCantNotasTeoricas() {
		return cantNotasTeoricas;
	}
	
	public void setCantNotasPracticas(int value) {
		setCantNotasPracticas(new Integer(value));
	}
	
	public void setCantNotasPracticas(Integer value) {
		this.cantNotasPracticas = value;
	}
	
	public Integer getCantNotasPracticas() {
		return cantNotasPracticas;
	}
	
	public void setPonderacionTeorica(double value) {
		setPonderacionTeorica(new Double(value));
	}
	
	public void setPonderacionTeorica(Double value) {
		this.ponderacionTeorica = value;
	}
	
	public Double getPonderacionTeorica() {
		return ponderacionTeorica;
	}
	
	public void setPoderacionPractica(double value) {
		setPoderacionPractica(new Double(value));
	}
	
	public void setPoderacionPractica(Double value) {
		this.poderacionPractica = value;
	}
	
	public Double getPoderacionPractica() {
		return poderacionPractica;
	}
	
	public void setHorasSemanales(int value) {
		setHorasSemanales(new Integer(value));
	}
	
	public void setHorasSemanales(Integer value) {
		this.horasSemanales = value;
	}
	
	public Integer getHorasSemanales() {
		return horasSemanales;
	}
	
	public void setSemestreidSemestre(clases.Semestre value) {
		if (semestreidSemestre != null) {
			semestreidSemestre.ramo.remove(this);
		}
		if (value != null) {
			value.ramo.add(this);
		}
	}
	
	public clases.Semestre getSemestreidSemestre() {
		return semestreidSemestre;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_SemestreidSemestre(clases.Semestre value) {
		this.semestreidSemestre = value;
	}
	
	private clases.Semestre getORM_SemestreidSemestre() {
		return semestreidSemestre;
	}
	
	private void setORM_Horario(java.util.Set value) {
		this.ORM_horario = value;
	}
	
	private java.util.Set getORM_Horario() {
		return ORM_horario;
	}
	
	public final clases.HorarioSetCollection horario = new clases.HorarioSetCollection(this, _ormAdapter, ORMConstants.KEY_RAMO_HORARIO, ORMConstants.KEY_HORARIO_RAMOIDRAMO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_NotasTeorico(java.util.Set value) {
		this.ORM_notasTeorico = value;
	}
	
	private java.util.Set getORM_NotasTeorico() {
		return ORM_notasTeorico;
	}
	
	public final clases.NotasTeoricoSetCollection notasTeorico = new clases.NotasTeoricoSetCollection(this, _ormAdapter, ORMConstants.KEY_RAMO_NOTASTEORICO, ORMConstants.KEY_NOTASTEORICO_RAMOIDRAMO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_NotasPractico(java.util.Set value) {
		this.ORM_notasPractico = value;
	}
	
	private java.util.Set getORM_NotasPractico() {
		return ORM_notasPractico;
	}
	
	public final clases.NotasPracticoSetCollection notasPractico = new clases.NotasPracticoSetCollection(this, _ormAdapter, ORMConstants.KEY_RAMO_NOTASPRACTICO, ORMConstants.KEY_NOTASPRACTICO_RAMOIDRAMO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setPromedioMixto(clases.PromedioMixto value) {
		if (this.promedioMixto != value) {
			clases.PromedioMixto lpromedioMixto = this.promedioMixto;
			this.promedioMixto = value;
			if (value != null) {
				promedioMixto.setRamoidRamo(this);
			}
			if (lpromedioMixto != null && lpromedioMixto.getRamoidRamo() == this) {
				lpromedioMixto.setRamoidRamo(null);
			}
		}
	}
	
	public clases.PromedioMixto getPromedioMixto() {
		return promedioMixto;
	}
	
	public void setPromedioSimple(clases.PromedioSimple value) {
		if (this.promedioSimple != value) {
			clases.PromedioSimple lpromedioSimple = this.promedioSimple;
			this.promedioSimple = value;
			if (value != null) {
				promedioSimple.setRamoidRamo(this);
			}
			if (lpromedioSimple != null && lpromedioSimple.getRamoidRamo() == this) {
				lpromedioSimple.setRamoidRamo(null);
			}
		}
	}
	
	public clases.PromedioSimple getPromedioSimple() {
		return promedioSimple;
	}
	
	public String toString() {
		return String.valueOf(getIdRamo());
	}
	
}
