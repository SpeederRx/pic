package br.pic.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.Configuration;

import br.pic.model.Lancamento;

@Configuration
public class LancamentoDaoImp extends PicDaoImp<Lancamento> implements LancamentoDao{
	
	public LancamentoDaoImp() {
		super(Lancamento.class);
	}
	
	public LancamentoDaoImp(Class<Lancamento> klass) {
		super(klass);
	}
	
	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}