package servicios;

import java.util.List;

import repositorio.entidades.Cliente;


public interface IClienteServicio {

	public void insertarCliente (Cliente nuevoCliente);
	
	public List<Cliente> listarCliente();
}
