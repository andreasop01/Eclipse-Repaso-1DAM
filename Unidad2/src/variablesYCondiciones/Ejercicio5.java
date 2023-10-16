package variablesYCondiciones;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime un numero");
		int n=sc.nextInt();
		
		if(n>0) {
			System.out.println("el numero es positivo");
		}
		if(n<0) {
			System.out.println("El numero es negativo");
		}
		if(n==0) {
			System.out.println("El numero es un 0");
		}
	}

}
