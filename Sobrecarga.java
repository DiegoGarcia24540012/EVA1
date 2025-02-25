package ej13;

public class Sobrecarga
{
	// --------------- HEADER (CABECERA) -----------------
	//                     ------------ FIRMA ------------
	public static int sumar(int val1, int val2) // sumar(int, int)
	{
		// IMPLEMENTACION
		return val1+val2;
	}
	
	public static String sumar(String val1, String val2) // sumar(String, String)
	{
		return val1+val2;
	}
	
	public static void sumar()
	{
		System.out.println("Esta funcion no hace nada");
	}
}
