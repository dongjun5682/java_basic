package day9;

import java.util.Scanner;

public class NameArray2 {
	public String name2(){
		String[] name = {"ȫ�浿","�������","�念��"};
		String res = "";
		for (int i = 0; i < name.length; i++) {
			if(i < name.length-1){
				res += name[i] + ","; 
			}else{
				res += name[i] + " ";
			}
		}
		return res;
	}
}