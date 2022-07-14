package classe;

public class ValorVSReferencia {

	public static void main(String[] args) {
		int a = 2;
		int b = a; // Atribuição por valor
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		Data data1 = new Data(18, "Novembro", 1973);
		Data data2 = data1; // Atribuição por referência
		
		data2.dia = 20;
		
		System.out.println(data1.obterDataFormatada());
		System.out.println(data2.obterDataFormatada());
		
		voltarDataPadrao(data1);
		
		System.out.println(data1.obterDataFormatada());
		System.out.println(data2.obterDataFormatada());
		
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
	}
	
	static void voltarDataPadrao (Data data) {
		data.dia = 1;
		data.mes = "Janeiro";
		data.ano = 1970;
	}
	
	static void alterarPrimitivo (int numero) {
		numero++;
	}
}
