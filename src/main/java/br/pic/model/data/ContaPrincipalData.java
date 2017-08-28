package br.pic.model.data;

import java.util.Date;
import java.util.List;

public class ContaPrincipalData {

	private Long id;
	private SocioData socio;
	private Date dataAbertura;
	private Double saldoAtual;
	private List<LancamentoData> lancamentos;
	private Integer estadoConta;
	private String codigoConta;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public SocioData getSocio() {
		return socio;
	}
	public void setSocio(SocioData socio) {
		this.socio = socio;
	}
	public Date getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	public Double getSaldoAtual() {
		return saldoAtual;
	}
	public void setSaldoAtual(Double saldoAtual) {
		this.saldoAtual = saldoAtual;
	}
	public List<LancamentoData> getLancamentos() {
		return lancamentos;
	}
	public void setLancamentos(List<LancamentoData> lancamentos) {
		this.lancamentos = lancamentos;
	}
	public Integer getEstadoConta() {
		return estadoConta;
	}
	public void setEstadoConta(Integer estadoConta) {
		this.estadoConta = estadoConta;
	}
	public String getCodigoConta() {
		return codigoConta;
	}
	public void setCodigoConta(String codigoConta) {
		this.codigoConta = codigoConta;
	}
	
}
