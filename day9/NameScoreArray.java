package day9;

import java.util.Scanner;

public class NameScoreArray {

	public String namescoreArray(String[] name, int[] grade){
		String res = "";
		for(int i = 0; i < grade.length; i++){
			for(int j = i+1; j < grade.length; j++){// i+1�� ū���� �տ� �ֱ⶧���� ���ƿͼ� �� ���� �ʿ䰡���
				if(grade[i] < grade[j]){
					int t = grade[i];
					grade[i] = grade[j];
					grade[j] = t;

					String t1 = name[i];
					name[i] = name[j];
					name[j] = t1;
				}
			}
			//��������
//			for (int j = 0; j < grade.length -i -1; j++) {// -i -1�� �������� ū���� ����ֱ⶧���� �� ������ �ʿ䰡����
//			if(grade[j] > grade[j+1]){
//				int t = grade[j];
//				grade[j] = grade[j+1];
//				grade[j+1] = t;
//
//				String t1 = name[j];
//				name[j] = name[j+1];
//				name[j+1] = t1;
//			}
//		}
			res += i+1+"�� : "+name[i] +" ����: "+ grade[i]+"\n";
		}
		return res;
	}

}

