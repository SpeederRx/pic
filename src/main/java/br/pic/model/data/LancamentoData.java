package br.pic.model.data;

public class LancamentoData {
	
	private Long id;
	private ContaPrincipalData contaPrincipalData;
	private AtivoData ativoData;
	private PropostaData propostaData;
	private Double valorTotalLanc;
	private String descricao;
	private Integer qtdeLancada;
	private Integer tipoLancamento;
	private OperadorData operador;
	private Integer estadoLancamento;
	private String estadoLancamentoString;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public ContaPrincipalData getContaPrincipalData() {
		return contaPrincipalData;
	}
	public void setContaPrincipalData(ContaPrincipalData contaPrincipalData) {
		this.contaPrincipalData = contaPrincipalData;
	}
	public AtivoData getAtivoData() {
		return ativoData;
	}
	public void setAtivoData(AtivoData ativoData) {
		this.ativoData = ativoData;
	}
	public PropostaData getPropostaData() {
		return propostaData;
	}
	public void setPropostaData(PropostaData propostaData) {
		this.propostaData = propostaData;
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
	public String getEstadoLancamentoString() {
		return estadoLancamentoString;
	}
	public void setEstadoLancamentoString(String estadoLancamentoString) {
		this.estadoLancamentoString = estadoLancamentoString;
	}
	
	
}
