package day2;

import java.util.Scanner;
class Test1{
    public static void main(String[] agrs){
	System.out.println("3의 배수를 입력하세요");
	Scanner scan = new Scanner(System.in);
	int num1 = scan.nextInt();
	if(num1 % 3 == 0){
		System.out.print("3의 배수입니다.");
}
	else{
		System.out.print("3의 배수가 아닙니다.");	

}
}
}