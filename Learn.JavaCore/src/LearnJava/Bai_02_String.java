package LearnJava;

import java.util.Scanner;

public class Bai_02_String {
	public static void main(String[] args) throws Exception {

	 double high, weight, BMI;
	 
	 
	 
	 
	 Scanner sc = new Scanner(System.in);
		
		 System.out.print("Nhập chiều cao:");
		 high = sc.nextDouble();
		 
		 System.out.println("Nhập cân nặng:");
		 weight = sc.nextDouble();
		 
	//	 BMI = weight/Math.pow(high, 2);
		 BMI = weight/(high*high);
		 System.out.println(BMI);
		
		 if (BMI < 18.5) {
			 System.out.println("Thiếu cân");
			
		} else if ( BMI >= 18.5 && BMI <= 25.9) {
			System.out.println("trung binh");
			
		}else {
			System.out.println("thừa cân");
			
		}
			

		}     
	      
	   

	public void Sum() {
		int a = 10;
		int b = 30;
		int c = a + b;
		System.out.print("tổng a + b= " + c);
	}
}
