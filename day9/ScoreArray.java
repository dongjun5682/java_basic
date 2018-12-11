package day9;

import java.util.Scanner;

public class ScoreArray {

	public String score(int num1, int num2, int num3){	
		int[] score = new int[3];
		score[0] = num1;
		score[1] = num2;
		score[2] = num3;
		
		String res ="";
		System.out.println("점수 3개를 입력하세요.");
		for (int i = 0; i < score.length; i++) {
			if(i < 2){
				res += score[i]+",";
			}else{
				res += score[i]+" ";
			}
			
		}

		return res;
	}

}
