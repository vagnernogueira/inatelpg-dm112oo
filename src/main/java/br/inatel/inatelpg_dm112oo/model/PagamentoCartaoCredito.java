package br.inatel.inatelpg_dm112oo.model;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@DiscriminatorValue(value = "C")
@PrimaryKeyJoinColumn(name = "idPagamento")
public class PagamentoCartaoCredito extends Pagamento {

	private static final long serialVersionUID = -4545315892558156094L;
	
	@Column(nullable = false)
	private String idTransacaoCartaoCredito;

	public String getIdTransacaoCartaoCredito() {
		return idTransacaoCartaoCredito;
	}

	public void setIdTransacaoCartaoCredito(String idTransacaoCartaoCredito) {
		this.idTransacaoCartaoCredito = idTransacaoCartaoCredito;
	}
}
