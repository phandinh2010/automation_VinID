package Bai_Kiem_Tra;

public class Bai_01 {

	
	static int count = 0;

	public int Count_Lowercase(String str) {

		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				count++;
			}

		}
		return count;

	}
}
