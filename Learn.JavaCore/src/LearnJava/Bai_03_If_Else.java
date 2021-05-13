package LearnJava;

public class Bai_03_If_Else {
	 public static void main(String[] args) throws Exception {
	       String Name = "Lập trình java";
	       System.out.println(Name);
	       
	       // chuyển string thành chữ hoa, thường
	       System.out.println(Name.toUpperCase());
	       System.out.println(Name.toLowerCase());
	       
	       //Lấy kích thước chuỗi
	       int sizeCharacter = Name.length();
	       System.out.println(sizeCharacter);
	       
	       //Xóa khoảng trắng đầu cuối chuoõi
	       String Adress = " Hà Nội   ";
	       System.out.println(Adress.trim());
	       
	       //Vị trí kí tự trong chuỗi
	      int IndexOfCharacter = Adress.indexOf("N");
	      System.out.println(IndexOfCharacter);
	       
	       //Thay thế a bằng kí thư jkhác
	      String Replace =  Adress.replace("N", "b");
	      System.out.println(Replace);
	      
	      //Lấy từ 1 vị trí bất kì đến 1 vị  trí bất kì	     
	      Adress.substring(0, 2);   
	      
	      
	     
	       
	    }
	 
	 public void Sum() {
	 int a = 10;
	 int b = 30;
	 int c = a+ b;
	 System.out.print("tổng a + b= " + c);
}
}
