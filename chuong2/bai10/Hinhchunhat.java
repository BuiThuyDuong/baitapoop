package chuong2.bai10;
import java.util.Scanner;

public class Hinhchunhat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Nhập vào hai cạnh hcn
    System.out.print("Nhập vào chiều dài: ");
    float a = sc.nextFloat();
    System.out.print("Nhập vào chiều rộng: ");
    float b = sc.nextFloat();
	
    	// Diện tích, chu vi
    System.out.println("Diện tích hcn là:" + a*b);
    System.out.println("Chu vi hcn là:" + 2*(a+b));
   
    sc.close();
	}
}