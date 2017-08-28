package br.pic.service;

import br.pic.exception.PicException;

public interface PicService <T>{
	public void validar(T obj) throws PicException;
	public void salvar(T obj) throws PicException;
}
