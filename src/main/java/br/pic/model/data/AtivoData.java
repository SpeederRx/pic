package br.pic.model.data;


public class AtivoData {
	
	private Long id;
	private String descricao;
	private Integer tipoAtivo;
	private String tipoAtivoString;

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

	public String getTipoAtivoString() {
		return tipoAtivoString;
	}

	public void setTipoAtivoString(String tipoAtivoString) {
		this.tipoAtivoString = tipoAtivoString;
	}
	
	
	
}
