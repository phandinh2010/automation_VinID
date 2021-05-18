package Exercise;

import java.util.Scanner;

public class Bai_05_Bai_Ve_Nha {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Hãy nhập số n:");
//		int n = sc.nextInt();

		//Show_Prime(n);
		Show_Prime(100);
		

	}

	public static void Show_Prime(int n) {
		for (int i = 1; i < n; i++) {
			if (isPrime(i)) {
				System.out.println(i + " ");
			}
		}
	}

	public static boolean isPrime(int n) {
		// boolean result;

		if (n <= 2) {
			return true;
		} else {
			for (int i = 2; i <= Math.sqrt(n); i++)
				if (n % i == 0) {
					return false;
				}
		}
		return true;
	}
}
