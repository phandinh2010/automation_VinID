package Person;

import java.time.LocalDate;

public class HardWorkPerson extends Person {

	

	public HardWorkPerson(String firstName, String lastName, LocalDate birthday) {
		super(firstName, lastName, birthday);		
	}

	@Override
	public void work() {		
		super.work(); //Gá»�i phÆ°Æ¡ng thá»©c lá»›p cha
		System.out.println("ContinÃºe to work 4 hours in evening");
	}
	public void  workRemoteFromHome() {
		System.out.println("Connect to Internet, and work from home");
	}
}
