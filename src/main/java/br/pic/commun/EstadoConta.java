package br.pic.commun;

public enum EstadoConta {
	
	ATIVA(1, "Ativa"),
	INATIVA(2, "Inativa"),
	;
	
	private Integer codigo;
	private String descricao;
	
	private EstadoConta(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static EstadoConta getPorCodigo(Integer codigo) {
		for (EstadoConta estadoConta : values()) {
			if(estadoConta.getCodigo().equals(codigo)) {
				return estadoConta;
			}
		}
		return null;
	}

}
