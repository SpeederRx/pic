package br.pic.service;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import javax.inject.Inject;

import org.springframework.context.annotation.Configuration;

import br.pic.dao.AtivoDao;
import br.pic.exception.PicException;
import br.pic.model.Ativo;
import br.pic.util.StringUtils;

@Configuration
public class AtivoService implements PicService<Ativo>{

	@Inject
	private AtivoDao ativoDao;
	
	@Override
	public void validar(Ativo obj) throws PicException {
		
		if(obj == null) {
			throw new PicException("Objeto nao pode ser nulo.");
		} if(StringUtils.isNullOrBlank(obj.getDescricao())){
			throw new PicException("Descricao nao pode ser nula.");
		} if(obj.getTipoAtivo() == null){
			throw new PicException("Tipo do Ativo nao pode ser nulo.");
		} 
		
		
		
	}

	@Override
	public void salvar(Ativo obj) throws PicException {
		validar(obj);
		ativoDao.salvar(obj);
		
	}

	@Override
	public void atualizar(Ativo obj) throws PicException {
		validar(obj);
		ativoDao.atualizar(obj);		
	}

	@Override
	public List<Ativo> pesquisarPorAtributo(Ativo obj) throws PicException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, SecurityException {
		// TODO Auto-generated method stub
		return null;
	}

}
