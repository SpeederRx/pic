package br.pic.test.model;

import org.junit.Assert;
import org.junit.Test;

import br.pic.model.Lancamento;

public class LancamentoModelTest {
	
	
	protected Lancamento lancamento; 
	
	@Test
	public void criarLancamentoCompleto(){
		//Cria um novo Lancamento
		lancamento = novoLancamento1();
		//Verifica se o Lancamento nao eh nulo
		Assert.assertNotNull(lancamento);
		
		//Cria um novo Lancamento
		lancamento = novoLancamento2();
		//Verifica se o Lancamento nao eh nulo
		Assert.assertNotNull(lancamento);
		
		//Cria um novo Lancamento
		lancamento = novoLancamento3();
		//Verifica se o Lancamento nao eh nulo
		Assert.assertNotNull(lancamento);
	}
	
	/**
	  * Metodo para criar um Lancamento novo
	 * @return
	 */
	public static Lancamento novoLancamento1(){
		Lancamento lancamento = new Lancamento();
		lancamento.setId(1L);
		return lancamento;
	}
	
	/**
	  * Metodo para criar um Lancamento novo
	 * @return
	 */
	public static Lancamento novoLancamento2(){
		Lancamento lancamento = new Lancamento();
		lancamento.setId(1L);
		return lancamento;
	}
	
	/**
	 * Metodo para criar um Lancamento novo
	 * @return
	 */
	public static Lancamento novoLancamento3(){
		Lancamento lancamento = new Lancamento();
		lancamento.setId(1L);
		return lancamento;
	}

}
