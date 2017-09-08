package br.pic.service;

import javax.inject.Inject;

import org.springframework.context.annotation.Configuration;

import br.pic.dao.SocioAtivoDao;
import br.pic.exception.PicException;
import br.pic.model.SocioAtivo;

@Configuration
public class SocioAtivoService implements PicService<SocioAtivo>{
	
	@Inject
	private SocioAtivoDao socioAtivoDao;
	
	@Inject
	private SocioService socioService;
	
	@Inject
	private AtivoService ativoService;

	@Override
	public void validar(SocioAtivo obj) throws PicException {
		
		if(obj == null) {
			throw new PicException("Objeto nao pode ser nulo.");
		} if(obj.getCotas() == null){
			throw new PicException("Cotas nao pode ser nulo.");
		} 
		socioService.validar(obj.getSocio());
		ativoService.validar(obj.getAtivo());
		
	}

	@Override
	public void salvar(SocioAtivo obj) throws PicException {
		validar(obj);
		socioAtivoDao.salvar(obj);
		
	}

}
