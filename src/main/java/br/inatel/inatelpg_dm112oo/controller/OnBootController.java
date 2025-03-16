package br.inatel.inatelpg_dm112oo.controller;

import java.util.List;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Controller;

import br.inatel.inatelpg_dm112oo.model.Produto;
import br.inatel.inatelpg_dm112oo.service.ProdutoService;

@Controller
public class OnBootController {

	private final ProdutoService produtoService;
	
	public OnBootController(ProdutoService produtoService) {
		this.produtoService = produtoService;
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void listarProdutos() {
		List<Produto> produtos = produtoService.listarTodos();
        System.out.println("=== Lista de Produtos ===");
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            produtos.forEach(produto -> System.out.println(produto.getNmProduto()));
        }
        System.out.println("=== FIM Lista de Produtos ===");
	}
}
