package br.pic.test.model;

import org.junit.Assert;
import org.junit.Test;

import br.pic.model.SocioAtivo;

public class SocioAtivoModelTest {

	protected SocioAtivo socioAtivo; 
	
	@Test
	public void criarSocioAtivoCompleto(){
		//Cria um novo SocioAtivo
		socioAtivo = novoSocioAtivo1();
		//Verifica se o SocioAtivo nao eh nulo
		Assert.assertNotNull(socioAtivo);
		
		//Cria um novo SocioAtivo
		socioAtivo = novoSocioAtivo2();
		//Verifica se o SocioAtivo nao eh nulo
		Assert.assertNotNull(socioAtivo);
		
		//Cria um novo SocioAtivo
		socioAtivo = novoSocioAtivo3();
		//Verifica se o SocioAtivo nao eh nulo
		Assert.assertNotNull(socioAtivo);
	}
	
	/**
	  * Metodo para criar um SocioAtivo novo
	 * @return
	 */
	public static SocioAtivo novoSocioAtivo1(){
		SocioAtivo socioAtivo = new SocioAtivo();
		socioAtivo.setId(1L);
		return socioAtivo;
	}
	
	/**
	  * Metodo para criar um SocioAtivo novo
	 * @return
	 */
	public static SocioAtivo novoSocioAtivo2(){
		SocioAtivo socioAtivo = new SocioAtivo();
		socioAtivo.setId(1L);
		return socioAtivo;
	}
	
	/**
	 * Metodo para criar um SocioAtivo novo
	 * @return
	 */
	public static SocioAtivo novoSocioAtivo3(){
		SocioAtivo socioAtivo = new SocioAtivo();
		socioAtivo.setId(1L);
		return socioAtivo;
	}
	
}
