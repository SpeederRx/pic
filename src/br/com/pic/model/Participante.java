package br.com.pic.model;

import java.util.Date;

public class Participante {
	
	private Long id;
	private Date dataVinculo;
	private Date dataDesvinculo;
	private Boolean proponente;
	private Double cotas;
	private Socio socio;
	private Proposta proposta;
	
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
	public Socio getSocio() {
		return socio;
	}
	public void setSocio(Socio socio) {
		this.socio = socio;
	}
	public Proposta getProposta() {
		return proposta;
	}
	public void setProposta(Proposta proposta) {
		this.proposta = proposta;
	}
	
		
}
