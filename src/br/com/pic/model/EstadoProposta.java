package br.com.pic.model;

public enum EstadoProposta {
	
	AGUARDANDO_ATIVACAO(1, "Aguardando Ativacao"),
	ATIVA(2, "Ativa"),
	AGUARDANDO_EXECUCAO(3, "Aguardando Execucao"),
	CANCELADA(4, "Cancelada"),
	CONCLUIDA(5, "Concluida"),
	;
	
	private Integer codigo;
	private String descricao;
	
	private EstadoProposta(Integer codigo, String descricao) {
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
