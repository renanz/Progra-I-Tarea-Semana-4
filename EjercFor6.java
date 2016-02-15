import java.util.Scanner;

public class EjercFor6 {
	public static void main(String args[]){

		Scanner lea = new Scanner (System.in);

		System.out.println ("Ingrese la altura del triangulo");
		int n=lea.nextInt();
		String espacio=" ";
		String as="*";
				
		for (int contador=0; contador<=n; contador++){
			for (int space=0; space<(n-contador); space++){
				System.out.print (espacio);
			}	
			for (int ast1=1; ast1<=contador; ast1++){
				System.out.print (as);
			}
			for (int ast2=2; ast2<=contador; ast2++){
				System.out.print (as);
			}
			System.out.print("\n");
		}
		//Renan Zelaya
	} 
}