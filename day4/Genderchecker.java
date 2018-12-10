package day4;

import java.util.Scanner;

public class Genderchecker {
public void checker(){
	Scanner sc = new Scanner(System.in);
	System.out.println("이름을 입력하세요.");
	String name = sc.next();
	System.out.println("주민번호를 입력하세요.");
	String ssn =sc.next();
	String re = "";
	char ch =ssn.charAt(7);
	
	if(ch == '1' || ch == '3'){
		re = "남자";
	}else if(ch == '2' || ch == '4'){
		re = "여자";
	}else if(ch == '5' || ch == '6'){
		re = "외국인";
	}else if(ch == '0' || ch == '7' || ch == '8' || ch == '9'){
		re = "잘못입력하셨습니다.";
	}
	System.out.println(re);
	
}

}
