package day9;

import java.util.Scanner;

public class NameScoreArray {

	public void namescoreArray(){
		Scanner scan = new Scanner(System.in);
		System.out.println("�л��� ����Դϱ�?");
		int count = scan.nextInt();
		String[] names = new String[count];
		int[] scores = new int[count];
		int iter = 0;
		String res = "";
		while (true) {
			System.out.println("[���� 0, ���� 1]");
			String flag = scan.next();
			if(!flag.equals("0") && iter != count){
				System.out.println("�л��̸��̶� ������ �Է��ϼ���.");
				names[iter] = scan.next();
				scores[iter] = scan.nextInt();
				res += "�̸���  "+ names[iter] + " ������ "+scores[iter]+"\n";
				iter++;
			}else{
				System.out.println("�����Դϴ�. \n"
						+ res);
				return;
			}
		}
	}
}
