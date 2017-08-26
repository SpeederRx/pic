package br.com.pic.model;

public class Socio extends Pessoa {
	
	private String contaMovimento;
	private String senha;
	private  double classificacao; 
	private TipoEnvio tipoEnvio;
	
	public String getContaMovimento() {
		return contaMovimento;
	}
	public void setContaMovimento(String contaMovimento) {
		this.contaMovimento = contaMovimento;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public double getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(double classificacao) {
		this.classificacao = classificacao;
	}
	public TipoEnvio getTipoEnvio() {
		return tipoEnvio;
	}
	public void setTipoEnvio(TipoEnvio tipoEnvio) {
		this.tipoEnvio = tipoEnvio;
	}
	

}
