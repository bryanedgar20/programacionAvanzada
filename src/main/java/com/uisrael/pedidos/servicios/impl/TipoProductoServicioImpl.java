package com.uisrael.pedidos.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.uisrael.pedidos.modelo.entidades.TipoProducto;
import com.uisrael.pedidos.modelo.repositorio.ITipoProductoRepositorio;
import com.uisrael.pedidos.servicios.ITipoProductoServicio;

public class TipoProductoServicioImpl implements ITipoProductoServicio{

	@Autowired
	private ITipoProductoRepositorio tipoProductoRepositorio;
	
	@Override
	public void guardarTipoProducto(TipoProducto tipoProducto) {
		// TODO Auto-generated method stub
		this.tipoProductoRepositorio.save(tipoProducto);
	}

}
