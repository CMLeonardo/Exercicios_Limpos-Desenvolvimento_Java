package oo.heranca.desafio;

public class Carro {
	
	int velocidade = 0;
	
	public void acelerar () {
		velocidade += 5;
	}
	
	public void reduzir () {
		if (velocidade > 0) {
			velocidade -= 5;
		} else {
			velocidade = 0;
		}
	}
	
	public String toString () {
		return "A Velocidade é " + velocidade + " Km/h";
	}
}
