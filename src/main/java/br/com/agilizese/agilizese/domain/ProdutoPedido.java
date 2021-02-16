package br.com.agilizese.agilizese.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity(name = "tb_produto_pedido")
public class ProdutoPedido {

	@Id
	@Column(name = "id_produto_pedido")
	private Long id;

	@Column(name = "descricao")
	private String descricao;

	@Column(name = "quantidade")
	private BigDecimal quantidade;

	@Column(name = "preco_unitario")
	private BigDecimal precoUnitario;

	@Column(name = "dt_inclusao")
	private LocalDateTime dtInclusao;

	@OneToOne
	@JoinColumn(name = "id_produto")
	private Produto produto;
	
	@OneToOne
	@JoinColumn(name = "id_tipo_pedido")
	private TipoPedido tipoPedido;

}
