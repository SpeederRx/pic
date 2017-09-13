package br.pic.email;

import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

public class PicEmailConfig {

	public static void main(String[] args) throws MessagingException {
		new PicEmailConfig();
	}
	
	public PicEmailConfig() throws MessagingException {
		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
		mailSender.setHost("smtp.gmail.com");
	    mailSender.setPort(587);
	    mailSender.setPassword("gitpull10");
	    mailSender.setUsername("contato.pic");
	    
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
		helper.setTo("rodrigobsilva@live.com");
		helper.setFrom("contato.pic@outlook.com");
		helper.setText("Thank you for ordering!");

		mailSender.send(message);
		
	}
}
