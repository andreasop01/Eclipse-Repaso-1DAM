package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int numero=0;
		int cont=0;
		int suma=0;
		int media=0;
		
		do {
			System.out.println("Escribe un numero");
			numero=sc.nextInt();
			
			if(numero>0) {
				cont++;
				suma+=numero;
				media=suma/cont;
			}
			
			
		}while(numero>0);
		System.out.println("La media es: "+media);
	}

}
