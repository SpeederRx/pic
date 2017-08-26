package br.com.pic.model;

public class Operador extends Pessoa {
	
	private Long nivelAcesso;
	private String senha;
	private String descricao;
	
	public Long getNivelAcesso() {
		return nivelAcesso;
	}
	public void setNivelAcesso(Long nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	

}
