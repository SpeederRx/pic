package br.pic.service;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import javax.inject.Inject;

import org.springframework.context.annotation.Configuration;

import br.pic.dao.PropostaDao;
import br.pic.exception.PicException;
import br.pic.model.Proposta;
import br.pic.util.StringUtils;

@Configuration
public class PropostaService implements PicService<Proposta>{
	
	@Inject
	private AtivoService ativoService;
	
	@Inject
	private PropostaDao propostaDao;

	@Override
	public void validar(Proposta obj) throws PicException {
		
		if(obj == null) {
			throw new IllegalArgumentException("Objeto nao pode ser nulo.");
		} if(StringUtils.isNullOrBlank(obj.getNome())){
			throw new PicException("Nome nao pode ser nulo.");
		}if(obj.getTipoProposta() == null){
			throw new PicException("Tipo de Proposta nao pode ser nulo.");
		} if(obj.getDataInicio() == null){
			throw new PicException("Data de Inicio nao pode ser nula.");
		} if(obj.getDataFim() == null) {
			throw new PicException("Data de Fim nao pode ser nula.");
		} if(obj.getMinCotas() == null){
			throw new PicException("Minimo de Cotas nao pode ser nulo.");
		} if(obj.getMaxCotas() == null){
			throw new PicException("Maximo de Cotas nao pode ser nulo.");
		} if(obj.getEstadoProposta() == null){
			throw new PicException("Estado da Proposta nao pode ser nulo.");
		} if(StringUtils.isNullOrBlank(obj.getDescricao())){
			throw new PicException("Descricao nao pode ser nula.");
		} if(obj.getPercentLucro() == null){
			throw new PicException("Percentual de Lucro nao pode ser nulo.");
		} if(obj.getValorCorrenteAtivo() == null){
			throw new PicException("Valor Corrente do Ativo nao pode ser nulo.");
		}
		ativoService.validar(obj.getAtivo());
		
	}

	@Override
	public void salvar(Proposta obj) throws PicException {
		validar(obj);
		propostaDao.salvar(obj);
	
		
	}

	@Override
	public void atualizar(Proposta obj) throws PicException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Proposta> pesquisarPorAtributo(Proposta obj) throws PicException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, SecurityException {
		// TODO Auto-generated method stub
		return null;
	}

}
