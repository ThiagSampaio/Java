package application;
import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero de notas: ");
		int N = sc.nextInt();
		double[] vect = new double[N];
		double soma = 0;
		int notaAcimaMedia = 0;
		int notaAbaixoMedia = 0;
		for(int i=0; i<vect.length; i++) {
			System.out.printf("Digite a nota %d: \n",i+1);
			double nota = sc.nextDouble();
			vect[i]= nota;
			soma += nota;
		}
		double media = soma/N;
		
		for (int j=0; j<N; j++) {
			if(vect[j]> media) {
				notaAcimaMedia += 1;
			}
			else {
				notaAbaixoMedia += 1;
			}
		}
		
		System.out.println("A Media é :" + media);
		
		if(notaAcimaMedia > 0 ) {
			System.out.println("Notas acima da media: ");
			for (int z=0; z<N;z++) {
				if(vect[z]>= media) {
					System.out.println(vect[z]);
				}
			}
		}
		else if(notaAbaixoMedia < 0) {
			System.out.println("Notas abaixo da media: ");
			for (int w=0; w<N;w++) {
				if(vect[w]< media) {
					System.out.println(vect[w]);
				}
			}
		}
		else{
			System.out.println("Não existe notas fora da média");
		}
		
		
		sc.close();
	}

}
