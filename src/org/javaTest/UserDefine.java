package org.javaTest;

import java.util.ArrayList;
import java.util.List;

public class UserDefine extends Employee {

	public static void main(String[] args) {

		Employee e1 = new Employee();

		e1.setId(12);
		e1.setName("Hariharan");
		e1.setPhoneno(8015942141l);

		Employee e2 = new Employee();

		e2.setId(9);
		e2.setName("Mageshwari");
		e2.setPhoneno(9790442120l);

		Employee e3 = new Employee();

		e3.setId(1209);
		e3.setName("HariMagi");
		e3.setPhoneno(121995092001l);

		List<Employee> li = new ArrayList<Employee>();

		li.add(e1);
		li.add(e2);
		li.add(e3);

		for (int i = 0; i < li.size(); i++) {

			System.out.println("My Employee Id   Is  = " + li.get(i).getId());

			System.out.println("My Phone Number  Is  = " + li.get(i).getPhoneno());

			System.out.println("My Employee Name Is  = " + li.get(i).getName());

		}

	}

}
