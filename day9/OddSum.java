package day9;

import java.util.Scanner;

public class OddSum {

	public void sum(){
		// Odd Ȧ��
		// Even ¦��
		// 1 ���� �Է¹��� ���ڱ����� ���ε�, �� �߿��� Ȧ���� ��
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���.");
		int count = scan.nextInt();
		int[] number = new int[count]; 
		int odd = 0;
		int even = 0;
		
		for (int i = 0; i < number.length; i++) {
			number[i] = i+1;
			if(number[i] % 2 != 0){
				odd += number[i];
			}else{
				even += number[i];
			}
		}
		System.out.println("Ȧ������ : "+ odd);
		System.out.println("¦������ : "+ even);
	}
}
