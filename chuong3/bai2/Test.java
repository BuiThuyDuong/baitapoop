package chuong3.bai2;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//ktra cac phuong thuc
		DiaChi diachi1 = new DiaChi();
		diachi1.setThon("Tong Thuong");
		diachi1.setXa("Quang Thanh");
		diachi1.setHuyen("Kinh Mon");
		diachi1.setTinh("Hai Duong");
		System.out.println(diachi1.getThon());
		System.out.println(diachi1.getXa());
		System.out.println(diachi1.getHuyen());
		System.out.println(diachi1.getTinh());
		System.out.println(diachi1.toString());
		sc.close();
	}
}
