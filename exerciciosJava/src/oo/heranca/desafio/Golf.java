package oo.heranca.desafio;

public class Golf extends Carro{

	Golf() {
		this(312);
	}
	
	Golf(int velocidadeMaxima) {
		super(velocidadeMaxima);
	}
	
	@Override
	public void acelerar () {
		super.acelerar();
		super.acelerar();
		super.acelerar();
	}
	
	@Override
	public void reduzir () {
		super.reduzir();
		super.reduzir();
		super.reduzir();
	}
}
