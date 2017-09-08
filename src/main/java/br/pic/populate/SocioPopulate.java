package br.pic.populate;

import javax.inject.Inject;

import org.springframework.context.annotation.Configuration;

import br.pic.model.Socio;
import br.pic.model.data.SocioData;

@Configuration
public class SocioPopulate implements PicPopulate<Socio, SocioData> {
	
	@Inject
	private EnderecoPopulate enderecoPopulate; 
	
	@Override
	public Socio toModel(SocioData data) {
		
		if(data == null) {
			throw new IllegalArgumentException("Socio nao pode ser nulo.");
		}
		Socio socio = new Socio();
		
		socio.setId(data.getId());
		socio.setClassificacao(data.getClassificacao());
		socio.setContaMovimento(data.getContaMovimento());
		socio.setCpf(data.getCpf());
		socio.setDataNasc(data.getDataNasc());
		socio.setEmail(data.getEmail());
		socio.setNome(data.getNome());
		socio.setSenha(data.getSenha());
		socio.setTelefone(data.getTelefone());
		socio.setTipoEnvio(data.getTipoEnvio());
		socio.setEndereco(enderecoPopulate.toModel(data.getEnderecoData()));
		
		return socio;
	}
}
