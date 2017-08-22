package pic.model;

import java.util.Date;
import java.util.List;

public class Proposta {
	
	private Integer id;
	private TipoProposta tipoProposta;
	private Date dtInicio;
	private Date dtFim;
	private Double minCotas;
	private Double maxCotas;
	private EstadoProposta status;
	private List<Lancamento> lancamentos;
	private List<Participante> participantes;
	private String descricao;
	private Double percentLucro;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public TipoProposta getTipoProposta() {
		return tipoProposta;
	}
	public void setTipoProposta(TipoProposta tipoProposta) {
		this.tipoProposta = tipoProposta;
	}
	public Date getDtInicio() {
		return dtInicio;
	}
	public void setDtInicio(Date dtInicio) {
		this.dtInicio = dtInicio;
	}
	public Date getDtFim() {
		return dtFim;
	}
	public void setDtFim(Date dtFim) {
		this.dtFim = dtFim;
	}
	public Double getMinCotas() {
		return minCotas;
	}
	public void setMinCotas(Double minCotas) {
		this.minCotas = minCotas;
	}
	public Double getMaxCotas() {
		return maxCotas;
	}
	public void setMaxCotas(Double maxCotas) {
		this.maxCotas = maxCotas;
	}
	public EstadoProposta getStatus() {
		return status;
	}
	public void setStatus(EstadoProposta status) {
		this.status = status;
	}
	public List<Lancamento> getLancamentos() {
		return lancamentos;
	}
	public void setLancamentos(List<Lancamento> lancamentos) {
		this.lancamentos = lancamentos;
	}
	public List<Participante> getParticipantes() {
		return participantes;
	}
	public void setParticipantes(List<Participante> participantes) {
		this.participantes = participantes;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getPercentLucro() {
		return percentLucro;
	}
	public void setPercentLucro(Double percentLucro) {
		this.percentLucro = percentLucro;
	}
	


}
