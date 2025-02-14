package ej8;

public class Main8
{
	public static void main(String[] args)
	{
		Vehiculo carro = new Vehiculo("Lamborghini", "Urus", 2017, 5000000, "Negro");
		carro.imprimirDatos();
		
		Vehiculo otroCarro = new Vehiculo();
		otroCarro.imprimirDatos();
	}
}
