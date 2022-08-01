package com.globalLogic.Collections;
import java.util.*;
public class ArrayList12 {
public static void main(String args[]) {
	ArrayList<String> ls=new ArrayList();
	ls.add("Isha");
	ls.add("Manas");
	ls.add("Shashwat");
	ls.add("Suraj");
	ls.add("Yash");
	Iterator<String > it=  ls.iterator();
	//it will check there is any next element is there or not
	//it will return true if there is any element
	//it will return false if there is not element
	

	
	
	while(it.hasNext())
	{
		//String element=it.next();
		System.out.println("element is "+it.next());
}
}
}
