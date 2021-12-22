package org.javaTest;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UserDefineMap extends Employee {

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

		Map<Integer, Employee> mp = new LinkedHashMap<>();

		mp.put(01, e1);
		mp.put(02, e2);
		mp.put(03, e3);

		Set<Entry<Integer, Employee>> enSt = mp.entrySet();

		for (Entry<Integer, Employee> e : enSt) {

			System.out.println("Order = " + e.getKey());

			System.out.println("My Employee Id Is = " + e.getValue().getId());

			System.out.println("My Phone Number Is = " + e.getValue().getPhoneno());

			System.out.println("My Employee Name Is = " + e.getValue().getName());

		}

	}
}
