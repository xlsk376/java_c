package C1_���ǹ�1_�˰���;

import java.util.Scanner;

public class ���ǹ�1_�˰���_��ū����_���� {

	public static void main(String[] args) {
		/*
		 * [����] ���� 2���� �Է¹ް� �� ū ������ ���� ����Ͻÿ�.
		 * 
		 * (1) ����1�� �Է� : 
		 * (2) ����2�� �Է� : 
		 * (3) ��ū���ڴ� ? �Դϴ�.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("����1 �Է� : ");
		int n1 = scan.nextInt();
		
		System.out.print("����2 �Է� : ");
		int n2 = scan.nextInt();
		
		if (n1 > n2) {
			System.out.println("����1 :" + n1);
			System.out.println("����1�� �� ũ��");
		}
		if (n1 < n2) {
			System.out.println("����2 :" + n2);
			System.out.println("����2�� �� ũ��");
		}

	}

}
