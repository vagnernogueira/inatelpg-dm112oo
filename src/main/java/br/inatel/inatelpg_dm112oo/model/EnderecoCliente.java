package br.inatel.inatelpg_dm112oo.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class EnderecoCliente implements Serializable {

	private static final long serialVersionUID = -8636622836986805891L;

	@Id
	private Long idEnderecoCliente;

	@ManyToOne
	@JoinColumn(name = "idCliente", nullable = false)
	private Cliente cliente;

	@Column(nullable = false, length = 8)
	private String cep;

	@Column(nullable = false, length = 2)
	private String uf;

	@Column(nullable = false)
	private String nmMunicipio;

	@Column(nullable = false)
	private String nmBairro;

	@Column(nullable = false)
	private String nmLogradouro;

	@Column(nullable = false, length = 36)
	private String numResidencia;

	public Long getIdEnderecoCliente() {
		return idEnderecoCliente;
	}

	public void setIdEnderecoCliente(Long idEnderecoCliente) {
		this.idEnderecoCliente = idEnderecoCliente;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getNmMunicipio() {
		return nmMunicipio;
	}

	public void setNmMunicipio(String nmMunicipio) {
		this.nmMunicipio = nmMunicipio;
	}

	public String getNmBairro() {
		return nmBairro;
	}

	public void setNmBairro(String nmBairro) {
		this.nmBairro = nmBairro;
	}

	public String getNmLogradouro() {
		return nmLogradouro;
	}

	public void setNmLogradouro(String nmLogradouro) {
		this.nmLogradouro = nmLogradouro;
	}

	public String getNumResidencia() {
		return numResidencia;
	}

	public void setNumResidencia(String numResidencia) {
		this.numResidencia = numResidencia;
	}
}
