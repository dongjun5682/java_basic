package day10;

import java.util.Scanner;

import day8.*;
import day9.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("[메뉴] 0.종류 1.BMI 2.계산기 3.시퀀스 4.구구단 5.로또 6.등수구하기 7.이름배열2 8.이름배열 9.홀수 10.숫자수열 ");
			int flag = scanner.nextInt();
			switch (flag) {
			case 0:
				System.out.println("종료입니다.");
				return;
				
			case 1:
				Bmi bmi = new Bmi();
				System.out.println("몸무게와 키를 입력하세요.");
				System.out.println( bmi.bodyFit(
						scanner.nextInt(),
						scanner.nextInt()) );
				break;
				
			case 2:
				Calc calc = new Calc();
				System.out.println("계산기 숫자 연산자 숫자 입력하세요.");
				System.out.println(calc.calculation(
						scanner.nextInt(),
						scanner.next(),
						scanner.nextInt()));
				break;
				
			case 3:
				Sequence seq = new Sequence();
				System.out.println("1부터 덧셈할 마지막 숫자 입력");
				System.out.println(seq.test(
						scanner.nextInt()));
				break;
				
			case 4:
				Gugudan gugudan = new Gugudan();
				System.out.println("원하는 구구단 수를 입력하세요.");
				System.out.println(gugudan.gugu(
						scanner.nextInt()));
				break;
				
			case 5:
				LottoNumberGen lotto = new LottoNumberGen();
				System.out.println(lotto.gen());
				break;
				
			case 6:
				NameScoreArray namescore = new NameScoreArray();
				System.out.println("학생이 몇명입니까?");
				int count = scanner.nextInt();
				String[] names = new String[count];
				int[] grade = new int[count];
				for (int i = 0; i < grade.length; i++) {
					System.out.println("학생이름과 점수를 입력하세요.");
					names[i] = scanner.next();
					grade[i] = scanner.nextInt();
				}
				System.out.println(namescore.namescoreArray(names, grade));
				break;
				
			case 7:
				NameArray2 name2 = new NameArray2();
				System.out.println(name2.name2());
				break;
				
			case 8:
				NameArray name = new NameArray();
				System.out.println(name.name());
				break;
				
			case 9:
				OddSum odd = new OddSum();
				System.out.println("숫자하나를 입력하세요.");
				System.out.println(odd.sum(scanner.nextInt()));
				break;
				
			case 10:
				ScoreArray score = new ScoreArray();
				System.out.println("3개의 숫자를 입력하세요.");
				System.out.println(score.score(
						scanner.nextInt(),
						scanner.nextInt(),
						scanner.nextInt()));
				break;
				
			}
		}
	}

}
