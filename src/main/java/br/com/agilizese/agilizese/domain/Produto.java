package br.com.agilizese.agilizese.domain;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Produto {
	private String nome;
	private BigDecimal precoUnitario;
	private String quantidade;

}
