package day5;

public class WhileSequence {

	public static void main(String[] args) {
		System.out.println("While문  1부터 10까지 출력하기.");
		String res = "";
		int count = 1;
		while (count <= 10) {
			res += count + " ";
			count++;
		}
		System.out.println(res);
	}

}
