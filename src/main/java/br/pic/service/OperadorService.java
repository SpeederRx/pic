package br.pic.service;

import javax.inject.Inject;

import org.springframework.context.annotation.Configuration;

import br.pic.dao.OperadorDao;
import br.pic.exception.PicException;
import br.pic.model.Operador;
import br.pic.util.StringUtils;

@Configuration
public class OperadorService implements PicService<Operador>{
	
	@Inject
	private OperadorDao operadorDao;
	
	@Inject
	private EnderecoService enderecoService;
	
	@Override
	public void validar(Operador obj) throws PicException {
		
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
		} if(StringUtils.isNullOrBlank(obj.getDescricao())){
			throw new PicException("Descricao nao pode ser nula.");
		} if(StringUtils.isNullOrBlank(obj.getSenha())){
			throw new PicException("Senha nao pode ser nulo.");
		} if(obj.getDataNasc() == null){
			throw new PicException("Data de Nascimento nao pode ser nula.");
		} if(obj.getNivelAcesso() == null){
			throw new PicException("Nivel de Acesso nao pode ser nulo.");
		} 
		enderecoService.validar(obj.getEndereco());
		
	}

	@Override
	public void salvar(Operador obj) throws PicException {
		validar(obj);
		operadorDao.salvar(obj);
		
	}

	@Override
	public void atualizar(Operador obj) throws PicException {
		// TODO Auto-generated method stub
		
	}

}
