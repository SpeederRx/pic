package br.pic.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.Configuration;

import br.pic.model.Proposta;

@Configuration
public class PropostaDaoImp extends PicDaoImp<Proposta> implements PropostaDao{
	
	public PropostaDaoImp() {
		super(Proposta.class);
	}
	
	public PropostaDaoImp(Class<Proposta> klass) {
		super(klass);
	}
	
	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
