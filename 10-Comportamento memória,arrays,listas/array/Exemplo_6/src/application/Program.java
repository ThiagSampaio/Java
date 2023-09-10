package application;

public class Program {

	public static void main(String[] args) {
		int [] vect = new int[50];
		int cont = 101;
		for(int i=0; i<vect.length ; i++) {
			vect[i] = cont;
			cont +=1;
		}
		for(int j=0; j<vect.length; j++) {
			System.out.println(vect[j]);
		}

	}

}
