package day9;

import java.util.Scanner;

public class Gugudan {
	public String gugu(int number){
		
		String res = "";
		for (int i = 1; i < 10; i++) {
			if(number < 10){
				res += number +" * "+ i +" = "+ number*i + "\n";
			}else{
				res = "10�� ������ �ȵ˴ϴ�.";
			}
			}
		return res;
	}

}
