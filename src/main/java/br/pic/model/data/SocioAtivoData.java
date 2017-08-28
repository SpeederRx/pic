package br.pic.model.data;

import br.pic.model.Ativo;
import br.pic.model.Socio;

public class SocioAtivoData {
	
	private Long id;
	private Socio socio;
	private Ativo ativo;
	private Double cotas;
	
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
	public Ativo getAtivo() {
		return ativo;
	}
	public void setAtivo(Ativo ativo) {
		this.ativo = ativo;
	}
	public Double getCotas() {
		return cotas;
	}
	public void setCotas(Double cotas) {
		this.cotas = cotas;
	}
	
	
	

}
