package day10;

import java.util.Scanner;

import day8.*;
import day9.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("[�޴�] 0.���� 1.BMI 2.���� 3.������ 4.������ 5.�ζ� 6.������ϱ� 7.�̸��迭2 8.�̸��迭 9.Ȧ�� 10.���ڼ��� ");
			int flag = scanner.nextInt();
			switch (flag) {
			case 0:
				System.out.println("�����Դϴ�.");
				return;
				
			case 1:
				Bmi bmi = new Bmi();
				System.out.println("�����Կ� Ű�� �Է��ϼ���.");
				System.out.println( bmi.bodyFit(
						scanner.nextInt(),
						scanner.nextInt()) );
				break;
				
			case 2:
				Calc calc = new Calc();
				System.out.println("���� ���� ������ ���� �Է��ϼ���.");
				System.out.println(calc.calculation(
						scanner.nextInt(),
						scanner.next(),
						scanner.nextInt()));
				break;
				
			case 3:
				Sequence seq = new Sequence();
				System.out.println("1���� ������ ������ ���� �Է�");
				System.out.println(seq.test(
						scanner.nextInt()));
				break;
				
			case 4:
				Gugudan gugudan = new Gugudan();
				System.out.println("���ϴ� ������ ���� �Է��ϼ���.");
				System.out.println(gugudan.gugu(
						scanner.nextInt()));
				break;
				
			case 5:
				LottoNumberGen lotto = new LottoNumberGen();
				System.out.println(lotto.gen());
				break;
				
			case 6:
				NameScoreArray namescore = new NameScoreArray();
				System.out.println("�л��� ����Դϱ�?");
				int count = scanner.nextInt();
				String[] names = new String[count];
				int[] grade = new int[count];
				for (int i = 0; i < grade.length; i++) {
					System.out.println("�л��̸��� ������ �Է��ϼ���.");
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
				System.out.println("�����ϳ��� �Է��ϼ���.");
				System.out.println(odd.sum(scanner.nextInt()));
				break;
				
			case 10:
				ScoreArray score = new ScoreArray();
				System.out.println("3���� ���ڸ� �Է��ϼ���.");
				System.out.println(score.score(
						scanner.nextInt(),
						scanner.nextInt(),
						scanner.nextInt()));
				break;
				
			}
		}
	}

}
