package day8;

import java.util.Scanner;

public class Year {
	public void year(){
		System.out.println("�⵵�� �Է��ϼ���.");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		String rs = "";
		if((year%4 ==0 && year%100 != 0) || year%400 == 0 ){
			rs = "����";
		}else{
			rs ="���";
		}
		System.out.println(rs);
	}
}
