package br.pic.service;

import java.util.Date;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.apache.commons.logging.impl.Log4JLogger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.pic.commun.TipoEnvio;
import br.pic.dao.SocioDao;
import br.pic.exception.PicException;
import br.pic.model.Endereco;
import br.pic.model.Socio;

@RestController
@Transactional(rollbackOn=Throwable.class)
@RequestMapping(value="Socio")
public class SocioService {

	@Inject
	private SocioDao socioDao;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<HttpStatus> teste() {
		Socio socio = new Socio();
		
		socio.setNome("Gabriel AquinoTeste");
		socio.setDataNasc(new Date());
		socio.setCpf("12345678901");
		socio.setSenha("teste");
		socio.setClassificacao(9d);
		socio.setContaMovimento("98989");
		socio.setTelefone("98989897");
		socio.setTipoEnvio(TipoEnvio.EMAIL.getCodigo());
		socio.setEmail("teste@teste.com");

		Endereco endereco = new Endereco();
		endereco.setBairro("Boqueirão");
		endereco.setCep("81750240");
		endereco.setCidade("Cidade da Sardola");
		endereco.setComplemento("Foda-se");
		endereco.setEstado("PR");
		endereco.setNumero(1439);
		endereco.setPais("Country");
		endereco.setRua("se essa rua se essa rua fosse minha");

		socio.setEndereco(endereco);

		try {
			socioDao.salvar(socio);
		} catch (PicException e) {
			e.printStackTrace();
		}
		
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
}
