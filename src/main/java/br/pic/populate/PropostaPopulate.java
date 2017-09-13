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
	public PropostaData toData(Proposta model) {
		
		if(model == null){
			throw new IllegalArgumentException("Proposta nao pode ser nula.");
		}
		
		PropostaData propostaData = new PropostaData();
		
		propostaData.setId(model.getId());
		propostaData.setNome(model.getNome());
		propostaData.setTipoProposta(model.getTipoProposta());
		propostaData.setDataInicio(model.getDataInicio());
		propostaData.setDataFim(model.getDataFim());
		propostaData.setMinCotas(model.getMinCotas());
		propostaData.setMaxCotas(model.getMaxCotas());
		propostaData.setEstadoProposta(model.getEstadoProposta());
		propostaData.setDescricao(model.getDescricao());
		propostaData.setPercentLucro(model.getPercentLucro());
		
		return propostaData;
		
	}
	
}
