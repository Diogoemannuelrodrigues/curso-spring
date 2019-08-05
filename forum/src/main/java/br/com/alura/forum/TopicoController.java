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
		
		List<TopicoDTO> toc = new ArrayList<>();
		
	

		return toc;
	}
}
