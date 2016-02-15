import java.util.Scanner;

public class EjercFor3 {
	public static void main(String args[]){

		Scanner lea = new Scanner (System.in);

		System.out.println ("Ingrese la altura del triangulo");
		int altura = lea.nextInt();

		for (int conta=1;conta<=altura ;conta++) {
			System.out.print("\n");
			for (int cont=1;cont<=conta ;cont++ ) {
			System.out.print("*");
			}
		}

		//Renan Zelaya
	} 
}