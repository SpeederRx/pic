package br.pic.service;

import org.springframework.context.annotation.Configuration;

import br.pic.exception.PicException;
import br.pic.model.Lancamento;

@Configuration
public class LancamentoService implements PicService<Lancamento>{

	@Override
	public void validar(Lancamento obj) throws PicException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void salvar(Lancamento obj) throws PicException {
		// TODO Auto-generated method stub
		
	}
	
}
