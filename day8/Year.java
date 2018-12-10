package day8;

import java.util.Scanner;

public class Year {
	public void year(){
		System.out.println("년도를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		String rs = "";
		if((year%4 ==0 && year%100 != 0) || year%400 == 0 ){
			rs = "윤년";
		}else{
			rs ="평년";
		}
		System.out.println(rs);
	}
}
