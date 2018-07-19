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

public class Login {
	public Login() {
	}
	
	private String idLogin;
	
	private String password;
	
	private clases.Usuario usuario;
	
	public void setIdLogin(String value) {
		this.idLogin = value;
	}
	
	public String getIdLogin() {
		return idLogin;
	}
	
	public String getORMID() {
		return getIdLogin();
	}
	
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setUsuario(clases.Usuario value) {
		if (this.usuario != value) {
			clases.Usuario lusuario = this.usuario;
			this.usuario = value;
			if (value != null) {
				usuario.setLoginusuario(this);
			}
			if (lusuario != null && lusuario.getLoginusuario() == this) {
				lusuario.setLoginusuario(null);
			}
		}
	}
	
	public clases.Usuario getUsuario() {
		return usuario;
	}
	
	public String toString() {
		return String.valueOf(getIdLogin());
	}
	
}
