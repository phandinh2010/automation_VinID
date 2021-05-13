package Exercise;

public class Bai_02_For {
	public static void main(String[] args) {
	
	int sum = 50;
	 for (int i =  0; i < sum; i++) {
		 if (i % 2 == 0) {
			sum = (i++);
			
		}
	}	
		System.out.println(sum);			

	}	
	

}
 