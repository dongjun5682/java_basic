package day9;

import java.util.Scanner;

public class Gugudan {
	public void gugu(){
		Scanner scan = new Scanner(System.in);
		String res = "";
		System.out.println("원하는 구구단 수를 입력하세요.");
		int number = scan.nextInt();
		for (int i = 1; i < 10; i++) {
			if(number < 10){
				res += number +" * "+ i +" = "+ number*i + "\n";
			}else{
				res = "10을 넘으면 안됩니다.";
			}
			}
		System.out.println(res);
	}

}
