package Person;

import java.time.LocalDate;

import MyMath.Vector;

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
		
		Person person2 = new Person("Bill", "Gates", LocalDate.of(1970, 11, 02));
		
		if (person.equals(person2)) {
			System.out.println("Hai đối tượng giống nhau");			
		} else {
			System.out.println("Hai đối tượng khác nhau");
		}
	}
	
	public static void demoMyMath() {
		Vector vector = new Vector(3,4);
		System.out.println(vector.x);
	}
}
