package br.pic.model.data;

public class LancamentoData {
	
	private Long id;
	private ContaPrincipalData contaPrincipal;
	private AtivoData ativo;
	private PropostaData proposta;
	private Double valorTotalLanc;
	private String descricao;
	private Integer qtdeLancada;
	private Integer tipoLancamento;
	private OperadorData operador;
	private Integer estadoLancamento;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public ContaPrincipalData getContaPrincipal() {
		return contaPrincipal;
	}
	public void setContaPrincipal(ContaPrincipalData contaPrincipal) {
		this.contaPrincipal = contaPrincipal;
	}
	public AtivoData getAtivo() {
		return ativo;
	}
	public void setAtivo(AtivoData ativo) {
		this.ativo = ativo;
	}
	public PropostaData getProposta() {
		return proposta;
	}
	public void setProposta(PropostaData proposta) {
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
	public Integer getTipoLancamento() {
		return tipoLancamento;
	}
	public void setTipoLancamento(Integer tipoLancamento) {
		this.tipoLancamento = tipoLancamento;
	}
	public OperadorData getOperador() {
		return operador;
	}
	public void setOperador(OperadorData operador) {
		this.operador = operador;
	}
	public Integer getEstadoLancamento() {
		return estadoLancamento;
	}
	public void setEstadoLancamento(Integer estadoLancamento) {
		this.estadoLancamento = estadoLancamento;
	}
	
	


}
