package C1_���ǹ�1_������Ʈ;

import java.util.Scanner;

public class ���ǹ�1_������Ʈ_����_���� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * [����]
		 * 
		 * 	[����]
		 * 	���������� �Է¹޴´�. 
		 * 	���������� �ش��ϴ� ������ ����Ͻÿ�.
		 * 	�Ʒ��� ����ǥ�̴�.
		 * 		100~91 �̸� A����,
		 * 		90~81  �̸� B����,
		 * 		80���ϴ� "�����"
		 * 		
		 * 		��, �����̰ų�, A������ B������ ���� �ڸ��� 7���̻��̸� + �߰��Ͻÿ�.
		 * 		A������ B������ ���� �ڸ��� 3�������̸� - �߰��Ͻÿ�.
		 * 
		 * 	��) 
		 * 		100 => A+
		 *     	87 ==> B+
		 *     	82 ==> B-
		 *     	23 ==> �����
		 */
		int num = 0;
		
		System.out.print("������ �Է��ϼ��� : ");
		num = scan.nextInt();
		
		if (91 <= num && num <= 100) {
			if(num >= 97) {
				System.out.println("A+");
			}
			if(num <= 93) {
				System.out.println("A-");
			}
			if(93 < num && num < 97) {
				System.out.println("A");
			}
		}
		
		if (81 <= num && num <= 90) {
			if(num >= 87) {
				System.out.println("B+");
			}
			if(num <= 83) {
				System.out.println("B-");
			}
			if(83 < num && num < 87) {
				System.out.println("B");
			}
		}
		if (num <= 80) {
			System.out.println("�����");

		}
		
		scan.close();

	}

}
