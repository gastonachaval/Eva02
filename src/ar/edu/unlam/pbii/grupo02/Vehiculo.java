package ar.edu.unlam.pbii.grupo02;

public class Vehiculo {
	private Double latitud;
	private Double longitud;
	
	
	public Vehiculo(Double latitud, Double longitud) {
		super();
		this.latitud = latitud;
		this.longitud = longitud;
	}


	public Double getLatitud() {
		return latitud;
	}


	public Double getLongitud() {
		return longitud;
	}


	public void actualizarCoordenadas(Double latitud, Double longitud) {
		this.latitud=latitud;
		this.longitud=longitud;
		
	}
	
	
	
	
}
