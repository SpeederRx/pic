package br.pic.service;

import javax.transaction.Transactional;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Transactional(rollbackOn=Throwable.class)
@RequestMapping(value="Socio")
public class SocioService {

//	@Inject
//	private SocioDao socioDao;
//	
//	@RequestMapping(method=RequestMethod.GET)
//	public ResponseEntity<HttpStatus> teste() {
//		Socio socio = new Socio();
//		
//		socio.setNome("Gabriel AquinoTeste");
//		socio.setDataNasc(new Date());
//		socio.setCpf("12345678901");
//		socio.setSenha("teste");
//		socio.setClassificacao(9d);
//		socio.setContaMovimento("98989");
//		socio.setTelefone("98989897");
//		socio.setTipoEnvio(TipoEnvio.EMAIL.getCodigo());
//		socio.setEmail("teste@teste.com");
//
//		Endereco endereco = new Endereco();
//		endereco.setBairro("Boqueirão");
//		endereco.setCep("81750240");
//		endereco.setCidade("Cidade da Sardola");
//		endereco.setComplemento("Foda-se");
//		endereco.setEstado("PR");
//		endereco.setNumero(1439);
//		endereco.setPais("Country");
//		endereco.setRua("se essa rua se essa rua fosse minha");
//
//		socio.setEndereco(endereco);
//
//		try {
//			socioDao.salvar(socio);
//		} catch (PicException e) {
//			e.printStackTrace();
//		}
//		
//		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
//	}
}
