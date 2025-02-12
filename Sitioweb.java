package fichas_apa;

public class Sitioweb
{
	private String ap;
	private String i;
	private int year;
	private int dia;
	private String mes;
	private String sitio;
	private String url;
	
	////////////  GET Y SET  ////////////
	
	public String getAp()
	{
		return ap;
	}
	public void setAp(String valor)
	{
		ap=valor;
	}
	/////////////////////////////////////
	public String getI()
	{
		return i;
	}
	public void setI(String valor)
	{
		i=valor;
	}
	/////////////////////////////////////
	public int getYear()
	{
		return year;
	}
	public void setYear(int valor)
	{
		year=valor;
	}
	/////////////////////////////////////
	public int getDia()
	{
		return dia;
	}
	public void setDia(int valor)
	{
		dia=valor;
	}
	//////////////////////////////////////
	public String getMes()
	{
		return mes;
	}
	public void setMes(String valor)
	{
		mes=valor;
	}
	///////////////////////////////////////
	public String getSitio()
	{
		return sitio;
	}
	public void setSitio(String valor)
	{
		sitio=valor;
	}
	///////////////////////////////////////
	public String getUrl()
	{
		return url;
	}
	public void setUrl(String valor)
	{
		url=valor;
	}
	///////////////////////////////////////
	
	
	public void imprimirReferencia()
	{
		System.out.println(getAp()+", "+getI()+". ("+getDia()+" de "+getMes()+" de "+getYear()+"). "+getSitio()+". Obtenido de\n     "+getUrl());
	}
}
