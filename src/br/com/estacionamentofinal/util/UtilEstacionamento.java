package br.com.estacionamentofinal.util;

import java.time.Duration;
import java.time.LocalTime;
import java.util.UUID;

public class UtilEstacionamento {

	public static String gerarCodigo() {
		
		return UUID.randomUUID().toString().substring(0, 8).toUpperCase();
	
	}
	
	public static void calcularTempo() {
		LocalTime inicio = LocalTime.now();
		LocalTime fim = LocalTime.now().plusHours(2);
		
		System.out.println(inicio + " - " + fim);
		
		Duration tempo = Duration.between(inicio, fim);
		System.out.println(tempo.toHours());
		
	}
}
