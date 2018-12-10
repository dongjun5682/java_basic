package day5;

import java.util.Random;

public class MyRandom {

	public static void main(String[] args) {
		System.out.println("랜덤으로 1~10 사이에 숫자를 출력하시오.");
		Random random = new Random();
		int num1 = random.nextInt(9)+1;
		System.out.println(num1);

	}

}
