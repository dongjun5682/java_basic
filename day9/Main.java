package day9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true){
			System.out.println("[ �޴� ] \n"
					+ " 0.���� \n"
					+ "1.BMI \n"
					+ "2.���� \n"
					+ "3.1~10������ \n"
					+ "4.������ \n"
					+ "5.�ζǹ�ȣ \n"
					+ "6.�̸��迭 \n"
					+ "7.�̸��迭2 \n"
					+ "8.�̸��������迭 \n"
					+ "9.Ȧ��,¦�� �ձ��ϱ� \n"
					+ "10.�����迭 \n");
			int select = scan.nextInt();
			switch (select) {
			case 0:System.out.println("�����Դϴ�.");return;
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
