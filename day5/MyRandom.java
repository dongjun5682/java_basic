package day5;

import java.util.Random;

public class MyRandom {

	public static void main(String[] args) {
		System.out.println("�������� 1~10 ���̿� ���ڸ� ����Ͻÿ�.");
		Random random = new Random();
		int num1 = random.nextInt(9)+1;
		System.out.println(num1);

	}

}
