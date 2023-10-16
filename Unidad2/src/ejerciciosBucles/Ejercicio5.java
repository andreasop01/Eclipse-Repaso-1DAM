package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		5. Realizar un juego para adivinar un número. Para ello generar un número N aleatorio
//		entre 1 y 20, y luego ir pidiendo números indicando “mayor” o “menor” según sea
//		mayor o menor con respecto a N. El proceso termina cuando el usuario acierta
		
		Scanner sc=new Scanner(System.in);
		int numeroAleatorio=(int)(1+Math.random()*20);
		int numero=0;
		
		System.out.println("Numero ganador: "+numeroAleatorio);
		do {
			System.out.println("Escribe un numero: ");
			numero=sc.nextInt();
			
			if(numero>numeroAleatorio) {
				System.out.println("menor");
			}
			if(numero<numeroAleatorio){
				System.out.println("mayor");
			}
			
			
		}while(numeroAleatorio!=numero);
		System.out.println("has ganado");
	}

}
