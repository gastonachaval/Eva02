package ar.edu.unlam.pbii.grupo02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Mapa {

	private String ciudad;
	private List<Vehiculo> vehiculosEnLaCiudad;

	public Mapa(String ciudad) {
		this.ciudad = ciudad;
		this.vehiculosEnLaCiudad = new ArrayList<Vehiculo>();
	}

	public Boolean agregarVehiculo(Vehiculo vehiculoAAgregar) {
		return vehiculosEnLaCiudad.add(vehiculoAAgregar);
	}

	public Integer getCantidadDeVehiculos() {
		return vehiculosEnLaCiudad.size();
	}

	public Boolean hayCoalicion() throws ColitionException {
		for (Vehiculo vehiculo1 : vehiculosEnLaCiudad) {
			for (Vehiculo vehiculo2 : vehiculosEnLaCiudad) {
				if (vehiculo1 != vehiculo2 && vehiculo1.getLatitud().equals(vehiculo2.getLatitud())
						&& vehiculo1.getLongitud().equals(vehiculo2.getLongitud())) {
					throw new ColitionException();
				}
			}
		}
		return false;
	}

}
