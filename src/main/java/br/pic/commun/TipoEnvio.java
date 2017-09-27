package br.pic.commun;

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
	
	public static TipoEnvio getPorCodigo(Integer codigo) {
		for (TipoEnvio tipoEnvio : values()) {
			if(tipoEnvio.getCodigo().equals(codigo)) {
				return tipoEnvio;
			}
		}
		return null;
	}

	
}
