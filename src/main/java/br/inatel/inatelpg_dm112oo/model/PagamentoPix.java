package br.inatel.inatelpg_dm112oo.model;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@DiscriminatorValue(value = "P")
@PrimaryKeyJoinColumn(name = "idPagamento")
public class PagamentoPix extends Pagamento {

	private static final long serialVersionUID = -7439398912877513047L;

	@Column(nullable = false)
	private String nmSacado;

	@Column(nullable = false)
	private String nmBancoSacado;

	@Column(nullable = false)
	private String numContaSacado;

	@Column(nullable = false)
	private String idTransacaoPix;

	public String getNmSacado() {
		return nmSacado;
	}

	public void setNmSacado(String nmSacado) {
		this.nmSacado = nmSacado;
	}

	public String getNmBancoSacado() {
		return nmBancoSacado;
	}

	public void setNmBancoSacado(String nmBancoSacado) {
		this.nmBancoSacado = nmBancoSacado;
	}

	public String getNumContaSacado() {
		return numContaSacado;
	}

	public void setNumContaSacado(String numContaSacado) {
		this.numContaSacado = numContaSacado;
	}

	public String getIdTransacaoPix() {
		return idTransacaoPix;
	}

	public void setIdTransacaoPix(String idTransacaoPix) {
		this.idTransacaoPix = idTransacaoPix;
	}
}
