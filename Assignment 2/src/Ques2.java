import java.util.Arrays;
import java.util.Scanner;

class Employee{
	int id;
	String name;
	int salary;
	
	public Employee(int id,String name,int salaray) {
		this.id=id;
		this.name=name;
		this.salary=salaray;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
public class Ques2 {
 
	public static void main(String[] args) {
	       Employee emp[]= {
	    		   new Employee(1, "Aman", 10000),
	    		   new Employee(2,"samarth",20000)
	    		   
	       };
	       Scanner sc=new Scanner(System.in);
	       System.out.println("enter the salary");
	       int key=sc.nextInt();
	       for(Employee e:emp) {
	    	   if(e.salary==key) {
	    		   System.out.println(e);
	    	   }
	       }
	       
	}

}
