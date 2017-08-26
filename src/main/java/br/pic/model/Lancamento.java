package br.pic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "lancamento")
public class Lancamento {
	
	@Id
	@Column(name = "ID")
	private Long id;
	
	@ManyToOne()
	@Column(name = "ID_CONTA_PRINCIPAL")
	private ContaPrincipal contaPrincipal;
	
	@Column(name = "ID_ATIVO")
	private Ativo ativo;
	
	@ManyToOne()
	@Column(name = "ID_PROPOSTA")
	private Proposta proposta;
	
	@Column(name = "VALOR_TOTAL_LANC")
	private Double valorTotalLanc;
	
	@Column(name = "DESCRICAO")
	private String descricao;
	
	@Column(name = "QTDE_LANCADA")
	private Integer qtdeLancada;
	
	@Column(name = "TIPO_LANCAMENTO")
	private Integer tipoLancamento;
	
	@Column(name = "ID_OPERADOR")
	private Operador operador;
	
	@Column(name = "ESTADO_LANCAMENTO")
	private Integer estadoLancamento;


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
	
			
}
