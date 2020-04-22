package com.qintess.model.arquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DadosMercado {
	private Integer id_preco;
	private Integer nuPrazoDiasCorridos;
	private Double vl_preco;
	private Operacoes operacoes;
	public long getNuPrazoDiasCorridos;
	
	//Contrutor Simples
	public DadosMercado() {
		//super();
		}
	
	//Construtor com Parametros
	
	public DadosMercado(Integer id_preco, Integer nuPrazoDiasCorridos, Double vl_preco, Operacoes operacoes) {
		this.id_preco = id_preco;
		this.nuPrazoDiasCorridos = nuPrazoDiasCorridos;
		this.vl_preco = vl_preco;
		this.operacoes = operacoes;
	}

	//Geters e Seters
	public Integer getId_preco() {
		return id_preco;
	}

	public void setId_preco(Integer id_preco) {
		this.id_preco = id_preco;
	}

	public Integer getNuPrazoDiasCorridos() {
		return nuPrazoDiasCorridos;
	}

	public void setNuPrazoDiasCorridos(Integer nuPrazoDiasCorridos) {
		this.nuPrazoDiasCorridos = nuPrazoDiasCorridos;
	}

	public Double getVl_preco() {
		return vl_preco;
	}

	public void setVl_preco(Double vl_preco) {
		this.vl_preco = vl_preco;
	}

	public Operacoes getOperacoes() {
		return operacoes;
	}

	public void setOperacoes(Operacoes operacoes) {
		this.operacoes = operacoes;
	}
	
	public static List<DadosMercado> getDados(String path) throws IOException{
		BufferedReader bf = new BufferedReader(new FileReader(path));
		List<DadosMercado> lista = new ArrayList<DadosMercado>();
		String linha;
		bf.readLine();
		while ((linha = bf.readLine()) != null) {
			String[] colunas = linha.split(";");
/* private Long id_preco;
	private Long nuPrazoDiasCorridos;
	private Double vl_preco;
	private Operacoes operacoes;
	public long getNuPrazoDiasCorrido
 * */
			DadosMercado dados = new DadosMercado(Integer.parseInt(colunas[0]), Integer.parseInt(colunas[1]), Double.parseDouble(colunas[2].replace(',', '.')), null);					
			lista.add(dados);
		}
		bf.close();
		return lista;
		
	}
	
	

}
