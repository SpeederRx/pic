package br.com.pic.model;

public class SocioAtivo {
	
	private Integer id;
	private Socio socio;
	private Ativo ativo;
	private Double cotas;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
