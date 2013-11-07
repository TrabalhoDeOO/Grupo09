package game.entidade;

import java.util.Random;

public class Rand {
	
	private static Random numero = new Random(System.currentTimeMillis());

	public Rand() {
		numero.nextInt();
	}

	public int Random(int min, int max){
		int num = numero.nextInt((max-(min-1)))+min;
		return num;
	}
}
