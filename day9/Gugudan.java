package day9;

import java.util.Scanner;

public class Gugudan {
	public void gugu(){
		Scanner scan = new Scanner(System.in);
		String res = "";
		System.out.println("���ϴ� ������ ���� �Է��ϼ���.");
		int number = scan.nextInt();
		for (int i = 1; i < 10; i++) {
			if(number < 10){
				res += number +" * "+ i +" = "+ number*i + "\n";
			}else{
				res = "10�� ������ �ȵ˴ϴ�.";
			}
			}
		System.out.println(res);
	}

}
