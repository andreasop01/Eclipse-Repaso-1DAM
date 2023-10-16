package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int numero=0;
		
		
		while(numero>=0) {
			System.out.println("Dime un numero: ");
			numero=sc.nextInt();
			
			if(numero>=0) {
				System.out.println("El cuadrado es :"+(numero*numero));
			}else {
				System.out.println("Es numero negativo");
			}
		}
	}

}
