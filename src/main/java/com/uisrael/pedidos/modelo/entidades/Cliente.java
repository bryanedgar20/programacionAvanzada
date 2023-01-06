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
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Cliente implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCliente;
	
	@Column(name = "nombreCliente",length = 100)
	private String nombreCliente;
	
	private String apellidoCliente;
	
	private String identificacionCliente;
	
	private String telefonoCliente;
	
	private boolean estado;
	
	private String usuarioCrea;
	
	private String usuarioModifica;
	
	private Date fechaCreacion;
	
	private Date fechaModificacion;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente")
	private List<CabPedido> listaPedido;
}
