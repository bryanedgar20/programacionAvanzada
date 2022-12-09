package repositorio.entidades;

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
	
}
