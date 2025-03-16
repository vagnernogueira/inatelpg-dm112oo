package br.inatel.inatelpg_dm112oo.model;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Produto implements Serializable {
	
	private static final long serialVersionUID = -9180282725379258607L;

	@Id
	private Long idProduto;

	@Column(nullable = false)
	private String nmProduto;

	@Column(nullable = false, precision = 12, scale = 2)
	private BigDecimal preco;

	@Column(nullable = false)
	private Integer qtdeProdutoEstoque;

	@Column(nullable = false, length = 1)
	private String ativo;

	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}

	public String getNmProduto() {
		return nmProduto;
	}

	public void setNmProduto(String nmProduto) {
		this.nmProduto = nmProduto;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public Integer getQtdeProdutoEstoque() {
		return qtdeProdutoEstoque;
	}

	public void setQtdeProdutoEstoque(Integer qtdeProdutoEstoque) {
		this.qtdeProdutoEstoque = qtdeProdutoEstoque;
	}

	public String getAtivo() {
		return ativo;
	}

	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}
}
