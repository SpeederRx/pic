package br.pic.service;

import javax.inject.Inject;

import org.springframework.context.annotation.Configuration;

import br.pic.dao.SocioDao;
import br.pic.exception.PicException;
import br.pic.model.Socio;

@Configuration
public class SocioService implements PicService<Socio>{

	@Inject
	private SocioDao socioDao;
	
	@Override
	public void validar(Socio obj) {
		if(obj == null) {
			throw new IllegalArgumentException("Objeto não pode ser nulo.");
		}
	}
	
	@Override
	public void salvar(Socio obj) throws PicException {
		validar(obj);
		socioDao.salvar(obj);
	}
}
