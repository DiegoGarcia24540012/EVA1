package ej12;

public class Calculadora
{
	public int Suma(int n1, int n2)
	{
		int res;
		res = n1+n2;
		return res;
	}
	
	public int Resta(int n1, int n2)
	{
		int res;
		res = n1-n2;
		return res;
	}
	
	public int Multi(int n1, int n2)
	{
		int res;
		res = n1*n2;
		return res;
	}
	
	public int Divis(int n1, int n2)
	{
		int res;
		res = n1/n2;
		return res;
	}
	
	public int Potencia(int n1, int n2)
	{
		int i=0;
		int e=n1;
		
		while(i<=n2)
		{
			n1 = e*e;
			i++;
		}
		
		return n1;
	}
}
