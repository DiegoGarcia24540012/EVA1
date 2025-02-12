package ej7;

public class Main7
{
	public static void main(String[] args)
	{
		Productos prod = new Productos();
		Clientes cl = new Clientes();
		
		System.out.println("### SISTEMA DE CLIENTES Y PRODUCTOS ###\n\n\n    PRODUCTO:\n");
		
		prod.setClave("AVON-B0022");
		prod.setInv(24);
		prod.setMarca("Avon");
		prod.setNombre("Jabon corporal");
		prod.setPrecio(36);
		prod.imprimirDatos();
		
		System.out.println("\n\n    CLIENTE: \n");
		cl.setAp("Garcia");
		cl.setEdad(19);
		cl.setNombre("Diego");
		cl.setRfc("GACL051212HCHRRSA7");
		cl.setTel("6481080988");
		cl.setTipo("Fisica");
		cl.imprimirDatos();
	}
}
