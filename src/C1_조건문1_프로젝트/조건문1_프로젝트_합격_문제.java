package C1_���ǹ�1_������Ʈ;

import java.util.Scanner;

public class ���ǹ�1_������Ʈ_�հ�_���� {

	public static void main(String[] args) {
		/*
		 * [����]
		 *  [���� ��ȿ�� �˻�]
		 * 1. ����2���� �Է¹޾� ����� ���Ѵ�.
		 * 2. �����  60�� �̻��̸� �հ�, 60�� �̸��̸� ���հ��̴�.
		 * 3. ����1)  �Է¹��� ������ 
		 *    �����̰ų� 100���� �ʰ��ϸ�, ���� �޼����� ����Ѵ�.
		 *    ��) ������  �߸� �Է��߽��ϴ�.
		 * 4. ����2) ����� 60 �̻��̶� , �Ѱ����̶� 50�̸��̸� ���հ��� ����Ѵ�.
		 */
		Scanner scan = new Scanner(System.in);
		/*
		System.out.println("����1������ �Է��ϼ��� : ");
		int score1 = scan.nextInt();
		if (score1 < 0 ) {
			System.out.println("������ �߸��Է��Ͽ����ϴ�.");
		}
		if (score1 > 100 ) {
			System.out.println("������ �߸��Է��Ͽ����ϴ�.");
		}
		System.out.println("����2������ �Է��ϼ��� : ");
		int score2 = scan.nextInt();
		if (score2 < 0 ) {
			System.out.println("������ �߸��Է��Ͽ����ϴ�.");
		}
		if (score2 > 100 ) {
			System.out.println("������ �߸��Է��Ͽ����ϴ�.");
		}
		int sum = score1 + score2;
		double ��� = sum/2.0;
		
		if(��� >= 60) {
			
			if(score1 < 50) {
				System.out.println("���հ�");
			}
			if(score2 < 50) {
				System.out.println("���հ�");
			}
			
			if(score1 >= 50 && score2 >= 50) {
				System.out.println("�հ�");
			}
			
			
		}
		if(��� < 60) {
			System.out.println("���հ�");
		}
		
		scan.close();
		*/
		
		System.out.println("���� 1 : ");
		int s1 = scan.nextInt();		
		System.out.println("���� 2 : ");
		int s2 = scan.nextInt();
		double ��� = (s1 + s2)/2.0;
		//1. ��� �Է¹��� ������ 0~100 ���̿� �־���Ѵ�.		
		if(s1 >= 0 && s1 <= 100 && s2 >= 0 && s2 <= 100) {
			//1-1. ����� 60�̻��̰� �������� ���� 50�̻��̸�
			if(��� >= 60 && s1 >= 50 && s2 >= 50) {
				System.out.println("�հ�");
			}
			//1-2. ����� 60�̸��̰ų�, �������� �ϳ��� 50�̸��̸�
			if(��� < 60 || s1 < 50 || s2 <50) {
				System.out.println("���հ�");
			}
		}
		//2. ��� ������ �ϳ��� �߸��ԷµǾ��ٸ�
		if(s1 < 0 || s1 > 100 || s2 < 0 || s2 >100) {
			System.out.println("����");
		}
		

	}

}
