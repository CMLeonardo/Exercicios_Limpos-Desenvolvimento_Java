package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		var b = 4.5; //n�o pode mudar o tipo da vari�vel
		System.out.println(b);
		
		var c = "Texto"; //tipo var deve ser declarado e j� instanciado, se n�o da erro
		System.out.println(c);
	}
}
