package day7;

public class ForloopDemo {
public static void main(String[] args) {
	String res ="";
	int res2 =0;
	
	for (int i = 0; i <= 10; i++) {
			if(i !=10){
				res += i+" + ";
			}else{
				res += i+" = ";
			}
			res2 += i;
	}
	System.out.println(res+res2);
}
}
