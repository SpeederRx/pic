package br.pic.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.context.annotation.Configuration;

import br.pic.exception.PicException;

@Configuration
public class PicDaoImp<T> implements PicDao<T> {
	
	protected EntityManager entityManager;

	private Class<?> klass;
	
	public PicDaoImp() {		
	}

	public PicDaoImp(Class<T> klass) {
		this.klass = klass;
	}
	
	@Override
	public T pesquisarPorId(Long id) {
		if(id == null) {
			return null;
		}
		return (T) entityManager.find(klass, id);
	}

	@Override
	public void salvar(T obj) throws PicException {
		entityManager.persist(obj);
	}

	@Override
	public void atualizar(T obj) throws PicException {
		entityManager.merge(obj);
	}

	@Override
	public void deletar(Long id) throws PicException {
		T obj = this.pesquisarPorId(id);
		entityManager.remove(obj);
	}

	@Override
	public List<T> pesquisarTodos() {
		String sql = "Select o from " + klass.getSimpleName() + " o ";
		Query query = entityManager.createQuery(sql);
		return (List<T>) query.getResultList();
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
}
