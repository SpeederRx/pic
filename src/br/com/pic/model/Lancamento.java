package br.com.pic.model;

public class Lancamento {
	
	private Long id;
	private ContaPrincipal conta;
	private Ativo ativo;
	private Proposta proposta;
	private Double valorTotalLanc;
	private String descricao;
	private Integer qtdeLancada;
	private TipoLancamento tipoLancamento;
	private Operador operador;
	private EstadoLancamento estadoLancamento;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public ContaPrincipal getConta() {
		return conta;
	}
	public void setConta(ContaPrincipal conta) {
		this.conta = conta;
	}
	public Ativo getAtivo() {
		return ativo;
	}
	public void setAtivo(Ativo ativo) {
		this.ativo = ativo;
	}
	public Proposta getProposta() {
		return proposta;
	}
	public void setProposta(Proposta proposta) {
		this.proposta = proposta;
	}
	public Double getValorTotalLanc() {
		return valorTotalLanc;
	}
	public void setValorTotalLanc(Double valorTotalLanc) {
		this.valorTotalLanc = valorTotalLanc;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Integer getQtdeLancada() {
		return qtdeLancada;
	}
	public void setQtdeLancada(Integer qtdeLancada) {
		this.qtdeLancada = qtdeLancada;
	}
	public TipoLancamento getTipoLancamento() {
		return tipoLancamento;
	}
	public void setTipoLancamento(TipoLancamento tipoLancamento) {
		this.tipoLancamento = tipoLancamento;
	}
	public Operador getOperador() {
		return operador;
	}
	public void setOperador(Operador operador) {
		this.operador = operador;
	}
	public EstadoLancamento getEstadoLancamento() {
		return estadoLancamento;
	}
	public void setEstadoLancamento(EstadoLancamento estadoLancamento) {
		this.estadoLancamento = estadoLancamento;
	}
	
}
