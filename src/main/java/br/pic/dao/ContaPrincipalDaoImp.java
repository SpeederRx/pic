package br.pic.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.Configuration;

import br.pic.model.ContaPrincipal;

@Configuration
public class ContaPrincipalDaoImp extends PicDaoImp<ContaPrincipal> implements ContaPrincipalDao{
	
	public ContaPrincipalDaoImp() {
		super(ContaPrincipal.class);
	}
	
	public ContaPrincipalDaoImp(Class<ContaPrincipal> klass) {
		super(klass);
	}
	
	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
