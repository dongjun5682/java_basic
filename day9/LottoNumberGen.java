package day9;

import java.util.Random;
import java.util.Set;

public class LottoNumberGen {
	
	public String gen(){
	Random random = new Random();
	int[] lotto = new int[6];
	String res = "";
	for (int i = 0; i < lotto.length; i++) {
		int number = random.nextInt(44)+1;
		lotto[i] =number;
		res += lotto[i]+" ";
	}
		return "로또번호: "+"[ "+res+"]";
	}
	
}
