package br.pic.controller;

import javax.inject.Inject;
import javax.mail.MessagingException;
import javax.transaction.Transactional;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.pic.dao.SocioDao;
import br.pic.email.PicEmailConfig;
import br.pic.exception.PicException;
import br.pic.model.Participante;
import br.pic.model.Socio;
import br.pic.model.data.ParticipanteData;
import br.pic.populate.ParticipantePopulate;
import br.pic.populate.PropostaPopulate;
import br.pic.populate.SocioPopulate;
import br.pic.service.ParticipanteService;
import br.pic.service.PropostaService;

@RestController
@Transactional(rollbackOn=Throwable.class)
public class ParticipanteController {

	@Inject
	private ParticipanteService participanteService;
	
	@Inject
	private SocioDao socioDao;
	
	@Inject
	private PropostaService propostaService;
	
	@Inject
	private PropostaPopulate propostaPopulate;

	@Inject
	private SocioPopulate socioPopulate;
	
	@Inject
	private ParticipantePopulate participantePopulate;
	
	@Inject
	private PicEmailConfig emailConfig;
	
	
	@RequestMapping(value="/novaproposta", method=RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<HttpStatus> save(@RequestBody ParticipanteData participanteData) {
//solução temporária até que o sócio seja carregado na sessão.
		Socio socio = new Socio();
		socio = socioDao.pesquisarPorId(participanteData.getSocioData().getId());
		participanteData.setSocioData(socioPopulate.toData(socio));
		participanteData.getPropostaData().setTipoProposta(1);
		participanteData.getSocioData().setId(socio.getId());
		
		try {
			
			Participante participante = participantePopulate.toModel(participanteData);
			propostaService.salvar(participante.getProposta());
			participanteService.salvar(participante);	
			emailConfig.EnviarEmail(participanteData.getSocioData());
			
		} catch (PicException e) {
            HttpHeaders headers = new HttpHeaders();
            headers.add("Erro", e.getLocalizedMessage());
            ResponseEntity<HttpStatus> response = new ResponseEntity<HttpStatus>(headers, HttpStatus.BAD_REQUEST);
            return response;
		} catch (MessagingException e) {
            HttpHeaders headers = new HttpHeaders();
            headers.add("Erro", e.getLocalizedMessage());
            ResponseEntity<HttpStatus> response = new ResponseEntity<HttpStatus>(headers, HttpStatus.BAD_REQUEST);
            return response;
		}
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);		

	}

	
}
