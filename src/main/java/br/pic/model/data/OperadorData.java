package br.pic.model.data;

import java.util.Date;

public class OperadorData {

	private Long id;
	private String nome;
	private String cpf;
	private Date dataNasc;
	private String email;
	private EnderecoData endereco;
	private String telefone;
	private Long nivelAcesso;
	private String senha;
	private String descricao;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public EnderecoData getEndereco() {
		return endereco;
	}
	public void setEndereco(EnderecoData endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
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
