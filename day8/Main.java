package day8;
import java.util.Scanner;

import day9.Genderchecker;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Year y = new Year();
		Genderchecker checker = new Genderchecker();   
		Grade g =new Grade();
		while (true) {
			System.out.println("[�޴�] 0.���� 1.���� 2.BMI 3.���� 4.�ֹι�ȣ 5.���");
			
			String select = scanner.next();
			switch (select) {
			case "0":
				System.out.println("�����Դϴ�.");
				return;
			case "1":
				
				break;
			case "2":
				
				break;
			case "3":
				y.year();
				break;
			case "4":
				checker.checker();
				break;
			case "5":
				g.ranking();
				break;
			}
		}
		
	
	}
}



