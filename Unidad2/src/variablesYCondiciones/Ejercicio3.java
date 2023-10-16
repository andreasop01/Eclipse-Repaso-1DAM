package variablesYCondiciones;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime el radio");
		int radio=sc.nextInt();
		int diametro=radio*2;
		double longitud=Math.PI*diametro;
		double longitud2=2*Math.PI*radio;
		
		System.out.println("la longitud es: "+longitud);
		System.out.println("la 2 logitud es: "+longitud2);
		
		
		
		
		

	}

}
