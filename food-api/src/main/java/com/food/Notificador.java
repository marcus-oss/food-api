package com.food;

import Modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}