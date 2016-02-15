import java.util.Scanner;

public class EjercFor7 {
	public static void main(String args[]){

		Scanner lea = new Scanner (System.in);

		System.out.println ("Ingrese un numero");
		int num = lea.nextInt();
		
		for (int cont=1;cont<=num ;cont++) {
			if (num%cont==0) {
				System.out.print(cont+" ");
			}
		}
	//Renan Zelaya
	} 
}