package br.pic.model.data;

import java.util.Date;
import java.util.List;

public class PropostaData {
	
	private Long id;
	private String nome;
	private Integer tipoProposta;
	private String tipoPropostaString;
	private Date dataInicio;
	private Date dataFim;
	private Double minCotas;
	private Double maxCotas;
	private Integer estadoProposta;
	private String estadoPropostaString;
	private List<LancamentoData> lancamentosData;
	private List<ParticipanteData> participantesData;
	private String descricao;
	private Double percentLucro;
	private Double valorCorrenteAtivo;
	private AtivoData ativoData;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getTipoProposta() {
		return tipoProposta;
	}
	public void setTipoProposta(Integer tipoProposta) {
		this.tipoProposta = tipoProposta;
	}
	public String getTipoPropostaString() {
		return tipoPropostaString;
	}
	public void setTipoPropostaString(String tipoPropostaString) {
		this.tipoPropostaString = tipoPropostaString;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataFim() {
		return dataFim;
	}
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	public Double getMinCotas() {
		return minCotas;
	}
	public void setMinCotas(Double minCotas) {
		this.minCotas = minCotas;
	}
	public Double getMaxCotas() {
		return maxCotas;
	}
	public void setMaxCotas(Double maxCotas) {
		this.maxCotas = maxCotas;
	}
	public Integer getEstadoProposta() {
		return estadoProposta;
	}
	public void setEstadoProposta(Integer estadoProposta) {
		this.estadoProposta = estadoProposta;
	}
	public String getEstadoPropostaString() {
		return estadoPropostaString;
	}
	public void setEstadoPropostaString(String estadoPropostaString) {
		this.estadoPropostaString = estadoPropostaString;
	}
	public List<LancamentoData> getLancamentosData() {
		return lancamentosData;
	}
	public void setLancamentosData(List<LancamentoData> lancamentosData) {
		this.lancamentosData = lancamentosData;
	}
	public List<ParticipanteData> getParticipantesData() {
		return participantesData;
	}
	public void setParticipantesData(List<ParticipanteData> participantesData) {
		this.participantesData = participantesData;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getPercentLucro() {
		return percentLucro;
	}
	public void setPercentLucro(Double percentLucro) {
		this.percentLucro = percentLucro;
	}
	public Double getValorCorrenteAtivo() {
		return valorCorrenteAtivo;
	}
	public void setValorCorrenteAtivo(Double valorCorrenteAtivo) {
		this.valorCorrenteAtivo = valorCorrenteAtivo;
	}
	public AtivoData getAtivoData() {
		return ativoData;
	}
	public void setAtivoData(AtivoData ativoData) {
		this.ativoData = ativoData;
	}
	
	
}