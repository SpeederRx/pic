package br.pic.commun;

public enum EstadoLancamento {
	
	EFETIVAD0(1, "Efetivado"),
	PENDENTE(2, "Pendente"),
	CANCELADO(3, "Cancelado"),
	;
	
	private Integer codigo;
	private String descricao;
	
	private EstadoLancamento(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static EstadoLancamento getPorCodigo(Integer codigo) {
		for (EstadoLancamento estadoLancamento : values()) {
			if(estadoLancamento.getCodigo().equals(codigo)) {
				return estadoLancamento;
			}
		}
		return null;
	}

}
