package fichas_apa;

public class Main6
{
	public static void main (String[] args)
	{
		Libro lib = new Libro();
		Sitioweb web = new Sitioweb();
		
		System.out.println("### GENERADOR DE FORMATO APA ###\n");
		
		System.out.println("\nLIBRO:");
		lib.setAp1("Garcia");
		lib.setAp2("Marquez");
		lib.setI("G");
		lib.setCd("Buenos Aires");
		lib.setEdit("Editorial Sudamericana");
		lib.setLibro("Cien años de soledad");
		lib.setYear(1967);
		lib.imprimirReferencia();
		
		System.out.println("\nSITIO WEB:");
		web.setAp("Solis");
		web.setDia(7);
		web.setI("S");
		web.setMes("Febrero");
		web.setSitio("El Heraldo de Chihuahua");
		web.setUrl("https://oem.com.mx/elheraldodechihuahua/");
		web.setYear(2025);
		web.imprimirReferencia();
		
	}
}