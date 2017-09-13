package br.pic.controller;


import java.lang.reflect.InvocationTargetException;
import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.pic.dao.SocioDao;
import br.pic.model.Socio;
import br.pic.model.data.SocioData;
import br.pic.populate.SocioPopulate;

@RestController
@Transactional(rollbackOn=Throwable.class)
@RequestMapping(value="/login")
public class LoginController {

	@Inject
	private SocioDao socioDao;
	
	@Inject
	private SocioPopulate SocioPopulate;
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<SocioData> login(@RequestBody SocioData socioData){
		
		Socio socio = new Socio();
		socio.setEmail(socioData.getEmail());
		socio.setSenha(socioData.getSenha());
		
		try {
			List<Socio> socios = socioDao.pesquisarPorAtributo(socio);
			return new ResponseEntity<SocioData>(SocioPopulate.toData(socios.get(0)), HttpStatus.OK);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | SecurityException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
}
