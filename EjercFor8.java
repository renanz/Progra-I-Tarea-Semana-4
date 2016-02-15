import java.util.Scanner;

public class EjercFor8 {
	public static void main(String args[]){

		Scanner lea = new Scanner (System.in);

		System.out.print ("Ingrese un numero: ");
		int num = lea.nextInt();
		boolean primo=false;
		int contar=0;
		
		for (int cont=1;cont<=num ;cont++) {
			if (num%cont==0) {
				contar++;
			}
		}
		if (contar<3) {
			primo=true;
		}
		if (primo==true) {
			System.out.print(num+" Es un numero primo.");	
		}
		else
			System.out.print(num+" NO es un numero primo.");
		//Renan Zelaya
	} 
}