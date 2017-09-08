package br.pic.service;

import javax.inject.Inject;

import org.springframework.context.annotation.Configuration;

import br.pic.dao.LancamentoDao;
import br.pic.exception.PicException;
import br.pic.model.Lancamento;
import br.pic.util.StringUtils;

@Configuration
public class LancamentoService implements PicService<Lancamento>{
	
	@Inject
	private LancamentoDao lancamentoDao;
	
	@Inject
	private AtivoService ativoService;
	
	@Inject
	private ContaPrincipalService contaPrincipalService;
	
	@Inject
	private OperadorService operadorService;
	
	@Inject
	private PropostaService propostaService;
	

	@Override
	public void validar(Lancamento obj) throws PicException {
		
		if(obj == null) {
			throw new PicException("Objeto nao pode ser nulo.");
		} if(obj.getValorTotalLanc() == null){
			throw new PicException("Valor Total do lancamento nao pode ser nulo.");
		} if(StringUtils.isNullOrBlank(obj.getDescricao())){
			throw new PicException("Descricao nao pode ser nula");
		} if(obj.getQtdeLancada() == null) {
			throw new PicException("Quantidade Lancada nao pode ser nula.");
		} if(obj.getTipoLancamento() == null) {
			throw new PicException("Tipo do Lancamento nao pode ser nulo.");
		} if(obj.getEstadoLancamento() == null) {
			throw new PicException("Estado do Lancamento nao pode ser nulo.");
		}
		contaPrincipalService.validar(obj.getContaPrincipal());
		ativoService.validar(obj.getAtivo());
		propostaService.validar(obj.getProposta());
		operadorService.validar(obj.getOperador());
		
	}

	@Override
	public void salvar(Lancamento obj) throws PicException {
		validar(obj);
		lancamentoDao.salvar(obj);
	}
	
}
