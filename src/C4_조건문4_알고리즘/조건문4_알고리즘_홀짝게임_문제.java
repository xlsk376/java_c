package C4_���ǹ�4_�˰���;

import java.util.Random;
import java.util.Scanner;

public class ���ǹ�4_�˰���_Ȧ¦����_���� {

	public static void main(String[] args) {
		/*
		 * [����]
		 * 
		 * 	[Ȧ¦ ����]
		 * 
		 * 1. 1~10���� ������ �������� �Ѱ��� ���ڸ� �����Ѵ�.
		 * 2. ������ ���ڰ� [1.Ȧ��][2.¦��] ���� ���ߴ°����̴�.
		 */
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		/*
		int num = ran.nextInt(10)+1;
		System.out.println(num);
		System.out.println("[1.Ȧ��][2.¦��]"); //�����ϴ°� �������� ���α׷��� 1~2����� ����
		int select = scan.nextInt();
		if(num%2 == 0) {
			if(select == 2) {
				System.out.println("�½��ϴ�.");
			}else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
			}
		}else {
			if(select == 1) {
				System.out.println("�½��ϴ�.");
			}else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
			}
		}
		
		scan.close();
		*/
		int r = ran.nextInt(10) + 1;
		//System.out.println(r);
		System.out.println("[1] Ȧ�� , [2] ¦�� �Է� : ");
		int sel = scan.nextInt();
		if(sel == 1) {
			if(r % 2 != 0) {
				System.out.println("����");
			}else {
				System.out.println("����");
			}
			
		}else if(sel == 2) {
			if(r % 2 == 0) {
				System.out.println("����");
			}else {
				System.out.println("����");
			}
		}else {
			System.out.println("����");
		}
		System.out.println(r);

	}

}
