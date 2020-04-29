package com.servicos.eventos.controllers.repository;

import org.springframework.data.jpa.repository.JpaRepository;



import com.servicos.eventos.models.Evento;

// Extends - esta é a INTERFACE e não classe java normal - do EventoRepository (DAO)
//definite qual a classe(model) JPa que vai pertencer e o tipo por padrão é String 
public interface EventoRepository extends JpaRepository<Evento, String> {
	Evento findByCodigo(long codigo);

}
