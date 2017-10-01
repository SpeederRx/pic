package br.pic.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "lancamento")
public class Lancamento {
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "ID_CONTA_PRINCIPAL")
	private ContaPrincipal contaPrincipal;
	
	@ManyToOne
	@JoinColumn(name = "ID_ATIVO", insertable = false, updatable = false)
	private Ativo ativo;
	
	@ManyToOne
	@JoinColumn(name = "ID_PROPOSTA")
	private Proposta proposta;
	
	@Column(name = "VALOR_TOTAL_LANC")
	private Double valorTotalLanc;
	
	@Column(name = "DESCRICAO")
	private String descricao;
	
	@Column(name = "QTDE_LANCADA")
	private Integer qtdeLancada;
	
	@Column(name = "TIPO_LANCAMENTO")
	private Integer tipoLancamento;
	
	@ManyToOne
	@JoinColumn(name = "ID_OPERADOR", insertable = false, updatable = false)
	private Operador operador;
	
	@Column(name = "ESTADO_LANCAMENTO")
	private Integer estadoLancamento;
	
	@Column(name = "DATA")
	private Date data;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public ContaPrincipal getContaPrincipal() {
		return contaPrincipal;
	}


	public void setContaPrincipal(ContaPrincipal contaPrincipal) {
		this.contaPrincipal = contaPrincipal;
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


	public Integer getTipoLancamento() {
		return tipoLancamento;
	}


	public void setTipoLancamento(Integer tipoLancamento) {
		this.tipoLancamento = tipoLancamento;
	}


	public Operador getOperador() {
		return operador;
	}


	public void setOperador(Operador operador) {
		this.operador = operador;
	}


	public Integer getEstadoLancamento() {
		return estadoLancamento;
	}


	public void setEstadoLancamento(Integer estadoLancamento) {
		this.estadoLancamento = estadoLancamento;
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}
	
			
}
