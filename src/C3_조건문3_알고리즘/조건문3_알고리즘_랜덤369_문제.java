package C3_���ǹ�3_�˰���;

import java.util.Random;

public class ���ǹ�3_�˰���_����369_���� {

	public static void main(String[] args) {
		/*
		 * [����]
		 * 
		 * 	[369����]
		 * 
		 * 1. 1~50 ������ ���� ���ڸ� �����Ѵ�.
		 * 2. �� ���� 369�� ������
		 * 	1) 2���̸�, ¦¦�� ����Ѵ�.
		 *  2) 1���̸�, ¦�� ����Ѵ�.
		 *  3) 0���̸�, �ش� ���ڸ� ����Ѵ�.
		 * ��)
		 * 		33	 : ¦¦
		 * 		16	 : ¦
		 * 		 7	 : 7       
		 */
		// [��Ʈ] ���� �ڸ�, ���� �ڸ� �и��ϸ� ����ϱ� ����.
		Random ran = new Random();
		/*
		int r = ran.nextInt(50)+1;
		System.out.println(r);
		int dTen = r/10; // �����ڸ�
		int dOne = r%10; // �����ڸ�
		//������ ���ϱⰡ �ʿ� ����, 369���� �ش�Ǵ� ���ڸ� üũ�Ǹ� ��
		if(dTen%3 == 0 || dTen%6 ==0 || dTen%9 == 0) { 
			System.out.println("¦");
			if(dOne%3 == 0 || dOne%6 == 0 || dOne%9 == 0) {
				System.out.println("¦¦");
			}
		}
		*/
		int num = ran.nextInt(50); // 50�� ==> 0~49
		num = num + 1;
		System.out.println(num);
		
		int a = num / 10; // 10�� �ڸ�
		int b = num % 10; // 1�� �ڸ�
		int count = 0;
		if(a == 3 || a == 6 || a == 9) {
			count = count + 1;
		}
		if(b == 3 || b == 6 || b == 9) {
			count = count + 1;
		}
			
		if(count == 2) {
			System.out.println("¦¦");
		}else if(count == 1) {
			System.err.println("¦");
		}else {
			System.out.println(num);
		}
		

	}

}
