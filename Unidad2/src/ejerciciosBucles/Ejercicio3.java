package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int numero=0;
		do {
			System.out.println("Escribe un numero");
			numero=sc.nextInt();
			
			if(numero!=0) {
				if(numero%2==0) {
					System.out.println("Es par");
				}else {
					System.out.println("Es impar");
				}
			}
		}while(numero!=0);
	}

}
