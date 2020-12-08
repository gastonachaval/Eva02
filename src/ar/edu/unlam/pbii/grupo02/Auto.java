package ar.edu.unlam.pbii.grupo02;

public class Auto extends Vehiculo {

	private Integer cantidadMaximaDePasajeros;
	private Integer velocidadMaxima;
	private String patente;

	public Auto(String patente, Integer cantidadmaximaDePaSajeros, Integer velocidadMaxima, Double latitud,
			Double longitud) {
		super(latitud, longitud);
		this.patente=patente;
		this.cantidadMaximaDePasajeros = cantidadmaximaDePaSajeros;
		this.velocidadMaxima = velocidadMaxima;
	}

	public Integer getCantidadMaximaDePasajeros() {
		return cantidadMaximaDePasajeros;
	}

	public Integer getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public String getPatente() {
		return patente;
	}
	
	

}
