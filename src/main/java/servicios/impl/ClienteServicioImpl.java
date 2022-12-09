package servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import modelo.repositorio.IClienteRepositorio;
import repositorio.entidades.Cliente;
import servicios.IClienteServicio;

@Service
@Component
public class ClienteServicioImpl implements IClienteServicio{

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
		return null;
	}

}
