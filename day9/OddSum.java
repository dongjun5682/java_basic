package day9;

import java.util.Scanner;

public class OddSum {

	public String sum(int count){
		// Odd 홀수
		// Even 짝수
		// 1 부터 입력받은 숫자까지의 합인데, 그 중에서 홀수의 합
		
		int even = 0;
		int odd = 0;
		for (int i = 1; i <= count; i++) {
				if(i%2 != 0){
					odd += i;
				}else{
					even += i;
				}
			
		}
		return "홀수 : "+odd;

	}
}

//	int[] number = new int[count]; 
//	int odd = 0;
//	int even = 0;
//	
//	for (int i = 0; i < number.length; i++) {
//		number[i] = i+1;
//		if(number[i] % 2 != 0){
//			odd += number[i];
//		}else{
//			even += number[i];
//		}
//	}
//	System.out.println("홀수의합 : "+ odd);
//	System.out.println("짝수의합 : "+ even);

