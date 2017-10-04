package br.pic.model.data;

import java.util.Date;
import java.util.List;

public class ContaPrincipalData {

	private Long id;
	private SocioData socioData;
	private Date dataAbertura;
	private Double saldoAtual;
	private List<LancamentoData> lancamentosData;
	private Integer estadoConta;
	private String estadoContaString;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public SocioData getSocioData() {
		return socioData;
	}
	public void setSocioData(SocioData socioData) {
		this.socioData = socioData;
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
	public List<LancamentoData> getLancamentosData() {
		return lancamentosData;
	}
	public void setLancamentosData(List<LancamentoData> lancamentosData) {
		this.lancamentosData = lancamentosData;
	}
	public Integer getEstadoConta() {
		return estadoConta;
	}
	public void setEstadoConta(Integer estadoConta) {
		this.estadoConta = estadoConta;
	}
	public String getEstadoContaString() {
		return estadoContaString;
	}
	public void setEstadoContaString(String estadoContaString) {
		this.estadoContaString = estadoContaString;
	}
	
}
