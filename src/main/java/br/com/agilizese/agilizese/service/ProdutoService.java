package br.com.agilizese.agilizese.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.agilizese.agilizese.domain.Produto;
import br.com.agilizese.agilizese.repository.ProdutoRepository;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;

	public List<Produto> findAll() {
		return produtoRepository.findAll();
	}
}
