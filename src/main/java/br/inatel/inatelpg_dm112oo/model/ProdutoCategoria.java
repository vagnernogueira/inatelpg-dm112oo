package br.inatel.inatelpg_dm112oo.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ProdutoCategoria implements Serializable {

	private static final long serialVersionUID = 6056781055342086619L;

	@Id
	private Long idProdutoCategoria;

	@ManyToOne
	@JoinColumn(name = "idProduto", nullable = false)
	private Produto produto;

	@ManyToOne
	@JoinColumn(name = "idCategoria", nullable = false)
	private Categoria categoria;

	public Long getIdProdutoCategoria() {
		return idProdutoCategoria;
	}

	public void setIdProdutoCategoria(Long idProdutoCategoria) {
		this.idProdutoCategoria = idProdutoCategoria;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
}
