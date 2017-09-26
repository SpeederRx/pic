package br.pic.commun;

public enum TipoProposta {
	
	COMPRA(1, "Compra"),
	VENDA(2, "Venda"),
	APORTE(3, "Aporte"),
	RETIRADA(4, "Retirada"),
	;
	
	private Integer codigo;
	private String descricao;
	
	private TipoProposta(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public static TipoProposta getPorCodigo(Integer codigo) {
		for (TipoProposta tipoProposta : values()) {
			if(tipoProposta.getCodigo().equals(codigo)) {
				return tipoProposta;
			}
		}
		return null;
	}
	
	
}
