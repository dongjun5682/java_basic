package day6;
import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("[�޴�] \n0.���� \n"
					+ "1.���� \n"
					+ "2.BMI \n"
					+ "3.������ \n"
					+ "4.�ֹι�ȣ \n"
					+ "5.������ϱ� ");
			String select =scanner.next();

			switch (select) {
			case "0":
				System.out.println("����");
				return;
			case "1": 
					System.out.println("���� �Դϴ�.ex) 5 + 6");
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
				System.out.println("�����Ը� �Է��ϼ���.");
				int w = scanner.nextInt();
				System.out.println("Ű�� �Է��ϼ���.");
				double h = scanner.nextDouble();
				double h1 = h/100;
				Double bmi = w /(h1 * h1);
				String result1 = "";
				if(bmi > 40) {
					result1 = "����";
				}else if(bmi >= 39.9){
					result1 = "��� ��(2�ܰ� ��)";
				}else if(bmi >=34.9){
					result1 = "�浵 ��(1�ܰ� ��)";
				}else if(bmi >= 29.9){
					result1 = "��ü���Դϴ�.";
				}else if(bmi >= 24.9){
					result1 = "����";
				}else if(bmi < 18.5){
					result1 = "��ü��";
				}
				System.out.println(result1);
				break;
			case "3":
				System.out.println("�⵵�� �Է��ϼ���.");
				int year = scanner.nextInt();
				if((year%4 ==0 && year%100 !=0) || year%400 == 0) {
					System.out.println("����");
				}else {
					System.out.println("����Դϴ�.");
				}
				break;
			case "4":
				System.out.println("�ֹε�� ��ȣ�� �Է��ϼ���.");
				String ssn = scanner.next();
				char ch = ssn.charAt(7);

				if(ch=='1' || ch=='3' ) {
					System.out.println("�����Դϴ�");
				}else if (ch=='2' || ch=='4') {
					System.out.println("�����Դϴ�.");
				}else if (ch=='5' || ch=='6') {
					System.out.println("�ܱ����Դϴ�.");
				}else if (ch=='0' || ch=='7' || ch=='8' || ch=='9') {
					System.out.println("�ٽ��Է��ϼ���.");
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
		        	System.out.println("��������� 0~100�� �����Դϴ�.");
		        }else if(a > b && b >c){
		            System.out.println("1��:"+ a + " 2�� :" + b + " 3��: " + c );
		        }else if(a > c && c > b){
		            System.out.println("1�� :"+ a + " 2�� :" + c + " 3��: " + b );
		        }else if(b > a && a > c){
		            System.out.println("1�� :"+ b + " 2�� :" + a + " 3��: " + c );
		        }else if(b > c && c > a){
		            System.out.println("1�� :"+ b + " 2�� :" + c + " 3��: " + a );
		        }else if(c > b && b > a){
		            System.out.println("1�� :"+ c + " 2�� :" + b + " 3��: " + a );
		        }else if(c > a && a > b){
		            System.out.println("1�� :"+ c + " 2�� :" + a + " 3��: " + b );
		        }else {
		        	System.out.println("������ �����ϴ�.");
		        }
		        
//				System.out.println("�̸��� ������ �Է��ϼ���");
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
//				System.out.print("1���� "+ name1 +" "+ sc1 +"��\t");
//				System.out.print("2���� "+ name2 +" "+ sc2 +"��\t");
//				System.out.println("3���� "+ name3 +" "+ sc3 +"��\t");
//				break;
			}
		}

	}
}



