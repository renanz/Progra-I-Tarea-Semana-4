import java.util.Scanner;

public class EjercFor4 {
	public static void main(String args[]){

		Scanner lea = new Scanner (System.in);

		System.out.println ("Ingrese la anchura del triangulo");
		int n=lea.nextInt();
		String espacio=" ";
		String as="*";
				
		for (int conta=1;conta<=n ;conta++) {
			System.out.print("\n");
			for (int cont=1;cont<=conta ;cont++ ) {
			System.out.print("*");
			}
		}
		System.out.println();
		for (int contador=1; contador<n; contador++){
			for (int space=0; space<(n-contador); space++){
				System.out.print (as);
			}	
			for (int ast1=1; ast1<contador; ast1++){
				System.out.print (espacio);
			}
			for (int ast2=2; ast2<contador; ast2++){
				System.out.print (espacio);
			}
			System.out.print("\n");
		}
		//Renan Zelaya
	} 
}