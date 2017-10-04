package br.pic.service;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import br.pic.exception.PicException;

public interface PicService <T>{
	public void validar(T obj) throws PicException;
	public void salvar(T obj) throws PicException;
	public void atualizar(T obj) throws PicException;
	public List<T> pesquisarPorAtributo(T obj) throws PicException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, SecurityException;
}
