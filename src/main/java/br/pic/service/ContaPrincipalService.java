package br.pic.service;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.springframework.context.annotation.Configuration;

import br.pic.commun.EstadoConta;
import br.pic.dao.ContaPrincipalDao;
import br.pic.exception.PicException;
import br.pic.model.ContaPrincipal;
import br.pic.model.Socio;

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
		} 
		
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
	

	@Override
	public List<ContaPrincipal> pesquisarPorAtributo(ContaPrincipal obj) throws PicException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, SecurityException {
		// TODO Auto-generated method stub
		return null;
	}

	public void criarNovaContaPrincipal(Socio socio) throws PicException {
		ContaPrincipal contaPrincipal = new ContaPrincipal();
		contaPrincipal.setSocio(socio);
		contaPrincipal.setDataAbertura(new Date());
		contaPrincipal.setSaldoAtual(0d);
		contaPrincipal.setEstadoConta(EstadoConta.ATIVA.getCodigo());

		salvar(contaPrincipal);
	}

}
