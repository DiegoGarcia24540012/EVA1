package ej9;

public class Television
{
	// AGREGAR CONST DEFAULT.  TV APAGADA, CANAL 3, VOLUMEN 10.  CONST CON PARAMETROS
	
	public Television()
	{
		System.out.println("CREANDO OBJETO TELEVISION");
	}
	
	public Television(boolean enc, int vol, int can)
	{
		encendido=enc;
		volumen=vol;
		canal=can;
	}
	
	private boolean encendido;
	private int volumen;
	private int canal;
	
	public void encenderApagar()
	{
		if(encendido == true)
			encendido = false;
		else
			encendido = true;
	}
	
	public void subirVol()
	{
		if(encendido==true)
		{
		   volumen+=1;
		   if(volumen>100)
			   volumen=100;	
		}
		else
			volumen=+0;
	}
	public void bajarVol()
	{
		if(encendido==true)
		{
		   volumen-=1;
		   if(volumen<0)
			   volumen=0;
		}
		else
			volumen=+0;
	}
	
	public void imprimirDatos()
	{
		if(encendido == true)
			System.out.println("TV Encendida.");
		else
			System.out.println("TV Apagada");
		
		System.out.println("Volumen: "+volumen);
		System.out.println("Canal: "+canal+"\n---------------");
	}
	
	public void canalSub()
	{
		if(encendido==true)
		{
			canal=canal+1;
			if(canal>10)
				   canal=0;
		}
	}
	
	public void canalBaj()
	{
		if(encendido==true)
		{
			canal=canal-1;
			if(canal<0)
				   canal=0;
		}
	}
	
	public void canalSet(int valor)
	{
		if(encendido==true)
		{
			canal=valor;
		}
	}
}
