package ej11;

public class Main11
{
	public static void main(String[] args)
	{
		//Math es una clase que proporciona funciones matematicas.
		double valorAleatorio = Math.random();
		int valor = (int) (valorAleatorio*10000);
		System.out.println(valorAleatorio);
		System.out.println(valor);
		//
		Persona pers = new Persona();
		pers.mostrarMensaje();
		System.out.println("\n");
		
		Temperaturas temp = new Temperaturas();
		System.out.println(temp.convFaC(100));
		System.out.println(Temperaturas.convCaF(100));
		System.out.println(Temperaturas.convCaK(100));
		System.out.println(Temperaturas.convKaC(100));
		System.out.println(Temperaturas.convFaK(100));
		System.out.println(Temperaturas.convKaF(100));
	}
}
