package day9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true){
			System.out.println("[ 메뉴 ] \n"
					+ " 0.종료 \n"
					+ "1.BMI \n"
					+ "2.계산기 \n"
					+ "3.1~10까지합 \n"
					+ "4.구구단 \n"
					+ "5.로또번호 \n"
					+ "6.이름배열 \n"
					+ "7.이름배열2 \n"
					+ "8.이름과점수배열 \n"
					+ "9.홀수,짝수 합구하기 \n"
					+ "10.점수배열 \n");
			int select = scan.nextInt();
			switch (select) {
			case 0:System.out.println("종료입니다.");return;
			case 1:
				Bmi b = new Bmi();
				b.bodyFit();
				break;

			case 2:
				Calc c = new Calc();
				c.calculation();
				break;

			case 3:
				ForDemo loop = new ForDemo();
				loop.test();
				break;
				
			case 4:	
				Gugudan gugudan = new Gugudan();
				gugudan.gugu();
				break;
			
			case 5:
				LottoNumberGen lotto = new LottoNumberGen();
				lotto.gen();
				break;
				
			case 6:
				NameArray namearray = new NameArray();
				namearray.name();
				break;
			
			case 7:
				NameArray2 namearray2 = new NameArray2();
				namearray2.name2();
				break;
				
			case 8:
				NameScoreArray namescore = new NameScoreArray();
				namescore.namescoreArray();
				break;
				
			case 9:
				OddSum odd = new OddSum();
				odd.sum();
				break;
				
			case 10:
				ScoreArray scores = new ScoreArray();
				scores.score();
			}
		}

	}

}
