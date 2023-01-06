package com.uisrael.pedidos.modelo.entidades;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class DetPedido implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDetPedido;
	
	@Column(name = "cantidad")
	private Double cantidad;
	
	
	@Column(name = "observacion")
	private String observacion;
	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idPedido")
	private CabPedido pedido;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "detallePedido")
	private List<Producto> listaProducto;
}
