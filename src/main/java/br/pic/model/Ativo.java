package br.pic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ativo")
public class Ativo {
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
		
	@Column(name = "DESCRICAO")
	private String descricao;
		
	@Column(name = "TIPO_ATIVO")
	private Integer tipoAtivo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getTipoAtivo() {
		return tipoAtivo;
	}

	public void setTipoAtivo(Integer tipoAtivo) {
		this.tipoAtivo = tipoAtivo;
	}
	
	
	
}
