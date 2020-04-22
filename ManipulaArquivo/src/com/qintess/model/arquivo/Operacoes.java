package com.qintess.model.arquivo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Time; //para horas
import java.text.DateFormat;
import java.text.SimpleDateFormat;

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
		//super();
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
		this.dadosMercado.getNuPrazoDiasCorridos();
		//= ((dt_fim.getTime() - dt_inicio.getTime()) / (24 * 60 * 60 * 1000)));
		//this.getDadosMercado().getNuPrazoDiasCorridos( ((dt_fim.getTime() - dt_inicio.getTime()) / (24 * 60 * 60 * 1000)));
		//Long.parseLong(dadosMercado.getNuPrazoDiasCorridos, (("hhmm", linha2.UPDTIME), "mm") <= "60" && Long.parseLong (TalendDate.diffDate (TalendDate.parseDate 
				//("hhmm", TalendDate.getDate ("hhmm")), TalendDate.parseDate ("hhmm", linha2.UPDTIME), "mm"))> = "1"
			
	
	}


	public Operacoes(int cd, int prazo, double qtd, int id_preco2, String subprod) {
		// TODO Auto-generated constructor stub
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
	
	public static List<Operacoes> getOperacoes(String path) throws IOException{
		BufferedReader bf = new BufferedReader(new FileReader(path));
		List<Operacoes> lista = new ArrayList<Operacoes>();
		String linha;
		bf.readLine();
		while ((linha = bf.readLine()) != null) {
			String[] colunas = linha.split(";");
			int cd = Integer.parseInt(colunas[0]);
			int prazo = Operacoes.calcularDias(colunas[1], colunas[2]);
			double qtd = Double.parseDouble(colunas[12].replace(',', '.'));
			int id_preco = Integer.parseInt(colunas[13]);
			String subprod = colunas[9];
			Operacoes operacao = new Operacoes(cd, prazo, qtd, id_preco, subprod);
			lista.add(operacao);
		}
		bf.close();
		return lista;
		
	}

	public static int calcularDias(String dataInicio, String dataFinal) {
		 DateFormat df = new SimpleDateFormat ("dd/MM/yyyy");
	        df.setLenient(false);
	        Date d1 = null;
	        Date d2 = null;
	        try {
	        	d1 = df.parse (dataInicio);
	        	d2 = df.parse (dataFinal);
	        }catch(Exception e) {
	        	
	        }
	        long dt = (d2.getTime() - d1.getTime()) + 3600000; // 1 hora para compensar horário de verão
	        int dias =  (int) (dt / 86400000L);
			return dias; 
	}
	
	

}
