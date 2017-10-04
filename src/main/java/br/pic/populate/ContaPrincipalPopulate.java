package br.pic.populate;

import javax.inject.Inject;

import org.springframework.context.annotation.Configuration;

import br.pic.commun.EstadoConta;
import br.pic.model.ContaPrincipal;
import br.pic.model.data.ContaPrincipalData;

@Configuration
public class ContaPrincipalPopulate implements PicPopulate<ContaPrincipal, ContaPrincipalData> {
	
	@Inject
	private SocioPopulate socioPopulate;

	@Override
	public ContaPrincipal toModel(ContaPrincipalData data) {

		if(data == null) {
			throw new IllegalArgumentException("Conta Principal nao pode ser nulo.");
		}
		ContaPrincipal contaPrincipal = new ContaPrincipal();
		
		contaPrincipal.setDataAbertura(data.getDataAbertura());
		contaPrincipal.setEstadoConta(data.getEstadoConta());
		contaPrincipal.setSaldoAtual(data.getSaldoAtual());
		contaPrincipal.setSocio(socioPopulate.toModel(data.getSocioData()));
		
		return contaPrincipal;
	}

	@Override
	public ContaPrincipalData toData(ContaPrincipal model) {
		
		if(model == null) {
			throw new IllegalArgumentException("Conta Principal nao pode ser nulo.");
		}
		ContaPrincipalData contaPrincipalData = new ContaPrincipalData();
		
		contaPrincipalData.setId(model.getId());
		contaPrincipalData.setDataAbertura(model.getDataAbertura());
		contaPrincipalData.setEstadoConta(model.getEstadoConta());
		contaPrincipalData.setSaldoAtual(model.getSaldoAtual());
		contaPrincipalData.setSocioData(socioPopulate.toData(model.getSocio()));
		
		EstadoConta estadoConta = EstadoConta.getPorCodigo(model.getEstadoConta());
		if(estadoConta != null) {
			contaPrincipalData.setEstadoContaString(estadoConta.getDescricao());
			
		}
		
		return contaPrincipalData;
	}

}
