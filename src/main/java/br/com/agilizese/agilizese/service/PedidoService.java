package br.com.agilizese.agilizese.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.agilizese.agilizese.domain.ProdutoPedido;
import br.com.agilizese.agilizese.repository.PedidoRepository;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PedidoService {

	@Autowired
	private PedidoRepository pedidoRepository;

	public List<ProdutoPedido> findAll() {
		return pedidoRepository.findAll();
	}
}
