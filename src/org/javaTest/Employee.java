package org.javaTest;

public class Employee {

	private int id;
	private String name;
	private long Phoneno;

	// Yes, it is possible by using encapsultion. we can access private method
	// Right click ----> source ----> Generate getters and setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhoneno() {
		return Phoneno;
	}

	public void setPhoneno(long phoneno) {
		Phoneno = phoneno;
	}

}
