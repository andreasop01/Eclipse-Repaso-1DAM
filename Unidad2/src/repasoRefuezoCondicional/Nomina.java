package repasoRefuezoCondicional;

import java.util.Scanner;

public class Nomina {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("*******************");
		System.out.println("Calculo nomina");
		System.out.println("*******************");
		System.out.println("1-Programador Junior");
		System.out.println("2-Programador Senior");
		System.out.println("3-Jefe de Proyecto");
		System.out.println("Introduzca el cargo del empleado: ");
		
		int cargo=sc.nextInt();
		int sueldoBase=0;
		
		switch(cargo) {
		case 1:
			sueldoBase=950;
			break;
		case 2:
			sueldoBase=1200;
			break;
		case 3:
			sueldoBase=1600;
			break;
		}
		System.out.println("Cuantos dias a estado de viaje visitando clientes?");
		int dias=sc.nextInt();
		int sueldoDieta=dias*30;
		System.out.println("Introduzca su estado civil: 1-Soltero, 2-Casado");
		
		int estadoCivil=sc.nextInt();
		int irpf=0;
		
		switch(estadoCivil) {
		case 1:
			irpf=25;
			break;
		case 2:
			irpf=20;
			break;
		}
		System.out.println("------------------------");
		System.out.println("Sueldo base: "+sueldoBase);
		System.out.println("Dietas ("+dias+"viajes):"+sueldoDieta);
		System.out.println("------------------------");
		
		int sueldoBruto=sueldoBase+sueldoDieta;
		System.out.println("Sueldo bruto "+sueldoBruto);
		
		double retencion=sueldoBruto*(irpf*0.01);
		System.out.println("Retencion IRPF("+irpf+"): "+retencion);
		System.out.println("------------------------");
		
		double sueldoNeto=sueldoBruto-retencion;
		System.out.println("Sueldo neto: "+sueldoNeto);
		System.out.println("------------------------");
		
	}
}
