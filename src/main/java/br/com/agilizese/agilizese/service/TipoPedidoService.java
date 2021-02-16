package br.com.agilizese.agilizese.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.agilizese.agilizese.domain.TipoPedido;
import br.com.agilizese.agilizese.repository.TipoPedidoRepository;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class TipoPedidoService {

	@Autowired
	private TipoPedidoRepository tipoPedidoRepository;

	public List<TipoPedido> findAll() {
		return tipoPedidoRepository.findAll();
	}
}

