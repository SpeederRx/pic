package br.com.pic.model;

import java.util.Date;

public class Socio {
	
	private Long id;
	private String nome;
	private String cpf;
	private Date dataNasc;
	private String email;
	private Endereco endereco;
	private String telefone;
	private String contaMovimento;
	private String senha;
	private  double classificacao; 
	private TipoEnvio tipoEnvio;
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
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
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
