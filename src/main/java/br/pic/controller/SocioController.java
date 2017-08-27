package br.pic.controller;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.pic.dao.SocioDao;

@RestController
@Transactional(rollbackOn=Throwable.class)
@RequestMapping(value="Socio")
public class SocioController {

	@Inject
	private SocioDao socioDao;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<HttpStatus> save() {
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
}
