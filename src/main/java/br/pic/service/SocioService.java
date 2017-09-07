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
	
	@Override
	public void validar(Socio obj) throws PicException {
		
		if(obj == null) {
			throw new IllegalArgumentException("Objeto não pode ser nulo.");
		} if(StringUtils.isNullOrBlank(obj.getNome())){
			throw new PicException("Nome deve ser preenchido corretamente.");
		} if(StringUtils.isNullOrBlank(obj.getCpf())){
			throw new PicException("CPF deve ser preenchido corretamente.");
		} if(StringUtils.isNullOrBlank(obj.getEmail())) {
			throw new PicException("E-mail deve ser preenchido corretamente.");
		} if(StringUtils.isNullOrBlank(obj.getTelefone())){
			throw new PicException("Telefone deve ser preenchido corretamente.");
		} if(StringUtils.isNullOrBlank(obj.getContaMovimento())){
			throw new PicException("Conta de Movimento deve ser preenchido corretamente.");
		} if(StringUtils.isNullOrBlank(obj.getSenha())){
			throw new PicException("Senha deve ser preenchido corretamente.");
		} if(obj.getEndereco() == null){
			throw new PicException("Endereco deve ser preenchido corretamente.");
		}
	
	}
	
	@Override
	public void salvar(Socio obj) throws PicException {
		validar(obj);
		socioDao.salvar(obj);
	}
	
	
}
