package br.pic.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity 
@Table(name = "socio")
public class Socio {
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "NOME")
	private String nome;
	
	@Column(name = "CPF")
	private String cpf;
	
	@Column(name = "DATA_NASC")
	private Date dataNasc;
	
	@Column(name = "EMAIL")
	private String email;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_ENDERECO", updatable = true, insertable = true)
	private Endereco endereco;
	
	@Column(name = "TELEFONE")
	private String telefone;
	
	@Column(name = "CONTA_MOVIMENTO")
	private String contaMovimento;
	
	@Column(name = "SENHA")
	private String senha;
	
	@Column(name = "CLASSIFICACAO")
	private  Double classificacao; 
	
	@Column(name = "TIPO_ENVIO")
	private Integer tipoEnvio;
	
	@OneToOne(mappedBy="socio")
	private ContaPrincipal contaPrincipal;

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

	public Double getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(Double classificacao) {
		this.classificacao = classificacao;
	}

	public Integer getTipoEnvio() {
		return tipoEnvio;
	}

	public void setTipoEnvio(Integer tipoEnvio) {
		this.tipoEnvio = tipoEnvio;
	}
	
	
}
