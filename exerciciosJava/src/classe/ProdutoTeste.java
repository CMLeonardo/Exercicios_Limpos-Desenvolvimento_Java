package classe;

import java.util.Scanner;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		int a = 3;
		Scanner entrada = new Scanner(System.in);
		Produto p1 = new Produto();
		p1.nome = "Panela";
		p1.preco = 23.99;
		p1.desconto = 0.25;
		
		double precoFinal = p1.preco * (1 - p1.desconto);
		
		System.out.println(p1.nome);
		System.out.println(precoFinal);
		
		entrada.close();
	}
}
