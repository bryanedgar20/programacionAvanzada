package com.uisrael.pedidos.servicios;

import java.util.List;

import com.uisrael.pedidos.modelo.entidades.Cliente;

public interface IClienteService {

	public void insertarCliente (Cliente nuevoCliente);
	
	public List<Cliente> listarCliente();
}
