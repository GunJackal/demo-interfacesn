package com.qualitas.demointerfaces.entities;

import java.time.LocalDate;

public class Poliza {
	private Integer numero;
	private LocalDate inicioVigencia;
	private LocalDate finVigencia;

	public Poliza(int numero, LocalDate inicioVigencia, LocalDate finVigencia) {
		this.numero = numero;
		this.inicioVigencia = inicioVigencia;
		this.finVigencia = finVigencia;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getNumero() {
		return this.numero;
	}

	public void setInicioVigencia(LocalDate inicioVigencia) {
		this.inicioVigencia = inicioVigencia;
	}

	public LocalDate getInicioVigencia() {
		return this.inicioVigencia;
	}

	public void setFinVigencia(LocalDate finVigencia) {
		this.finVigencia = finVigencia;
	}

	public LocalDate getFinVigencia() {
		return this.finVigencia;
	}

	public String toString() {
		return "[Número: " + getNumero() + ", Inicio Vigencia: " + getInicioVigencia() + ", Final de Vigencia: "
				+ getFinVigencia() + "]";
	}
}
