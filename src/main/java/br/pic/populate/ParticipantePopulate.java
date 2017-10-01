package br.pic.populate;

import javax.inject.Inject;

import org.springframework.context.annotation.Configuration;

import br.pic.model.Participante;
import br.pic.model.data.ParticipanteData;

@Configuration
public class ParticipantePopulate implements PicPopulate<Participante, ParticipanteData> {
	
	@Inject
	private PropostaPopulate propostaPopulate;
	
	@Inject
	private SocioPopulate socioPopulate;
		

	@Override
	public Participante toModel(ParticipanteData data) {


		if(data == null) {
			throw new IllegalArgumentException("Participante nao pode ser nulo.");
		}
		Participante participante = new Participante();
		
		participante.setCotas(data.getCotas());
		participante.setDataDesvinculo(data.getDataDesvinculo());
		participante.setDataVinculo(data.getDataVinculo());
		participante.setProponente(data.getProponente());
		participante.setProposta(propostaPopulate.toModel(data.getPropostaData()));
		
		participante.setSocio(socioPopulate.toModel(data.getSocioData()));

		return participante;
	}

	@Override
	public ParticipanteData toData(Participante model) {

		
		if(model == null) {
			throw new IllegalArgumentException("Participante pode ser nulo.");
		}
		ParticipanteData participanteData = new ParticipanteData();
		
		participanteData.setId(model.getId());
		participanteData.setCotas(model.getCotas());
		participanteData.setDataDesvinculo(model.getDataDesvinculo());
		participanteData.setDataVinculo(model.getDataVinculo());
		participanteData.setProponente(model.getProponente());
		participanteData.setPropostaData(propostaPopulate.toData(model.getProposta()));
		participanteData.setSocioData(socioPopulate.toData(model.getSocio()));

		return participanteData;
		
	}

}
