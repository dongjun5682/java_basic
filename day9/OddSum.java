package day9;

import java.util.Scanner;

public class OddSum {

	public String sum(int count){
		// Odd Ȧ��
		// Even ¦��
		// 1 ���� �Է¹��� ���ڱ����� ���ε�, �� �߿��� Ȧ���� ��
		
		int even = 0;
		int odd = 0;
		for (int i = 1; i <= count; i++) {
				if(i%2 != 0){
					odd += i;
				}else{
					even += i;
				}
			
		}
		return "Ȧ�� : "+odd;

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
//	System.out.println("Ȧ������ : "+ odd);
//	System.out.println("¦������ : "+ even);

