package lambdas.desafio;

import java.util.function.Function;
import java.util.function.UnaryOperator;

import lambdas.Produto;

public class DesafioBinaryOperator {

	public static void main(String[] args) {
		Produto iPad = new Produto("IPad", 4235.89, 0.13);
		Produto iPhone = new Produto("IPhone", 2300.00, 0.05);
		
		Function<Produto, Double> valorReal = 
				prod -> (prod.preco * (1 - prod.desconto));
				
		System.out.printf("------------------------------------------- \n"
				+ "Valor com Desconto dos Produtos: \n\n"
				+ "%s: %.2f \n"
				+ "%s: %.2f \n"
				+ "------------------------------------------- \n", 
				iPad.nome, valorReal.apply(iPad), 
				iPhone.nome, valorReal.apply(iPhone));
		
		
		
		UnaryOperator<Double> impostoMunicipal = 
				imposto -> (imposto >= 2500) ? (imposto * 1.085) : imposto;
				
		System.out.printf("------------------------------------------- \n"
				+ "Valor do Produto com o Imposto Municipal: \n\n"
				+ "%s: %.2f \n"
				+ "%s: %.2f \n"
				+ "------------------------------------------- \n", 
				iPad.nome, valorReal.andThen(impostoMunicipal).apply(iPad), 
				iPhone.nome, valorReal.andThen(impostoMunicipal).apply(iPhone));
				
		
				
		UnaryOperator<Double> freteEntrega = 
				frete -> (frete >= 3000) ? frete + 100 : frete + 50;
				
		System.out.printf("------------------------------------------- \n"
				+ "Valor do Produto com o Frete: \n\n"
				+ "%s: %.2f \n"
				+ "%s: %.2f \n"
				+ "------------------------------------------- \n", 
				iPad.nome, valorReal.andThen(impostoMunicipal).andThen(freteEntrega).apply(iPad), 
				iPhone.nome, valorReal.andThen(impostoMunicipal).andThen(freteEntrega).apply(iPhone));
	
				
				
		System.out.printf("------------------------------------------- \n"
						+ "Valor Final do Produto Formatado: \n\n"
						+ "%s: R$ %.2f \n"
						+ "%s: R$ %.2f \n"
						+ "------------------------------------------- \n", 
						iPad.nome, valorReal.andThen(impostoMunicipal).andThen(freteEntrega).apply(iPad), 
						iPhone.nome, valorReal.andThen(impostoMunicipal).andThen(freteEntrega).apply(iPhone));
		
// --------------------------------------------------- Resposta Professor -----------------------------------------------------------
				
		Function<Double, String> arredondar = 
			arredondado -> String.format("%.2f", arredondado);
		
		UnaryOperator<String> formatar = 
				formatado -> ("R$ " + formatado).replace(".", ",");
		
		
		String preco = valorReal.andThen(impostoMunicipal).andThen(freteEntrega).andThen(arredondar).andThen(formatar).apply(iPad);
		
		System.out.println("------------------------------------------- \n"
				+ "Valor Final - Resposta Professor: \n\n"
				+ "O preco final do IPad eh " + preco + "\n"
				+ "------------------------------------------- \n");
	}
}
