package day8;

import java.util.Scanner;

public class Grade {
	public void ranking(){
		Scanner sc = new Scanner(System.in);
		String[] name= new String[3];
		int[] grade = new int[3];
		for(int i = 0; i <= 2; i++){
			System.out.println("학생 이름를 입력하세요.");
			name[i] = sc.next();
			System.out.println("학생 점수를 입력하세요.");
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
			System.out.println("1등 : "+name[i] +"점수: "+ grade[i]);
		}
		
//		Scanner scan = new Scanner(System.in); 
//		System.out.println("이름과 점수를 입력하세요. ex)점수는 0~100점 사이입니다.");
//		String name1 = scan.next();
//		int a = scan.nextInt();
//		String name2 = scan.next();
//		int b = scan.nextInt();
//		String name3 = scan.next();
//		int c = scan.nextInt();
//		String re = "";
//
//		if(a < 0 || a > 100 || b < 0 || b > 100 || c < 0 || c > 100 ) {
//			re = "평균점수는 0~100점 사이입니다.";
//		}else if(a > b && b >c){
//			re = "1등:"+ a + " 2등 :" + b + " 3등: " + c;
//		}else if(a > c && c > b){
//			re = "1등 :"+ a + " 2등 :" + c + " 3등: " + b;
//		}else if(b > a && a > c){
//			re = "1등 :"+ b + " 2등 :" + a + " 3등: " + c;
//		}else if(b > c && c > a){
//			re = "1등 :"+ b + " 2등 :" + c + " 3등: " + a;
//		}else if(c > b && b > a){
//			re = "1등 :"+ c + " 2등 :" + b + " 3등: " + a;
//		}else if(c > a && a > b){
//			re = "1등 :"+ c + " 2등 :" + a + " 3등: " + b;
//		}else {
//			re = "동점은 없습니다.";
//		}
//		System.out.println(re);
	}
}
