package day9;

public class NameArray {

		public void name(){
		String[] names = new String[5];
		
		names[0] = "ȫ�浿";
		names[1] = "�������";
		names[2] = "�̼���";
		names[3] = "������";
		names[4] = "������";
		
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
}
