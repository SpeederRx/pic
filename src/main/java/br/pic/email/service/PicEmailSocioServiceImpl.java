package br.pic.email.service;

import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import br.pic.model.Socio;

@Configuration
public class PicEmailSocioServiceImpl implements PicEmailSocioService{

	@Override
	public void enviarEmailCadastroSocio(Socio socio) throws MessagingException {

		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
		mailSender.setHost("smtp.gmail.com");
	    mailSender.setPort(587);
	    mailSender.setPassword("gitpull10");
	    mailSender.setUsername("picdonotreply");
	    
	    Properties properties = new Properties();
	    properties.put("mail.smtp.starttls.enable", "true");
	    properties.put("mail.smtp.starttls.required", "true");
	    properties.put("mail.smtp.auth", "true");
	    properties.put("mail.smtp.passsword", "gitpull10");
	    properties.put("password", "gitpull10");
	    properties.put("mail.smtp.host", "smtp.gmail.com");

	    mailSender.setJavaMailProperties(properties);
		
		MimeMessage message = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message);
		helper.setTo(socio.getEmail());
		helper.setFrom("picdonotreply@gmail.com");
		helper.setText(socio.getNome() + "  Seja bem vindo ao PIC");
		helper.setSubject("Bem Vindo ao PIC");

		mailSender.send(message);
		
			
	}
	
	
}
