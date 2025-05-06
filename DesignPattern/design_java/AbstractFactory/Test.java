package AbstractFactory;

class DataInfo {
	
}
interface Local
{
  DataInfo[] loadDB(String filename);
}

interface Remote extends Local
{
  void connect2WWW(String url);
}

class LocalMode implements Local {
  public DataInfo[] loadDB(String name) 
  {
	  System.out.println("Load from a local database"+name); 
    
    return null;
  }
}
class RemoteMode implements Remote {
	  public void connect2WWW(String url) {
	    System.out.println("Connect to a remote site am remote ");
	  }
	  public DataInfo[] loadDB(String name) {
	     System.out.println("Load from a remote database "+name);
	     return null;
	  }
	}
	
	// The Abstract Factory
	interface ConnectionFactory 
	{
	  Local getLocalConnection();
	  Remote getRemoteConnection();
	}
	
	
	class DataManager implements ConnectionFactory 
	{
	    boolean local = false;
	    DataInfo[] data;
	    //...
	    public Local getLocalConnection() {
	        return new LocalMode();
	    }
	   public Remote getRemoteConnection() {
	        return new RemoteMode();
	    }
	    
	    public  void loadData() {
	         if(local)
	         {
	            Local conn = getLocalConnection();
	            data = conn.loadDB("hello am from Local");
	         }else 
	         {
	            Remote conn = getRemoteConnection();
	          //  conn.connect2WWW("www.cognizant.com");
	            data = conn.loadDB(" hello am from Remote");
	         }
	         
	     }
		 // work on data 
	   
	   /* public void setConnection(boolean b)
	    {
	       local = b;
	    }*/
	 
}
	class Test
	{
		public static void main(String args[])
		{
			new DataManager().loadData();
			LocalMode l= new LocalMode();
			l.loadDB(" am from Local Main");
			
			
			RemoteMode r=new RemoteMode();
			r.connect2WWW("www.cognizant.com");
			//new DataManager().loadData();
			//new DataManager().getRemoteConnection();
			
			
		}
	}
	

	    