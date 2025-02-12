package ej7;

public class Productos
{
	private String nombre;
	private String marca;
	private String clave;
	private int inv;
	private double precio;
	
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
	public String getMarca()
	{
		return marca;
	}
	public void setMarca(String valor)
	{
		marca=valor;
	}
	/////////////////////////////////////
	public String getClave()
	{
		return clave;
	}
	public void setClave(String valor)
	{
		clave=valor;
	}
	/////////////////////////////////////
	public int getInv()
	{
		return inv;
	}
	public void setInv(int valor)
	{
		inv=valor;
	}
	/////////////////////////////////////
	public double getPrecio()
	{
		return precio;
	}
	public void setPrecio(double valor)
	{
		precio=valor;
	}
	/////////////////////////////////////
	
	public void imprimirDatos()
	{
		System.out.println("Producto: "+getNombre());
		System.out.println("Marca: "+getMarca());
		System.out.println("Precio: "+getPrecio());
		System.out.println("Clave: "+getClave());
		System.out.println("Inventario: "+getInv());
	}
}
