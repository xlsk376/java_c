package C1_���ǹ�1_�˰���;

import java.util.Scanner;

public class ���ǹ�1_�˰���_¦��Ȧ��_���� {

	public static void main(String[] args) {
		/*
		 * [����] 
		 * 
		 * 	int a ������ ���ڸ� �Է¹ް� "¦��" "Ȧ��" �� ����Ͻÿ�.
		 * 
		 *  ��)
		 *  (1) ���ڸ� �Է� : 
		 *  (2) ¦��
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ��� : ");
		int a = scan.nextInt();
		
		if(a%2 ==0 ) {
			System.out.println("a�� ¦���Դϴ�.");
		}
		if(a%2 != 0) {
			System.out.println("a�� Ȧ���Դϴ�.");
		}
		
		scan.close();

	}

}
