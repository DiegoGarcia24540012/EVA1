package ej5;

//import java.util.Scanner;

public class Main5
{
	public static void main(String[] args)
	{
		Television tv = new Television();
		//Scanner leer = new Scanner(System.in);
		
		tv.imprimirDatos(); //#1
		tv.subirVol();
		tv.canalSub();
		tv.canalSet(8);
		tv.imprimirDatos(); //#2
		tv.encenderApagar();
		tv.canalSub();
		tv.imprimirDatos(); //#3
		tv.subirVol();
		tv.canalBaj();
		tv.imprimirDatos(); //#4
		tv.canalBaj();
		tv.imprimirDatos(); //#5
		tv.canalSub();
		tv.imprimirDatos(); //#6
		
		System.out.println("Introduce el canal deseado: 6");
		tv.canalSet(6);
		System.out.println("---------------");
		tv.imprimirDatos(); //#7
		
		//leer.close();
	}
}
