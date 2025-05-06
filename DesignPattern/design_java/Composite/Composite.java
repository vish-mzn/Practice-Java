package Composite;

class Employee 
{
	   String name;
	   double salary;
	   Employee(String n, double s)
	   {
	       name = n;
	       salary = s;   
	       } 
	String getName() {
	      return name;   }
	   double getSalary() {
	      return salary;    }
	   public String toString() {
	       return "Employee " + name;   
	       }
	 } 
class Manager 
{
	   Manager mgr;
	   Employee[] ely;
	   String dept;
	   Manager(Manager mgr,Employee[] e, String d ) {
	       this(e, d);
	       this.mgr = mgr;   }
	   
	   Manager(Employee[] e, String d) 
	   {
	       ely = e;
	       dept =d;   
	       }
	   String getDept() 
	   {
	       return dept;   
	       }
	   Manager getManager() 
	   {
	       return mgr;   
	       }
	   Employee[] getEmployee() 
	   {
	       return ely;   
	       }
	   public String toString() 
	   {
	       return dept + " manager"; 
	       }
	   } 
class Composite
{
	   public static void main(String[] args) {
	       Employee[] e1 = {new Employee("Karthi", 50),
	                        new Employee("Raja", 60)};
	       Manager m1 = new Manager(e1, "Accounting");
	       
	       Employee[] e2 = {new Employee("Chitra", 70),
	                        new Employee("Daniel", 80),
	                        new Employee("Ezhil", 90)};
	       Manager m2 = new Manager(m1, e2, "Production");
	       
	       System.out.println(m2);
	       Employee[] emp = m2.getEmployee();
	       if (emp != null)
	             for (int k = 0; k < emp.length; k++)
	                  System.out.println(" "+emp[k]+" Salary: $"+ emp[k].getSalary());       
	       Manager m = m2.getManager();
	       System.out.println(" " + m);
	       if (m!= null) {
	          Employee[] emps = m.getEmployee();
	          if (emps != null)
	             for (int k = 0; k < emps.length; k++)
	                   System.out.println("    " + emps[k]+" Salary: $"+ emps[k].getSalary());
	        
	       }   
	   }
	} 