package br.com.alura.forum;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.DTO.TopicoDTO;
import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;

@RestController
public class TopicoController {
	
	@RequestMapping("/topicos")
	public List<TopicoDTO> listao() {
		
		List<Topico> toc = new ArrayList<>();
		
		Topico topico = new Topico("Teste 1", "Adicionando 1º. topico", new Curso("Java Spring", "Programação"));
		Topico topico2 = new Topico("Teste 1", "Adicionando 1º topico", new Curso("Java Spring", "Programação"));
		toc.add(topico);
		toc.add(topico2);

		return toc;
	}
}
