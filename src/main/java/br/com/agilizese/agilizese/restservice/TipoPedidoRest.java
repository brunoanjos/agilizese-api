package br.com.agilizese.agilizese.restservice;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.agilizese.agilizese.domain.TipoPedido;
import br.com.agilizese.agilizese.service.TipoPedidoService;

@RestController
@Configuration
@RequestMapping(value = "/tipos-pedidos")
public class TipoPedidoRest {

	private static final Logger log = LoggerFactory.getLogger(TipoPedidoRest.class);

	@Autowired
	private TipoPedidoService tipoPedidoServive;

	@GetMapping(value = "/{nome}")
	public List<TipoPedido> getTipoPedido(@PathVariable("nome") String nome) {
		return tipoPedidoServive.findAll();
	}

}
