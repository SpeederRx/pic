package br.pic.dao;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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
	
	@Override
	public List<T> pesquisarPorAtributo(T t) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, SecurityException{
		
		StringBuilder sql = new StringBuilder();
		sql.append(" Select o from " + klass.getSimpleName() + " o where 1=1 ");
		for(int i = 0; i < t.getClass().getMethods().length; i++) {
			Method method = t.getClass().getMethods()[i];
			if(t.getClass().getMethods()[i].getName().startsWith("get") && !t.getClass().getMethods()[i].getName().contains("Class")){
				if(method.invoke(t, new Object[] {}) != null) {
					String fieldName = method.getName().substring(3, method.getName().length());
					sql.append(" and o." + fieldName.toLowerCase() + " = :" + fieldName);
				}
			}
		}
		Query query = entityManager.createQuery(sql.toString());
		
		for(int i = 0; i < t.getClass().getMethods().length; i++) {
			Method method = t.getClass().getMethods()[i];
			if(t.getClass().getMethods()[i].getName().startsWith("get") && !t.getClass().getMethods()[i].getName().contains("Class")){
				if(method.invoke(t, new Object[] {}) != null) {
					String fieldName = method.getName().substring(3, method.getName().length());
					query.setParameter(fieldName, method.invoke(t, new Object[] {}));
				}
			}
		}
		
		return query.getResultList();
		
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
}
