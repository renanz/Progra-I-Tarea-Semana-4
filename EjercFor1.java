import java.util.Scanner;

public class EjercFor1 {
	public static void main(String args[]){

		Scanner lea = new Scanner (System.in);

		System.out.println("Ingrese un numero");
		int num=lea.nextInt();
		int res=0;

		for (int cont=1;cont<=num ;cont++ ) {
			res = res+cont;
		}
		System.out.println("La suma de 1 a "+num+" es igual a: "+res);

		//Renan Zelaya
	} 
}