package br.inatel.inatelpg_dm112oo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.inatel.inatelpg_dm112oo.model.Pagamento;

@Repository
public interface PagamentoDAO extends JpaRepository<Pagamento, Long> {

}
