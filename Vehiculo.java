package ej4;

public class Vehiculo
{
	// ATRIBUTOS - PRIVADO
	private String marca;
	private String modelo;
	private double precio;
	private int year;
	private String color;
	
	////////////////  GET Y SET  ////////////////////
	public String getMarca()
	 {
		return marca;
	 }
	
	public void setMarca(String valor)
	 {
		marca=valor;
	 }
	/////////////////////////////////////////////////
	public String getModelo()
	 {
		return modelo;
	 }
	
	public void setModelo(String valor)
	 {
		modelo=valor;
	 }
	////////////////////////////////////////////////
	public double getPrecio()
	 {
		return precio;
	 }
	
	public void setPrecio(double valor)
	 {
		precio=valor;
	 }
	////////////////////////////////////////////////
	public int getYear()
	 {
		return year;
	 }
	
	public void setYear(int valor)
	 {
		year=valor;
	 }
	////////////////////////////////////////////////
	public String getColor()
	 {
		return color;
	 }
	
	public void setColor(String valor)
	 {
		color=valor;
	 }
	////////////////////////////////////////////////
	
	
	//////////////    IMPRIMIR DATOS    //////////////////
	public void imprimirDatos()
	{
		System.out.println("- Datos del vehiculo -");
		System.out.println("Marca: "+getMarca());
		System.out.println("Modelo: "+getModelo());
		System.out.println("Año: "+getYear());
		System.out.println("Color: "+getColor());
		System.out.println("Precio: $"+getPrecio()+" MXN");
	}
}
