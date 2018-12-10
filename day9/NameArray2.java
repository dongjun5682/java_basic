package day9;

import java.util.Scanner;

public class NameArray2 {
	public void name2(){
		Scanner scan =new Scanner(System.in);
		String[] name = {"홍길동","세종대왕","장영실"};
		String res = "";
		for (int i = 0; i < name.length; i++) {
			if(i < name.length-1){
				res += name[i] + ","; 
			}else{
				res += name[i] + " ";
			}
		}
		System.out.println(res);
	}
}