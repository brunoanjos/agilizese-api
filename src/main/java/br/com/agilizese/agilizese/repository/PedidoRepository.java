package br.com.agilizese.agilizese.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.agilizese.agilizese.domain.ProdutoPedido;

@Repository
public interface PedidoRepository extends JpaRepository<ProdutoPedido, Long> {

}
