package br.com.agilizese.agilizese.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name = "tb_unidade_medida")
public class UnidadeMedida {

	@Id
	@Column(name = "id_unidade_medida")
	private Long id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "sigla")
	private String sigla;

	@Column(name = "dt_inclusao")
	private LocalDateTime dtInclusao;

}
