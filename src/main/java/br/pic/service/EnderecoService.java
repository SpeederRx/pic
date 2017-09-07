package br.pic.service;

import javax.inject.Inject;

import br.pic.dao.EnderecoDao;
import br.pic.exception.PicException;
import br.pic.model.Endereco;
import br.pic.util.StringUtils;

public class EnderecoService implements PicService<Endereco> {

	@Inject
	private EnderecoDao enderecoDao;
		
	@Override
	public void validar(Endereco obj) throws PicException {
		
		if(obj == null) {
			throw new IllegalArgumentException("Objeto não pode ser nulo.");
		} if(StringUtils.isNullOrBlank(obj.getRua())){
			throw new PicException("Nome da Rua ser preenchido corretamente.");
		} if(obj.getNumero()== null){
			throw new PicException("Numero deve ser preenchido corretamente.");
		} if(StringUtils.isNullOrBlank(obj.getCidade())){
			throw new PicException("Cidade deve ser preenchido corretamente.");
		} if(StringUtils.isNullOrBlank(obj.getEstado())){
			throw new PicException("Estado deve ser preenchido corretamente.");
		} if(StringUtils.isNullOrBlank(obj.getCep())){
			throw new PicException("CEP deve ser preenchido corretamente.");
		} if(StringUtils.isNullOrBlank(obj.getPais())){
			throw new PicException("Pais deve ser preenchido corretamente.");
		}
		
	}

	@Override
	public void salvar(Endereco obj) throws PicException {
		validar(obj);
		enderecoDao.salvar(obj);
		
	}

}
