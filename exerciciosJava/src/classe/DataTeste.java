package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		Data data1 = new Data();
		
		data1.dia = 25;
		data1.mes = "Fevereiro";
		data1.ano = 2006;
		
		Data data2 = new Data();
		
		data2.dia = 29;
		data2.mes = "Janeiro";
		data2.ano = 2001;
		
		Data data3 = new Data();
		
		Data data4 = new Data(9, "Dezembro", 1972);
		
		System.out.println(data1.obterDataFormatada());
		System.out.println(data2.obterDataFormatada());
		System.out.println(data3.obterDataFormatada());
		System.out.println(data4.obterDataFormatada());
	}
}
