package Exercise;

public class Bài_03_Chia_Het_3_5 {

	public static void main(String[] args) {
		System.out.println("");
		
		for (int i = 1; i < 100; i++) {
			if (i % 5 == 0) {
				if (i % 3 == 0) {
					System.out.println( i + "chia hết cho 3 và 5");
					
				}
				else {
					System.out.println(i + "chia hết cho 5");
				}
				
			}
			else {
			
		System.out.println(i);

	}
		}
	
}
}
