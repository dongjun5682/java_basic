package day9;

import java.util.Scanner;

public class NameArray2 {
	public void test(){
		Scanner scan =new Scanner(System.in);
		System.out.println("�л����� �Է��ϼ���.");
		int count = scan.nextInt();
		String[] names =new String[count];
		int [] scores = new int[count];
		int iter = 0;
		while (true) {
			System.out.println("[���� 0 ���� 1] �̸��� ������ �Է��ϼ���.");
			String flag = scan.next();
			if(!flag.equals("0") && iter != count){
				names[iter] = scan.next();
			}
		}
	}
}