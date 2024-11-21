import java.util.Scanner;

class Employee{
	int id;
	String name;
	
	public Employee(int id,String name) {
		this.id=id;
		this.name=name;
	}
}

public class Ques3_Employee {

	public static void main(String[] args) {
		Employee emp[]= {
				new Employee(1,"Aman"),
				new Employee(2,"raj")
		};
		Scanner sc= new Scanner(System.in);
//		System.out.println("enter the Employee id");
//		int id=sc.nextInt();
		
		System.out.println("enter Employee name");
		String name=sc.nextLine();
//		System.out.println(searchEmployeeId(emp, id));
		System.out.println(searchEmployeeName(emp, name));

	}
	public static boolean searchEmployeeId(Employee emp[],int id) {
		for(int i=0;i<emp.length;i++) {
			if(emp[0].id==id) {
				return true;
			}
		}
		return false;
	}
	public static boolean searchEmployeeName(Employee emp[],String name) {
		for(int i=0;i<emp.length;i++) {
		if(emp[i].name.equals(name)) {
			return true;
		}
		}
		return false;
	}

}
