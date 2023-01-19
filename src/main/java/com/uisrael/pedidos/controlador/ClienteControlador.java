package com.uisrael.pedidos.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClienteControlador {

	@GetMapping("/listarCliente")
	public String getViewClient() {
		return "cliente/cliente";
	}
}
