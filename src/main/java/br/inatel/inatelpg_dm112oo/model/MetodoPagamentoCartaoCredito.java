package br.inatel.inatelpg_dm112oo.model;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@DiscriminatorValue(value = "C")
@PrimaryKeyJoinColumn(name = "idMetodoPagamento")
public class MetodoPagamentoCartaoCredito extends MetodoPagamento {

	private static final long serialVersionUID = 409975085873743406L;

	@Column(nullable = false, length = 16)
	private String numCartaoSacado;

	@Column(nullable = false)
	private String nmProprietarioCartaoSacado;

	@Column(nullable = false, length = 4)
	private String validadeCartaoSacado;

	@Column(nullable = false)
	private String chaveSegurancaCartaoSacado;

	public String getNumCartaoSacado() {
		return numCartaoSacado;
	}

	public void setNumCartaoSacado(String numCartaoSacado) {
		this.numCartaoSacado = numCartaoSacado;
	}

	public String getNmProprietarioCartaoSacado() {
		return nmProprietarioCartaoSacado;
	}

	public void setNmProprietarioCartaoSacado(String nmProprietarioCartaoSacado) {
		this.nmProprietarioCartaoSacado = nmProprietarioCartaoSacado;
	}

	public String getValidadeCartaoSacado() {
		return validadeCartaoSacado;
	}

	public void setValidadeCartaoSacado(String validadeCartaoSacado) {
		this.validadeCartaoSacado = validadeCartaoSacado;
	}

	public String getChaveSegurancaCartaoSacado() {
		return chaveSegurancaCartaoSacado;
	}

	public void setChaveSegurancaCartaoSacado(String chaveSegurancaCartaoSacado) {
		this.chaveSegurancaCartaoSacado = chaveSegurancaCartaoSacado;
	}
}
