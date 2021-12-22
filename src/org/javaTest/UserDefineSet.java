package org.javaTest;

import java.util.LinkedHashSet;
import java.util.Set;

public class UserDefineSet extends Employee {

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

		Set<Employee> si = new LinkedHashSet<Employee>();

		si.add(e1);
		si.add(e2);
		si.add(e3);

		for (Employee emp : si) {

			System.out.println("My Employee Id Is = " + emp.getId());

			System.out.println("My Phone Number Is = " + emp.getPhoneno());

			System.out.println("My Employee Name Is = " + emp.getName());

		}
	}

}
