package variablesYCondiciones;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime un numero");
		int n1=sc.nextInt();
		System.out.println("Dime otro numero");
		int n2=sc.nextInt();
		
		if(n1==n2) {
			System.out.println("Son iguales");
		}else {
			System.out.println("No son Iguales");
		}

	}

}
