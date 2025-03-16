package br.inatel.inatelpg_dm112oo.model;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class PedidoItem implements Serializable {

	private static final long serialVersionUID = -4715328216269563077L;

	@Id
	private Long idPedidoItem;

	@ManyToOne
	@JoinColumn(name = "idPedido", nullable = false)
	private Pedido pedido;

	@ManyToOne
	@JoinColumn(name = "idProduto", nullable = false)
	private Produto produto;

	@Column(nullable = false, precision = 12, scale = 2)
	private BigDecimal precoItem;

	@Column(nullable = false)
	private Integer qtdeItem;

	@Column(nullable = false, precision = 12, scale = 2)
	private BigDecimal preco;

	public Long getIdPedidoItem() {
		return idPedidoItem;
	}

	public void setIdPedidoItem(Long idPedidoItem) {
		this.idPedidoItem = idPedidoItem;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public BigDecimal getPrecoItem() {
		return precoItem;
	}

	public void setPrecoItem(BigDecimal precoItem) {
		this.precoItem = precoItem;
	}

	public Integer getQtdeItem() {
		return qtdeItem;
	}

	public void setQtdeItem(Integer qtdeItem) {
		this.qtdeItem = qtdeItem;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
}
