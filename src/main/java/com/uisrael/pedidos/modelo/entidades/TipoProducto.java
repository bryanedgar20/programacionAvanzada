package com.uisrael.pedidos.modelo.entidades;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class TipoProducto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTipoProducto;
	
	@Column(name = "descripcionProducto")
	private String descripcionProducto;
	
	@Column(name = "estado")
	private boolean estado;
	
	@Column(name = "usuarioCrea")
	private String usuarioCrea;
	
	@Column(name = "usuarioModifica")
	private String usuarioModifica;
	
	@Column(name = "fechaCreacion")
	private Date fechaCreacion;
	
	@Column(name = "fechaModificacion")
	private Date fechaModificacion;
}
