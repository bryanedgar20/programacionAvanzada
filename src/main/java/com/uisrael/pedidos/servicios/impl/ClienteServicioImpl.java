package com.uisrael.pedidos.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.uisrael.pedidos.modelo.entidades.Cliente;
import com.uisrael.pedidos.modelo.repositorio.IClienteRepositorio;
import com.uisrael.pedidos.servicios.IClienteService;

@Service
@Component
public class ClienteServicioImpl implements IClienteService{

	@Autowired
	@Lazy
	private IClienteRepositorio clienteRepositorio;
	
	@Override
	public void insertarCliente(Cliente nuevoCliente) {
		// TODO Auto-generated method stub
		this.clienteRepositorio.save(nuevoCliente);
	}

	@Override
	public List<Cliente> listarCliente() {
		// TODO Auto-generated method stub
		return this.clienteRepositorio.findAll();
	}

}
