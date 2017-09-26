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
	
	@Override
	public SocioData toData(Socio model) {
		
		
		if(model == null) {
			throw new IllegalArgumentException("Socio nao pode ser nulo.");
		}
		SocioData socioData = new SocioData();
		
		socioData.setId(model.getId());
		socioData.setClassificacao(model.getClassificacao());
		socioData.setContaMovimento(model.getContaMovimento());
		socioData.setCpf(model.getCpf());
		socioData.setDataNasc(model.getDataNasc());
		socioData.setEmail(model.getEmail());
		socioData.setNome(model.getNome());
		socioData.setSenha(model.getSenha());
		socioData.setTelefone(model.getTelefone());
		socioData.setTipoEnvio(model.getTipoEnvio());
		socioData.setEnderecoData(enderecoPopulate.toData(model.getEndereco()));
		
		return socioData;
	}
	
}
