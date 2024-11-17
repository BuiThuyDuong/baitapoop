package chuong2.bai7;
import java.util.Scanner;

public class Kytu {
public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        // Nhập vào hai số thực
		        System.out.print("Nhập vào số thực thứ nhất: ");
		        double a = sc.nextDouble();
		        System.out.print("Nhập vào số thực thứ hai: ");
		        double b = sc.nextDouble();

		        // Nhập vào một ký tự
		        System.out.print("Nhập vào một ký tự trong (A, S, M, D): ");
		        char kytu = sc.next().charAt(0);

		        // Thực hiện các công việc dựa trên ký tự nhập được
		        switch (kytu) {
		            case 'A':
		                System.out.println("Kết quả của phép cộng: " + (a + b));
		                break;
		            case 'S':
		                System.out.println("Kết quả của phép trừ: " + (a - b));
		                break;
		            case 'M':
		                System.out.println("Kết quả của phép nhân: " + (a * b));
		                break;
		            case 'D':
		                if (b != 0) {
		                    System.out.println("Kết quả của phép chia: " + (a / b));
		                } else {
		                    System.out.println("Lỗi: Không thể chia cho 0.");
		                }
		                break;
		            default:
		                System.out.println("Ký tự vừa nhập không hợp lệ. Vui lòng nhập A, S, M hoặc D.");
		                break;
		        }

		        sc.close();
		   

	}

}
