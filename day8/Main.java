package day8;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calc c = new Calc();
		Bmi b = new Bmi();
		Year y = new Year();
		Genderchecker checker = new Genderchecker();   
		Grade g =new Grade();
		while (true) {
			System.out.println("[메뉴] 0.종료 1.계산기 2.BMI 3.윤년 4.주민번호 5.등수");
			
			String select = scanner.next();
			switch (select) {
			case "0":
				System.out.println("종료입니다.");
				return;
			case "1":
				c.calculation();
				break;
			case "2":
				b.bodyFit();
				break;
			case "3":
				y.year();
				break;
			case "4":
				checker.checker();
				break;
			case "5":
				g.ranking();
				break;
			}
		}
		
	
	}
}



