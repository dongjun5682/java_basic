package day9;

import java.util.Scanner;

public class NameArray2 {
	public void test(){
		Scanner scan =new Scanner(System.in);
		System.out.println("학생수를 입력하세요.");
		int count = scan.nextInt();
		String[] names =new String[count];
		int [] scores = new int[count];
		int iter = 0;
		while (true) {
			System.out.println("[종료 0 진행 1] 이름과 점수를 입력하세요.");
			String flag = scan.next();
			if(!flag.equals("0") && iter != count){
				names[iter] = scan.next();
			}
		}
	}
}