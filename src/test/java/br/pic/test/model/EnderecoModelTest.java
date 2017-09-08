package br.pic.test.model;

import org.junit.Assert;
import org.junit.Test;

import br.pic.model.Endereco;

public class EnderecoModelTest {

		protected Endereco endereco; 
		
		@Test
		public void criarEnderecoCompleto(){
			//Cria um novo endereco
			endereco = novoEndereco1();
			//Verifica se o endereco nao eh nulo
			Assert.assertNotNull(endereco);
			
			//Cria um novo endereco
			endereco = novoEndereco2();
			//Verifica se o endereco nao eh nulo
			Assert.assertNotNull(endereco);
			
			//Cria um novo endereco
			endereco = novoEndereco3();
			//Verifica se o endereco nao eh nulo
			Assert.assertNotNull(endereco);
		}
		
		/**
		 * Metodo para criar um novo endereco
		 * @return
		 */
		public static Endereco novoEndereco1(){
			Endereco endereco = new Endereco();
			endereco.setId(1L);
			endereco.setBairro("Afonso Pena");
			endereco.setCidade("Sao Jose dos Pinhais");
			endereco.setComplemento("Casa 10");
			endereco.setEstado("PR");
			endereco.setNumero(200);
			endereco.setPais("Brasil");
			endereco.setRua("Afonso Pereira");
			endereco.setCep("80000-000");
			return endereco;
		}
		
		/**
		 * Metodo para criar no novo endereco
		 * @return
		 */
		public static Endereco novoEndereco2(){
			Endereco endereco = new Endereco();
			endereco.setId(1L);
			endereco.setBairro("Cabral");
			endereco.setCidade("Curitiba");
			endereco.setComplemento("Casa 10");
			endereco.setEstado("PR");
			endereco.setNumero(340);
			endereco.setPais("Brasil");
			endereco.setRua("Alberto Ferreira");
			endereco.setCep("80000-000");
			return endereco;
		}
		
		/**
		 * Metodo para criar no novo endereco
		 * @return
		 */
		public static Endereco novoEndereco3(){
			Endereco endereco = new Endereco();
			endereco.setId(1L);
			endereco.setBairro("Batel");
			endereco.setCidade("Curitiba");
			endereco.setComplemento("Casa 10");
			endereco.setEstado("PR");
			endereco.setNumero(345);
			endereco.setPais("Brasil");
			endereco.setRua("Rua do Batel");
			endereco.setCep("80000-000");
			return endereco;
		}

}
