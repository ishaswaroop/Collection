package com.globalLogic.Collections;

import java.util.Comparator;

public class SortByNameArr implements Comparator<Employee3> {

	@Override
	public int compare(Employee3 o1, Employee3 o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}

}
