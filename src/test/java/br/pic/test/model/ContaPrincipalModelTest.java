package br.pic.test.model;

import org.junit.Assert;
import org.junit.Test;

import br.pic.model.ContaPrincipal;

public class ContaPrincipalModelTest {
	
	protected ContaPrincipal contaPrincipal; 
	
	@Test
	public void criarContaPrincipalCompleto(){
		//Cria uma nova  ContaPrincipal 
		contaPrincipal = novoContaPrincipal1();
		//Verifica se a ContaPrincipal nao eh nula
		Assert.assertNotNull(contaPrincipal);
		
		//Cria uma nova  ContaPrincipal 
		contaPrincipal = novoContaPrincipal2();
		//Verifica se a ContaPrincipal nao eh nula
		Assert.assertNotNull(contaPrincipal);
		
		//Cria uma nova  ContaPrincipal 
		contaPrincipal = novoContaPrincipal3();
		//Verifica se a ContaPrincipal nao eh nula
		Assert.assertNotNull(contaPrincipal);
	}
	
	/**
	  * Metodo para criar uma ContaPrincipal nova
	 * @return
	 */
	public static ContaPrincipal novoContaPrincipal1(){
		ContaPrincipal contaPrincipal = new ContaPrincipal();
		contaPrincipal.setId(1L);
		return contaPrincipal;
	}
	
	/**
	  * Metodo para criar uma ContaPrincipal nova
	 * @return
	 */
	public static ContaPrincipal novoContaPrincipal2(){
		ContaPrincipal contaPrincipal = new ContaPrincipal();
		contaPrincipal.setId(1L);
		return contaPrincipal;
	}
	
	/**
	 * Metodo para criar uma ContaPrincipal nova
	 * @return
	 */
	public static ContaPrincipal novoContaPrincipal3(){
		ContaPrincipal contaPrincipal = new ContaPrincipal();
		contaPrincipal.setId(1L);
		return contaPrincipal;
	}


}
