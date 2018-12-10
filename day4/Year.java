package day4;

import java.util.Scanner;
class Year{
	public static void main(String[] args){
		System.out.print("년도를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int yer = scan.nextInt();
		
		if((yer%4 == 0 && yer%100 != 0 )|| yer %400 == 0  ){
				System.out.println(yer+"는 윤년입니다");
}
		else{
				System.out.print(yer+"는 평년입니다.");
}

}
}