package day2;

import java.util.Scanner;
class Grade{
     public static void main(String[] args){
	System.out.println("�л��̸��� �Է��ϼ���.");
	Scanner scan = new Scanner(System.in);
	String name = scan.next();
	System.out.println("���� ������ �Է��ϼ���.");
	int a = scan.nextInt();
	System.out.println("���� ������ �Է��ϼ���.");
	int b = scan.nextInt();
	System.out.println("���� ������ �Է��ϼ���.");
	int c = scan.nextInt();
	System.out.println("���� ������ �Է��ϼ���.");
	int d = scan.nextInt();
	System.out.println("��ȸ ������ �Է��ϼ���.");
	int e = scan.nextInt();
	int sum = a+b+c+d+e;
	int avg = sum/5;
	
	if(90 <= avg && avg <= 100){
	System.out.print(name + ", ����."+sum + "��."+" ���. "+avg +" ���� A ����");
      }
	else if(80 <= avg ){
	System.out.print(name + ", ����."+sum + "��."+" ���. "+avg +" ���� B ����");
     }
	else if(70 <= avg){
	System.out.print(name + ", ����."+sum + "��."+" ���. "+avg +"���� C ����");
    }
	else if(60 <= avg){
	System.out.print(name + ", ����."+sum + "��."+" ���. "+avg +"���� D ����");
   }
	else if(50 <= avg){
	System.out.print(name + ", ����."+sum + "��."+" ���. "+avg +"���� E ����");
  }
	else{
	System.out.print(name + ", ����."+sum + "��."+" ���. "+avg +"���� F ����");
}
	

 }	
}