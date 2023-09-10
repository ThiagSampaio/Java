package application;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de numeros");
		int N = sc.nextInt();
		int[] vect = new int[N];
		int[] vectOrdenado = new int[N];
		for(int i = 0;i<vect.length;i++) {
			System.out.println("Digite um numero: ");
			int numero = sc.nextInt();
			vect[i] = numero;
		}
		int n=0;
		for (int i=0; i< vectOrdenado.length; i++) {
			
			int num1 = vect[i];
			for(int j=n; j<vectOrdenado.length; j++) {
				int num2 = vect[j];
				if (num1 < num2) {
					vectOrdenado[j] = num1;
				}
				else {
					vectOrdenado[j] = num2;
				}
			}
			n+=1;
			
		}
		for (int i=0;i<N;i++) {
			System.out.println(vectOrdenado[i]);
		}
		
		sc.close();

	}

}
