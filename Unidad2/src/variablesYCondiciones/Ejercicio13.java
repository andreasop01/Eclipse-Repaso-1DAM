package variablesYCondiciones;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime un numero");
		int n=sc.nextInt();
		
		if(n==1) {
			System.out.println("LUNES");
		}
		if(n==2) {
			System.out.println("MARTES");
		}
		if(n==3) {
			System.out.println("MIERCOLES");
		}
		if(n==4 ){
			System.out.println("JUEVES");
		}
		if(n==5) {
			System.out.println("VIERNES");
		}
		if(n==6) {
			System.out.println("SABADO");
		}
		if(n==7) {
			System.out.println("DOMINGO");
		}

	}

}
