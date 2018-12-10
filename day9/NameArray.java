package day9;

public class NameArray {
		public void test(){
		String[] names = new String[5];
		
		names[0] = "홍길동";
		names[1] = "세종대왕";
		names[2] = "이순신";
		names[3] = "유관순";
		names[4] = "서동준";
		
		String res = "";
		for (int i = 0; i < 5; i++) {
			if(i < 4){
				res += names[i] +",";
			}else{
				res += names[i] +"";

			}
		}
		System.out.println(res);
	}
		public static void main(String[] args) {
			NameArray name = new NameArray();
			name.test();
		}
}
