package Singleton;
class SingleOnly {
	   private static SingleOnly instance = new SingleOnly();
	   
	   public SingleOnly(){}
	  
	   public static SingleOnly getInstance(){
	      return instance;
	   }
	   public void showMessage(){
	      System.out.println("I am from cts");
	   }
	}
public class SingletonPattern 
{
	   public static void main(String[] args) {

	           SingleOnly object = new SingleOnly();

	     	      SingleOnly so = SingleOnly.getInstance();

	           so.showMessage();
	   }
	}


/*
public class Sequence {
private static Sequence instance;
private static int counter;
private Sequence()
{
counter = 0; // May be necessary to obtain
// starting value elsewhere...
}
public static synchronized Sequence getInstance()
{
if(instance==null) // Lazy instantiation
{
instance = new Sequence();
}
return instance;
}
public static synchronized int getNext()
{
return ++counter;
}
}*/