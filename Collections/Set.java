package com.globalLogic.Collections;
import java.util.*;
class Employee5 implements Comparable<Employee5>{
	int age;
	String name;
	int id;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Employee5(int age, String name, int id) {
		super();
		this.age = age;
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", id=" + id + "]";
	}
	@Override
	public int compareTo(Employee5 o) {
		// TODO Auto-generated method stub
		 return this.name.compareTo(o.name);
	}
	
	
}
public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashSet<Employee5>hs=new HashSet();
       Scanner sc=new Scanner(System.in);
       int age,id;
       String name;
  	 System.out.println("Press 1 to add the employees to the Set");
  	 System.out.println("Press 2 to delete the employees from the List");
  	 System.out.println("Press 3 to Search the employee ");
  	 System.out.println("Press 4 to Sort the Set");
  	
  	 
  	 lp : while(true) // labeling the while loop
       {
  		 System.out.print("Make your choice: ");  
  	 int choice=sc.nextInt();
  	 switch(choice) {
  	 
  	 case 1:sc.nextLine();
  		 System.out.println("Enter the name");
  	 name=sc.nextLine();
  	 System.out.println("Enter the id");
  	 id=sc.nextInt();
  	 System.out.println("Enter the age");
  	 age=sc.nextInt();
  	 hs.add(new Employee5(age,name,id));
  	 System.out.println("Details added successfully");
  	 break;
  	 case 2:sc.nextLine();
  	 System.out.println("Enter the name to be deleted");
  	 name=sc.nextLine();
  	 Iterator<Employee5>iterator=hs.iterator();
  	 while(iterator.hasNext()) {
  		 	Employee5 value=iterator.next();
  		 	if(value.getName().equals(name)) {
  		 		iterator.remove();
  	 }
  	 	
  	 }
  	System.out.println(hs);
  	
  	 System.out.println("Details deleted successfully");
  	 break;
  	 
  	 case 3:sc.nextLine();
  	 System.out.println("Enter the name to be searched");
  	 name=sc.nextLine();
  	 for(Employee5 emp:hs)
  	 {
  		 if(emp.getName().equalsIgnoreCase(name)) {
  			 	System.out.println("Name Found");
  		 }else {
  			 System.out.println("Name not found");
  		 }
  	 }
  	 break;
	
  	 case 4:
  		TreeSet<Employee5>ts=new TreeSet<>(hs);
  		System.out.println(ts);
  		break;
  		default:System.out.println("Wrong choice");
  		
}
}
}
}
