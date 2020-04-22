package com.qintess.controler.arquivo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import com.qintess.model.arquivo.DadosMercado;
import com.qintess.model.arquivo.Operacoes;

interface LerArq {

	/*
	 * Autora: Simone Machado 
	 * Objetivo e Desafio: Manipulação entre dois arquivos
	 * Entrada / Leitura: 2 Arquivos
	 * Saída: Um arquivo com o resultado da operações entre os 2
	 **/
	// as classes Operações e Dados são os objetos a serem manipulados,
	// portando para isto viram uma lista de ArrayList
	public static final String OPCSV = "Operacoes.csv";
	public static final String DMCSV = "DadosMercado.csv";
	public void readCSV() throws IOException;
	public void altCSV() throws IOException;
	public static void main(String[] args) {
	}
}

class manipulaArq implements LerArq {
	private static List<Operacoes> listaOperacores = new ArrayList<Operacoes>();
	private static List<DadosMercado> listaDadosMercado = new ArrayList<DadosMercado>();
	private static List<ResultOperacoes> ListaResultOperacoes = new ArrayList<ResultOperacoes>();
	
	public static void main(String[] args) throws FileNotFoundException, ParseException, IOException {

		// Path caminho = Paths.get(System.getProperty("Operacoes.csv",
		// "DadosMercado.csv"));
		File caminhoDadosMercado = new File("DadosMercado.csv");
		File caminhoOperacoes = new File("Operacoes.csv");
		String formatoData = "dd/MM/yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(formatoData,
		Locale.getDefault());
		// FileWriter escritor = new
		// FileWriter("C:\\eclipse-workspace\\Java_Estagio\\src\\Resultados.csv");

		try {
			Scanner scnDM = new Scanner(caminhoDadosMercado);
			Scanner scnOp = new Scanner(caminhoOperacoes);
			
			long start = System.currentTimeMillis();
			List<Operacoes> listaOperacores = Operacoes.getOperacoes("Operacoes.csv");
			List<DadosMercado> listD = DadosMercado.getDados("DadosMercado.csv");
			long finish;
			
			//List<ResultOperacoes> ListaResultOperacoes = new ArrayList<ResultOperacoes>();
			ArrayList<ResultOperacoes> ListaResultOperacoes = ResultOperacoes.buscaResultados(listaDadosMercado, listaOperacores);
			ArrayList<ResultOperacoes> resultAgrupados = ResultOperacoes.agruparSubProdutos(ListaResultOperacoes);
			
			
			BufferedWriter bw = new BufferedWriter (new FileWriter("Resultados.csv"));
			for(ResultOperacoes resulAgdos : resultAgrupados) {
				bw.write(resulAgdos.getNm_subProduto()+";"+resulAgdos.getResultado());
				bw.newLine();
			}
			bw.close();
			
			finish = (System.currentTimeMillis() - start)/10;
			System.out.println(finish + " Segundos");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			

		} catch (Exception e) {
			// TODO: handle exception
		}

	}// fim da void

	//Leituras dos arquivos - calculos
	@Override
	public void readCSV() throws IOException {
		// TODO Auto-generated method stub
		try {
			Readable caminhoDadosMercado = null;
			Scanner scnDM = new Scanner(caminhoDadosMercado);
			
			Readable caminhoOperacoes = null;
			Scanner scnOp = new Scanner(caminhoOperacoes);

		
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	//Altera dados dos arquivos - calculos
	@Override
	public void altCSV() throws IOException {
		// TODO Auto-generated method stub

	}

} /// fim da classe LerArquivo//
