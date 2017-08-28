package br.pic.controller;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.pic.exception.PicException;
import br.pic.model.data.SocioData;
import br.pic.populate.SocioPopulate;
import br.pic.service.SocioService;

@RestController
@Transactional(rollbackOn=Throwable.class)
@RequestMapping(value="Socio")
public class SocioController {

	@Inject
	private SocioService socioService;
	
	@Inject
	private SocioPopulate socioPopulate;
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<HttpStatus> save(@RequestBody SocioData socioData) {
		
		try {
			socioService.salvar(socioPopulate.toModel(socioData));
		} catch (PicException e) {
            HttpHeaders headers = new HttpHeaders();
            headers.add("Erro", e.getLocalizedMessage());
            ResponseEntity<HttpStatus> response = new ResponseEntity<HttpStatus>(headers, HttpStatus.BAD_REQUEST);
            return response;
		}
		
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
}