package proxy;
interface Ifolder{  
    public void performOperations();  
}  
class Folder implements Ifolder{  
	 public void performOperations()  
	 {  
	         System.out.println("Performing operation on folder");  
	 }  
		}  
class FolderProxy implements Ifolder{  
	  
	 Folder folder;  
	 User user;  
	    
	 public FolderProxy(User user) {  
	  this.user = user;  
	 }  
		 public void performOperations() {  
	  if(user.getUserName().equalsIgnoreCase("kalpana") && user.getPassword().equalsIgnoreCase("kalpana"))  
	  {  
	   folder=new Folder();  
	   folder.performOperations();  
	  }  
	  else  
	  {  
	   System.out.println("You don't have access to this folder");  
	  }  
      }  
	}   
class User {  
	 String userName;  
	 String password;  
	    
	 public User(String userName, String password) {  
	  this.userName = userName;  
	  this.password = password;  
	 }  
	   
	 public String getUserName() {  
	  return userName;  
	 }  
	 public String getPassword() {  
	  return password;  
	 }  
  	}  
public class ProxyDesignPatternMain {  
	  	 public static void main(String[] args) {  
	    
	  //When you click on folder,Lets say a GUI form will ask for userName and password.  
	  //and this GUI will create this user object  
	    
	  // If we give correct wrong userName and password  
	  User user=new User("karthi","karthi");  
	  
	  FolderProxy folderProxyWrong=new FolderProxy(user);  
	  System.out.println("When userName and password are not correct:");  
	  folderProxyWrong.performOperations();  
	  System.out.println("**************************************");  
	  // if we give correct userName and Password  
	  User userWrong=new User("kalpana","kalpana");  
	  FolderProxy folderProxy=new FolderProxy(userWrong);  
	  System.out.println("When userName and password are correct:");  
	  folderProxy.performOperations();  
	 }  
  
	}  



	