package br.pic.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.Configuration;

import br.pic.model.SocioAtivo;

@Configuration
public class SocioAtivoDaoImp extends PicDaoImp<SocioAtivo> implements SocioAtivoDao{
	
	public SocioAtivoDaoImp() {
		super(SocioAtivo.class);
	}
	
	public SocioAtivoDaoImp(Class<SocioAtivo> klass) {
		super(klass);
	}
	
	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
