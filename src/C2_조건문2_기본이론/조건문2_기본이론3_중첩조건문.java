package C2_���ǹ�2_�⺻�̷�;

import java.util.Scanner;

public class ���ǹ�2_�⺻�̷�3_��ø���ǹ� {

	public static void main(String[] args) {
		/*
		 * [����]
		 * 
			[��ø ���ǹ�]
				�α����� ��øif �� �ٽ� ǥ���ϱ�. 
				���� id �� �Է¹ް� , id �� ��ġ�ϸ� �׶� pw �� �Է¹ޱ�.
		
		 * 1. Id�� �Է¹޾� dbId�� ��ġ�� ��쿡�� Pw�� �Է��� �� �ִ�.
		 * 2. Id�� Ʋ�� ���, "Id�� Ȯ�����ּ���"��� �޼����� ����Ѵ�.
		 * 3. Pw�� Ʋ�� ���, "Pw�� Ȯ�����ּ���"��� �޼����� ����Ѵ�.
		 * 4. Id�� Pw�� ��� ��ġ�ϴ� ���, "�α��� ����"��� �޼����� ����Ѵ�.
		 * 
		 * �Ʒ��������� ������ũǥ�����̴�.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int dbId = 1234;
		int dbPw = 1111;
		
		System.out.print("���̵� �Է����ּ��� : ");
		int join_id = scan.nextInt();
		if(join_id == dbId) {
			System.out.print("�н����带 �Է����ּ��� : ");
			int join_pw = scan.nextInt();
			if (join_pw == dbPw) {
				System.out.println("�α��� ����");
			}
			if(join_pw != dbPw) {
				System.out.println("�н����带 Ȯ�����ּ���");
			}
		}
		if(join_id != dbId) {
			System.out.println("���̵� Ȯ�����ּ���");
		}
		scan.close();
		
		/*
		 * 
		 //ȸ�������� ����
		int join_id = 1234;
		int join_pw = 1111;

		//�ȳ� �α��� ���̵�
		System.out.print("ID �Է� : ");
		//�Է� �α��� ���̵� 
		int log_id = scan.nextInt();
		
		// �н������ ���̵� ��ġ�ϸ� �Է¹޴´�. 
		// 1. ���̵� �񱳽� ���ٸ�,
		if (join_id == log_id) {
			//1-1 �ȳ� �α��� �н����� 
			System.out.print("Pw �Է� : ");
			//1-1 �Է� �α��� �н����� 
			int log_pw = scan.nextInt();  // log_pw �� ���� �Ҹ��ϴ°�
			//1-1 �н����尡 ���Ƹ�
			if (join_pw == log_pw) {
				System.out.println("�α��� ����!");
			}
			//1-2 �н����尡 Ʋ���ٸ� 
			if (join_pw != log_pw) {
				System.out.println("Pw�� Ȯ�����ּ���.");
			}
		}
		// 2. ���̵� �񱳽� Ʋ���ٸ� 
		if (join_id != log_id) {
			System.out.println("Id�� Ȯ�����ּ���.");
		}
		 */

	}

}
