package application;
import java.util.Scanner;
import java.util.Locale;
import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = 5;
		Aluno[]vect = new Aluno[5];
		double soma = 0;
		double somaAbaixoMedia =0;
		for(int i=0 ; i<N;i++) {
			System.out.println("Entre com o nome do aluno " + i+1 + ":");
			String nome = sc.nextLine();
			System.out.println("Entre com a nota do aluno " + i+1 + ":");
			double nota = sc.nextDouble();
			sc.nextLine();
			vect[i] = new Aluno(nota,nome);
			soma += nota;
		}
		double media = soma/N;
		for (int j=0; j<N;j++) {
			if(vect[j].getNota()<media) {
				somaAbaixoMedia += 1;
			}
		}
		if (somaAbaixoMedia > 0) {
			System.out.println("Alunos abaixo da media: ");
			for (int j=0; j<N;j++) {
				if(vect[j].getNota()<media) {
					System.out.println(vect[j].getNome());
				}
			}
		}
		
		
		sc.close();

	}

}
