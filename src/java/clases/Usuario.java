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
		if (key == clases.ORMConstants.KEY_USUARIO_SEMESTRE) {
			return ORM_semestre;
		}
		else if (key == clases.ORMConstants.KEY_USUARIO_EVENTO) {
			return ORM_evento;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == clases.ORMConstants.KEY_USUARIO_LOGINUSUARIO) {
			this.loginusuario = (clases.Login) owner;
		}
		
		else if (key == clases.ORMConstants.KEY_USUARIO_CARRERAIDCARRERA) {
			this.carreraidCarrera = (clases.Carrera) owner;
		}
		
		else if (key == clases.ORMConstants.KEY_USUARIO_DIRECCION) {
			this.direccion = (clases.Direccion) owner;
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
	
	private clases.Login loginusuario;
	
	private clases.Carrera carreraidCarrera;
	
	private java.util.Set ORM_semestre = new java.util.HashSet();
	
	private clases.Direccion direccion;
	
	private java.util.Set ORM_evento = new java.util.HashSet();
	
	private void setIdUsuario(int value) {
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
	
	public void setLoginusuario(clases.Login value) {
		if (this.loginusuario != value) {
			clases.Login lloginusuario = this.loginusuario;
			this.loginusuario = value;
			if (value != null) {
				loginusuario.setUsuario(this);
			}
			if (lloginusuario != null && lloginusuario.getUsuario() == this) {
				lloginusuario.setUsuario(null);
			}
		}
	}
	
	public clases.Login getLoginusuario() {
		return loginusuario;
	}
	
	public void setCarreraidCarrera(clases.Carrera value) {
		if (carreraidCarrera != null) {
			carreraidCarrera.usuario.remove(this);
		}
		if (value != null) {
			value.usuario.add(this);
		}
	}
	
	public clases.Carrera getCarreraidCarrera() {
		return carreraidCarrera;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_CarreraidCarrera(clases.Carrera value) {
		this.carreraidCarrera = value;
	}
	
	private clases.Carrera getORM_CarreraidCarrera() {
		return carreraidCarrera;
	}
	
	private void setORM_Semestre(java.util.Set value) {
		this.ORM_semestre = value;
	}
	
	private java.util.Set getORM_Semestre() {
		return ORM_semestre;
	}
	
	public final clases.SemestreSetCollection semestre = new clases.SemestreSetCollection(this, _ormAdapter, clases.ORMConstants.KEY_USUARIO_SEMESTRE, clases.ORMConstants.KEY_SEMESTRE_USUARIOIDUSUARIO, clases.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
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
	
	private void setORM_Evento(java.util.Set value) {
		this.ORM_evento = value;
	}
	
	private java.util.Set getORM_Evento() {
		return ORM_evento;
	}
	
	public final clases.EventoSetCollection evento = new clases.EventoSetCollection(this, _ormAdapter, clases.ORMConstants.KEY_USUARIO_EVENTO, clases.ORMConstants.KEY_EVENTO_USUARIOIDUSUARIO, clases.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdUsuario());
	}
	
}
