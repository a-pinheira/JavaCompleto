package com.servicos.eventos.controllers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servicos.eventos.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {
	Usuario findByNome(String nome);

	// Users findByNome(String nome);
}
