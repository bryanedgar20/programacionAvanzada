package com.uisrael.pedidos.modelo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.uisrael.pedidos.modelo.entidades.Cliente;

@Repository
@Component
public interface IClienteRepositorio extends JpaRepository<Cliente, Integer> {

	
}
