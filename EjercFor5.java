import java.util.Scanner;

public class EjercFor5 {
	public static void main(String args[]){

		Scanner lea = new Scanner (System.in);

		System.out.print ("Ingrese la altura del rectangulo: ");
		int altura = lea.nextInt();
		System.out.print ("Ingrese la anchura del rectangulo: ");
		int anchura = lea.nextInt();
		System.out.print("\n");
		
		for (int contador=1;contador<=altura ;contador++) {
			System.out.println();
			if(contador==1 || contador==altura){
				for (int conta=1;conta<=anchura;conta++ ) {
				System.out.print("*");
				System.out.print(" ");
				}
			}
			if (contador>1 && contador<=altura-1) {
				System.out.print("*");
				for (int count=1;count<anchura-1 ;count++ ) {
				System.out.print(" ");		
				System.out.print(" ");
				}
				System.out.print(" *");	
			}
			
		}

		//Renan Zelaya
	} 
}