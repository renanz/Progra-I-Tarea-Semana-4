import java.util.Scanner;

public class EjercFor2 {
	public static void main(String args[]){

		Scanner lea = new Scanner (System.in);

		System.out.println ("Ingrese la altura del rectangulo");
		int altura = lea.nextInt();
		System.out.println ("Ingrese la anchura del rectangulo");
		int ancho = lea.nextInt();

		for (int conta=1;conta<=altura ;conta++) {
			System.out.print("\n");
			for (int cont=1;cont<=ancho ;cont++ ) {
			System.out.print("*");
			}
		}

		//Renan Zelaya
	} 
}