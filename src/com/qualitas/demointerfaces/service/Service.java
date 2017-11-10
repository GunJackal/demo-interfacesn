package com.qualitas.demointerfaces.service;

import java.util.ArrayList;
import java.util.List;

import com.qualitas.demointerfaces.dao.ClienteDAO;
import com.qualitas.demointerfaces.dao.PolizaDAO;
import com.qualitas.demointerfaces.dao.impl.ClienteDAOImpl;
import com.qualitas.demointerfaces.dao.impl.PolizaDAOImpl;
import com.qualitas.demointerfaces.entities.Cliente;

public class Service {
	private ClienteDAO clienteDAO;
	private PolizaDAO polizaDAO;

	public Service() {
		super();
		polizaDAO = new PolizaDAOImpl();
		this.clienteDAO = new ClienteDAOImpl(polizaDAO);
	}

	public List<Cliente> getClientes() {
		List<Cliente> lista = new ArrayList<Cliente>();
		lista = clienteDAO.consultar();
		return lista;
	}

}
