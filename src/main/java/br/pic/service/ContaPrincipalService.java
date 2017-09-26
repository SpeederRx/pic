package br.pic.service;

import javax.inject.Inject;

import org.springframework.context.annotation.Configuration;

import br.pic.dao.ContaPrincipalDao;
import br.pic.exception.PicException;
import br.pic.model.ContaPrincipal;
import br.pic.util.StringUtils;

@Configuration
public class ContaPrincipalService implements PicService<ContaPrincipal> {
	
	@Inject
	private ContaPrincipalDao contaPrincipalDao;
	
	@Inject
	private SocioService socioService;
	
	@Override
	public void validar(ContaPrincipal obj) throws PicException {
		
		if(obj == null) {
			throw new PicException("Objeto nao pode ser nulo.");
		} if(obj.getDataAbertura() == null){
			throw new PicException("Data de Abertura nao pode ser nula");
		} if(obj.getSaldoAtual() == null){
			throw new PicException("Saldo nao pode ser nulo.");
		} if(obj.getEstadoConta() == null) {
			throw new PicException("Estado da Conta nao pode ser nulo.");
		} if(StringUtils.isNullOrBlank(obj.getCodigoConta())){
			throw new PicException("Codigo da Conta nao pode ser nulo");
		} 
		socioService.validar(obj.getSocio());
		
	}

	@Override
	public void salvar(ContaPrincipal obj) throws PicException {
		validar(obj);
		contaPrincipalDao.salvar(obj);
		
	}

	@Override
	public void atualizar(ContaPrincipal obj) throws PicException {
		// TODO Auto-generated method stub
		
	}

}
