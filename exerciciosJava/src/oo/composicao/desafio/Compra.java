package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {

	final ArrayList<Item> itens = new ArrayList<>();
	
	void adicionarItem(Produto p, int qtde ) {
		this.itens.add(new Item(p, qtde));
	}
	
	void adicionarItem(String nome, double preco, int qtde ) {
		var produto = new Produto(nome, preco);
		this.itens.add(new Item(produto, qtde));
	}
	
	double obterValorCompra() {
		double totalCompra = 0;
		for(Item item: itens) {
			totalCompra += item.obterValorTotalItem();		
		}
		return totalCompra;
	}
}
