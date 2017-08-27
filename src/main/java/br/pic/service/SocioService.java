package br.pic.service;

import org.springframework.context.annotation.Configuration;

import br.pic.model.Socio;

@Configuration
public class SocioService implements PicService<Socio>{

	@Override
	public void validar(Socio obj) {
		if(obj == null) {
			throw new IllegalArgumentException("Objeto não pode ser nulo.");
		}
	}
	
}
