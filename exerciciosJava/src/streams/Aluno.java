package streams;

public class Aluno {

	public final String nome;
	public double nota;
	public final boolean suborno;
	final boolean bomComportamento;
	
	public Aluno(String nome, double nota) {
		this.nome = nome;
		this.nota = nota;
		this.suborno = false;
		this.bomComportamento = true;
	}

	public Aluno(String nome, double nota, boolean suborno) {
		this.nome = nome;
		this.nota = nota;
		this.suborno = suborno;
		this.bomComportamento = true;
	}
}
