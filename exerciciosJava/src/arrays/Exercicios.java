package arrays;

import java.util.Arrays;

public class Exercicios {
	public static void main(String[] args) {
		double notasAluno[] = new double[3];
		
		notasAluno[0] = 7.9;
		notasAluno[1] = 8;
		notasAluno[2] = 5.6;
		
		System.out.println(Arrays.toString(notasAluno));
		
		double total = 0;
		for(int i = 0; i < notasAluno.length; i++) {
			total += notasAluno[i];
		}
		
		System.out.println(total / notasAluno.length);
		
		double notasAlunoB[] = {6.9, 8.9, 5.5, 10};
		
		for (int j = 0; j < notasAlunoB.length; j++) {
			System.out.println(notasAlunoB[j]);
		}
	}
}
