package entities;

public class Aluno {
	private Double nota;
	private String nome;
	
	public Aluno() {
		
	}
	
	public Aluno(Double nota, String nome) {
		this.nota = nota;
		this.nome = nome;
	}
	
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	public double getNota() {
		return nota;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
}
