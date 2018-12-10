package day2;

import java.util.Scanner;
class Grade{
     public static void main(String[] args){
	System.out.println("학생이름을 입력하세요.");
	Scanner scan = new Scanner(System.in);
	String name = scan.next();
	System.out.println("국어 점수를 입력하세요.");
	int a = scan.nextInt();
	System.out.println("영어 점수를 입력하세요.");
	int b = scan.nextInt();
	System.out.println("수학 점수를 입력하세요.");
	int c = scan.nextInt();
	System.out.println("과학 점수를 입력하세요.");
	int d = scan.nextInt();
	System.out.println("사회 점수를 입력하세요.");
	int e = scan.nextInt();
	int sum = a+b+c+d+e;
	int avg = sum/5;
	
	if(90 <= avg && avg <= 100){
	System.out.print(name + ", 총점."+sum + "점."+" 평균. "+avg +" 성적 A 학점");
      }
	else if(80 <= avg ){
	System.out.print(name + ", 총점."+sum + "점."+" 평균. "+avg +" 성적 B 학점");
     }
	else if(70 <= avg){
	System.out.print(name + ", 총점."+sum + "점."+" 평균. "+avg +"성적 C 학점");
    }
	else if(60 <= avg){
	System.out.print(name + ", 총점."+sum + "점."+" 평균. "+avg +"성적 D 학점");
   }
	else if(50 <= avg){
	System.out.print(name + ", 총점."+sum + "점."+" 평균. "+avg +"성적 E 학점");
  }
	else{
	System.out.print(name + ", 총점."+sum + "점."+" 평균. "+avg +"성적 F 학점");
}
	

 }	
}