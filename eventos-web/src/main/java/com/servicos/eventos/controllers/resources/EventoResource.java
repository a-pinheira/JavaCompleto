package com.servicos.eventos.controllers.resources;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.servicos.eventos.models.Evento;
import com.servicos.eventos.repository.EventoRepository;

//CONTROLLER (Resourcce)
//@Controller do Spring simples

//Anotação parecida com a @Controller
@RestController
//Vai mapear os recursos do objeto Evento.java
@RequestMapping("/evento")
public class EventoResource {

	@Autowired // Faz automaticamente uma injeção de dependecia do EventoRepository aqui dentro
				// do EventoController/Repository
	private EventoRepository er;

	// Método Get - HTTP Get, retorna a lista de eventos do BD
	@GetMapping(produces = "Application/json") // Tipo de método que vai retornar no padrão JSON

	// A anatoção ResponseBody, retorna a lista, impressa no corpo da resposta
	// Este Método retorna uma lista de Eventos
	// Função que retorna Iterable<evento> - lista de evento
	// Este método é um endpoint para listar/acessar os eventos
	public @ResponseBody Iterable<Evento> listaEventos() {
		// Testar Evento ev = new Evento(1, "Show Da(o)s Devs", "SP", "08/06/2020", "18H");

		// Iterable dentro do ResponseBody, faz a busca no banco de dados
		Iterable<Evento> listaEventos = er.findAll(); // findAll faz uma busca por tods os eventos
		return listaEventos;

	}

	// Método Post: Método que o usuário/cliente vai enviar um evento para o BD

	@PostMapping()

	// este metodo usa o RequestBody, pois vai recber um evento no corpo da
	// requisção
	// AValid valida o evento para salvar no banco de dados, caso esteja com algum
	// erro não será salvo
	public Evento cadastraEvento(@RequestBody @Valid Evento evento) {
		return er.save(evento);

	}

	// Metodo Delete: para deletear determinado evento
	@DeleteMapping()
	public Evento deletaEvento(@RequestBody Evento evento) {
		er.delete(evento);
		return evento;
	}

}
