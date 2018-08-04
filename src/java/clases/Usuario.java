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

public class Usuario {
	public Usuario() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_USUARIO_SEMESTRE) {
			return ORM_semestre;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int idUsuario;
	
	private String nombre;
	
	private String apellido;
	
	private String matricula;
	
	private String run;
	
	private Double pga;
	
	private String sexo;
	
	private String edad;
	
	private String fechaNacimiento;
	
	private String nacionalidad;
	
	private String telefono;
	
	private String email;
	
	private clases.Login loginidLogin;
	
	private java.util.Set ORM_semestre = new java.util.HashSet();
	
	private clases.Carrera carrera;
	
	private clases.Direccion direccion;
	
	public void setIdUsuario(int value) {
		this.idUsuario = value;
	}
	
	public int getIdUsuario() {
		return idUsuario;
	}
	
	public int getORMID() {
		return getIdUsuario();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setApellido(String value) {
		this.apellido = value;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setMatricula(String value) {
		this.matricula = value;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setRun(String value) {
		this.run = value;
	}
	
	public String getRun() {
		return run;
	}
	
	public void setPga(double value) {
		setPga(new Double(value));
	}
	
	public void setPga(Double value) {
		this.pga = value;
	}
	
	public Double getPga() {
		return pga;
	}
	
	public void setSexo(String value) {
		this.sexo = value;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setEdad(String value) {
		this.edad = value;
	}
	
	public String getEdad() {
		return edad;
	}
	
	public void setFechaNacimiento(String value) {
		this.fechaNacimiento = value;
	}
	
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public void setNacionalidad(String value) {
		this.nacionalidad = value;
	}
	
	public String getNacionalidad() {
		return nacionalidad;
	}
	
	public void setTelefono(String value) {
		this.telefono = value;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setLoginidLogin(clases.Login value) {
		if (this.loginidLogin != value) {
			clases.Login lloginidLogin = this.loginidLogin;
			this.loginidLogin = value;
			if (value != null) {
				loginidLogin.setUsuario(this);
			}
			if (lloginidLogin != null && lloginidLogin.getUsuario() == this) {
				lloginidLogin.setUsuario(null);
			}
		}
	}
	
	public clases.Login getLoginidLogin() {
		return loginidLogin;
	}
	
	private void setORM_Semestre(java.util.Set value) {
		this.ORM_semestre = value;
	}
	
	private java.util.Set getORM_Semestre() {
		return ORM_semestre;
	}
	
	public final clases.SemestreSetCollection semestre = new clases.SemestreSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_SEMESTRE, ORMConstants.KEY_SEMESTRE_USUARIOIDUSUARIO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setCarrera(clases.Carrera value) {
		if (this.carrera != value) {
			clases.Carrera lcarrera = this.carrera;
			this.carrera = value;
			if (value != null) {
				carrera.setUsuarioidUsuario(this);
			}
			if (lcarrera != null && lcarrera.getUsuarioidUsuario() == this) {
				lcarrera.setUsuarioidUsuario(null);
			}
		}
	}
	
	public clases.Carrera getCarrera() {
		return carrera;
	}
	
	public void setDireccion(clases.Direccion value) {
		if (this.direccion != value) {
			clases.Direccion ldireccion = this.direccion;
			this.direccion = value;
			if (value != null) {
				direccion.setUsuarioidUsuario(this);
			}
			if (ldireccion != null && ldireccion.getUsuarioidUsuario() == this) {
				ldireccion.setUsuarioidUsuario(null);
			}
		}
	}
	
	public clases.Direccion getDireccion() {
		return direccion;
	}
	
	public String toString() {
		return String.valueOf(getIdUsuario());
	}
	
}
