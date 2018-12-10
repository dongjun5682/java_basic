package day9;

import java.util.Scanner;

public class NameScoreArray {

	public void namescoreArray(){
		Scanner scan = new Scanner(System.in);
		System.out.println("학생이 몇명입니까?");
		int count = scan.nextInt();
		String[] names = new String[count];
		int[] scores = new int[count];
		int iter = 0;
		String res = "";
		while (true) {
			System.out.println("[종료 0, 진행 1]");
			String flag = scan.next();
			if(!flag.equals("0") && iter != count){
				System.out.println("학생이름이랑 점수를 입력하세요.");
				names[iter] = scan.next();
				scores[iter] = scan.nextInt();
				res += "이름은  "+ names[iter] + " 점수는 "+scores[iter]+"\n";
				iter++;
			}else{
				System.out.println("종료입니다. \n"
						+ res);
				return;
			}
		}
	}
}
