package br.pic.test.model;

import org.junit.Assert;
import org.junit.Test;

import br.pic.model.Proposta;

public class PropostaModelTest {
	
	protected Proposta proposta; 
	
	@Test
	public void criarPropostaCompleto(){
		//Cria uma nova Proposta 
		proposta = novoProposta1();
		//Verifica se a Proposta nao eh nula
		Assert.assertNotNull(proposta);
		
		//Cria uma nova Proposta 
		proposta = novoProposta2();
		//Verifica se a Proposta nao eh nula
		Assert.assertNotNull(proposta);
		
		//Cria uma nova Proposta 
		proposta = novoProposta3();
		//Verifica se a Proposta nao eh nula
		Assert.assertNotNull(proposta);
	}
	
	/**
	  * Metodo para criar uma Proposta nova
	 * @return
	 */
	public static Proposta novoProposta1(){
		Proposta proposta = new Proposta();
		proposta.setId(1L);
		return proposta;
	}
	
	/**
	  * Metodo para criar uma Proposta nova
	 * @return
	 */
	public static Proposta novoProposta2(){
		Proposta proposta = new Proposta();
		proposta.setId(1L);
		return proposta;
	}
	
	/**
	 * Metodo para criar uma Proposta nova
	 * @return
	 */
	public static Proposta novoProposta3(){
		Proposta proposta = new Proposta();
		proposta.setId(1L);
		return proposta;
	}

}
