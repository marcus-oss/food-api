package com.food;

import org.springframework.stereotype.Component;

import Modelo.Cliente;

@TipodoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorSms implements Notificador {

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s por SMS através do telefone  %s: %s\n", cliente.getNome(),
				cliente.getTelefone(), mensagem);
	}

}
