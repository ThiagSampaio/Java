package application;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Diga quantas pessoas serao digitadas: ");
		int N = sc.nextInt();
		
		String[] vect = new String[N];
		for(int i = 0; i<vect.length;i++) {
			System.out.print("Digite o nome da pessoa: ");
			String nome = sc.nextLine();
			vect[i] = nome;
			sc.next();
		}
		System.out.println("Digite o numero da pessoa que deseja pesquisar: ");
		int numero = sc.nextInt();
		
		if(numero >= N || numero < 0) {
			System.out.println("Numero inválido");
		}
		else{
			System.out.println(vect[numero]);
		}
		
		sc.close();

	}

}
