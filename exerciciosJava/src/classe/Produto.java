package classe;

public class Produto {

	String nome;
	double preco;
	// double desconto;
	static double desconto = 0.25;
	
	Produto () {
		// Construtor Padrão
	}
	
	Produto (String nomeInicial) {
		nome = nomeInicial; //Construtor "Especial"
	}
	
	double precoComDesconto () {
		return preco * (1 - desconto);
	}
}