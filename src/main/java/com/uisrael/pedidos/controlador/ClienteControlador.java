package com.uisrael.pedidos.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.uisrael.pedidos.modelo.entidades.Cliente;
import com.uisrael.pedidos.servicios.IClienteService;


@Controller
public class ClienteControlador {

	@Autowired
	private IClienteService clienteService;
	
	@GetMapping("/listarCliente")
	public String getViewClient(Model model) {
		//List<Cliente> listaCliente = 
		
		model.addAttribute("tituloPagina","Cliente");
		model.addAttribute("listaCliente",clienteService.listarCliente());
		
		return "cliente/cliente";
	}
	
	
	@GetMapping("/test")
	public String test() {
		
		
		return "cliente/plantilla";
	}
	
}
