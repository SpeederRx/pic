package br.pic.populate;

import javax.inject.Inject;

import org.springframework.context.annotation.Configuration;

import br.pic.model.SocioAtivo;
import br.pic.model.data.SocioAtivoData;

@Configuration
public class SocioAtivoPopulate implements PicPopulate<SocioAtivo, SocioAtivoData> {

	@Inject
	private SocioPopulate socioPopulate;
	
	@Inject
	private AtivoPopulate ativoPopulate;
	
	@Override
	public SocioAtivo toModel(SocioAtivoData data) {
		
		
		if(data == null) {
			throw new IllegalArgumentException("SocioAtivo nao pode ser nulo.");
		}
		SocioAtivo socioAtivo = new SocioAtivo();
		
		socioAtivo.setCotas(data.getCotas());
		socioAtivo.setSocio(socioPopulate.toModel(data.getSocioData()));
		socioAtivo.setAtivo(ativoPopulate.toModel(data.getAtivoData()));
		
		return socioAtivo;
	}

	@Override
	public SocioAtivoData toData(SocioAtivo model) {

		
		if(model == null){
			throw new IllegalArgumentException("SocioAtivo nao pode ser nulo.");
		}
		
		SocioAtivoData socioAtivoData = new SocioAtivoData();
		
		socioAtivoData.setId(model.getId());
		socioAtivoData.setCotas(model.getCotas());
		socioAtivoData.setSocioData(socioPopulate.toData(model.getSocio()));
		socioAtivoData.setAtivoData(ativoPopulate.toData(model.getAtivo()));
		
		return socioAtivoData;
	}

}
