package br.com.estacionamentofinal.util;

import java.util.UUID;

public class UtilEstacionamento {

	public static String gerarCodigo() {
		
		return UUID.randomUUID().toString().substring(0, 8).toUpperCase();
	
	}
	
}
