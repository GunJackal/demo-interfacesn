package com.qualitas.demointerfaces.dao;

import java.util.List;

import com.qualitas.demointerfaces.entities.Cliente;
import com.qualitas.demointerfaces.entities.Poliza;

public interface ClienteDAO {
	public int insertar(Cliente cliente);

	public int borrar(Cliente cliente);

	public Cliente actualizar(Cliente cliente);

	public Cliente consultar(String nombre, String direccion, Poliza poliza);

	public List<Cliente> consultar();

	public List<Cliente> consultar(int inicio, int fin);
}
