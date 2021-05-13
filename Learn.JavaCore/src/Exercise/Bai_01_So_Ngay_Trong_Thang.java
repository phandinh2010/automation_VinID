package Exercise;

import java.util.Scanner;

public class Bai_01_So_Ngay_Trong_Thang {
	 public static int Month, NumberDay;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		 while (true) {
			 System.out.print("Nhập một tháng bất kì: ");
			 Month = sc.nextInt();
			
			//NumberDayOnMonth_Cach_01();
			NumberDayOfMonth_Cach_02();
			
		}
		
	}

	public static void NumberDayOnMonth_Cach_01() {			 
		
		if (Month == 2) {
			System.out.println("Có 28 hoặc 29 ngày");
			
		} if  (Month == 1 ||Month == 3 || Month == 5  ||Month == 7 || Month == 8|| Month == 10|| Month == 12) {			
		
			System.out.println("Có 31 ngày");

		} else {
			System.out.println("Có 30 ngày");

		}  
			
		
		
	}
	 public static void NumberDayOfMonth_Cach_02() {
		 
		 switch (Month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Có 31 ngày");
			break;
		case 2:
			System.out.println("Có 28 hoặc 29 ngày");

		default:
			System.out.println("Có 30 ngày");
			break;
		}
	 }
	
}
