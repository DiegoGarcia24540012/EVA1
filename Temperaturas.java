package ej11;

public class Temperaturas
{
	public double convFaC(double f)
	{
		double res;
		res = (f-32)*(5.0/9.0);
		return res;
	}
	
	public static double convCaF(double c)
	{
		double res;
		res = c*(9.0/5.0) + 32;
		return res;
	}
	
	public static double convCaK(double c)
	{
		double res;
		res = c+273.15;
		return res;
	}
	
	public static double convKaC(double k)
	{
		double res;
		res = k-273.15;
		return res;
	}
	
	public static double convFaK(double f)
	{
		double res;
		res = (5.0/9.0)*(f-32)+273.15;
		return res;
	}
	
	public static double convKaF(double k)
	{
		double res;
		res = 1.8*(k-273.15)+32;
		return res;
	}
}
