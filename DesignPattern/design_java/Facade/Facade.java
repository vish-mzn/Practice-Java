package Facade;
interface General {
    public void accessGeneral();
}
interface Special extends General {
    public void accessSpecial();
}
interface Private extends General {
    public void accessPrivate();
}

class GeneralInfo implements General {
    public void accessGeneral() {
    	 System.out.println("General welcome");
    }
}
class SpecialInfo implements Special{
    public void accessSpecial() {
        System.out.println("Special welcome");
    }
    public void accessGeneral() {
    	System.out.println(" Special General");
    	
    }
    //...
}
class PrivateInfo implements Private, Special {
    public void accessPrivate() {
	// ...
    }
    public void accessSpecial() {
	//...
    }
    public void accessGeneral() {
	// ...
    }
    //...
} 
class Facade {
	   public static void main(String args[])
	   {
	    GeneralInfo gi=new GeneralInfo();
	    SpecialInfo si=new  SpecialInfo();
	    PrivateInfo pi=new PrivateInfo();
	    Object a=gi;
	   if (gi instanceof Object)
	   {
		   new GeneralInfo().accessGeneral();
		   
		   }
	    else
	    {
	    System.out.println("Bye");
	    }
	   if (si instanceof Object)
	   {
		   new SpecialInfo().accessSpecial();
		    }
	   
	   if (pi instanceof Object)
	   {
		   new PrivateInfo().accessPrivate();
	   }
	   }
}
