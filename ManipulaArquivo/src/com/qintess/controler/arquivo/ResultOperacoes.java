package com.qintess.controler.arquivo;

import com.qintess.model.arquivo.DadosMercado;
import com.qintess.model.arquivo.Operacoes;

import java.util.ArrayList;
import java.util.List;



/*
 * 1.	Calcular o Resultado de cada operação utilizando a fórmula abaixo:
		Resultado = VL_PRECO * QUANTIDADE
	Tal que:
			QUANTIDADE: oriunda do arquivo de operações;
			PRECO: oriundo do arquivo de dados de mercado;
Relação entre os arquivos para utilizar quantidade e o preço é feita através do 
	ID do preço (coluna “ID_PRECO”)
	Prazo em dias corridos, (informado no arquivo de dados mercado como “NU_PRAZO_DIAS_CORRIDOS” e 
	a ser calculado no arquivo de operações (diferença entre a DT_FIM e a DT_INICIO).
2.	Caso não haja preço para um determinado ID e prazo estipulados, assumir o valor 0.
3.	O sistema deve informar o tempo total do processamento (deverá ser informado ao 
	instrutor ao término desta prova).
 * 
 * */

public class ResultOperacoes {	
	private static List<Operacoes> ListaOperacoes = new ArrayList<Operacoes>();
	private	static List<DadosMercado> ListaDadosMercado = new ArrayList<DadosMercado>();
	private static List<ResultOperacoes> ListaResultOperacoes = new ArrayList<ResultOperacoes>();
	private  String nm_subProduto;
	private Double resultado;
	
	public ResultOperacoes() {
		//super();
	}
	//Construtor com método
	public ResultOperacoes(String nm_subProduto, Double resultado) {
		//super();
		this.nm_subProduto = nm_subProduto;
		this.resultado = resultado;
		
	}
	public static List<Operacoes> getListaOperacoes() {
		return ListaOperacoes;
	}
	public static void setListaOperacoes(List<Operacoes> listaOperacoes) {
		ListaOperacoes = listaOperacoes;
	}
	public static List<DadosMercado> getListaDadosMercado() {
		return ListaDadosMercado;
	}
	public static void setListaDadosMercado(List<DadosMercado> listaDadosMercado) {
		ListaDadosMercado = listaDadosMercado;
	}
	public String getNm_subProduto() {
		return nm_subProduto;
	}
	public void setNm_subProduto(String nm_subProduto) {
		this.nm_subProduto = nm_subProduto;
	}
	public Double getResultado() {
		return resultado;
	}
	public void setResultado(Double quantidade, Double id_preco) {
		 this.resultado += (id_preco * quantidade);
		}


	public static ArrayList<ResultOperacoes> agruparSubProdutos(ArrayList<ResultOperacoes> ListaOperacoes) {
		ArrayList<ResultOperacoes> resultAgrupados = new ArrayList<ResultOperacoes>();
		//resulAgrupados.add(new Resultado(listR.get(0).getSubproduto(), 0))
		resultAgrupados.add(new ResultOperacoes(ListaResultOperacoes.get(0).getNm_subProduto() , null));
				//getSubproduto(), 0));
		boolean igual;
		for (ResultOperacoes resultado : ListaResultOperacoes) {
			igual = false;
			for (ResultOperacoes resulAgdos : resultAgrupados) {
				if (resultado.getNm_subProduto().equals(resulAgdos.getNm_subProduto())) {
					resulAgdos.setResultado(resulAgdos.getResultado() + resultado.getResultado(), null);
					igual = true;
				}
			}
			if (!igual) {
				resultAgrupados.add(resultado);
			}
		}
		return resultAgrupados;

	}
	/*
	 * private static List<Operacoes> ListaOperacoes = new ArrayList<Operacoes>();
	private	static List<DadosMercado> ListaDadosMercado = new ArrayList<DadosMercado>();
	private static List<ResultOperacoes> ListaResultOperacoes = new ArrayList<ResultOperacoes>();
		ArrayList<ResultOperacoes> resultAgrupados = new ArrayList<ResultOperacoes>();
	*/
	public static ArrayList<ResultOperacoes> buscaResultados(List<DadosMercado> listaDadosMercado, List<Operacoes> listaOperacoes) {
		boolean achou;
		ArrayList<ResultOperacoes> listaResultOperacores = new ArrayList<ResultOperacoes>();
		for (Operacoes op : listaOperacoes) {
			achou = true;
			for (DadosMercado dm : listaDadosMercado) {
//		if( List<ResultOperacoes> listaResultOperacoes = list.stream().filter(calculo lambda).collect(Collectors.toList());
				if (op.getNm_SubProduto().equals(dm.getNuPrazoDiasCorridos())) {
				//if (dm.getNuPrazoDiasCorridos() == op.getDt_inicio() && dm.getId_preco() == op.getId_Preco()) {
					ListaResultOperacoes.add(new ResultOperacoes(op.getNm_SubProduto(), (op.getQuantidade() * dm.getVl_preco())));
					break;
				}
			}
			if (!achou)
				listaResultOperacores.add(new ResultOperacoes(op.getNm_SubProduto(), null));
		}
		return listaResultOperacores;
	}
	
	
}
