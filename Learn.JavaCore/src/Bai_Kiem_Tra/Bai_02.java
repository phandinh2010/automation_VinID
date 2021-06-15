package Bai_Kiem_Tra;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Bai_02 {

	public void CheckPassword() {
		Scanner sc2 = new Scanner(System.in);

		String inputPass;
		String EMAIL_PATTERN = "\"^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{10,}$\"";
		String EMAIL_PATTERN1 = "\"^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{0,9}$\"";

		System.out.println("Nhập vào password: ");
		inputPass = sc2.nextLine();

		if (Pattern.matches(EMAIL_PATTERN, inputPass)) {

			System.out.println("Good password ");
		} else if (Pattern.matches(EMAIL_PATTERN1, inputPass)) {
			System.out.println("Mật khẩu yếu");
		} else {
			System.out.println("Mật khẩu chưa đủ mạnh");
		}

		
	}
}
