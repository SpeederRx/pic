package br.pic.service;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import javax.inject.Inject;

import org.springframework.context.annotation.Configuration;

import br.pic.dao.EnderecoDao;
import br.pic.exception.PicException;
import br.pic.model.Endereco;
import br.pic.util.StringUtils;

@Configuration
public class EnderecoService implements PicService<Endereco> {

	@Inject
	private EnderecoDao enderecoDao;
		
	@Override
	public void validar(Endereco obj) throws PicException {
		
		if(obj == null) {
			throw new PicException("Objeto nao pode ser nulo.");
		} if(StringUtils.isNullOrBlank(obj.getRua())){
			throw new PicException("Nome da Rua nao pode ser nulo.");
		} if(obj.getNumero()== null){
			throw new PicException("Numero nao pode ser nulo.");
		} if(StringUtils.isNullOrBlank(obj.getCidade())){
			throw new PicException("Cidade nao pode ser nula.");
		} if(StringUtils.isNullOrBlank(obj.getEstado())){
			throw new PicException("Estado nao pode ser nulo.");
		} if(StringUtils.isNullOrBlank(obj.getCep())){
			throw new PicException("CEP nao pode ser nulo.");
		} if(StringUtils.isNullOrBlank(obj.getPais())){
			throw new PicException("Pais nao pode ser nulo.");
		} if(StringUtils.isNullOrBlank(obj.getBairro())){
			throw new PicException("Bairro nao pode ser nulo.");
		}
		
	}

	@Override
	public void salvar(Endereco obj) throws PicException {
		validar(obj);
		enderecoDao.salvar(obj);
		
	}

	@Override
	public void atualizar(Endereco obj) throws PicException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Endereco> pesquisarPorAtributo(Endereco obj) throws PicException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, SecurityException {
		// TODO Auto-generated method stub
		return null;
	}

}
