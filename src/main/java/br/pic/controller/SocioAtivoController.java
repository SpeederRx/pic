package br.pic.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.pic.dao.SocioAtivoDao;
import br.pic.model.data.SocioAtivoData;
import br.pic.populate.SocioAtivoPopulate;

public class SocioAtivoController {
	
	@Inject
	private SocioAtivoPopulate socioAtivoPopulate;
	
	@Inject
	SocioAtivoDao socioAtivoDao;
	
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<SocioAtivoData>> socioAtivo(){
		
//	
//		try {
//			List<SocioAtivo> socioAtivos = socioAtivoDao.pesquisarPorAtributo(socioAtivo);
//			
//			List<SocioAtivoData> socioAtivosData = new ArrayList<SocioAtivoData>();
//			
//			for(SocioAtivo socioAtivo: socioAtivos){
//				socioAtivosData.add(socioAtivoPopulate.toData(socioAtivo));
//				
//			}
//			return new ResponseEntity<List<SocioAtivoData>>(socioAtivosData, HttpStatus.OK);
//		} catch (IllegalArgumentException | SecurityException e) {
//			e.printStackTrace();
//		}
		return null;
	}

}
