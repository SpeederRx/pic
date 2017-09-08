package br.pic.model.data;

import java.util.Date;

public class ParticipanteData {

	private Long id;
	private Date dataVinculo;
	private Date dataDesvinculo;
	private Boolean proponente;
	private Double cotas;
	private SocioData socioData;
	private PropostaData propostaData;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDataVinculo() {
		return dataVinculo;
	}
	public void setDataVinculo(Date dataVinculo) {
		this.dataVinculo = dataVinculo;
	}
	public Date getDataDesvinculo() {
		return dataDesvinculo;
	}
	public void setDataDesvinculo(Date dataDesvinculo) {
		this.dataDesvinculo = dataDesvinculo;
	}
	public Boolean getProponente() {
		return proponente;
	}
	public void setProponente(Boolean proponente) {
		this.proponente = proponente;
	}
	public Double getCotas() {
		return cotas;
	}
	public void setCotas(Double cotas) {
		this.cotas = cotas;
	}
	public SocioData getSocioData() {
		return socioData;
	}
	public void setSocioData(SocioData socioData) {
		this.socioData = socioData;
	}
	public PropostaData getPropostaData() {
		return propostaData;
	}
	public void setPropostaData(PropostaData propostaData) {
		this.propostaData = propostaData;
	}
	
	
	
}
