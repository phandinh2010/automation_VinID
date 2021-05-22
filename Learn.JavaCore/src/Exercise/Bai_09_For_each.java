package Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Bai_09_For_each {
	// Viết ct nhâp vao so nguyên dương n (n>0) (n nhập vào từ bàn phím)

	// Tính tổng S(n) = 1+ 1/2+ 1/3+ ...+ 1/n

	public static void main(String[] args) {
		Sum_Bai_01();
		
	}
	
	public static float Sum_Bai_01 () {
		
		float sum = 0;
		int n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Input n = ");
			n = sc.nextInt();
		} while (n <= 0);

		for (int i = 1; i <= n; i++) {
			sum += 1.0 / i;
		}

		System.out.println("Sum = " + sum);
 return sum;
	}
	
	
	public 
}
