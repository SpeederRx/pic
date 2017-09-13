package br.pic.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.pic.dao.PropostaDao;
import br.pic.exception.PicException;
import br.pic.model.Proposta;
import br.pic.model.data.PropostaData;
import br.pic.populate.PropostaPopulate;
import br.pic.service.PropostaService;

@RestController
@Transactional(rollbackOn=Throwable.class)
@RequestMapping(value="proposta")
public class PropostaController {

	@Inject
	private PropostaService propostaService;
	
	@Inject
	private PropostaPopulate propostaPopulate;
	
	@Inject PropostaDao propostaDao;
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<HttpStatus> save(@RequestBody PropostaData propostaData) {
		
		try {
			propostaService.salvar(propostaPopulate.toModel(propostaData));	
		} catch (PicException e) {
            HttpHeaders headers = new HttpHeaders();
            headers.add("Erro", e.getLocalizedMessage());
            ResponseEntity<HttpStatus> response = new ResponseEntity<HttpStatus>(headers, HttpStatus.BAD_REQUEST);
            return response;
		}
		
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<PropostaData>> propostas(){
		
	
		try {
			List<Proposta> propostas = propostaDao.pesquisarTodos();
			
			List<PropostaData> propostasData = new ArrayList<PropostaData>();
			
			for(Proposta proposta: propostas){
				propostasData.add(propostaPopulate.toData(proposta));
				
			}
			return new ResponseEntity<List<PropostaData>>(propostasData, HttpStatus.OK);
		} catch (IllegalArgumentException | SecurityException e) {
			e.printStackTrace();
		}
		return null;
	}
}

