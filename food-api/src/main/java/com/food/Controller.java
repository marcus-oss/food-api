package com.food;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import Modelo.Cliente;

@org.springframework.stereotype.Controller
public class Controller {

	private AtivacaoClienteServices ativacaoClienteServices;

	public Controller(AtivacaoClienteServices ativacaoClienteServices) {
		this.ativacaoClienteServices = ativacaoClienteServices;

		System.out.println("MeuPrimeiroController: ");
	}

	@GetMapping("/food-api")
	@ResponseBody
	public String hello() {
		Cliente vinicius = new Cliente("Vinicius", "teste@asada.com", "333444888");
		ativacaoClienteServices.ativar(vinicius);

		return "Hello World pagina";

	}

}
