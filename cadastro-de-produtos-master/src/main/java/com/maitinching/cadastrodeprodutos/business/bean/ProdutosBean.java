package com.maitinching.cadastrodeprodutos.business.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean(name = "produtos")
public class ProdutosBean {
	private List<ProdutoBean> produtos;
	private ProdutoBean produtoSelecionado;
    
	
	public ProdutosBean() {
		produtos = new ArrayList<>();
		produtoSelecionado = new ProdutoBean();

	}

	public List<ProdutoBean> getProdutos() {
		return produtos;
		
		}
	     
	public void adicionar(ProdutoBean funcionario) {
		produtos.add(funcionario);
	}
	
	 public void remover(ProdutoBean produto) {
		 produtos.remove(produto);
	 }
	 
	 public String selecionar(ProdutoBean produto) {
		 produtoSelecionado = produto;
		 
		 // Redireciona para pagina de detalhe quando o usuário clicar no nome
		 return "detalhe";
	 }

	public ProdutoBean getProdutoSelecionado() {
		return produtoSelecionado;
	}

	
	}


