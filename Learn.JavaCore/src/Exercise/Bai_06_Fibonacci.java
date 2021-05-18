package Exercise;

import java.util.Scanner;

public class Bai_06_Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hãy nhập số n:");
		int n = sc.nextInt();

		Show_Fibonacci(n);
		//Show_Fibonacci(8);

	}

	public static void Show_Fibonacci(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(Fibonacci(i) + " ");

		}

	}

	public static int Fibonacci(int n) {

		if (n == 0 || n == 1) {
			return n;
		} else {
			int Fibonacci[] = new int[n];
			Fibonacci[0] = 1;
			Fibonacci[1] = 1;
			for (int i = 2; i < Fibonacci.length; i++) {
				Fibonacci[i] = Fibonacci[i - 1] + Fibonacci[i - 2];
			}
			return Fibonacci[n - 1];

		}

	}
}
