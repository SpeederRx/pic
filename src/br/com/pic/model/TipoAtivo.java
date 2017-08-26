package br.com.pic.model;

public enum TipoAtivo {
	
	MOEDA(1, "Moeda"),
	TITULO(2, "Titulo"),
	ACAO(3, "Acao"),
	;
	
	private Integer codigo;
	private String descricao;
	
	private TipoAtivo(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
}
