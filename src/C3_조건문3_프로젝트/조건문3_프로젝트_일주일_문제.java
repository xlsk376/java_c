package C3_���ǹ�3_������Ʈ;

import java.util.Random;

public class ���ǹ�3_������Ʈ_������_���� {

	public static void main(String[] args) {
		/*
		 * [����]
		 * 
		 *  [���� ���߱�]
		 *  
		 * 	�̹��� 1���� �������̶�� �Ҷ�, 
		 *  �������� 1~31�� �����ϰ� �ش� ���� ����Ѵ�. 
		 *  
		 *  ��) 3�� ==> �ݿ���
		 */
		
		Random ran = new Random();
		int day = ran.nextInt(31)+1; // 1 ~ 31
		int week = day % 7;
		System.out.println(day);
		if(week == 1) {
			System.out.println("������");
		}
		if(week == 2) {
			System.out.println("�����");
		}
		if(week == 3) {
			System.out.println("�ݿ���");
		}
		if(week == 4) {
			System.out.println("�����");
		}
		if(week == 5) {
			System.out.println("�Ͽ���");
		}
		if(week == 6) {
			System.out.println("������");
		}
		if(week == 0) {
			System.out.println("ȭ����");
		}
		long a = System.currentTimeMillis();
		System.out.println(a); // 1970��1��1�� 0�ʺ��� ���ݱ��� �� ��

	}

}
