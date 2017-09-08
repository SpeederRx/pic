package br.pic.test.model;

import org.junit.Assert;
import org.junit.Test;

import br.pic.model.Ativo;

public class AtivoModelTest {
	
	protected Ativo ativo; 
	
	@Test
	public void criarAtivoCompleto(){
		//Cria um novo ativo
		ativo = novoAtivo1();
		//Verifica se o ativo nao eh nulo
		Assert.assertNotNull(ativo);
		
		//Cria um novo ativo
		ativo = novoAtivo2();
		//Verifica se o ativo nao eh nulo
		Assert.assertNotNull(ativo);
		
		//Cria um novo ativo
		ativo = novoAtivo3();
		//Verifica se o ativo nao eh nulo
		Assert.assertNotNull(ativo);
	}
	
	/**
	 * Metodo para criar um novo ativo
	 * @return
	 */
	public static Ativo novoAtivo1(){
		Ativo ativo = new Ativo();
		ativo.setId(1L);
		ativo.setDescricao("Moeda");
		ativo.setTipoAtivo(1);
		
		return ativo;
	}
	
	/**
	 * Metodo para criar um novo ativo
	 * @return
	 */
	public static Ativo novoAtivo2(){
		Ativo ativo = new Ativo();
		ativo.setId(1L);
		ativo.setDescricao("Titulo");
		ativo.setTipoAtivo(2);
		return ativo;
	}
	
	/**
	 * Metodo para criar um novo ativo
	 * @return
	 */
	public static Ativo novoAtivo3(){
		Ativo ativo = new Ativo();
		ativo.setId(1L);
		ativo.setDescricao("Acao");
		ativo.setTipoAtivo(3);
		return ativo;
	}


}
