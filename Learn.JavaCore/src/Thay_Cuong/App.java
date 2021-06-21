package Thay_Cuong;

import java.time.LocalDate;

public class App {

	public static  void main(String[] args) {
		System.out.println("hello world");
		demoPerson();

	}

	public static void demoPerson() {
		Person person = new Person();
		person.firstName = "Bill";
		person.lastName = "Gate";
		person.birthday = LocalDate.of(1970, 11, 02);
		System.out.println(person);
		
		Person steveJobs = new Person ("Steve", "Jobs", LocalDate.of(1970, 11, 02 ));
		System.out.println(steveJobs);
		
		HardWorkPerson elonMusk = new HardWorkPerson ("Elon", "Musk", LocalDate.of(1972, 11, 02 ));
		elonMusk.work();
	}
	
	
}
