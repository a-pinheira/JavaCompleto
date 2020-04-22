package com.servicos.eventos.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

//Esta classe java normal, será uma entidade de relacioanamento, onde será feito as persistência do dados no JPA
@Entity
//Serializable, tranforma o objeto em uma cadeia de bytes, para que o objeto trafegue na rede e possa ser gravado em arquivos
public class Evento implements Serializable {
	private static final long serialVersionUID = 1L;

	// OBJETO Evento
	// Será o ID da entidade no BD ou PrimaryKey(chave primária)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Será gerado no BD automaticamente
	private long codEvento;

	// Anotação de validação dos Atributos, o spring não aceita que os atributos
	// estejam com campo em branco, pois n salvará os dados no BD
	@NotBlank
	private String nome;

	@NotBlank
	private String local;

	@NotBlank
	private String data;

	@NotBlank
	private String horario;

	public Evento() {
		// super();
		// TODO Auto-generated constructor stub
	}

	// Construtor com os atributos
	public Evento(long codEvento, @NotBlank String nome, @NotBlank String local, @NotBlank String data,
			@NotBlank String horario) {
		super();
		this.codEvento = codEvento;
		this.nome = nome;
		this.local = local;
		this.data = data;
		this.horario = horario;
	}

	// Gets e Stes
	public long getCodEvento() {
		return codEvento;
	}

	public void setCodEvento(long codEvento) {
		this.codEvento = codEvento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	// Hashcode e Equalss - para comparar os objetos
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (codEvento ^ (codEvento >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Evento other = (Evento) obj;
		if (codEvento != other.codEvento)
			return false;
		return true;
	}

}
