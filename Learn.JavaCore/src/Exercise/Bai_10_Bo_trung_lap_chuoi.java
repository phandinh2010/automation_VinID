package Exercise;

public class Bai_10_Bo_trung_lap_chuoi {

	public static void main(String[] args) {
		
		System.out.println(removeDuplicate("ahdn kdhfkdfkslds"));

	}

	public static String removeDuplicate(String stringBanDau) {

		String output = new String();
		for (int i = 0; i < stringBanDau.length(); i++) {
			if (output.indexOf(stringBanDau.charAt(i)) < 0) {
				output = output + stringBanDau.charAt(i);
			}

		}
		return output;

	}

}
