package com.qualitas.demointerfaces.dao.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.qualitas.demointerfaces.dao.PolizaDAO;
import com.qualitas.demointerfaces.entities.Poliza;

public class PolizaDAOImpl implements PolizaDAO {

	public List<Poliza> damePolizas() {
		List<Poliza> lista = new ArrayList<Poliza>();
		
		for (int i = 0; i < 10; i++) {
			int valor = (int) (Math.random() * 1000000);
			Poliza instancia = new Poliza(valor, LocalDate.now(), LocalDate.now());
			lista.add(instancia);// Agrego la instancia a la lista
			// System.out.println(valor);
		}
		return lista;// regresa la lista llena

	}

}
