package br.com.agilizese.agilizese.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.agilizese.agilizese.domain.TipoPedido;

@Repository
public interface TipoPedidoRepository extends JpaRepository<TipoPedido, Long> {

}
