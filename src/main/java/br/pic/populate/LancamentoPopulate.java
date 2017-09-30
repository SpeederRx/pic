package br.pic.populate;

import javax.inject.Inject;

import org.springframework.context.annotation.Configuration;

import br.pic.commun.EstadoLancamento;
import br.pic.model.Lancamento;
import br.pic.model.data.LancamentoData;

@Configuration
public class LancamentoPopulate implements PicPopulate<Lancamento, LancamentoData> {
	
	@Inject
	private PropostaPopulate propostaPopulate;
	
	@Inject
	private AtivoPopulate ativoPopulate;
	
	@Inject
	private ContaPrincipalPopulate contaPrincipalPopulate;
	
	@Inject
	private OperadorPopulate operadorPopulate;

	@Override
	public Lancamento toModel(LancamentoData data) {
		
		if(data == null) {
			throw new IllegalArgumentException("Lancamento nao pode ser nulo.");
		}
		Lancamento lancamento = new Lancamento();
		
		lancamento.setDescricao(data.getDescricao());
		lancamento.setQtdeLancada(data.getQtdeLancada());
		lancamento.setValorTotalLanc(data.getValorTotalLanc());
		lancamento.setTipoLancamento(data.getTipoLancamento());
		lancamento.setEstadoLancamento(data.getEstadoLancamento());
		lancamento.setAtivo(ativoPopulate.toModel(data.getAtivoData()));
		lancamento.setData(data.getData());
		lancamento.setContaPrincipal(contaPrincipalPopulate.toModel(data.getContaPrincipalData()));
		lancamento.setProposta(propostaPopulate.toModel(data.getPropostaData()));
		lancamento.setOperador(operadorPopulate.toModel(data.getOperador()));
		
		return lancamento;
	}

	@Override
	public LancamentoData toData(Lancamento model) {

		
		if(model == null) {
			throw new IllegalArgumentException("Lancamento pode ser nulo.");
		}
		LancamentoData lancamentoData = new LancamentoData();
		
		
		lancamentoData.setId(model.getId());
		lancamentoData.setAtivoData(ativoPopulate.toData(model.getAtivo()));
		lancamentoData.setContaPrincipalData(contaPrincipalPopulate.toData(model.getContaPrincipal()));
		lancamentoData.setDescricao(model.getDescricao());
		lancamentoData.setEstadoLancamento(model.getEstadoLancamento());
		lancamentoData.setOperador(operadorPopulate.toData(model.getOperador()));
		lancamentoData.setPropostaData(propostaPopulate.toData(model.getProposta()));
		lancamentoData.setQtdeLancada(model.getQtdeLancada());
		lancamentoData.setTipoLancamento(model.getTipoLancamento());
		lancamentoData.setValorTotalLanc(model.getValorTotalLanc());
		lancamentoData.setData(model.getData());
		
		EstadoLancamento estadoLancamento = EstadoLancamento.getPorCodigo(model.getEstadoLancamento());
		if(estadoLancamento != null) {
			lancamentoData.setEstadoLancamentoString(estadoLancamento.getDescricao());
			
		}

		return lancamentoData;
		
	}

}
