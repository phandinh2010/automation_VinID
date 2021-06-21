package Car;

import java.time.LocalDate;

public class ACar {
	
	

	public ACar(String color, String type, LocalDate mfgDate, LocalDate expDate) {
		super();
		this.color = color;
		this.type = type;
		this.mfgDate = mfgDate;
		this.expDate = expDate;
	}

	String color, type;
	LocalDate mfgDate, expDate;
	
	
	public void Cost( String type) {
		if (type == "sedan A") {
		System.out.println("Cost : 300-500tr");
			
		} else if (type == "sedan B") {
			System.out.println("Cost : 500-900tr");
		}
		else {
			System.out.println("Cost: > 1billion");
		}
	}

	public void Speed() {
		if (type == "sedan A") {
			System.out.println("Slow");
				
			} else if (type == "sedan B") {
				System.out.println("Middle");
			}
			else {
				System.out.println("Fast");
			}
	}
	
}
