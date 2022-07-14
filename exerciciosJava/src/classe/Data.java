package classe;

public class Data {

	int dia;
	String mes;
	int ano;
	
	Data () {
		// Construtor Padrão
		// dia = 1;
		// mes = "Janeiro";
		// ano = 1970;
		
		this(1, "Janeiro", 1970);
	}
	
	Data (int dia, String mes, int ano) {
		this.dia = dia; //Construtor "Especial"
		this.mes = mes; // "this" referencia para o objeto
		this.ano = ano;
	}
	
	String obterDataFormatada () {
		//return dia + " de " + mes + " de " + ano;
		return String.format("%d de %s de %d", dia, mes, ano);
	}
}