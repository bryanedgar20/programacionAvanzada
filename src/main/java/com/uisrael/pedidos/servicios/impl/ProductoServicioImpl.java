package com.uisrael.pedidos.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.uisrael.pedidos.modelo.entidades.Producto;
import com.uisrael.pedidos.modelo.repositorio.IProductoRepositorio;
import com.uisrael.pedidos.servicios.IProductoServicio;

public class ProductoServicioImpl implements IProductoServicio{

	@Autowired
	private IProductoRepositorio productoRepositorio;
	
	@Override
	public void guardarProducto(Producto producto) {
		// TODO Auto-generated method stub
		this.productoRepositorio.save(producto);
	}

}
