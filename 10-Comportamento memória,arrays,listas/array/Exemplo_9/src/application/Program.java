package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Produtos;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero de produtos:");
		int N = sc.nextInt();
		
		Produtos[] vect = new Produtos[N];
		double soma = 0;
		for(int i=0; i<N; i++) {
			sc.nextLine();
			System.out.print("Digite o nome do produto: ");
			String nome = sc.nextLine();
			System.out.print("Digite o valor do produto: ");
			double preco = sc.nextDouble();
			
			vect[i] = new Produtos(nome,preco);
			soma += preco;
		}
		double media = soma/N;
		
		System.out.println("A media do preco foi: " + media);
	}

}
