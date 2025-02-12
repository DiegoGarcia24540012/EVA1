package ej7;

public class Clientes
{
	private String nombre;
	private String ap;
	private String rfc;
	private String tipo;
	private int edad;
	private String tel;
	
	////////////  GET y SET  ////////////
	
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String valor)
	{
		nombre=valor;
	}
	/////////////////////////////////////
	public String getAp()
	{
		return ap;
	}
	public void setAp(String valor)
	{
		ap=valor;
	}
	/////////////////////////////////////
	public String getRfc()
	{
		return rfc;
	}
	public void setRfc(String valor)
	{
		rfc=valor;
	}
	/////////////////////////////////////
	public String getTipo()
	{
		return tipo;
	}
	public void setTipo(String valor)
	{
		tipo=valor;
	}
	////////////////////////////////////
	public int getEdad()
	{
		return edad;
	}
	public void setEdad(int valor)
	{
		edad=valor;
	}
	///////////////////////////////////
	public String getTel()
	{
		return tel;
	}
	public void setTel(String valor)
	{
		tel=valor;
	}
	///////////////////////////////////
	
	
	public void imprimirDatos()
	{
		System.out.println("Nombre: "+getNombre());
		System.out.println("Apellido: "+getAp());
		System.out.println("RFC: "+getRfc());
		System.out.println("Tipo de persona: "+getTipo());
		System.out.println("Edad: "+getEdad());
		System.out.println("Telefono: "+getTel());
	}
}
