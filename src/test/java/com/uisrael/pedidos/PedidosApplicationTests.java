package com.uisrael.pedidos;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import repositorio.entidades.Cliente;
import servicios.IClienteServicio;

@SpringBootTest
class PedidosApplicationTests {

	@Autowired
	IClienteServicio clienteServicio;
	
	@Test
	void contextLoads() {
		Cliente cliente = new Cliente();
		
		clienteServicio.insertarCliente(cliente);
	}

}
