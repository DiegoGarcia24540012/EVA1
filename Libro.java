package fichas_apa;

public class Libro
{
	private String ap1;
	private String ap2;
	private String i;
	private int year;
	private String libro;
	private String cd;
	private String edit;
	
	////////////  GET Y SET  ////////////
	
	public String getAp1()
	{
		return ap1;
	}
	public void setAp1(String valor)
	{
		ap1=valor;
	}
	/////////////////////////////////////
	public String getAp2()
	{
		return ap2;
	}
	public void setAp2(String valor)
	{
		ap2=valor;
	}
	////////////////////////////////////
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
	public String getLibro()
	{
		return libro;
	}
	public void setLibro(String valor)
	{
		libro=valor;
	}
	//////////////////////////////////////
	public String getCd()
	{
		return cd;
	}
	public void setCd(String valor)
	{
		cd=valor;
	}
	///////////////////////////////////////
	public String getEdit()
	{
		return edit;
	}
	public void setEdit(String valor)
	{
		edit=valor;
	}
	///////////////////////////////////////
	
	
	public void imprimirReferencia()
	{
		System.out.println(getAp1()+" "+getAp2()+", "+getI()+". ("+getYear()+"). "+getLibro()+". "+getCd()+". "+getEdit()+".");
	}
	
	
}
