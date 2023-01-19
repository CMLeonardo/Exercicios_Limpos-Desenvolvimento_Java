package streams;

public class Aluno {

	public final String nome;
	public double nota;
	public final boolean suborno;
	
	public Aluno(String nome, double nota) {
		this.nome = nome;
		this.nota = nota;
		this.suborno = false;
	}

	public Aluno(String nome, double nota, boolean suborno) {
		this.nome = nome;
		this.nota = nota;
		this.suborno = suborno;
	}
}
