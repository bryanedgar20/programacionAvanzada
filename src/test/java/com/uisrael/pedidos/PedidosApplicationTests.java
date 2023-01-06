package com.uisrael.pedidos;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.uisrael.pedidos.modelo.entidades.Cliente;
import com.uisrael.pedidos.modelo.entidades.Producto;
import com.uisrael.pedidos.modelo.entidades.TipoProducto;
import com.uisrael.pedidos.modelo.repositorio.ITipoProductoRepositorio;
import com.uisrael.pedidos.servicios.IClienteService;
import com.uisrael.pedidos.servicios.IProductoServicio;
import com.uisrael.pedidos.servicios.ITipoProductoServicio;

@SpringBootTest
class PedidosApplicationTests {

	@Autowired
	IClienteService clienteServicio;
	
	
	@Autowired
	ITipoProductoServicio tipoProductoServicio;
	
	@Autowired
	IProductoServicio productoServicio;
	
	@Test
	void contextLoads() {
		TipoProducto tipoProduto = new TipoProducto();
		
		tipoProduto.setDescripcionProducto("Gaseosa");
		tipoProduto.setFechaCreacion(new Date());
		
		tipoProductoServicio.guardarTipoProducto(tipoProduto);
		
		Producto producto = new Producto();
		
		producto.setDescripcionProducto("Coca cola");
		producto.setEstado(true);
		producto.setFechaCreacion(new Date());
		
		productoServicio.guardarProducto(producto);
		
		
	}

}
