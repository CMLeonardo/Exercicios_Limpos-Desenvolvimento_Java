package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste2 {

	public static void main(String[] args) {
		
		// Usando interface já presente no Java
		BinaryOperator<Double> soma = (x, y) -> {
			return x + y;
		};
		
		System.out.println(soma.apply(2.0, 3.0));
		
		soma = (x, y) -> x * y;
		System.out.println(soma.apply(2.0, 3.0));
	}
}
