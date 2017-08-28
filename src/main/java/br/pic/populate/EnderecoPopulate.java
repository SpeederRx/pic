package br.pic.populate;

import org.springframework.context.annotation.Configuration;

import br.pic.model.Endereco;
import br.pic.model.data.EnderecoData;

@Configuration
public class EnderecoPopulate implements PicPopulate<Endereco, EnderecoData> {
	
	public Endereco toModel(EnderecoData data) {
		
		if(data == null){
			throw new IllegalArgumentException("Endere�o n�o pode ser nulo.");
		}
		
		Endereco endereco = new Endereco();
		
		endereco.setBairro(data.getBairro());
		endereco.setCep(data.getCep());
		endereco.setCidade(data.getCidade());
		endereco.setComplemento(data.getComplemento());
		endereco.setEstado(data.getEstado());
		endereco.setId(data.getId());
		endereco.setNumero(data.getNumero());
		endereco.setPais(data.getPais());
		endereco.setRua(data.getRua());
		
		return endereco;
	}
	
}