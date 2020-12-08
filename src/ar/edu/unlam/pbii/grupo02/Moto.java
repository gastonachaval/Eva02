package ar.edu.unlam.pbii.grupo02;

public class Moto extends Vehiculo {

	private final Integer CANTIDAD_MAXIMA_DE_PASAJEROS=2;
	private String patente;
	private Integer velocidadMaxima;

	public Moto(String patente, Integer velocidadMaxima, Double latitud, Double longitud) {
		super(latitud,longitud);
		this.patente=patente;
		this.velocidadMaxima=velocidadMaxima;
		
	}

	public Integer getCANTIDAD_MAXIMA_DE_PASAJEROS() {
		return CANTIDAD_MAXIMA_DE_PASAJEROS;
	}

	public String getPatente() {
		return patente;
	}

	public Integer getVelocidadMaxima() {
		return velocidadMaxima;
	}
	
	
	

}
