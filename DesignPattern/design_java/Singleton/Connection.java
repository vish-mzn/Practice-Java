package Singleton;
class Connection 
{
	private static boolean haveOne = false;
     Connection() throws Exception
    {
        if (!haveOne) {
           doSomething();
           haveOne = true;
        }else 
        {
          throw new Exception("You cannot have a second   instance");
        }
    }
    public static Connection getConnection() throws Exception{
    	
      return new Connection();
   }
    void doSomething() {
    	System.out.println("hai");
    }
    //...
    
    public static void main(String [] args) 
    {
    	   	
        try {
            Connection con = new Connection(); //ok
        System.out.println("am from main");    
        }catch(Exception e) {
            System.out.println("first: " +e.getMessage());
        }
                     
     try {
            Connection con2 = Connection.getConnection(); //failed.
           
        }catch(Exception e) {
            System.out.println("second: " +e.getMessage());
        }
    /*    try
        {
        	Connection con3=new Connection();
        }catch(Exception e){
        	System.out.println(e);}*/
        }
    }
 