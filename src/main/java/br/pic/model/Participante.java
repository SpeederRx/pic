package br.pic.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "participante")
public class Participante {	
	
	@Id
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "DATA_VINCULO")
	private Date dataVinculo;
	
	@Column(name = "DATA_DESVINCULO")
	private Date dataDesvinculo;
	
	@Column(name = "PROPONENTE")
	private Boolean proponente;
	
	@Column(name = "COTAS")
	private Double cotas;
	
	@OneToOne(mappedBy = "socio", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Socio socio;
	
	@OneToOne(mappedBy = "proposta", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
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
