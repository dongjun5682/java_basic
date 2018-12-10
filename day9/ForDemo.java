package day9;

import java.util.Scanner;

public class ForDemo {
public void test(){
	Scanner scan = new Scanner(System.in);
	System.out.println("1부터 10까지의 합은");
	int a = 0;
	String b = "";
	
	for (int i = 1; i <=10; i++) {
		if(i != 10){
			b += i+"+";
			a +=i;
		}else{
			b += i + "=";
			a +=i;
		}
		
	}
	System.out.println(b + a);
}
}
