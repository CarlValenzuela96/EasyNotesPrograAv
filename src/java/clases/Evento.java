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
		if (key == clases.ORMConstants.KEY_EVENTO_USUARIOIDUSUARIO) {
			this.usuarioidUsuario = (clases.Usuario) owner;
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
	
	private clases.Usuario usuarioidUsuario;
	
	private void setIdEvento(int value) {
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
	
	public void setUsuarioidUsuario(clases.Usuario value) {
		if (usuarioidUsuario != null) {
			usuarioidUsuario.evento.remove(this);
		}
		if (value != null) {
			value.evento.add(this);
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
	
	public String toString() {
		return String.valueOf(getIdEvento());
	}
	
}
