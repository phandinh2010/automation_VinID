package Exercise;

import java.util.Scanner;

public class Bai_07_Giai_thua {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 1;
		for (int i = 1; i <= n; i++) {
			// result *= i nghĩa là  result = result * i;
			result *= i;
		}
		System.out.print(result);
	}

}
