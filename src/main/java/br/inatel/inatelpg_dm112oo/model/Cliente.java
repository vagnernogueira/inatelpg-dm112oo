package br.inatel.inatelpg_dm112oo.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cliente implements Serializable {
	
	private static final long serialVersionUID = -8492957390357592729L;

	@Id
	private Long idCliente;

	@Column(nullable = false)
	private String nmCliente;

	@Column(nullable = false, length = 18)
	private String cpfCnpj;

	@Column(nullable = false, length = 1)
	private String ativo;

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public String getNmCliente() {
		return nmCliente;
	}

	public void setNmCliente(String nmCliente) {
		this.nmCliente = nmCliente;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public String getAtivo() {
		return ativo;
	}

	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}
}
