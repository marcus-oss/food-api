package com.food;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import Modelo.Cliente;

@Profile("dev")
@TipodoNotificador(NivelUrgencia.SEM_URGENCIA)
@Component
public class NotificadorEmailMock implements Notificador {

	public NotificadorEmailMock() {
		System.out.println("NotificadorEmailMock:");
	}

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("MOCK: Notificacao será enviada para %s através do e-mail %s: %s\n", cliente.getNome(),
				cliente.getEmail(), mensagem);
	}

}
