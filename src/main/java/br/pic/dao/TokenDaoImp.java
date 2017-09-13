package br.pic.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.Configuration;

import br.pic.model.Token;

@Configuration
public class TokenDaoImp extends PicDaoImp<Token> implements TokenDao{
	
	public TokenDaoImp() {
		super(Token.class);
	}
	
	public TokenDaoImp(Class<Token> klass) {
		super(klass);
	}
	
	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
