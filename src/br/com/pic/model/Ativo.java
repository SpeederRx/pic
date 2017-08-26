package br.com.pic.model;

public class Ativo {
	
	private Long id;
	private String descricao;
	private  TipoAtivo tipoAtivo;
	
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
	public TipoAtivo getTipoAtivo() {
		return tipoAtivo;
	}
	public void setTipoAtivo(TipoAtivo tipoAtivo) {
		this.tipoAtivo = tipoAtivo;
	}
	
}
