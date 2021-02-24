package br.com.agilizese.agilizese.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

	public List<ProdutoPedido> findById(Long i) {
		// TODO Auto-generated method stub
		List<ProdutoPedido> listaRetorno = new ArrayList<>();
		Optional<ProdutoPedido> optionalResult = pedidoRepository.findById(i);
		if (optionalResult.isPresent()) {
			listaRetorno.add(optionalResult.get());
		}
		return listaRetorno;
	}
}
