package day4;

import java.util.Scanner;
class Year{
	public static void main(String[] args){
		System.out.print("�⵵�� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int yer = scan.nextInt();
		
		if((yer%4 == 0 && yer%100 != 0 )|| yer %400 == 0  ){
				System.out.println(yer+"�� �����Դϴ�");
}
		else{
				System.out.print(yer+"�� ����Դϴ�.");
}

}
}