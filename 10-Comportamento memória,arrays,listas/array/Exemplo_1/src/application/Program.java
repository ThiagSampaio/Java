package application;
import java.util.Scanner;
import java.util.Locale;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Diga o tamango do vetor: ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		double soma = 0;
		
		for(int i=0; i<vect.length; i++) {
			double n2 = sc.nextDouble();
			vect[i] = n2;
			soma += n2;
		}
		
		int tamanhovect = vect.length;
		double media = soma / tamanhovect;
		
		System.out.printf("AVERAGE HEIGHT = %.2f ", media);
		
		
		
		sc.close();
		

	}

}
