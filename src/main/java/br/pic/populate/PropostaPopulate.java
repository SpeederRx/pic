package br.pic.populate;

import org.springframework.context.annotation.Configuration;

import br.pic.model.Proposta;
import br.pic.model.data.PropostaData;

@Configuration
public class PropostaPopulate implements PicPopulate<Proposta, PropostaData> {

	@Override
	public Proposta toModel(PropostaData data) {
		
		if(data == null){
			throw new IllegalArgumentException("Proposta nao pode ser nula.");
		}
		
		Proposta proposta = new Proposta();
		
		proposta.setNome(data.getNome());
		proposta.setTipoProposta(data.getTipoProposta());
		proposta.setDataInicio(data.getDataInicio());
		proposta.setDataFim(data.getDataFim());
		proposta.setMinCotas(data.getMinCotas());
		proposta.setMaxCotas(data.getMaxCotas());
		proposta.setEstadoProposta(data.getEstadoProposta());
		proposta.setDescricao(data.getDescricao());
		proposta.setPercentLucro(data.getPercentLucro());
		
		return proposta;
	}

	@Override
	public PropostaData toData(Proposta Model) {
		// TODO Auto-generated method stub
		return null;
	}
	
}