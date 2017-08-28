package br.pic.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.Configuration;

import br.pic.model.Endereco;

@Configuration
public class EnderecoDaoImp extends PicDaoImp<Endereco> implements EnderecoDao{
	
	public EnderecoDaoImp() {
		super(Endereco.class);
	}
	
	public EnderecoDaoImp(Class<Endereco> klass) {
		super(klass);
	}
	
	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	
}