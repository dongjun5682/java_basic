package day9;

import java.util.Scanner;

public class NameArray2 {
	public void name2(){
		Scanner scan =new Scanner(System.in);
		String[] name = {"ȫ�浿","�������","�念��"};
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