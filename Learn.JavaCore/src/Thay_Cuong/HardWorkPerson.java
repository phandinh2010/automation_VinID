package Thay_Cuong;

import java.time.LocalDate;

public class HardWorkPerson extends Person {

	

	public HardWorkPerson(String firstName, String lastName, LocalDate birthday) {
		super(firstName, lastName, birthday);		
	}

	@Override
	public void work() {		
		super.work(); //Gọi phương thức lớp cha
		System.out.println("Continúe to work 4 hours in evening");
	}
	

}
