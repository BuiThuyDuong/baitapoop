package chuong2.bai11;
import java.util.Scanner;

public class Hinhtron {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Nhập bán kính của hình tròn
		System.out.print("Bán kính hình tròn là: ");
		float r = sc.nextFloat();
		
		//Diện tích, chu vi
		 System.out.println("Diện tích hình tròn là:" + r*r*Math.PI);
		 System.out.println("Chu vi hình tròn là:" + 2*r*Math.PI);
		
		 sc.close();
	}

}
