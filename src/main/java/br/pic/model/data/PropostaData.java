package br.pic.model.data;

import java.util.Date;
import java.util.List;

public class PropostaData {
	
	private Long id;
	private String nome;
	private Integer tipoProposta;
	private Date dataInicio;
	private Date dataFim;
	private Double minCotas;
	private Double maxCotas;
	private Integer estadoProposta;
	private List<LancamentoData> lancamentos;
	private List<ParticipanteData> participantes;
	private String descricao;
	private Double percentLucro;
	
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
	public List<LancamentoData> getLancamentos() {
		return lancamentos;
	}
	public void setLancamentos(List<LancamentoData> lancamentos) {
		this.lancamentos = lancamentos;
	}
	public List<ParticipanteData> getParticipantes() {
		return participantes;
	}
	public void setParticipantes(List<ParticipanteData> participantes) {
		this.participantes = participantes;
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
	
	
}
