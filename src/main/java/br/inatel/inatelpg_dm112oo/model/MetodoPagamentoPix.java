package br.inatel.inatelpg_dm112oo.model;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@DiscriminatorValue(value = "P")
@PrimaryKeyJoinColumn(name = "idMetodoPagamento")
public class MetodoPagamentoPix extends MetodoPagamento {

	private static final long serialVersionUID = 2060311577586522204L;

	@Column(nullable = false)
	private String chavePixRecebedor;

	@Column(nullable = false, length = 1)
	private String tipoChavePixRecebedor;

	@Column(nullable = false)
	private String nmRecebedor;

	@Column(nullable = false)
	private String nmBancoRecebedor;

	@Column(nullable = false)
	private String numContaRecebedor;

	public String getChavePixRecebedor() {
		return chavePixRecebedor;
	}

	public void setChavePixRecebedor(String chavePixRecebedor) {
		this.chavePixRecebedor = chavePixRecebedor;
	}

	public String getTipoChavePixRecebedor() {
		return tipoChavePixRecebedor;
	}

	public void setTipoChavePixRecebedor(String tipoChavePixRecebedor) {
		this.tipoChavePixRecebedor = tipoChavePixRecebedor;
	}

	public String getNmRecebedor() {
		return nmRecebedor;
	}

	public void setNmRecebedor(String nmRecebedor) {
		this.nmRecebedor = nmRecebedor;
	}

	public String getNmBancoRecebedor() {
		return nmBancoRecebedor;
	}

	public void setNmBancoRecebedor(String nmBancoRecebedor) {
		this.nmBancoRecebedor = nmBancoRecebedor;
	}

	public String getNumContaRecebedor() {
		return numContaRecebedor;
	}

	public void setNumContaRecebedor(String numContaRecebedor) {
		this.numContaRecebedor = numContaRecebedor;
	}
}
