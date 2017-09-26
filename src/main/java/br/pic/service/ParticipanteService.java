package br.pic.service;

import javax.inject.Inject;

import org.springframework.context.annotation.Configuration;

import br.pic.dao.ParticipanteDao;
import br.pic.exception.PicException;
import br.pic.model.Participante;

@Configuration
public class ParticipanteService implements PicService<Participante>{
	
	@Inject
	private ParticipanteDao participanteDao;
	
	@Inject
	private SocioService socioService;

	@Override
	public void validar(Participante obj) throws PicException {
		if(obj == null) {
			throw new PicException("Objeto nao pode ser nulo.");
		} if(obj.getDataVinculo() == null){
			throw new PicException("Data de Vinculo nao pode ser nula.");
		} if(obj.getProponente() == null){
			throw new PicException("Proponente nao pode ser nulo");
		} if(obj.getCotas() == null) {
			throw new PicException("Cotas nao pode ser nulo.");
		} 
		socioService.validar(obj.getSocio());
		
	}

	@Override
	public void salvar(Participante obj) throws PicException {
		validar(obj);
		participanteDao.salvar(obj);
		
	}

	@Override
	public void atualizar(Participante obj) throws PicException {
		// TODO Auto-generated method stub
		
	}

	
}
