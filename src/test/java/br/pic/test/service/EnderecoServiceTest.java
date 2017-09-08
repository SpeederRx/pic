package br.pic.test.service;

import javax.inject.Inject;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.pic.PicApp;
import br.pic.exception.PicException;
import br.pic.service.EnderecoService;
import br.pic.test.model.EnderecoModelTest;

@Configuration
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=PicApp.class)
public class EnderecoServiceTest extends EnderecoModelTest{
	
	@Inject
	private EnderecoService enderecoService;
	
	@Before
	public void criarEndereco(){
		endereco = novoEndereco1();
	}
	
	@Test(expected = PicException.class)
	public void validarEnderecoNulo() throws PicException{
		endereco = null;
		enderecoService.salvar(endereco);
	}
	
	@Test(expected = PicException.class)
	public void validarNumeroNulo() throws PicException{
		endereco.setNumero(null);
		enderecoService.salvar(endereco);
	}
	
	@Test(expected = PicException.class)
	public void validarRuaNula() throws PicException{
		endereco.setRua(null);
		enderecoService.salvar(endereco);
	}
	
	@Test(expected = PicException.class)
	public void validarBairroNulo() throws PicException{
		endereco.setBairro(null);
		enderecoService.salvar(endereco);
	}
	
	@Test(expected = PicException.class)
	public void validarCidadeNulo() throws PicException{
		endereco.setCidade(null);
		enderecoService.salvar(endereco);
	}
	
	@Test(expected = PicException.class)
	public void validarEstadoNulo() throws PicException{
		endereco.setEstado(null);
		enderecoService.salvar(endereco);
	}
	
	@Test(expected = PicException.class)
	public void validarPaisNulo() throws PicException{
		endereco.setPais(null);
		enderecoService.salvar(endereco);
	}
	
	@Test(expected = PicException.class)
	public void validarCepNulo() throws PicException{
		endereco.setCep(null);
		enderecoService.salvar(endereco);
	}
	
}
