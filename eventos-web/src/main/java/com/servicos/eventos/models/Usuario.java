package com.servicos.eventos.models;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codUsuario;

	@NotBlank
	private String nomeUser;
	private String email;
	private String cpf;
	private String telefone;

	public Usuario() {
		// super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(long codUsuario, String nomeUser, String email, String cpf, String telefone) {
		super();
		this.codUsuario = codUsuario;
		this.nomeUser = nomeUser;
		this.email = email;
		this.cpf = cpf;
		this.telefone = telefone;
	}

	public long getCodUsuario() {
		return codUsuario;
	}

	public void setCodUsuario(long codUsuario) {
		this.codUsuario = codUsuario;
	}

	public String getNomeUser() {
		return nomeUser;
	}

	public void setNomeUser(String nomeUser) {
		this.nomeUser = nomeUser;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
