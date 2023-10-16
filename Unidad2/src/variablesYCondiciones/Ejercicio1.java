package variablesYCondiciones;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime el primer coeficiente");
		int a=sc.nextInt();
		System.out.println("Dime el segundo coeficiente");
		int b=sc.nextInt();
		System.out.println("Dime el tercero coeficiente");
		int c=sc.nextInt();
		
		double solucion1=(-b+Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
		double solucion2=(-b-Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
		
		if(Double.isNaN(solucion1)) {
			System.out.println("No tiene solucion");
			
		}else {
			System.out.println(solucion1);
			System.out.println(solucion2);
		}
		

	}

}
