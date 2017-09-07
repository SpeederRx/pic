package br.pic.service;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import br.pic.dao.PropostaDao;
import br.pic.exception.PicException;
import br.pic.model.Proposta;
import br.pic.model.data.LancamentoData;
import br.pic.model.data.ParticipanteData;
import br.pic.util.StringUtils;

public class PropostaService implements PicService<Proposta>{
	
	@Inject
	private PropostaDao propostaDao;

	@Override
	public void validar(Proposta obj) throws PicException {
		
//		private Integer tipoProposta;
//		private Date dataInicio;
//		private Date dataFim;
//		private Double minCotas;
//		private Double maxCotas;
//		private Integer estadoProposta;
//		private List<LancamentoData> lancamentos;
//		private List<ParticipanteData> participantes;
//		private String descricao;
//		private Double percentLucro;
		
		if(obj == null) {
			throw new IllegalArgumentException("Objeto não pode ser nulo.");
		} 
//		if(StringUtils.isNullOrBlank(obj.getNome())){
//			throw new PicException("Nome deve ser preenchido corretamente.");
//		} if(StringUtils.isNullOrBlank(obj.getCpf())){
//			throw new PicException("CPF deve ser preenchido corretamente.");
//		} if(StringUtils.isNullOrBlank(obj.getEmail())) {
//			throw new PicException("E-mail deve ser preenchido corretamente.");
//		} if(StringUtils.isNullOrBlank(obj.getTelefone())){
//			throw new PicException("Telefone deve ser preenchido corretamente.");
//		} if(StringUtils.isNullOrBlank(obj.getContaMovimento())){
//			throw new PicException("Conta de Movimento deve ser preenchido corretamente.");
//		} if(StringUtils.isNullOrBlank(obj.getSenha())){
//			throw new PicException("Senha deve ser preenchido corretamente.");
//		} if(obj.getEndereco() == null){
//			throw new PicException("Endereco deve ser preenchido corretamente.");
//		}
		
	}

	@Override
	public void salvar(Proposta obj) throws PicException {
		validar(obj);
		propostaDao.salvar(obj);
	
		
	}

}
