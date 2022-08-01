package com.globalLogic.Collections;
import java.util.Scanner;

import java .util.*;
public class Student {
 public static  void main(String args[]) {
	
	 ArrayList<String>employees=new ArrayList<>();
	 ArrayList<Integer>salary=new ArrayList<>();
	 String name,name1,name2,name3;
	 int index,n,sum=0;
	 int max,min;
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
	 case 1:
		 sc.nextLine();
		 System.out.println("Enter the employee name to be added \n");
		 name=sc.next();
		 employees.add(name);
		 System.out.println("Name added auccessfully");
	     break;
	 case 2:
		 sc.nextLine();
		 System.out.println("Enter the employee name to be deleted \n");
	     name1=sc.next();
	     employees.remove(name1);
	     System.out.println("Name deleted successfully");
	     break;
	 case 3:
		 sc.nextLine();
		 System.out.println("Enter the name to be searched");
	     name2=sc.nextLine();
	     if(employees.contains(name2)) {
		 System.out.println("Name found");
	     }else {
		 System.out.println("Name Not Found");
	     }
	     break;
	 case 4:
		 sc.nextLine();
		 System.out.println("Enter the name to be updated");
	     name3=sc.nextLine();
	     System.out.println("Enter the index");
	     index=sc.nextInt();
	     employees.set(index, name3);
	     break;
	 case 5:
		 Collections.sort(employees);
		 Collections.sort(salary);
	      System.out.println("The Sorted List is");
	      Iterator<String > it=  employees.iterator();
	      Iterator<Integer>it2=salary.iterator();
		 while(it.hasNext())
		{
			//String element=it.next();
			System.out.println("element are "+it.next());
	    }
		 while(it.hasNext()) {
			 System.out.println("elements are "+it2.next());
		 }
		break;
	 case 6:
		 System.out.println("Enter the number of employees");
	     n=sc.nextInt();
	     System.out.println("Enter the salaries");
	     for(int i=0;i<n;i++) {
		int m=sc.nextInt();
		salary.add(m);
	    }
	     sum=0;
	    for(Integer a:salary) {
		 sum=sum+a;
	    }
	    System.out.println("Sum of the salaries are  "+sum);
	    break;
	 case 7:
		 System.out.println("Enter the number of employees");
	     n=sc.nextInt();
	     System.out.println("Enter the salaries");
	     for(int i=0;i<n;i++) {
		int m=sc.nextInt();
		salary.add(m);
	    }
		 max=Collections.max(salary);
	     System.out.println("Highest salary is "+max);
	     break;
	 case 8:
		 System.out.println("Enter the number of employees");
	     n=sc.nextInt();
	     System.out.println("Enter the salaries");
	     for(int i=0;i<n;i++) {
		 int m=sc.nextInt();
		 salary.add(m);
	     }
		 min=Collections.min(salary);
	     System.out.println("Minimum salary is "+min);
	     break;
	 default:
		 System.out.println("Wrong Choice");
	 }
     }
 }

public Student() {
	super();
	// TODO Auto-generated constructor stub
}
}
