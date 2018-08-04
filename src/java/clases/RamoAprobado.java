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

public class RamoAprobado {
	public RamoAprobado() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_RAMOAPROBADO_HISTORIALIDHISTORIAL) {
			this.historialidHistorial = (clases.Historial) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int idRamoAprobado;
	
	private String nombreRamo;
	
	private Double notaAprobacion;
	
	private clases.Historial historialidHistorial;
	
	private void setIdRamoAprobado(int value) {
		this.idRamoAprobado = value;
	}
	
	public int getIdRamoAprobado() {
		return idRamoAprobado;
	}
	
	public int getORMID() {
		return getIdRamoAprobado();
	}
	
	public void setNombreRamo(String value) {
		this.nombreRamo = value;
	}
	
	public String getNombreRamo() {
		return nombreRamo;
	}
	
	public void setNotaAprobacion(double value) {
		setNotaAprobacion(new Double(value));
	}
	
	public void setNotaAprobacion(Double value) {
		this.notaAprobacion = value;
	}
	
	public Double getNotaAprobacion() {
		return notaAprobacion;
	}
	
	public void setHistorialidHistorial(clases.Historial value) {
		if (historialidHistorial != null) {
			historialidHistorial.ramoAprobado.remove(this);
		}
		if (value != null) {
			value.ramoAprobado.add(this);
		}
	}
	
	public clases.Historial getHistorialidHistorial() {
		return historialidHistorial;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_HistorialidHistorial(clases.Historial value) {
		this.historialidHistorial = value;
	}
	
	private clases.Historial getORM_HistorialidHistorial() {
		return historialidHistorial;
	}
	
	public String toString() {
		return String.valueOf(getIdRamoAprobado());
	}
	
}
