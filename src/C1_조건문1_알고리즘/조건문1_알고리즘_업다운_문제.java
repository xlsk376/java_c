package C1_���ǹ�1_�˰���;

import java.util.Scanner;

public class ���ǹ�1_�˰���_���ٿ�_���� {

	public static void main(String[] args) {
		/*
		 * [����]
		 * 	[Up & Down ����]
		 * 
		 *  com�� 8�̴�.
		 *  me�� ���ڸ� �ϳ��Է¹޴´�.
		 *  com �� me �� ���ؼ� ������ ���� �޼����� ����Ѵ�.
		 *   [1] me < com	: Up!
		 *   [2] me == com : Bingo!
		 *   [3] me > com  : Down!
		 *   
		 *   ��)
		 *   (1) ���ڸ� �Է� : 
		 *   (2) Up! 
		 *   
		 */
		
		int com = 8;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ��� : ");
		int me = scan.nextInt();
		
		if (me < com) {
			System.out.println("Up!");
		}
		if (me == com) {
			System.out.println("Bingo!");
		}
		if (me > com) {
			System.out.println("Down!");
		}
		
		
		scan.close();
		

	}

}
