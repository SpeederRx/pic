package br.com.pic.model;

import java.util.Date;
import java.util.List;

public class Proposta {
	
	private Long id;
	private TipoProposta tipoProposta;
	private Date dataInicio;
	private Date dataFim;
	private Double minCotas;
	private Double maxCotas;
	private EstadoProposta estadoProposta;
	private List<Lancamento> lancamentos;
	private List<Participante> participantes;
	private String descricao;
	private Double percentLucro;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public TipoProposta getTipoProposta() {
		return tipoProposta;
	}
	public void setTipoProposta(TipoProposta tipoProposta) {
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
	public EstadoProposta getEstadoProposta() {
		return estadoProposta;
	}
	public void setEstadoProposta(EstadoProposta estadoProposta) {
		this.estadoProposta = estadoProposta;
	}
	public List<Lancamento> getLancamentos() {
		return lancamentos;
	}
	public void setLancamentos(List<Lancamento> lancamentos) {
		this.lancamentos = lancamentos;
	}
	public List<Participante> getParticipantes() {
		return participantes;
	}
	public void setParticipantes(List<Participante> participantes) {
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
