package br.com.pic.model;

public enum TipoEnvio {

	EMAIL(1, "E-mail"),
	SMS(2, "SMS"),
	;
	
	private Integer codigo;
	private String descricao;
	
	private TipoEnvio(Integer codigo, String descricao) {
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
