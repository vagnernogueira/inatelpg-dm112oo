package br.inatel.inatelpg_dm112oo.model;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Pedido implements Serializable {

	private static final long serialVersionUID = 487127287581213779L;

	@Id
	private Long idPedido;

	@ManyToOne
	@JoinColumn(name = "idCliente", nullable = false)
	private Cliente cliente;

	@Column(nullable = false, precision = 12, scale = 2)
	private BigDecimal total;

	public Long getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}
}
