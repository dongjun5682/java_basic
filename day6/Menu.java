package day6;
import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("[메뉴] \n0.종료 \n"
					+ "1.계산기 \n"
					+ "2.BMI \n"
					+ "3.윤년계산 \n"
					+ "4.주민번호 \n"
					+ "5.등수구하기 ");
			String select =scanner.next();

			switch (select) {
			case "0":
				System.out.println("종료");
				return;
			case "1": 
					System.out.println("계산기 입니다.ex) 5 + 6");
					int num1 = scanner.nextInt();
					int result = 0;
					String op = scanner.next();
					int num2 = scanner.nextInt();
					switch (op) {
					case "+": result = num1 + num2;	break;
					case "-": result = num1 - num2;	break;
					case "*": result = num1 * num2;	break;
					case "/": result = num1 / num2;	break;
					default: result = 0;    		break;
					}
					System.out.println(num1 + op +num2 +" = " + result);	
					break;
			case "2":
				System.out.println("몸무게를 입력하세요.");
				int w = scanner.nextInt();
				System.out.println("키를 입력하세요.");
				double h = scanner.nextDouble();
				double h1 = h/100;
				Double bmi = w /(h1 * h1);
				String result1 = "";
				if(bmi > 40) {
					result1 = "고도비만";
				}else if(bmi >= 39.9){
					result1 = "증등도 비만(2단계 비만)";
				}else if(bmi >=34.9){
					result1 = "경도 비만(1단계 비만)";
				}else if(bmi >= 29.9){
					result1 = "과체중입니다.";
				}else if(bmi >= 24.9){
					result1 = "정상";
				}else if(bmi < 18.5){
					result1 = "저체중";
				}
				System.out.println(result1);
				break;
			case "3":
				System.out.println("년도를 입력하세요.");
				int year = scanner.nextInt();
				if((year%4 ==0 && year%100 !=0) || year%400 == 0) {
					System.out.println("윤년");
				}else {
					System.out.println("평년입니다.");
				}
				break;
			case "4":
				System.out.println("주민등록 번호를 입력하세요.");
				String ssn = scanner.next();
				char ch = ssn.charAt(7);

				if(ch=='1' || ch=='3' ) {
					System.out.println("남자입니다");
				}else if (ch=='2' || ch=='4') {
					System.out.println("여자입니다.");
				}else if (ch=='5' || ch=='6') {
					System.out.println("외국인입니다.");
				}else if (ch=='0' || ch=='7' || ch=='8' || ch=='9') {
					System.out.println("다시입력하세요.");
				}
				break;
			case "5":
				Scanner scan = new Scanner(System.in); 
		        System.out.println("name input");
		        String name1 = scan.next();
		        int a = scan.nextInt();
		        String name2 = scan.next();
		        int b = scan.nextInt();
		        String name3 = scan.next();
		        int c = scan.nextInt();
		        if(a < 0 && a > 100 || b < 0 && b > 100 || c < 0 && c > 100) {
		        	System.out.println("평균점수는 0~100점 사이입니다.");
		        }else if(a > b && b >c){
		            System.out.println("1등:"+ a + " 2등 :" + b + " 3등: " + c );
		        }else if(a > c && c > b){
		            System.out.println("1등 :"+ a + " 2등 :" + c + " 3등: " + b );
		        }else if(b > a && a > c){
		            System.out.println("1등 :"+ b + " 2등 :" + a + " 3등: " + c );
		        }else if(b > c && c > a){
		            System.out.println("1등 :"+ b + " 2등 :" + c + " 3등: " + a );
		        }else if(c > b && b > a){
		            System.out.println("1등 :"+ c + " 2등 :" + b + " 3등: " + a );
		        }else if(c > a && a > b){
		            System.out.println("1등 :"+ c + " 2등 :" + a + " 3등: " + b );
		        }else {
		        	System.out.println("동점은 없습니다.");
		        }
		        
//				System.out.println("이름과 점수를 입력하세요");
//				String name1 =scanner.next();
//				int sc1 = scanner.nextInt();
//				String name2 =scanner.next();
//				int sc2 = scanner.nextInt();
//				String name3 =scanner.next();
//				int sc3 = scanner.nextInt();
//				int t = 0;
//				if(sc1 < sc2) {
//					t = sc2;
//					sc2 = sc1;
//					sc1 = t;
//				}if(sc2 < sc3) {
//					t = sc3;
//					sc3 = sc2;
//					sc2 = t;	
//				}if(sc1 < sc2) {
//					t = sc2;
//					sc2 = sc1;
//					sc1 = t;
//				}
//				
//				System.out.print("1등은 "+ name1 +" "+ sc1 +"점\t");
//				System.out.print("2등은 "+ name2 +" "+ sc2 +"점\t");
//				System.out.println("3등은 "+ name3 +" "+ sc3 +"점\t");
//				break;
			}
		}

	}
}



