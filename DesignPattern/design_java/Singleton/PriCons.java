package Singleton;

public class PriCons {

	 int a;
	private PriCons()
	{
	System.out.println("Hai");
	}
	
	private PriCons(int a)
	{
	 this.a=a;
	 System.out.println(this.a);
   }
	public static PriCons getConnection() throws Exception
	{
	      return new PriCons();
	}
	public static void main(String args[])
	{
		PriCons p=new PriCons();
		try
		{PriCons p1=PriCons.getConnection();}catch(Exception e){}		
	   try
	   {
	  PriCons p2=new PriCons();
	   }catch(Exception e){System.out.println(e);}
	}
}
