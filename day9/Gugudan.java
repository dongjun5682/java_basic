package day9;

import java.util.Scanner;

public class Gugudan {
	public String gugu(int number){
		
		String res = "";
		for (int i = 1; i < 10; i++) {
			if(number < 10){
				res += number +" * "+ i +" = "+ number*i + "\n";
			}else{
				res = "10을 넘으면 안됩니다.";
			}
			}
		return res;
	}

}
