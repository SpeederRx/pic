package br.pic.dao;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import br.pic.exception.PicException;

public interface PicDao<T> {

	T pesquisarPorId(Long id);

	void salvar(T obj) throws PicException;

	void atualizar(T obj) throws PicException;

	void deletar(Long id) throws PicException;

	List<T> pesquisarTodos();
	
	List<T> pesquisarPorAtributo(T t)throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, SecurityException ;
	
}
