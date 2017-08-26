package br.pic.model;
import java.util.Date;
import java.util.List;

public class ContaPrincipal {
	
	private Long id;
	private Socio socio;
	private Date dtAbertura;
	private Double saldoAtual;
	private List<Lancamento> lancamentos;
	private EstadoConta status;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Socio getSocio() {
		return socio;
	}
	public void setSocio(Socio socio) {
		this.socio = socio;
	}
	public Date getDtAbertura() {
		return dtAbertura;
	}
	public void setDtAbertura(Date dtAbertura) {
		this.dtAbertura = dtAbertura;
	}
	public Double getSaldoAtual() {
		return saldoAtual;
	}
	public void setSaldoAtual(Double saldoAtual) {
		this.saldoAtual = saldoAtual;
	}
	public List<Lancamento> getLancamentos() {
		return lancamentos;
	}
	public void setLancamentos(List<Lancamento> lancamentos) {
		this.lancamentos = lancamentos;
	}
	public EstadoConta getStatus() {
		return status;
	}
	public void setStatus(EstadoConta status) {
		this.status = status;
	}
	
	

}
