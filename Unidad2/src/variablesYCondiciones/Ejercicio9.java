package variablesYCondiciones;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime un numero");
		int n1=sc.nextInt();
		System.out.println("Dimer otro numero");
		int n2=sc.nextInt();
		
		if(n1>n2) {
			System.out.println(n1+","+n2);
		}else {
			System.out.println(n2+","+n1);
		}
	}

}
