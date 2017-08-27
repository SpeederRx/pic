package br.pic.dao;

import java.util.List;

import br.pic.exception.PicException;

public interface PicDao<T> {

	T pesquisarPorId(Long id);

	void salvar(T obj) throws PicException;

	void atualizar(T obj) throws PicException;

	void deletar(Long id) throws PicException;

	List<T> pesquisarTodos();
	
}
