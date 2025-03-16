package br.inatel.inatelpg_dm112oo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.inatel.inatelpg_dm112oo.dao.ProdutoDAO;
import br.inatel.inatelpg_dm112oo.model.Produto;

@Service
public class ProdutoService {
	
	private final ProdutoDAO produtoDAO;
	
	public ProdutoService(ProdutoDAO produtoDAO) {
		this.produtoDAO = produtoDAO;
	}
	
	public List<Produto> listarTodos() {
        return produtoDAO.findAll();
    }
}
