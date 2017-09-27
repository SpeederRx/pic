package br.pic.populate;

import javax.inject.Inject;

import org.springframework.context.annotation.Configuration;

import br.pic.model.Operador;
import br.pic.model.data.OperadorData;

@Configuration
public class OperadorPopulate implements PicPopulate<Operador, OperadorData> {

	@Inject
	private EnderecoPopulate enderecoPopulate; 
	
	@Override
	public Operador toModel(OperadorData data) {

		if(data == null) {
			throw new IllegalArgumentException("Operador nao pode ser nulo.");
		}
		Operador operador = new Operador();
		
		operador.setCpf(data.getCpf());
		operador.setDataNasc(data.getDataNasc());
		operador.setDescricao(data.getDescricao());
		operador.setEmail(data.getEmail());
		operador.setNivelAcesso(data.getNivelAcesso());
		operador.setNome(data.getNome());
		operador.setSenha(data.getSenha());
		operador.setTelefone(data.getTelefone());
		operador.setEndereco(enderecoPopulate.toModel(data.getEnderecoData()));

		return operador;
	}

	@Override
	public OperadorData toData(Operador model) {

		
		if(model == null) {
			throw new IllegalArgumentException("Operador nao pode ser nulo.");
		}
		OperadorData operadorData = new OperadorData();
		
		operadorData.setId(model.getId());
		operadorData.setCpf(model.getCpf());
		operadorData.setDataNasc(model.getDataNasc());
		operadorData.setDescricao(model.getDescricao());
		operadorData.setEmail(model.getEmail());
		operadorData.setNivelAcesso(model.getNivelAcesso());
		operadorData.setNome(model.getNome());
		operadorData.setSenha(model.getSenha());
		operadorData.setTelefone(model.getTelefone());
		operadorData.setEnderecoData(enderecoPopulate.toData(model.getEndereco()));
		
		return operadorData;
	}

}
