package br.inatel.inatelpg_dm112oo.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Fatura implements Serializable {

	private static final long serialVersionUID = 9072651029977459293L;

	@Id
	private Long idFatura;

	@ManyToOne
	@JoinColumn(name = "idPedido", nullable = false)
	private Pedido pedido;

	@Column(nullable = false)
	private String nmDevedor;

	@Column(nullable = false, length = 18)
	private String cpfCnpjDevedor;

	@Column(nullable = false, length = 8)
	private String cepDevedor;

	@Column(nullable = false, length = 2)
	private String ufDevedor;

	@Column(nullable = false)
	private String nmMunicipioDevedor;

	@Column(nullable = false)
	private String nmBairroDevedor;

	@Column(nullable = false)
	private String nmLogradouroDevedor;

	@Column(nullable = false, length = 36)
	private String numResidenciaDevedor;

	@Column(nullable = false)
	private String nossoNumero;

	@Column(nullable = false)
	private LocalDateTime dtEmissaoFatura;

	@Column(nullable = false)
	private LocalDateTime dtVencimentoFatura;

	@Column(nullable = false, precision = 12, scale = 2)
	private BigDecimal valorFatura;

	@Column(nullable = false, length = 1)
	private String situacao;

	public Long getIdFatura() {
		return idFatura;
	}

	public void setIdFatura(Long idFatura) {
		this.idFatura = idFatura;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public String getNmDevedor() {
		return nmDevedor;
	}

	public void setNmDevedor(String nmDevedor) {
		this.nmDevedor = nmDevedor;
	}

	public String getCpfCnpjDevedor() {
		return cpfCnpjDevedor;
	}

	public void setCpfCnpjDevedor(String cpfCnpjDevedor) {
		this.cpfCnpjDevedor = cpfCnpjDevedor;
	}

	public String getCepDevedor() {
		return cepDevedor;
	}

	public void setCepDevedor(String cepDevedor) {
		this.cepDevedor = cepDevedor;
	}

	public String getUfDevedor() {
		return ufDevedor;
	}

	public void setUfDevedor(String ufDevedor) {
		this.ufDevedor = ufDevedor;
	}

	public String getNmMunicipioDevedor() {
		return nmMunicipioDevedor;
	}

	public void setNmMunicipioDevedor(String nmMunicipioDevedor) {
		this.nmMunicipioDevedor = nmMunicipioDevedor;
	}

	public String getNmBairroDevedor() {
		return nmBairroDevedor;
	}

	public void setNmBairroDevedor(String nmBairroDevedor) {
		this.nmBairroDevedor = nmBairroDevedor;
	}

	public String getNmLogradouroDevedor() {
		return nmLogradouroDevedor;
	}

	public void setNmLogradouroDevedor(String nmLogradouroDevedor) {
		this.nmLogradouroDevedor = nmLogradouroDevedor;
	}

	public String getNumResidenciaDevedor() {
		return numResidenciaDevedor;
	}

	public void setNumResidenciaDevedor(String numResidenciaDevedor) {
		this.numResidenciaDevedor = numResidenciaDevedor;
	}

	public String getNossoNumero() {
		return nossoNumero;
	}

	public void setNossoNumero(String nossoNumero) {
		this.nossoNumero = nossoNumero;
	}

	public LocalDateTime getDtEmissaoFatura() {
		return dtEmissaoFatura;
	}

	public void setDtEmissaoFatura(LocalDateTime dtEmissaoFatura) {
		this.dtEmissaoFatura = dtEmissaoFatura;
	}

	public LocalDateTime getDtVencimentoFatura() {
		return dtVencimentoFatura;
	}

	public void setDtVencimentoFatura(LocalDateTime dtVencimentoFatura) {
		this.dtVencimentoFatura = dtVencimentoFatura;
	}

	public BigDecimal getValorFatura() {
		return valorFatura;
	}

	public void setValorFatura(BigDecimal valorFatura) {
		this.valorFatura = valorFatura;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
}
