//package view;
//
//public class Main {
//
//}
package view;

import java.util.Scanner;

import entity.Employee;
import reposistory.EmployeeReposistory;

public class Main {
	
	static EmployeeReposistory employeeReposistory=new EmployeeReposistory();
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("1. Add Employee");
		System.out.println("2. Find Employee based on ID");
		System.out.println("3. Update the Employee");
		System.out.println("4  delete the Employee");
		
		
		System.out.println("Enter the option : ");
		int option=sc.nextInt();
		
		switch (option ) {
		case 1:
			System.out.println("ID: ");
			int id=sc.nextInt();
			System.out.println("name: ");
			String name=sc.next();
			System.out.println("salary : ");
			double salary=sc.nextDouble();
			System.out.println("dept :");
			String dept =sc.next();
			Employee employee = new Employee(id,name,salary,dept); 
			employeeReposistory.addEmloyee(employee);
			
			  break;
		case 2:
			System.out.println("Enter ID : ");
			id= sc.nextInt();
			System.out.println(employeeReposistory.findEmployee(id));
			break;
		case 3:
			System.out.println("Enter ID : ");
			id= sc.nextInt();
			System.out.println(employeeReposistory.updateEmployee(id));
			break;
		case 4:
			System.out.println("Enter ID : ");
			id= sc.nextInt();
			employeeReposistory.deleteEmployee(id);
			break;
			
		default:
			   break;
		}
		}

}
