package oo.composicao.desafio;

import java.util.ArrayList;

public class Cliente {

	final String nome;
	final ArrayList<Compra> compras = new ArrayList<>();
	
	Cliente (String nome) {
		this.nome = nome;
	}
	
	double obterValorCompraCliente () {
		double totalTodasCompras = 0;
		for(Compra compra: compras) {
			totalTodasCompras += compra.obterValorCompra();		
		}
		return totalTodasCompras;
	}
}