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

import br.com.agilizese.agilizese.domain.ProdutoPedido;
import br.com.agilizese.agilizese.service.PedidoService;

@RestController
@Configuration
@RequestMapping(value = "/pedidos")
public class PedidoRest {

	private static final Logger log = LoggerFactory.getLogger(PedidoRest.class);

	@Autowired
	private PedidoService pedidoServive;

	@GetMapping(value = "/{nome}")
	public List<ProdutoPedido> getPedido(@PathVariable("nome") String nome) {
		return pedidoServive.findAll();
	}

	@PostMapping(value = "/")
	public void savePedido(ProdutoPedido pedido) {
		log.info("200");

	}

	@PutMapping(value = "/")
	public void updatePedido(ProdutoPedido pedido) {
		log.info("200");

	}

	@DeleteMapping(value = "/{identificador}")
	public void deletePedido(Integer identificador) {
		log.info("200");

	}

}
