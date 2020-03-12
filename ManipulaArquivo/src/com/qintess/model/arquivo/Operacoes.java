package com.qintess.model.arquivo;

import java.util.Date;

//import java.sql.Time; para horas

public class Operacoes {
	private Long cv_operacao;
	private Date dt_inicio;
	private Date dt_fim;
	private String nm_Empresa;
	private String nm_Mesa;
	private String nm_Estrategia;
	private String nm_Centralizador;
	private String nm_Gestor;
	private String nm_SubGestor;
	private String nm_SubProduto;
	private String nm_Caracteristica;
	private String cd_AtivoObjeto;
	private double quantidade;
	private long id_Preco;
	private DadosMercado dadosMercado;

	
	public void operacoes() {
		//super();
		
	}


	public Operacoes(Long cv_operacao, Date dt_inicio, Date dt_fim, String nm_Empresa, String nm_Mesa,
			String nm_Estrategia, String nm_Centralizador, String nm_Gestor, String nm_SubGestor, String nm_SubProduto,
			String nm_Caracteristica, String cd_AtivoObjeto, double quantidade, long id_Preco,
			DadosMercado dadosMercado) {
		super();
		this.cv_operacao = cv_operacao;
		this.dt_inicio = dt_inicio;
		this.dt_fim = dt_fim;
		this.nm_Empresa = nm_Empresa;
		this.nm_Mesa = nm_Mesa;
		this.nm_Estrategia = nm_Estrategia;
		this.nm_Centralizador = nm_Centralizador;
		this.nm_Gestor = nm_Gestor;
		this.nm_SubGestor = nm_SubGestor;
		this.nm_SubProduto = nm_SubProduto;
		this.nm_Caracteristica = nm_Caracteristica;
		this.cd_AtivoObjeto = cd_AtivoObjeto;
		this.quantidade = quantidade;
		this.id_Preco = id_Preco;
		this.dadosMercado = dadosMercado;
	}


	public Long getCv_operacao() {
		return cv_operacao;
	}


	public void setCv_operacao(Long cv_operacao) {
		this.cv_operacao = cv_operacao;
	}


	public Date getDt_inicio() {
		return dt_inicio;
	}


	public void setDt_inicio(Date dt_inicio) {
		this.dt_inicio = dt_inicio;
	}


	public Date getDt_fim() {
		return dt_fim;
	}


	public void setDt_fim(Date dt_fim) {
		this.dt_fim = dt_fim;
	}


	public String getNm_Empresa() {
		return nm_Empresa;
	}


	public void setNm_Empresa(String nm_Empresa) {
		this.nm_Empresa = nm_Empresa;
	}


	public String getNm_Mesa() {
		return nm_Mesa;
	}


	public void setNm_Mesa(String nm_Mesa) {
		this.nm_Mesa = nm_Mesa;
	}


	public String getNm_Estrategia() {
		return nm_Estrategia;
	}


	public void setNm_Estrategia(String nm_Estrategia) {
		this.nm_Estrategia = nm_Estrategia;
	}


	public String getNm_Centralizador() {
		return nm_Centralizador;
	}


	public void setNm_Centralizador(String nm_Centralizador) {
		this.nm_Centralizador = nm_Centralizador;
	}


	public String getNm_Gestor() {
		return nm_Gestor;
	}


	public void setNm_Gestor(String nm_Gestor) {
		this.nm_Gestor = nm_Gestor;
	}


	public String getNm_SubGestor() {
		return nm_SubGestor;
	}


	public void setNm_SubGestor(String nm_SubGestor) {
		this.nm_SubGestor = nm_SubGestor;
	}


	public String getNm_SubProduto() {
		return nm_SubProduto;
	}


	public void setNm_SubProduto(String nm_SubProduto) {
		this.nm_SubProduto = nm_SubProduto;
	}


	public String getNm_Caracteristica() {
		return nm_Caracteristica;
	}


	public void setNm_Caracteristica(String nm_Caracteristica) {
		this.nm_Caracteristica = nm_Caracteristica;
	}


	public String getCd_AtivoObjeto() {
		return cd_AtivoObjeto;
	}


	public void setCd_AtivoObjeto(String cd_AtivoObjeto) {
		this.cd_AtivoObjeto = cd_AtivoObjeto;
	}


	public double getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}


	public long getId_Preco() {
		return id_Preco;
	}


	public void setId_Preco(long id_Preco) {
		this.id_Preco = id_Preco;
	}


	public DadosMercado getDadosMercado() {
		return dadosMercado;
	}


	public void setDadosMercado(DadosMercado dadosMercado) {
		this.dadosMercado = dadosMercado;
	}
	
	
	

}
