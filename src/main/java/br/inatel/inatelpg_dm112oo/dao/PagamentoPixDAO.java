package br.inatel.inatelpg_dm112oo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.inatel.inatelpg_dm112oo.model.PagamentoPix;

@Repository
public interface PagamentoPixDAO extends JpaRepository<PagamentoPix, Long> {

}
