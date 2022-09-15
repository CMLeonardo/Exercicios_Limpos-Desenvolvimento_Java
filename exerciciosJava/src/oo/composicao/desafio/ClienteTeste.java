package oo.composicao.desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Cesar Morales Leonardo");
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 9.67, 100);
		compra1.adicionarItem("Notebook", 1897.75, 3);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Caderno", 10, 10);
		compra2.adicionarItem("Impressora", 998.90, 1);
		
		cliente1.compras.add(compra1);
		cliente1.compras.add(compra2);
		
		System.out.println(cliente1.obterValorCompraCliente());
	}
}
