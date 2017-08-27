package br.pic.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "proposta")
public class Proposta {
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "TIPO_PROPOSTA")
	private Integer tipoProposta;
	
	@Column(name = "DATA_INICIO")
	private Date dataInicio;
	
	@Column(name = "DATA_FIM")
	private Date dataFim;
	
	@Column(name = "MIN_COTAS")
	private Double minCotas;
	
	@Column(name = "MAX_COTAS")
	private Double maxCotas;
	
	@Column(name = "ESTADO_PROPOSTA")
	private Integer estadoProposta;
	
	@OneToMany(mappedBy = "proposta", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Lancamento> lancamentos;
	
	@OneToMany(mappedBy = "proposta", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Participante> participantes;
	
	@Column(name = "DESCRICAO")
	private String descricao;
	
	@Column(name = "PERCENT_LUCRO")
	private Double percentLucro;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
