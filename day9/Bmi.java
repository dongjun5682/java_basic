package day9;

import java.util.Scanner;

public class Bmi {

	public String bodyFit(int h ,double w){
	
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
		return re;	
	}
}
