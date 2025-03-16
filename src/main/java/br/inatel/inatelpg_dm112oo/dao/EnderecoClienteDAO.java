package br.inatel.inatelpg_dm112oo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.inatel.inatelpg_dm112oo.model.EnderecoCliente;

@Repository
public interface EnderecoClienteDAO extends JpaRepository<EnderecoCliente, Long> {

}
