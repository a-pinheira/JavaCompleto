package com.qintess.model.arquivo;

public class DadosMercado {
	private Long id_preco;
	private Long nuPrazoDiasCorridos;
	private Double vl_preco;
	
	//Contrutor Simples
	public DadosMercado() {
		super();
		}
	
	//Contrutor com Parametros
	
	public DadosMercado(Long id_preco, Long nuPrazoDiasCorridos, Double vl_preco) {
		this.id_preco = id_preco;
		this.nuPrazoDiasCorridos = nuPrazoDiasCorridos;
		this.vl_preco = vl_preco;
	}

	//Geters e Seters
	public Long getId_preco() {
		return id_preco;
	}

	public void setId_preco(Long id_preco) {
		this.id_preco = id_preco;
	}

	public Long getNuPrazoDiasCorridos() {
		return nuPrazoDiasCorridos;
	}

	public void setNuPrazoDiasCorridos(Long nuPrazoDiasCorridos) {
		this.nuPrazoDiasCorridos = nuPrazoDiasCorridos;
	}

	public Double getVl_preco() {
		return vl_preco;
	}

	public void setVl_preco(Double vl_preco) {
		this.vl_preco = vl_preco;
	}
	
	
	
	
	

}
