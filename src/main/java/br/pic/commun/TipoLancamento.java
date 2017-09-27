package br.pic.commun;

public enum TipoLancamento {
	
	DEBITO(1, "Debito"),
	CREDITO(2, "Credito"),
	PROVISIONAMENTO(3, "Provisionamento"),
	;
	
	private Integer codigo;
	private String descricao;
	
	private TipoLancamento(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static TipoLancamento getPorCodigo(Integer codigo) {
		for (TipoLancamento tipoLancamento : values()) {
			if(tipoLancamento.getCodigo().equals(codigo)) {
				return tipoLancamento;
			}
		}
		return null;
	}

}
