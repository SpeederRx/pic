package br.pic.email.service;

import javax.mail.MessagingException;

import br.pic.model.Socio;

public interface PicEmailSocioService {
	
	public void enviarEmailCadastroSocio(Socio socio) throws MessagingException;

}
