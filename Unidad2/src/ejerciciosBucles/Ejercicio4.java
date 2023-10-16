package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int numero=0;
		int cont=0;
		
		do {
			System.out.println("Escribe un numero");
			numero=sc.nextInt();
			
			if(numero>=0) {
				cont++;
			}
		
		}while(numero>0);
		System.out.println("Se han introducido: "+cont+" numeros");
	}

}
