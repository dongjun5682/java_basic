package day2;

import java.util.Scanner;

public class Calc {
	
	public void calculation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���.");
		int num1 = sc.nextInt();
		String op = sc.next();
		int num2 = sc.nextInt();
		
		int re = 0;
		switch (op) {
		case "+":
			re = num1 + num2 ;
			break;
		case "-":
			re = num1 - num2;
			break;
		}
		 System.out.println(num1 + op + num2 +" = "+ re);
	}

}
