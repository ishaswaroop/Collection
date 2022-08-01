package com.globalLogic.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

class Employee3{
	int salary;
	String name;
     String address;
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee3 [salary=" + salary + ", name=" + name + ", address=" + address + "]";
	}
	public Employee3(int salary, String name, String address) {
		super();
		this.salary = salary;
		this.name = name;
		this.address = address;
	}
	
	
}

	public class Student3{
		public static void main(String args[]) {
			ArrayList<Employee3>employees=new ArrayList<>();
			String name,address,nameup;
			int salary;
			 Scanner sc=new Scanner(System.in);
			 System.out.println("Press 1 to add the employees to the List");
			 System.out.println("Press 2 to delete the employees from the List");
			 System.out.println("Press 3 to Search the employee name");
			 System.out.println("Press 4 to Update the employee name");
			 System.out.println("Press 5 to Sort the data of employees");
			 System.out.println("Press 6 to Provide the sum of salary of employee");
			 System.out.println("Press 7 to search for highest paid salary");
			 System.out.println("Press 8 to search for minimum paid salary");
			 lp : while(true) // labeling the while loop
		     {
				 System.out.print("Make your choice: ");  
			 int choice=sc.nextInt();
			 switch(choice) {
			 case 1: sc.nextLine();
			 System.out.println("Enter the employee name  \n");
			 name=sc.nextLine();
			 System.out.println("Enter the address \n");
			 address=sc.nextLine();
			 System.out.println("Enter the salary \n");
			 salary=sc.nextInt();
			 employees.add(new Employee3(salary,name,address));
			 System.out.println("Data added auccessfully");
		     break; 
			 case 2:sc.nextLine();
				 System.out.println("Enter the name to be deleted");
			 name=sc.nextLine();
			 Iterator<Employee3>iterator=employees.iterator();
		  	 while(iterator.hasNext()) {
		  		 	Employee3 value=iterator.next();
		  		 	if(value.getName().equals(name)) {
		  		 		iterator.remove();
		  	 }	 	
		  	 }
		  	System.out.println(employees);
			 break;
			 case 3:sc.nextLine();
				 System.out.println("Enter the name to be searched");
			 name=sc.nextLine();
			 for(Employee3 emp:employees) {
				 if(emp.getName().equalsIgnoreCase(name)) {
					 System.out.println("Name Found");
					
				 }
			 }
			 break;
			 case 4:sc.nextLine();
			 System.out.println("Enter the name to be updated");
			 name=sc.nextLine();
			 System.out.println("Enter the updated name");
			 nameup=sc.nextLine();
			 for(Employee3 emp:employees) {
				 if(emp.getName().equalsIgnoreCase(name)) {
					 emp.setName(nameup);
				 }
			 }
			 System.out.println(employees);
			 break;
			 case 5:
				 Collections.sort(employees,new SortByNameArr());
					System.out.println(employees);
					break;
			 case 6:
				 double sum = 0;

					for (Employee3 e : employees) {
						sum = sum + e.getSalary();
					}
					System.out.println(sum);
					break;
			 case 7:
				 int maxSal = Integer.MIN_VALUE;

					for (Employee3 e : employees) {
						if (maxSal < e.getSalary()) {
							maxSal = e.getSalary();
						}
					}
					System.out.println(maxSal);
					break;
			 case 8:
				 int minSal = Integer.MAX_VALUE;

					for (Employee3 e : employees) {
						if (minSal > e.getSalary()) {
							minSal = e.getSalary();
						}
					}
					System.out.println(minSal);
					break;
				}
				}
			 }
		     }
		
	