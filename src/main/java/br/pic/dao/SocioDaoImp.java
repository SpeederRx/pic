package br.pic.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.Configuration;

import br.pic.model.Socio;

@Configuration
public class SocioDaoImp extends PicDaoImp<Socio> implements SocioDao{
	
	public SocioDaoImp() {
		super(Socio.class);
	}
	
	public SocioDaoImp(Class<Socio> klass) {
		super(klass);
	}
	
	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
}
