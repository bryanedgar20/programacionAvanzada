package modelo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import repositorio.entidades.Cliente;

@Repository
@Component
public interface IClienteRepositorio extends JpaRepository<Cliente, Integer> {

	
}
