package oo.heranca.desafio;

public class Carro {
	
	final int velocidadeMaxima;
	int velocidade = 0;
	int delta = 5;
	
	Carro(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	public void acelerar () {
		if (velocidade + delta > velocidadeMaxima) {
			velocidade = velocidadeMaxima;
		}else {
			velocidade += delta;
		}
	}
	
	public void reduzir () {
		if (velocidade >= delta) {
			velocidade -= delta;
		} else {
			velocidade = 0;
		}
	}
	
	public String toString () {
		return "A Velocidade é " + velocidade + " Km/h";
	}
}
