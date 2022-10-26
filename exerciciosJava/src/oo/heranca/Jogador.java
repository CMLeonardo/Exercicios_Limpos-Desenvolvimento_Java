package oo.heranca;

public class Jogador {

	int vida = 100;
	int x;
	int y;
	
	boolean atacar(Jogador oponente) {
		int diffX = Math.abs(x - oponente.x);
		int diffY = Math.abs(y - oponente.y);
		
		if( diffX == 0 && diffY == 1) {
			oponente.vida -= 10;
			return true;
		} else if (diffX == 1 && diffY == 0) {
			oponente.vida -= 10;
			return true;
		}else {
			return false;
		}
	}
	
	boolean andar(Direcao direcao) {
		switch(direcao) {
		case NORTE:
			y++;
			break;
		case LESTE:
			x++;
			break;
		case SUL:
			y--;
			break;
		case OESTE:
			x--;
			break;
		}
		return false;
	}
}
