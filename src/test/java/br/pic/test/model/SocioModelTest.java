package br.pic.test.model;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import br.pic.model.Socio;

public class SocioModelTest {
	
	protected Socio socio; 
	
	@Test
	public void criarSocioCompleto(){
		//Cria um novo socio
		socio = novoSocio1();
		//Verifica se o socio nao eh nulo
		Assert.assertNotNull(socio);
		
		//Cria um novo socio
		socio = novoSocio2();
		//Verifica se o socio nao eh nulo
		Assert.assertNotNull(socio);
		
		//Cria um novo socio
		socio = novoSocio3();
		//Verifica se o socio nao eh nulo
		Assert.assertNotNull(socio);
	}
	
	/**
	 * Metodo para criar um novo Socio
	 * @return
	 */
	
	public static Socio novoSocio1(){
		Socio socio = new Socio();
		socio.setId(1L);
		socio.setNome("Maria Joao");
		socio.setCpf("01234567890");
		socio.setDataNasc(new Date());
		socio.setEmail("123@123.com");
		socio.setTelefone("963258741");
		socio.setContaMovimento("123asd456");
		socio.setSenha("789qwe");
		socio.setClassificacao(0.5d);
		socio.setTipoEnvio(1);
		socio.setEndereco(EnderecoModelTest.novoEndereco1());
		return socio;
	}
	
	/**
	 * Metodo para criar no novo endereco
	 * @return
	 */
	public static Socio novoSocio2(){
		Socio socio = new Socio();
		socio.setId(1L);
		socio.setNome("Joao Maria");
		socio.setCpf("12345678900");
		socio.setDataNasc(new Date());
		socio.setEmail("789@789.com");
		socio.setTelefone("456789123");
		socio.setContaMovimento("789zxc123");
		socio.setSenha("456asd");
		socio.setClassificacao(0.8d);
		socio.setTipoEnvio(2);
		socio.setEndereco(EnderecoModelTest.novoEndereco2());
		return socio;
	}
	
	/**
	 * Metodo para criar no novo endereco
	 * @return
	 */
	public static Socio novoSocio3(){
		Socio socio = new Socio();
		socio.setId(1L);
		socio.setNome("Maria Maria");
		socio.setCpf("09876543210");
		socio.setDataNasc(new Date());
		socio.setEmail("456@456.com");
		socio.setTelefone("147258369");
		socio.setContaMovimento("456qwe789");
		socio.setSenha("123zxc");
		socio.setClassificacao(0.7d);
		socio.setTipoEnvio(1);
		socio.setEndereco(EnderecoModelTest.novoEndereco3());
		return socio;
	}


}
