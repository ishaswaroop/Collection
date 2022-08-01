package com.globalLogic.Collections;
import java.util.*;
class Employee{
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
	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", id=" + id + "]";
	}
	public Employee(int age, String name, int id) {
		super();
		this.age = age;
		this.name = name;
		this.id = id;
	}
	
	
}
public class Student2 {
 public static void main(String args[]) {
	 ArrayList <Employee>arr=new ArrayList<>();
	 arr.add(new Employee(23,"Isha",1));
	 arr.add(new Employee(16,"Suraj",2));
	 arr.add(new Employee(23,"Shashwat",3));
	 arr.add(new Employee(27,"Manas",4));
	 arr.add(new Employee(29,"Yah",5));
	Collections.sort(arr,new SortById());
	Collections.sort(arr,new SortByName());
	System.out.println(arr);
 }
}
