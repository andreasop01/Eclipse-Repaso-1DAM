package variablesYCondiciones;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime un numero");
		int n=sc.nextInt();
		int cont=0;
		while(n>0) {
			n/=10;
			cont++;
		}
		System.out.println(cont);
	}

}
