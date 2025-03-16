package br.inatel.inatelpg_dm112oo.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class MovimentoPedido implements Serializable {

	private static final long serialVersionUID = 2268906687784150226L;

	@Id
	private Long idMovimentoPedido;

	@ManyToOne
	@JoinColumn(name = "idPedido", nullable = false)
	private Pedido pedido;

	@Column(nullable = false, length = 1)
	private String tipoMovimento;

	@Column(nullable = false)
	private LocalDateTime dtMovimento;

	public Long getIdMovimentoPedido() {
		return idMovimentoPedido;
	}

	public void setIdMovimentoPedido(Long idMovimentoPedido) {
		this.idMovimentoPedido = idMovimentoPedido;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public String getTipoMovimento() {
		return tipoMovimento;
	}

	public void setTipoMovimento(String tipoMovimento) {
		this.tipoMovimento = tipoMovimento;
	}

	public LocalDateTime getDtMovimento() {
		return dtMovimento;
	}

	public void setDtMovimento(LocalDateTime dtMovimento) {
		this.dtMovimento = dtMovimento;
	}
}
