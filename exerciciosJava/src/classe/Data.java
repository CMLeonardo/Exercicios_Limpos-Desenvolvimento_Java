package classe;

public class Data {

	int dia;
	String mes;
	int ano;
	
	Data () {
		// Construtor Padrão
		dia = 1;
		mes = "Janeiro";
		ano = 1970;
	}
	
	Data (int diaConst, String mesConst, int anoConst) {
		dia = diaConst; //Construtor "Especial"
		mes = mesConst;
		ano = anoConst;
	}
	
	String obterDataFormatada () {
		//return dia + " de " + mes + " de " + ano;
		return String.format("%d de %s de %d", dia, mes, ano);
	}
}
