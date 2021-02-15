package br.com.agilizese.agilizese.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name = "tb_produto")
public class Produto {
	
	@Id
	@Column(name="id_produto")
	private Long id;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="dt_inclusao")	
	private LocalDateTime dtInclusao;
	

}
