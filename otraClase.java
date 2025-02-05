package otraclases;

public class otraClase 
{
	public static void main(String[] args) 
	{
		otraClase otraclase = new otraClase();
		Prueba prueba = new Prueba(); //Una clase default solo es visible en su mismo paquete.
		//INSTANCIAR UN OBJETO: CLASE IDENTIFICADOR = new CLASE();
		persona pers = new persona();
		
		pers.setNombre("Luis Diego");
		System.out.println("Nombre(s): "+pers.getNombre());
		
		pers.setApellidos("Garcia Carreon");
		System.out.println("Apellidos: "+pers.getApellidos());
		
		pers.setEdad(19);
		System.out.println("Edad: "+pers.getEdad());
		
		pers.setGenero("Hombre");
		System.out.println("Genero: "+pers.getGenero());
		
		pers.setCurp("GACL051212HCHRRSA7");
		System.out.println("CURP: "+pers.getCurp());
	}
}

class Prueba
{
	
}
