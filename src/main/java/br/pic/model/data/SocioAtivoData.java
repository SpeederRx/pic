package br.pic.model.data;

public class SocioAtivoData {
	
	private Long id;
	private SocioData socioData;
	private AtivoData ativoData;
	private Double cotas;
	
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
	public AtivoData getAtivoData() {
		return ativoData;
	}
	public void setAtivoData(AtivoData ativoData) {
		this.ativoData = ativoData;
	}
	public Double getCotas() {
		return cotas;
	}
	public void setCotas(Double cotas) {
		this.cotas = cotas;
	}
	
	
	
}
