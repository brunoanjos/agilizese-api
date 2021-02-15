package br.com.agilizese.agilizese.restservice;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.agilizese.agilizese.domain.Produto;
import br.com.agilizese.agilizese.service.ProdutoService;

@RestController
@Configuration
@RequestMapping(value = "/produtos")
public class ProdutoRest {

	private static final Logger log = LoggerFactory.getLogger(ProdutoRest.class);

	@Autowired
	private ProdutoService produtoServive;

	@GetMapping(value = "/{nome}")
	public List<Produto> getProduto(@PathVariable("nome") String nome) {
		return produtoServive.findAll();
	}

	@PostMapping(value = "")
	public void saveProduto(Produto produto) {
		log.info("200");

	}

	@PutMapping(value = "")
	public void updateProduto(Produto produto) {
		log.info("200");

	}

	@DeleteMapping(value = "/{identificador}")
	public void deleteProduto(Integer identificador) {
		log.info("200");

	}

}
