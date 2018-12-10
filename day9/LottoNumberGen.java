package day9;

import java.util.Random;

public class LottoNumberGen {
	
	public void gen(){
	Random random = new Random();
	int[] lotto = new int[6];
	String res = "";
	for (int i = 0; i < lotto.length; i++) {
		int number = random.nextInt(44)+1;
		lotto[i] =number;
		res += lotto[i]+" ";
	}
		System.out.println("로또번호: "+res);
	}
}
