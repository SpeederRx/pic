package br.pic.test.model;

import org.junit.Assert;
import org.junit.Test;

import br.pic.model.Participante;

public class ParticipanteModelTest {

	protected Participante participante; 
	
	@Test
	public void criarParticipanteCompleto(){
		//Cria um novo Participante 
		participante = novoParticipante1();
		//Verifica se o Participante nao eh nulo
		Assert.assertNotNull(participante);
		
		//Cria um novo Participante 
		participante = novoParticipante2();
		//Verifica se o Participante nao eh nulo
		Assert.assertNotNull(participante);
		
		//Cria um novo Participante 
		participante = novoParticipante3();
		//Verifica se o Participante nao eh nulo
		Assert.assertNotNull(participante);
	}
	
	/**
	  * Metodo para criar um Participante novo
	 * @return
	 */
	public static Participante novoParticipante1(){
		Participante participante = new Participante();
		participante.setId(1L);
		return participante;
	}
	
	/**
	  * Metodo para criar um Participante novo
	 * @return
	 */
	public static Participante novoParticipante2(){
		Participante participante = new Participante();
		participante.setId(1L);
		return participante;
	}
	
	/**
	 * Metodo para criar um Participante novo
	 * @return
	 */
	public static Participante novoParticipante3(){
		Participante participante = new Participante();
		participante.setId(1L);
		return participante;
	}
	
}
