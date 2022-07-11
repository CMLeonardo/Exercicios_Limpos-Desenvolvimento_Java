package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Panela");
		//p1.nome = "Panela";
		p1.preco = 23.99;
		
		Produto p2 = new Produto();
		p2.nome = "Bolsa";
		p2.preco = 43.99;
		
		Produto.desconto = 0.3; // Mudando o desconto de todos os produtod do sistema
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		
		System.out.println(p1.nome);
		System.out.println(precoFinal1);
		
		System.out.println(p2.nome);
		System.out.println(precoFinal2);
		
	}
}
