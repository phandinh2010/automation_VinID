package Car;

import java.time.LocalDate;

public class NewCar {

	public static void main(String[] args) {
		MyCar();
		HisCar();
	}
	
	public static void  MyCar() {
		ACar myCar = new ACar("Blue", "sedan C", LocalDate.of(2015, 12, 02), LocalDate.of(2015, 12, 11));
		myCar.Speed();
		myCar.Cost(myCar.type);
	}
	
	public static void  HisCar() {
		ACar hisCar = new ACar("Black", "sedan A", LocalDate.of(2015, 12, 02), LocalDate.of(2015, 12, 11));
		hisCar.Speed();
		hisCar.Cost(hisCar.type);
	}
}
