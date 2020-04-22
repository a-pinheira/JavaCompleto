package com.qintess.controler.arquivo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.qintess.model.arquivo.DadosMercado;
import com.qintess.model.arquivo.Operacoes;

public class ManipulaArquivos {

	private static List<Operacoes> listaOperacoes = new ArrayList<Operacoes>();
	private static List<DadosMercado> listaDadosMercado = new ArrayList<DadosMercado>();
	private static List<ResultOperacoes> listaResultOperacoes = new ArrayList<ResultOperacoes>();

	public static void main(String[] args) throws FileNotFoundException, ParseException, IOException {
		
		ArrayList<ResultOperacoes> listResultado = ResultOperacoes.buscaResultados(listaDadosMercado, listaOperacoes);
		ArrayList<ResultOperacoes> agrupados = ResultOperacoes.agruparSubProdutos(listResultado);

		File caminhoDadosMercado = new File("DadosMercado.csv");
		File caminhoOperacoes = new File("Operacoes.csv");
		FileWriter escreveResult = new FileWriter("Resultados.csv");

	try {
		Scanner LeitorOp = new Scanner(caminhoOperacoes);
		LeitorOp.nextLine(); // ler os cabeçalhos.
		escreveResult.append("NM_SUBPRODUTO; RESULTADO\n\t");
		//
		while (LeitorOp.hasNext()) {
			//split vai transformar dividir a linha lida em um array 
			//de String passando como parametro o divisor ";".
		String[] colunasO = LeitorOp.nextLine().split(" ; ");
		/*	if (Nm_Subproduto sp: ListaSubproduto.) {
				for () {
					if () {
					} //fim do if dentro do FOR
				} //fim do for
			} // fim do IS principal*/
		}// fim do while	
		}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
	}// fim da main
}// Fim LeituraArq - Manipulação
