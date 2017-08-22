package pic.model;

public class Ativo {
	
	private Integer id;
	private String descricao;
	private  TipoAtivo tipoAtivo;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
