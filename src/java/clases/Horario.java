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

public class Horario {
	public Horario() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == clases.ORMConstants.KEY_HORARIO_RAMOIDRAMO) {
			this.ramoidRamo = (clases.Ramo) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int idHorario;
	
	private String diaImpartido;
	
	private String horaInicio;
	
	private String horaFIn;
	
	private String sala;
	
	private String docente;
	
	private clases.Ramo ramoidRamo;
	
	private void setIdHorario(int value) {
		this.idHorario = value;
	}
	
	public int getIdHorario() {
		return idHorario;
	}
	
	public int getORMID() {
		return getIdHorario();
	}
	
	public void setDiaImpartido(String value) {
		this.diaImpartido = value;
	}
	
	public String getDiaImpartido() {
		return diaImpartido;
	}
	
	public void setHoraInicio(String value) {
		this.horaInicio = value;
	}
	
	public String getHoraInicio() {
		return horaInicio;
	}
	
	public void setHoraFIn(String value) {
		this.horaFIn = value;
	}
	
	public String getHoraFIn() {
		return horaFIn;
	}
	
	public void setSala(String value) {
		this.sala = value;
	}
	
	public String getSala() {
		return sala;
	}
	
	public void setDocente(String value) {
		this.docente = value;
	}
	
	public String getDocente() {
		return docente;
	}
	
	public void setRamoidRamo(clases.Ramo value) {
		if (ramoidRamo != null) {
			ramoidRamo.horario.remove(this);
		}
		if (value != null) {
			value.horario.add(this);
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
		return String.valueOf(getIdHorario());
	}
	
}
