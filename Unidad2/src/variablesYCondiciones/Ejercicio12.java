package variablesYCondiciones;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime un numero");
		int n=sc.nextInt();
		
		if(n>=0 && n<=4) {
			System.out.println("SUSPENSO");
		}
		if(n==5) {
			System.out.println("APROBADO");
		}
		if(n==6) {
			System.out.println("BIEN");
		}
		if(n>=7 && n<=8) {
			System.out.println("NOTABLE");
		}
		if(n>=9 && n<=10) {
			System.out.println("SOBRESALIENTE");
		}
	}

}
