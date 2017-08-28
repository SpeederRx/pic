package br.pic.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.Configuration;

import br.pic.model.Operador;

@Configuration
public class OperadorDaoImp extends PicDaoImp<Operador> implements OperadorDao{
	
	public OperadorDaoImp() {
		super(Operador.class);
	}
	
	public OperadorDaoImp(Class<Operador> klass) {
		super(klass);
	}
	
	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
