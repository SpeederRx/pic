package br.pic.populate;

import org.springframework.context.annotation.Configuration;

import br.pic.commun.TipoAtivo;
import br.pic.model.Ativo;
import br.pic.model.data.AtivoData;

@Configuration
public class AtivoPopulate implements PicPopulate<Ativo, AtivoData> {

	@Override
	public Ativo toModel(AtivoData data) {

		
		if(data == null) {
			throw new IllegalArgumentException("Ativo nao pode ser nulo.");
		}
		Ativo ativo = new Ativo();
		
		ativo.setDescricao(data.getDescricao());
		ativo.setTipoAtivo(data.getTipoAtivo());
		
		return ativo;
	}

	@Override
	public AtivoData toData(Ativo model) {
		
		if(model == null){
			throw new IllegalArgumentException("Ativo nao pode ser nulo.");
		}
		
		AtivoData ativoData = new AtivoData();
		
		ativoData.setId(model.getId());
		ativoData.setDescricao(model.getDescricao());
		ativoData.setTipoAtivo(model.getTipoAtivo());
		
		TipoAtivo tipoAtivo = TipoAtivo.getPorCodigo(model.getTipoAtivo());
		if(tipoAtivo != null) {
			ativoData.setTipoAtivoString(tipoAtivo.getDescricao());
			
		}
		
		return ativoData;
	}

}
