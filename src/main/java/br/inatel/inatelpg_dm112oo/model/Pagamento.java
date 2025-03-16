package br.inatel.inatelpg_dm112oo.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tipoPagamento", discriminatorType = DiscriminatorType.STRING, length = 1)
public class Pagamento implements Serializable {

	private static final long serialVersionUID = -2111797999080112013L;

	@Id
	private Long idPagamento;

	@ManyToOne
	@JoinColumn(name = "idMetodoPagamento", nullable = false)
	private MetodoPagamento metodoPagamento;

	// Mapeamento omitido
	// @Column(nullable = false, length = 1)
	// private String tipoPagamento;

	@Column(nullable = false)
	private LocalDateTime dtPagamento;

	@Column(nullable = false)
	private LocalDateTime dtRegistroPagamento;

	@Column(nullable = false, precision = 12, scale = 2)
	private BigDecimal valorPago;

	public Long getIdPagamento() {
		return idPagamento;
	}

	public void setIdPagamento(Long idPagamento) {
		this.idPagamento = idPagamento;
	}

	public MetodoPagamento getMetodoPagamento() {
		return metodoPagamento;
	}

	public void setMetodoPagamento(MetodoPagamento metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}

	public LocalDateTime getDtPagamento() {
		return dtPagamento;
	}

	public void setDtPagamento(LocalDateTime dtPagamento) {
		this.dtPagamento = dtPagamento;
	}

	public LocalDateTime getDtRegistroPagamento() {
		return dtRegistroPagamento;
	}

	public void setDtRegistroPagamento(LocalDateTime dtRegistroPagamento) {
		this.dtRegistroPagamento = dtRegistroPagamento;
	}

	public BigDecimal getValorPago() {
		return valorPago;
	}

	public void setValorPago(BigDecimal valorPago) {
		this.valorPago = valorPago;
	}
}
