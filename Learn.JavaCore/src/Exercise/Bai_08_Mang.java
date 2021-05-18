package Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Bai_08_Mang {
	// Viết ct tạo mảng số nguyên n phần tử (n nhập vào từ bàn phím)

	// 1. Nhập phần tử cho mảng và in mảng ra màn hình

	public static void main(String[] args) {
	    int n, sum = 0, tempSort;
	    Scanner scanner = new Scanner(System.in);
	         
	    do {
	        System.out.println("Nhập vào số phần tử của mảng: ");
	        n = scanner.nextInt();
	    } while (n < 0);
	         
	    // khởi tạo và cấp phát bộ nhớ cho mảng
	    int array[] = new int[n];
	         
	    System.out.println("Nhập các phần tử cho mảng. Nhập phần tử thứ: ");
	    for (int i = 0; i < n; i++) {
	        System.out.print("Nhập phần tử thứ " + i + ": ");
	        array[i] = scanner.nextInt();
	    }
	         
	    // Hiển thị mảng vừa nhập
	    System.out.println("\nMảng ban đầu: ");
	    for (int i = 0; i < n; i++) {
	        System.out.print(array[i] + "\t");
	        System.out.println(array[i]);
	    }
	        
	    //Hiển thị phần tử tại ví trí index =2	    
	    System.out.println("Giá trị phần tử tại ví trí index =2 là " + array[2]);
	   
	    
	    // tính tổng các phần tử có trong mảng
	    for (int i = 0; i < n; i++) {
	        sum += array[i];
	    }
	    System.out.println("\nTổng các phần tử có trong mảng = " + sum);
	    
	    //In ra các số chẵn trong mảng và tỉnh tổng các số đó
	    for (int i = 0; i < array.length; i++) {
	    	if (array[i] == 0) {
	    		
				
			} else if ((array[i] != 0) && (array[i] % 2 == 0)) {
				System.out.println("Các số chẵn có trong mảng là: " + array[i]);
				sum += array[i];
				System.out.println( "Tổng các số chẵn trong mảng: " + sum);
				
			} {
				
			}
			
		}
	    
	         
	    // sắp xếp theo thứ tự giảm dần
	    for (int i = 0; i < n - 1; i++) {
	        for (int j = i + 1; j <= n - 1; j++) {
	            if (array[i] < array[j]) {
	                tempSort = array[i];
	                array[i] = array[j];
	                array[j] = tempSort;
	            }
	        }
	    }
	    System.out.println("Mảng sau khi sắp xếp là: ");
	    for (int i = 0; i < n; i++) {
	        System.out.print(array[i] + "\t");
	    }
	         
	    // tìm phần tử nhỏ nhất
	    // sau khi sắp xếp theo thứ tự giảm dần 
	    // thì phần tử nhỏ nhất là phần tử cuối cùng trong mảng
	    System.out.println("\nPhần tử nhỏ nhất trong mảng là " + array[n - 1]);
	}


}
