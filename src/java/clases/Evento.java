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

public class Evento {
	public Evento() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_EVENTO_SEMESTREIDSEMESTRE) {
			this.semestreidSemestre = (clases.Semestre) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int idEvento;
	
	private String content;
	
	private Integer año;
	
	private Integer mes;
	
	private Integer dia;
	
	private String color;
	
	private clases.Semestre semestreidSemestre;
	
	public void setIdEvento(int value) {
		this.idEvento = value;
	}
	
	public int getIdEvento() {
		return idEvento;
	}
	
	public int getORMID() {
		return getIdEvento();
	}
	
	public void setContent(String value) {
		this.content = value;
	}
	
	public String getContent() {
		return content;
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
	
	public void setMes(int value) {
		setMes(new Integer(value));
	}
	
	public void setMes(Integer value) {
		this.mes = value;
	}
	
	public Integer getMes() {
		return mes;
	}
	
	public void setDia(int value) {
		setDia(new Integer(value));
	}
	
	public void setDia(Integer value) {
		this.dia = value;
	}
	
	public Integer getDia() {
		return dia;
	}
	
	public void setColor(String value) {
		this.color = value;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setSemestreidSemestre(clases.Semestre value) {
		if (semestreidSemestre != null) {
			semestreidSemestre.evento.remove(this);
		}
		if (value != null) {
			value.evento.add(this);
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
	
	public String toString() {
		return String.valueOf(getIdEvento());
	}
	
}
