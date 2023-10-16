package variablesYCondiciones;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime el radio ");
		int radio=sc.nextInt();
		
		double area=Math.PI*Math.pow(radio, 2);
		
		System.out.println("el area es "+area);

	}

}
