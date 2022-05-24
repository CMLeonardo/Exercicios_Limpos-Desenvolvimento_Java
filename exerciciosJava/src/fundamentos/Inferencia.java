package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		var b = 4.5; //não pode mudar o tipo da variável
		System.out.println(b);
		
		var c = "Texto"; //tipo var deve ser declarado e já instanciado, se não da erro
		System.out.println(c);
	}
}
