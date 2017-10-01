package br.pic.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.pic.model.data.LancamentoData;

@RestController
@Transactional(rollbackOn=Throwable.class)
@RequestMapping(value="lancamento")
public class LancamentoController {
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<HttpStatus> save(@RequestBody LancamentoData lancamentoData) {
		
		
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<LancamentoData>> lancamentos(){
		
	
		
		return null;
	}

}