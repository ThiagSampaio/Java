package application;
import java.util.Locale;
import java.util.Scanner;



public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int flag = 1;
		int contador = 0;
		
		double[] salario = new double[1000];
		while(flag != -1) {
			System.out.printf("Digite o salário numero %d:",contador);
			double salary = sc.nextDouble();
			salario[contador] = salary;
			contador += 1;
			System.out.println("Deseja continuar? [1] Sim [-1] Nao");
			flag = sc.nextInt();
		}
		System.out.println("Insira o valor de reajuste: ");
		double reajuste = sc.nextDouble();
		for (int i=0; i<contador; i++) {
			salario[i] += reajuste;
			System.out.println(salario[i]);
		}
		

	}

}
