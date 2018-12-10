package day9;

import java.util.Scanner;

public class ScoreArray {

	public void test(){	
		Scanner scan = new Scanner(System.in);
		int[] score = new int[3];
		String[] name = new String[3];
		String res ="";
		System.out.println("점수와 이름을 3개를 입력하세요.");
		for (int i = 0; i < score.length; i++) {
			score[i] = scan.nextInt();
			name[i] = scan.next();
		}
		if(score[0] < score[1] && score[1] < score[2] ){
			
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
				ScoreArray score = new ScoreArray();
				score.test();
	}
}
