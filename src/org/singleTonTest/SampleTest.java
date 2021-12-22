package org.singleTonTest;

public class SampleTest {
	
	// This Class Memory location will be different
	private void dhina() {

		System.out.println("Hello");

	}

	public static void main(String[] args) {

		// with out extends ----> parent class constructor will be in public or private
		// both will be accept
		SingletonTest st = SingletonTest.createObject();

		// with extends ----> parents constructor will be in public only
		// SingletonTest sh = createObject();

		st.empId();
		st.empName();
        
		
		// it was SingleTon Class memory location
		System.out.println(System.identityHashCode(st));

		SampleTest s = new SampleTest();

		s.dhina();
		
		//it was SampleTest Class memory location
		System.out.println(System.identityHashCode(s));
	}

}
