package com.qualitas.demointerfaces.entities;

public class Cliente extends Persona {
	private Poliza poliza;

	public Cliente(String nombre, String direccion, Poliza poliza) {
		super(nombre, direccion);
		this.poliza = poliza;
	}

	public Poliza getPoliza() {
		return poliza;
	}

	public String toString() {
		return "{Nombre: " + getNombre() + ", Dirección: " + getDireccion() + ", Póliza: " + poliza.getNumero() + "}";
	}
}
