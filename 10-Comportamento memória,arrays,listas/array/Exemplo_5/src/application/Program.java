package application;
import java.util.Scanner;
import java.util.Locale;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número de valores que serão digitados: ");
		int N = sc.nextInt();
		double[] vect = new double[N];
		
		for(int i=0;i<N;i++) {
			System.out.println("Digite um numero");
			double number = sc.nextDouble();
			vect[i] = number;
		}
		for(int j=N-1; j>-1; j--) {
			System.out.println(vect[j]);
		}
		sc.close();
	}

}
