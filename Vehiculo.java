package ej8;

public class Vehiculo
{
	// ATRIBUTOS - PRIVADO
	private String marca;
	private String modelo;
	private double precio;
	private int year;
	private String color;
	// Los metodos no tienen valor de retorno, solo ACCESO NOMBRE(PARAMETROS) 
	// Constructor default: Constructor sin parametros
	
	public Vehiculo() // CONSTRUCTOR DEFAULT
	{
		System.out.println("CREANDO OBJETO VEHICULO");
		marca="SIN MARCA";
		modelo="SIN MODELO";
		precio=0;
		year=0;
		color="SIN COLOR";
	}
	
	public Vehiculo(String mar, String mod, int y, double pre, String col) // CONSTRUCTOR CON PARAMETROS
	{
		marca=mar;
		modelo=mod;
		precio=pre;
		year=y;
		color=col;
	}
	
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
