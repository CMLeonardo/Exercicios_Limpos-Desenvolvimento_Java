package classe.desafios;

public class Pessoa {
	
	String nome;
	Double peso;
	
	void comerComida(Comida comida) {
		if (comida != null) {
			this.peso += comida.peso;
		}	
	}
}
