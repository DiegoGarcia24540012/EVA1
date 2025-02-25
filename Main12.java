package ej12;

public class Main12 {

	public static void main(String[] args)
	{
		Calculadora cal = new Calculadora();
		
		System.out.println("===  CALCULADORA  ===\n");
		System.out.println("Suma: 4+2 = "+cal.Suma(4, 2));
		System.out.println("Resta: 4-2 = "+cal.Resta(4, 2));
		System.out.println("Multiplicacion: 4x2 = "+cal.Multi(4, 2));
		System.out.println("Division: 4/2 = "+cal.Divis(4, 2));
		System.out.println("Potencia: 4^2 = "+cal.Potencia(4, 4));
	}
}
