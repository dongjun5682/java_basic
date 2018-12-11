package day9;

import java.util.Scanner;

public class Sequence {
public String test(int limit){
	
	int sum = 0;
	String res = "";
	
	for (int i = 1; i <=limit; i++) {
		if(i != limit){
			res += i+"+";
			sum +=i;
		}else{
			res += i + "=";
			sum +=i;
		}
		
	}
	return res + sum;
}
}
