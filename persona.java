package otraclases;

public class persona
{
	//ATRIBUTOS
	private String nombre;
	private String apellidos;
	private int edad;
	private String genero;
	private String curp;
	//CONSTRUCTORES
	//METODOS
	
	//INTERFAZ: METODOS GET (leer) Y SET (escribir):
	
	public String getNombre()
	{
		return nombre;
	}
	
	public void setNombre(String valor)
	{
		nombre=valor;
	}
	
	/////////////////////////////////////////////////
	
	public String getApellidos()
	{
		return apellidos;
	}
	
	public void setApellidos(String valor)
	{
		apellidos=valor;
	}
	
	/////////////////////////////////////////////////
	
	public int getEdad()
	{
		return edad;
	}
	
	public void setEdad(int valor)
	{
		edad=valor;
	}
	
	/////////////////////////////////////////////////
	
	public String getGenero()
	{
		return genero;
	}
	
	public void setGenero(String valor)
	{
		genero=valor;
	}
	
	////////////////////////////////////////////////
	
	public String getCurp()
	{
		return curp;
	}
	
	public void setCurp(String valor)
	{
		curp=valor;
	}
}
