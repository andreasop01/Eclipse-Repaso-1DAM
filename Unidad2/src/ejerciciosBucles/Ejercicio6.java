package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		6. Pedir números hasta que se teclee un 0, mostrar la suma de todos los números
//		introducidos.
		
		Scanner sc=new Scanner(System.in);
		int numero=0;
		int suma=0;
		
		do {
			System.out.println("Escribe un numero ");
			numero=sc.nextInt();
			suma+=numero;
			
		}while(numero!=0);
		System.out.println("La suma es: "+suma);
	}

}
