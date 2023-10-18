package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//8. Pedir un número N, y mostrar todos los números del 1 al N.
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Escribe un numero: ");
		int n=sc.nextInt();
		
		
		for(int i=1;i<=n;i++) {
			
			System.out.println(i);
		}
		
	}

}
