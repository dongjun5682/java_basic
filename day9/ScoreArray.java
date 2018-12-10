package day9;

import java.util.Scanner;

public class ScoreArray {

	public void score(){	
		Scanner scan = new Scanner(System.in);
		int[] score = new int[3];
		String res ="";
		System.out.println("점수 3개를 입력하세요.");
		for (int i = 0; i < score.length; i++) {
			score[i] = scan.nextInt();
			if(i < 2){
				res += score[i]+",";
			}else{
				res += score[i]+" ";
			}
			
		}

		System.out.println(res);
	}

}
