package com.servicos.eventos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servicos.eventos.models.Evento;

// Extends - esta é a INTERFACE e não classe java normal - do EventoRepository
//definite qual a classe(model) JPa que vai pertencer e o tipo por padrão é String 
public interface EventoRepository extends JpaRepository<Evento, String> {

}
