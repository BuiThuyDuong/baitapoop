package chuong2.bai6;
import java.util.Scanner;
import java.lang.Math;

public class Tinhtoan {
	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        // Nhập vào hai số nguyên
		        System.out.print("Nhập vào số nguyên thứ nhất: ");
		        int a1 = sc.nextInt();
		        System.out.print("Nhập vào số nguyên thứ hai: ");
		        int a2 = sc.nextInt();

		        // Tính tổng, hiệu, tích và thương
		        int tong = a1 + a2;
		        int hieu = Math.abs(a1 - a2);
		        int tich = a1 * a2;
		        float thuong = (float) a1 / a2;

		        // Hiển thị kết quả
		        System.out.println("Tổng: " + tong);
		        System.out.println("Hiệu: " + hieu);
		        System.out.println("Tích: " + tich);
		        System.out.println("Thương: " + thuong);

		        sc.close();
	}

}
