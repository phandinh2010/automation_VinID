package Exercise_02;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;


public class Person {
	String name;
	String nationality;
	int age;

	public Person(String name, String nationality, int age) {
		this.name = name;
		this.nationality = nationality;
		this.age = age;
	}

	static ArrayList<Person> people = new ArrayList<>(List.of(
	    new Person("Vinh", "Vietnam", 28),
	    new Person("Lan", "Vietnam", 24),
	    new Person("John", "USA", 27),
	    new Person("Lee", "China", 67),
	    new Person("Kim", "Korea", 22),
	    new Person("Long", "Vietnam", 18),
	    new Person("Jungho", "Korea", 19),
	    new Person("Tian", "China", 20),
	    new Person("Clara", "USA", 40),
	    new Person("Mikura", "Japan", 27),
	    new Person("Sony", "Japan", 29),
	    new Person("Xiang", "China", 78),
	    new Person("Peter", "France", 18),
	    new Person("Haloy", "Malaysia", 20),
	    new Person("Magie", "Malaysia", 32)
	    ));
	
	 public String getNationality() {
		    return nationality;
		  }
	 
 public static void Exercise_01() {
	 HashMap<String, Integer> countPeopleByCoutry = new HashMap<>();
	 people.stream().forEach(person -> {
	      Integer count = countPeopleByCoutry.get(person.getNationality());
	      if (count == null) {
	         countPeopleByCoutry.put(person.getNationality(), 1);
	      } else {
	        countPeopleByCoutry.put(person.getNationality(), count + 1);
	      } 
	    });

	    for (Entry<String, Integer> entry : countPeopleByCoutry.entrySet()) {
	      System.out.println(entry.getKey() + " : "+ entry.getValue());
	    }
	  }
 }
 
 

