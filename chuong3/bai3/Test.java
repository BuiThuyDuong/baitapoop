package chuong3.bai3;
import java.util.Scanner;

import chuong3.bai2.DiaChi;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DiaChi add1 = new DiaChi("Tong Thuong", "Quang Thanh", "Kinh Mon", "Hai Duong");
		NhanVien nv1 = new NhanVien();
		//ktra phuong thuc
		nv1.setName("Duong");
		nv1.setDob("17/2/2005");
		nv1.setGender('F');
		System.out.println(nv1.getName()+nv1.getAddress());
		System.out.println(nv1.toString());
		sc.close();

		
		
		
		
	}

}
