package br.com.estacionamentofinal.util;

import java.time.Duration;
import java.time.LocalTime;

public class CalcularTempo {
	
	public static void calcularHora() {
	
	LocalTime inicio = LocalTime.now();
	LocalTime fim = LocalTime.now().plusHours(2);
	
	System.out.println(inicio + " - " + fim);
	
	Duration tempo = Duration.between(inicio, fim);
	System.out.println(tempo.toHours());
	
	}
}
