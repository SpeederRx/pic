package br.pic.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.Configuration;

import br.pic.model.Ativo;

@Configuration
public class AtivoDaoImp extends PicDaoImp<Ativo> implements AtivoDao{
	
	public AtivoDaoImp() {
		super(Ativo.class);
	}
	
	public AtivoDaoImp(Class<Ativo> klass) {
		super(klass);
	}
	
	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
