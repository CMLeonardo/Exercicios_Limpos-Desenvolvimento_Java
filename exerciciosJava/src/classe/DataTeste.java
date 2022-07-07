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
		
		System.out.printf("Data 1 - %d %s %d\n", data1.dia, data1.mes, data1.ano);
		System.out.printf("Data 2 - %d %s %d", data2.dia, data2.mes, data2.ano);
	}
}
