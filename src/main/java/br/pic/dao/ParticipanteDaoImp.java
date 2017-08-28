package br.pic.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.Configuration;

import br.pic.model.Participante;

@Configuration
public class ParticipanteDaoImp extends PicDaoImp<Participante> implements ParticipanteDao{
	
	public ParticipanteDaoImp() {
		super(Participante.class);
	}
	
	public ParticipanteDaoImp(Class<Participante> klass) {
		super(klass);
	}
	
	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
