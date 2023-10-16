package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int numero=0;
		do {
			System.out.println("Escribe un numero: ");
			numero=sc.nextInt();
			
			if(numero>0) {
				System.out.println("El numero es positivo");
			}
			if(numero<0) {
				System.out.println("El numero es negativo");
			}
		}while(numero!=0);
	}
}
