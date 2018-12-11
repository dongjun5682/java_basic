package day9;

import java.util.Scanner;

public class Bmi {

	public String bodyFit(int h ,double w){
	
		double h1 = h/100;
		double bmi = w /(h1 * h1);
		String re = "";
		System.out.println(bmi);
		if(bmi > 40){
			re = "고도비만입니다.";
		}else if(bmi >= 35){
			re = "2단계 비만입니다.";
		}else if(bmi >= 30){
			re = "1단계 비만입니다.";
		}else if(bmi >= 25){
			re = "과체중 입니다.";
		}else if(bmi > 18.5){
			re = "보통 입니다.";
		}else {
			re = "저체중입니다.";
		}
		return re;	
	}
}
