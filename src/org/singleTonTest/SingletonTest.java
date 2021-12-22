package org.singleTonTest;

public class SingletonTest {

	public static SingletonTest s;

	private SingletonTest() {

	}

	public static SingletonTest createObject() {

		if (s == null) {

			s = new SingletonTest();

		}

		return s;

	}

	public void empId() {
		System.out.println("42141");

	}

	public void empName() {
		System.out.println("Hariharan");

	}

	public static void main(String[] args) {

		SingletonTest st = createObject();

		st.empId();
		st.empName();
		
		System.out.println(System.identityHashCode(st));
		
		SingletonTest stt= createObject();
		
		stt.empId();
		stt.empName();
		
		System.out.println(System.identityHashCode(stt));
		System.out.println(System.identityHashCode(s));

	}
}
