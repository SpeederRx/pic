package br.pic.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.pic.dao.SocioAtivoDao;
import br.pic.model.SocioAtivo;
import br.pic.model.data.SocioAtivoData;
import br.pic.populate.SocioAtivoPopulate;

@RestController
@Transactional(rollbackOn=Throwable.class)
//@RequestMapping(value="/socioativo")
public class SocioAtivoController {
	
	@Inject
	private SocioAtivoPopulate socioAtivoPopulate;
	
	@Inject
	SocioAtivoDao socioAtivoDao;
	
	@RequestMapping(value="/socioativo", method=RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<SocioAtivoData>> obterAtivos(@RequestBody Long socioId) {
		
		List<SocioAtivoData> socioAtivosData = new ArrayList<SocioAtivoData>();
		
		try {
			List<SocioAtivo> socioAtivos= socioAtivoDao.pesquisarTodos();
						
			for (SocioAtivo socioAtivo : socioAtivos) {
				if(socioAtivo.getSocio().getId() == socioId && socioAtivo.getAtivo().getTipoAtivo()!= 1) {
					socioAtivosData.add(socioAtivoPopulate.toData(socioAtivo));
				}
				
			}
						
		} catch (IllegalArgumentException | SecurityException e) {
			e.printStackTrace();
			return new ResponseEntity<List<SocioAtivoData>>(socioAtivosData, HttpStatus.BAD_REQUEST);
		}
		
		return new ResponseEntity<List<SocioAtivoData>>(socioAtivosData, HttpStatus.OK);
	}
	
	@RequestMapping(value="/socioativomoeda", method=RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<SocioAtivoData>> obterAtivosMoeda(@RequestBody Long socioId) {
		
		List<SocioAtivoData> socioAtivosData = new ArrayList<SocioAtivoData>();
		
		try {
			List<SocioAtivo> socioAtivos= socioAtivoDao.pesquisarTodos();
						
			for (SocioAtivo socioAtivo : socioAtivos) {
				if(socioAtivo.getSocio().getId() == socioId && socioAtivo.getAtivo().getTipoAtivo()== 1) {
					socioAtivosData.add(socioAtivoPopulate.toData(socioAtivo));
				}
				
			}
						
		} catch (IllegalArgumentException | SecurityException e) {
			e.printStackTrace();
			return new ResponseEntity<List<SocioAtivoData>>(socioAtivosData, HttpStatus.BAD_REQUEST);
		}
		
		return new ResponseEntity<List<SocioAtivoData>>(socioAtivosData, HttpStatus.OK);
	}

}
