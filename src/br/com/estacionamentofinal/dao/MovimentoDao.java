package br.com.estacionamentofinal.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

import br.com.estacionamentofinal.model.Movimento;

public class MovimentoDao {
	
	private Movimento movimento;
	
	private static final String LOCAL_ARQUIVO = "C:/Users/21192918/movimentacao.ds1";
	private static final String LOCAL_ARQUIVO_VALOR = "C:/Users/21192918/local_arquivo_valor.ds1";

	// Construtor que pede o cliente
	public MovimentoDao(Movimento movimento) {
		this.movimento = movimento;
	}	
	
	// Construtor vazio
	public MovimentoDao() {
			
	}
		
	public Movimento getCliente() {
		return movimento;
	}
	
	public void salvar() {

		Path path = Paths.get(LOCAL_ARQUIVO);

		try {

			BufferedWriter writer = Files.newBufferedWriter(path, Charset.forName("ISO-8859-1"),
					StandardOpenOption.WRITE, StandardOpenOption.APPEND);

			writer.write(movimento.toString());
			writer.newLine();
			writer.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public ArrayList<Movimento> listarVeiculos() {

		// Obter o caminho do arquivo
		Path path = Paths.get(LOCAL_ARQUIVO);

		// Criar o Buffer para o arquivo
		try {

			BufferedReader reader = Files.newBufferedReader(path, Charset.forName("ISO-8859-1"));

			String linha = reader.readLine();
			ArrayList<Movimento> veiculos = new ArrayList<>();
			
			while (linha != null) {
				String[] vetorVeiculo = linha.split(";");
				
				
				Movimento veiculo = new Movimento();
				veiculo.setCodigo(vetorVeiculo[0]);
				veiculo.setPlaca(vetorVeiculo[1]);
				veiculo.setModelo(vetorVeiculo[2]);
				veiculo.setDataEntrada(vetorVeiculo[3]);
				veiculo.setHoraEntrada(vetorVeiculo[4]);
				veiculo.setDataSaida(vetorVeiculo[5]);
				veiculo.setHoraSaida(vetorVeiculo[6]);
				veiculo.setTempo(vetorVeiculo[7]);
//				veiculo.set(Double.parseDouble(vetorVeiculo[8]));
				
				veiculos.add(veiculo);

				linha = reader.readLine();
			}
					
			reader.close();
			
			return veiculos;
			
			
		} catch (Exception e) {
			System.out.println("Ocorreu um erro na tentativa de ler o arquivo!");
			e.printStackTrace();
			return null;
			
			}
		}
		
	public Movimento buscarVeiculo(String placa) {

		// Obter o caminho do arquivo
		Path path = Paths.get(LOCAL_ARQUIVO);

		// Criar o Buffer para o arquivo
		try {

			BufferedReader reader = Files.newBufferedReader(path, Charset.forName("ISO-8859-1"));

			String linha = reader.readLine();
			Movimento veiculo = new Movimento();
			
			while (linha != null) {
				String[] vetorVeiculo = linha.split(";");
				
				if (vetorVeiculo[1].equals(placa)) {
					veiculo.setCodigo(vetorVeiculo[0]);
					veiculo.setPlaca(vetorVeiculo[1]);
					veiculo.setModelo(vetorVeiculo[2]);
					veiculo.setDataEntrada(vetorVeiculo[3]);
					veiculo.setHoraEntrada(vetorVeiculo[4]);
					veiculo.setDataSaida(vetorVeiculo[5]);
					veiculo.setHoraSaida(vetorVeiculo[6]);
					veiculo.setTempo(vetorVeiculo[7]);
//					veiculo.setValor(Double.parseDouble(vetorVeiculo[8]));

					break;
				}
				
				linha = reader.readLine();
			}
					
			reader.close();
			
			return veiculo;
			
			
		} catch (Exception e) {
			System.out.println("Ocorreu um erro na tentativa de ler o arquivo!");
			e.printStackTrace();
			return null;
			
		}
	}

	
}
