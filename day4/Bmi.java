package day4;

import java.util.Scanner;

public class Bmi {

	public void bodyFit(){
		Scanner sc = new Scanner(System.in);
		System.out.println("�����Ը��Է��ϼ���.");
		int w = sc.nextInt();
		System.out.println("Ű���Է��ϼ���.");
		double h = sc.nextDouble();
		
		double h1 = h/100;
		double bmi = w /(h1 * h1);
		String re = "";
		System.out.println(bmi);
		if(bmi > 40){
			re = "�����Դϴ�.";
		}else if(bmi >= 35){
			re = "2�ܰ� ���Դϴ�.";
		}else if(bmi >= 30){
			re = "1�ܰ� ���Դϴ�.";
		}else if(bmi >= 25){
			re = "��ü�� �Դϴ�.";
		}else if(bmi > 18.5){
			re = "���� �Դϴ�.";
		}else {
			re = "��ü���Դϴ�.";
		}
		System.out.println(re);	
	}
}
