package variablesYCondiciones;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime un numero");
		int n1=sc.nextInt();
		System.out.println("Dimer otro numero");
		int n2=sc.nextInt();
		System.out.println("Dime el ultimo ");
		int n3=sc.nextInt();
		
		for(int i=0;i<3;i++) {
			if(n2>n1) {
				int aux=n1;
				n1=n2;
				n2=aux;
			}
			if(n3>n2) {
				int aux=n2;
				n2=n3;
				n3=aux;
			}
		}
		System.out.println(n1+","+n2+","+n3);

	}

}
