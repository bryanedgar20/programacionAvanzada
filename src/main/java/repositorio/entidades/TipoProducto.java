package repositorio.entidades;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class TipoProducto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int idTipoProducto;
	
	private String descripcionProducto;
	
	private boolean estado;
	
	private String usuarioCrea;
	
	private String usuarioModifica;
	
	private Date fechaCreacion;
	
	private Date fechaModificacion;
}
