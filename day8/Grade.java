package day8;

import java.util.Scanner;

public class Grade {
	public void ranking(){
		Scanner sc = new Scanner(System.in);
		String[] name= new String[3];
		int[] grade = new int[3];
		for(int i = 0; i <= 2; i++){
			System.out.println("�л� �̸��� �Է��ϼ���.");
			name[i] = sc.next();
			System.out.println("�л� ������ �Է��ϼ���.");
			grade[i] =sc.nextInt();
		}
		for(int i = 0; i < grade.length; i++){
			for(int j = i+1; j < grade.length; j++){
				if(grade[i] < grade[j]){
					int t = grade[i];
					grade[i] = grade[j];
					grade[j] = t;
					
					String t1 = name[i];
					name[i] = name[j];
					name[j] = t1;
				}
			}
			System.out.println("1�� : "+name[i] +"����: "+ grade[i]);
		}
		
//		Scanner scan = new Scanner(System.in); 
//		System.out.println("�̸��� ������ �Է��ϼ���. ex)������ 0~100�� �����Դϴ�.");
//		String name1 = scan.next();
//		int a = scan.nextInt();
//		String name2 = scan.next();
//		int b = scan.nextInt();
//		String name3 = scan.next();
//		int c = scan.nextInt();
//		String re = "";
//
//		if(a < 0 || a > 100 || b < 0 || b > 100 || c < 0 || c > 100 ) {
//			re = "��������� 0~100�� �����Դϴ�.";
//		}else if(a > b && b >c){
//			re = "1��:"+ a + " 2�� :" + b + " 3��: " + c;
//		}else if(a > c && c > b){
//			re = "1�� :"+ a + " 2�� :" + c + " 3��: " + b;
//		}else if(b > a && a > c){
//			re = "1�� :"+ b + " 2�� :" + a + " 3��: " + c;
//		}else if(b > c && c > a){
//			re = "1�� :"+ b + " 2�� :" + c + " 3��: " + a;
//		}else if(c > b && b > a){
//			re = "1�� :"+ c + " 2�� :" + b + " 3��: " + a;
//		}else if(c > a && a > b){
//			re = "1�� :"+ c + " 2�� :" + a + " 3��: " + b;
//		}else {
//			re = "������ �����ϴ�.";
//		}
//		System.out.println(re);
	}
}
