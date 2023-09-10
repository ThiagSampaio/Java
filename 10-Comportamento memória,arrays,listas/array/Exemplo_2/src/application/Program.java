package application;
import java.util.Scanner;
import java.util.Locale;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		double soma = 0;
		
		String[] nome = new String[5];
		double[] nota = new double[5];
		
		for (int i=0; i<nome.length; i++) {
			
			System.out.println("Digite o nome do aluno: ");
			nome[i] = sc.nextLine();	
			System.out.println("Digite a nota do aluno: ");
			double n1 = sc.nextDouble();
			sc.nextLine();
			nota[i] = n1;
			soma += n1;
			
		}
		
		double media = soma/nome.length;
		
		System.out.println("O valor da média da turma é de: " + media);
		
		System.out.println("Os alunos com nota superior a média são: ");
		
		for (int j=0; j<nota.length; j++) {
			if (nota[j] > media) {
				System.out.println(nome[j]);
			}
		}
		
		sc.close();
		
	}

}
