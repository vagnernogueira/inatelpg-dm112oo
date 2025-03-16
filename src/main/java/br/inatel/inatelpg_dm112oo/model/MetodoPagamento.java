package br.inatel.inatelpg_dm112oo.model;

import java.io.Serializable;
import java.math.BigDecimal;

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
@DiscriminatorColumn(name = "tipoMetodoPagamento", discriminatorType = DiscriminatorType.STRING, length = 1)
public class MetodoPagamento implements Serializable {

	private static final long serialVersionUID = -820011814820278166L;

	@Id
	private Long idMetodoPagamento;

	@ManyToOne
	@JoinColumn(name = "idFatura", nullable = false)
	private Fatura fatura;

	// Mapeamento omitido
	// @Column(nullable = false, length = 1)
	// private String tipoMetodoPagamento;

	@Column(nullable = false, precision = 12, scale = 2)
	private BigDecimal valorDevidorPorMetodoPagamento;

	public Long getIdMetodoPagamento() {
		return idMetodoPagamento;
	}

	public void setIdMetodoPagamento(Long idMetodoPagamento) {
		this.idMetodoPagamento = idMetodoPagamento;
	}

	public Fatura getFatura() {
		return fatura;
	}

	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}

	public BigDecimal getValorDevidorPorMetodoPagamento() {
		return valorDevidorPorMetodoPagamento;
	}

	public void setValorDevidorPorMetodoPagamento(BigDecimal valorDevidorPorMetodoPagamento) {
		this.valorDevidorPorMetodoPagamento = valorDevidorPorMetodoPagamento;
	}
}
