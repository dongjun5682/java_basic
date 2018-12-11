package day9;

import java.util.Scanner;

public class Calc {
	
	public String calculation(int num1, String op , int num2) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		
		int re = 0;
		switch (op) {
		case "+":
			re = num1 + num2 ;
			break;
		case "-":
			re = num1 - num2;
			break;
		case "*":
			re = num1 * num2;
			break;
		case "/":
			re = num1 / num2;
			break;
		case "%":
			re = num1 % num2;
			break;
		default:
			re = 0;
		}
		 return num1 + op + num2 +" = "+ re;
	}

}
