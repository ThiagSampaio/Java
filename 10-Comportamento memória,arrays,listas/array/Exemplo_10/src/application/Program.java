package application;
import java.util.Scanner;
import java.util.Locale;

import entities.Pensao;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rendted? ");
		int rooms = sc.nextInt();
		
		Pensao[] vect = new Pensao[10];
		
		for(int i=0 ; i<rooms ; i++) {
			System.out.printf("Rent #%d:\n",i+1);
			sc.nextLine();
			System.out.printf("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vect[room] = new Pensao(name,email,room);
		}
		
		System.out.println("Busy rooms:");
		
		for(int j=0; j<vect.length;j++) {
			if (vect[j] != null) {
				System.out.println(vect[j].getRoom()+": " + vect[j].getName() + ", " + vect[j].getEmail());
			}
		}
		
		
		sc.close();

	}

}
