package com.uisrael.pedidos.modelo.entidades;

import java.io.Serializable;
import java.util.Date;
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

@Entity
@Data
public class CabPedido implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCabPedido;
	
	@Column(name = "fechaRegistro")
	private Date fechaRegistro;
	
	@Column(name = "observacion")
	private String observacion;
	
	@Column(name = "valorTotal")
	private Double valorTotal;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idCliente")
	private Cliente cliente;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pedido")
	List<DetPedido> listaDetallePedido;
	
}
