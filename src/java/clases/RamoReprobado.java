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

public class RamoReprobado {
	public RamoReprobado() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == clases.ORMConstants.KEY_RAMOREPROBADO_HISTORIALIDHISTORIAL) {
			this.historialidHistorial = (clases.Historial) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int idRamoReprobacion;
	
	private String nombreRamo;
	
	private Double notaReprobacion;
	
	private clases.Historial historialidHistorial;
	
	private void setIdRamoReprobacion(int value) {
		this.idRamoReprobacion = value;
	}
	
	public int getIdRamoReprobacion() {
		return idRamoReprobacion;
	}
	
	public int getORMID() {
		return getIdRamoReprobacion();
	}
	
	public void setNombreRamo(String value) {
		this.nombreRamo = value;
	}
	
	public String getNombreRamo() {
		return nombreRamo;
	}
	
	public void setNotaReprobacion(double value) {
		setNotaReprobacion(new Double(value));
	}
	
	public void setNotaReprobacion(Double value) {
		this.notaReprobacion = value;
	}
	
	public Double getNotaReprobacion() {
		return notaReprobacion;
	}
	
	public void setHistorialidHistorial(clases.Historial value) {
		if (historialidHistorial != null) {
			historialidHistorial.ramoReprobado.remove(this);
		}
		if (value != null) {
			value.ramoReprobado.add(this);
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
		return String.valueOf(getIdRamoReprobacion());
	}
	
}
