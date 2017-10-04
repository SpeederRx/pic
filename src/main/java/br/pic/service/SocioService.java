package br.pic.service;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import javax.inject.Inject;
import javax.mail.MessagingException;
import javax.transaction.Transactional;

import org.springframework.context.annotation.Configuration;

import br.pic.dao.SocioDao;
import br.pic.dao.SocioDaoImp;
import br.pic.email.service.PicEmailSocioService;
import br.pic.exception.PicException;
import br.pic.model.Socio;
import br.pic.util.StringUtils;

@Configuration
@Transactional(rollbackOn=Throwable.class)
public class SocioService implements PicService<Socio>{

	@Inject
	private SocioDaoImp socioDao;
	
	@Inject
	private EnderecoService enderecoService;
	
	@Inject
	private PicEmailSocioService picEmailSocioService;
	
	@Inject
	private ContaPrincipalService contaPrincipalService;
	
	@Override
	public void validar(Socio obj) throws PicException {
		
		if(obj == null) {
			throw new PicException("Objeto nao pode ser nulo.");
		} if(StringUtils.isNullOrBlank(obj.getNome())){
			throw new PicException("Nome nao pode ser nulo.");
		} if(StringUtils.isNullOrBlank(obj.getCpf())){
			throw new PicException("CPF nao pode ser nulo.");
		} if(StringUtils.isNullOrBlank(obj.getEmail())) {
			throw new PicException("E-mail nao pode ser nulo.");
		} if(StringUtils.isNullOrBlank(obj.getTelefone())){
			throw new PicException("Telefone nao pode ser nulo.");
		} if(StringUtils.isNullOrBlank(obj.getContaMovimento())){
			throw new PicException("Conta de Movimento nao pode ser nulo.");
		} if(StringUtils.isNullOrBlank(obj.getSenha())){
			throw new PicException("Senha nao pode ser nula.");
		} if(obj.getDataNasc() == null){
			throw new PicException("Data de Nascimento nao pode ser nula.");
		} if(obj.getTipoEnvio() == null){
			throw new PicException("Tipo do Envio nao pode ser nulo.");
		} if(obj.getClassificacao() == null){
			throw new PicException("Classificacao nao pode ser nula.");
		} 
		enderecoService.validar(obj.getEndereco());
	}
	
	@Override
	public void salvar(Socio obj) throws PicException {
		try {
			Socio filtro = new Socio();
			filtro.setCpf(obj.getCpf());
			List<Socio> socios = pesquisarPorAtributo(filtro);
			if(socios != null && !socios.isEmpty()){
				throw new PicException("Já existe um sócio com este CPF cadastrado.");
			}
			
			validar(obj);
			socioDao.salvar(obj);
			
			contaPrincipalService.criarNovaContaPrincipal(obj);
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new PicException("Erro ao cadastrar novo sócio.");
		}
		
		try {
			picEmailSocioService.enviarEmailCadastroSocio(obj);
		} catch (MessagingException e) {
			e.printStackTrace();
			throw new PicException("Erro ao enviar e-mail de cadastro.");
		}
		
	}
	
	
	public void atualizar(Socio obj) throws PicException {
		validar(obj);
		socioDao.atualizar(obj);
	}
	
	@Override
	public List<Socio> pesquisarPorAtributo(Socio obj) throws PicException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, SecurityException {
		return socioDao.pesquisarPorAtributo(obj);
	}
	
}
