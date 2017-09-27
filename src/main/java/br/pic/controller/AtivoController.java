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
import org.springframework.web.bind.annotation.RestController;

import br.pic.dao.AtivoDao;
import br.pic.exception.PicException;
import br.pic.model.Ativo;
import br.pic.model.data.AtivoData;
import br.pic.populate.AtivoPopulate;
import br.pic.service.AtivoService;

@RestController
@Transactional(rollbackOn=Throwable.class)
@RequestMapping(value="/ativo")
public class AtivoController {
	
	@Inject
	private AtivoService ativoService;
	
	@Inject
	private AtivoDao ativoDao;
	
	@Inject
	private AtivoPopulate ativoPopulate;
	

	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<HttpStatus> save(@RequestBody AtivoData ativoData) {
		if(ativoData.getId() == null){
			try {
				ativoService.salvar(ativoPopulate.toModel(ativoData));	
			} catch (PicException e) {
	            HttpHeaders headers = new HttpHeaders();
	            headers.add("Erro", e.getLocalizedMessage());
	            ResponseEntity<HttpStatus> response = new ResponseEntity<HttpStatus>(headers, HttpStatus.BAD_REQUEST);
	            return response;
			}
			
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}
		else {
			try {			
				Ativo ativo = new Ativo();
				ativo = ativoDao.pesquisarPorId((Long) ativoData.getId());
				ativo = ativoPopulate.toModel(ativoData);
				ativo.setId(ativoData.getId());
				ativoService.atualizar(ativo);
			
			}
			catch (PicException e) {
	            HttpHeaders headers = new HttpHeaders();
	            headers.add("Erro", e.getLocalizedMessage());
	            ResponseEntity<HttpStatus> response = new ResponseEntity<HttpStatus>(headers, HttpStatus.BAD_REQUEST);
	            return response;
			}
			

			
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}
	}
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<AtivoData>> obterAtivos() {
		
		List<AtivoData> ativosData = new ArrayList<AtivoData>();
		
		try {
			List<Ativo> ativos= ativoDao.pesquisarTodos();
						
			for (Ativo ativo : ativos) {
				ativosData.add(ativoPopulate.toData(ativo));
			}
						
		} catch (IllegalArgumentException | SecurityException e) {
			e.printStackTrace();
			return new ResponseEntity<List<AtivoData>>(ativosData, HttpStatus.BAD_REQUEST);
		}
		
		return new ResponseEntity<List<AtivoData>>(ativosData, HttpStatus.OK);
	}
}
