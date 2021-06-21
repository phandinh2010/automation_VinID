package Thay_Cuong;

import java.time.LocalDate;

public class Person {
	public Person() {
		this.firstName = "";
		this.lastName = "";
		this.birthday = LocalDate.now();
		
		
	}

	public Person(String firstName, String lastName, LocalDate birthday) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", birthday=" + birthday + "]";
	}
	String firstName;
	String lastName;
	LocalDate birthday;

	
	public void work() {
		System.out.println("work 8 hours day");
	}
}
