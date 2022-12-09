package modelo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import repositorio.entidades.Cliente;

public interface IClienteRepositorio extends JpaRepository<Cliente, Integer> {

	
}
