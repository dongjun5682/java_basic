package day4;

import java.util.Scanner;

public class Genderchecker {
public void checker(){
	Scanner sc = new Scanner(System.in);
	System.out.println("�̸��� �Է��ϼ���.");
	String name = sc.next();
	System.out.println("�ֹι�ȣ�� �Է��ϼ���.");
	String ssn =sc.next();
	String re = "";
	char ch =ssn.charAt(7);
	
	if(ch == '1' || ch == '3'){
		re = "����";
	}else if(ch == '2' || ch == '4'){
		re = "����";
	}else if(ch == '5' || ch == '6'){
		re = "�ܱ���";
	}else if(ch == '0' || ch == '7' || ch == '8' || ch == '9'){
		re = "�߸��Է��ϼ̽��ϴ�.";
	}
	System.out.println(re);
	
}

}
