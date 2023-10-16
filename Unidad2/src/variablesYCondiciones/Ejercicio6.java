package variablesYCondiciones;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime un numero");
		int n1=sc.nextInt();
		System.out.println("Dimer otro numero");
		int n2=sc.nextInt();
		
		if(n1%n2==0 || n2%n1==0) {
			System.out.println("Son multiplos");
		}else {
			System.out.println("no son multiplos");
		}
		
	}

}
