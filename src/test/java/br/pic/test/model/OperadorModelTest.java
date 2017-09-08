package br.pic.test.model;

import org.junit.Assert;
import org.junit.Test;

import br.pic.model.Operador;

public class OperadorModelTest {
	
	
	protected Operador operador; 
	
	@Test
	public void criarOperadorCompleto(){
		//Cria um novo Operador 
		operador = novoOperador1();
		//Verifica se o Operador nao eh nulo
		Assert.assertNotNull(operador);
		
		//Cria um novo Operador 
		operador = novoOperador2();
		//Verifica se o Operador nao eh nulo
		Assert.assertNotNull(operador);
		
		//Cria um novo Operador 
		operador = novoOperador3();
		//Verifica se o Operador nao eh nulo
		Assert.assertNotNull(operador);
	}
	
	/**
	  * Metodo para criar um Operador novo
	 * @return
	 */
	public static Operador novoOperador1(){
		Operador operador = new Operador();
		operador.setId(1L);
		return operador;
	}
	
	/**
	  * Metodo para criar um Operador novo
	 * @return
	 */
	public static Operador novoOperador2(){
		Operador operador = new Operador();
		operador.setId(1L);
		return operador;
	}
	
	/**
	 * Metodo para criar um Operador novo
	 * @return
	 */
	public static Operador novoOperador3(){
		Operador operador = new Operador();
		operador.setId(1L);
		return operador;
	}

}
