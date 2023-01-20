package streams.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import streams.Aluno;

public class DesafioFilter {
	
// Programa que filtra os alunos reprovados e verifica se o aluno pagou para passar de ano, incluindo o mesmo na lista de aprovados
	
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a2 = new Aluno("Lucas", 3.0);
		Aluno a3 = new Aluno("Arthur", 9.7);
		Aluno a4 = new Aluno("Anderson", 1.3, true);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> reprovado = a -> a.nota <= 7;
		Predicate<Aluno> suborno = a -> a.suborno;
		Consumer<Aluno> reajuste = a -> a.nota = 7;
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, String> saudacaoAprovado =
				a -> "Parabens " + a.nome + "! Voce foi aprovado(a)!";
		
		alunos.stream()
			.filter(reprovado)
			.filter(suborno)
			.forEach(reajuste);
		
		alunos.stream()
			.filter(aprovado)
			.map(saudacaoAprovado)
			.forEach(System.out::println);
	}
}
