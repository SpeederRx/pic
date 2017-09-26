package br.pic.service;

import javax.inject.Inject;

import org.springframework.context.annotation.Configuration;

import br.pic.dao.SocioDao;
import br.pic.exception.PicException;
import br.pic.model.Socio;
import br.pic.util.StringUtils;

@Configuration
public class SocioService implements PicService<Socio>{

	@Inject
	private SocioDao socioDao;
	
	@Inject
	private EnderecoService enderecoService;
	
	
	
	@Override
	public void validar(Socio obj) throws PicException {
		
		if(obj == null) {
			throw new PicException("Objeto nao pode ser nulo.");
		} if(StringUtils.isNullOrBlank(obj.getNome())){
			throw new PicException("Nome nao pode ser nulo.");
		} if(StringUtils.isNullOrBlank(obj.getCpf())){
			throw new PicException("CPF nao pode ser nulo.");
		} if(StringUtils.isNullOrBlank(obj.getEmail())) {
			throw new PicException("E-mail nao pode ser nulo.");
		} if(StringUtils.isNullOrBlank(obj.getTelefone())){
			throw new PicException("Telefone nao pode ser nulo.");
		} if(StringUtils.isNullOrBlank(obj.getContaMovimento())){
			throw new PicException("Conta de Movimento nao pode ser nulo.");
		} if(StringUtils.isNullOrBlank(obj.getSenha())){
			throw new PicException("Senha nao pode ser nula.");
		} if(obj.getDataNasc() == null){
			throw new PicException("Data de Nascimento nao pode ser nula.");
		} if(obj.getTipoEnvio() == null){
			throw new PicException("Tipo do Envio nao pode ser nulo.");
		} if(obj.getClassificacao() == null){
			throw new PicException("Classificacao nao pode ser nula.");
		} 
		enderecoService.validar(obj.getEndereco());
	}
	
	@Override
	public void salvar(Socio obj) throws PicException {
		validar(obj);
		
		
		socioDao.salvar(obj);
	}
	
	
	public void atualizar(Socio obj) throws PicException {
		validar(obj);
		socioDao.atualizar(obj);
	}
	
	
}
