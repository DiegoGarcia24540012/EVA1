package ej4;

import java.util.Scanner;

public class Auto {

	public static void main(String[] args)
	{
		Scanner leer = new Scanner(System.in);
		Vehiculo vehi = new Vehiculo();
		String cade = leer.nextLine();
		int ent = leer.nextInt();
		double deci = leer.nextDouble();
		
		vehi.setColor(cade);
		vehi.setMarca(cade);
		vehi.setModelo(cade);
		vehi.setPrecio(deci);
		vehi.setYear(ent);
		
		/*
		System.out.println("Marca: "+vehi.getMarca());
		System.out.println("Modelo: "+vehi.getModelo());
		System.out.println("Año: "+vehi.getYear());
		System.out.println("Color: "+vehi.getColor());
		System.out.println("Precio: $"+vehi.getPrecio()+" MXN");
		
		Todo ESTO SE RESUME CON imprimirDatos
		*/
		
		vehi.imprimirDatos();
		
		
		leer.close();
	}

}
