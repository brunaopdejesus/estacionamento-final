package br.com.estacionamentofinal.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Movimento {

	private String codigo;
	private String placa;
	private String modelo;
	private String tempo;
	private double valor;
	

	private String dataEntrada = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	
	private String dataSaida = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	
	private String horaEntrada = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
	
	private String horaSaida = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));


	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTempo() {
		return tempo;
	}

	public void setTempo(String tempo) {
		this.tempo = tempo;
	}

	public double getValor() {
		return valor;
	}

	public String getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(String dataSaida) {
		this.dataSaida = dataSaida;
	}

	public String getHoraEntrada() {
		return horaEntrada;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void setHoraEntrada(String horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public String getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(String horaSaida) {
		this.horaSaida = horaSaida;
	}

	@Override
	public String toString() {
		return codigo + ";" + placa + ";" + modelo + ";" + dataEntrada + ";" + horaEntrada + ";" + dataSaida + ";"
				+ horaSaida + ";" + 0 + ";" + 0;
	}

}
