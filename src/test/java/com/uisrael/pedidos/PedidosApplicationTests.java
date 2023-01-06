package com.uisrael.pedidos;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.uisrael.pedidos.modelo.entidades.Cliente;
import com.uisrael.pedidos.servicios.IClienteService;

@SpringBootTest
class PedidosApplicationTests {

	@Autowired
	IClienteService clienteServicio;
	
	@Test
	void contextLoads() {
		/*
		 * Cliente cliente = new Cliente();
		 * 
		 * clienteServicio.insertarCliente(cliente);
		 */
	}

}
