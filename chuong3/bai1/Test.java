package chuong3.bai1;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		// ktra cac phuong thuc
	  Scanner sc = new Scanner(System.in);
	  Person person1 = new Person();
      person1.setName("Duong");
      person1.setDob("17/02/2005");
      person1.setPob("Hai Duong");
      person1.setGender('F');
      person1.setPhone("0123 4567 89");
      person1.setEmail("duong@gmail.com");
      System.out.println(person1.getName());
      System.out.println(person1.getDob());
      System.out.println(person1.getPob());
      System.out.println(person1.getGender());
      System.out.println(person1.getEmail());
      System.out.println(person1.getPhone());
      System.out.println(person1.toString());
	        sc.close();
	}
}

 