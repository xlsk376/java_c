package C1_���ǹ�1_�˰���;

import java.util.Scanner;

public class ���ǹ�1_�˰���_ȸ������_���� {

	public static void main(String[] args) {
		/*
		 * [����]
		 * 
		 * 	[ȸ������ �� �α���] 
		 * 1. ���� ���̵�� ��й�ȣ�� �Է��ؼ� ȸ�������Ѵ�. 
		 * 2. ���� �α����� ���� �ٽ� ���̵�� ��й�ȣ�� �Է¹޴´�.
		 * 3. ���Ե� ���̵�� ��й�ȣ�� �α��ν� �Է��� ���̵�� ��й�ȣ�� ���Ѵ�.
		 * 4. "�α���" �Ǵ� "�α��ν���" �� ����ϼ���. 
		 * 
		 */
		/*Scanner scan = new Scanner(System.in);
		
		int joind_id = 0;
		int joind_pw = 0;
		
		System.out.print("ȸ������ ���̵� �Է� : ");
		int join_id = scan.nextInt();
		
		System.out.print("ȸ������ ��� �Է� : ");
	    int join_pw = scan.nextInt();
		
		int a = join_id;
		int b = join_pw;
		
		
		System.out.print("���̵� �Է� : ");
		int log_id = scan.nextInt();
		
		System.out.print("��� �Է� : ");
		int log_pw = scan.nextInt();
		
		if (a != log_id || b != log_pw) {
			System.out.println("�α��� ����");
		}
		if (a == log_id && b == log_pw) {
			System.out.println("�α���");
		}
		*/
		int join_id = 0;
		int join_pw = 0;
		
		int log_id = 0;
		int log_pw = 0;
		// scan
		Scanner scan = new Scanner(System.in);
		// �ȳ� ȸ������ ���̵�
		System.out.println("ȸ������ ���̵� �Է� : ");
		// �Է� ȸ������ ���̵�
		join_id = scan.nextInt();
		
		// �ȳ� ȸ������ ��й�ȣ
		System.out.println("ȸ������ ��й�ȣ �Է� : ");
		// �Է� ȸ������ ��й�ȣ
		join_pw = scan.nextInt();
		// �ȳ� �α��� ���̵�
		System.out.println("�α��� ���̵� �Է� : ");
		// �Է� �α��� ���̵�
		log_id = scan.nextInt();
		// �ȳ� �α��� ��й�ȣ
		System.out.println("�α��� ��й�ȣ �Է� : ");
		// �Է� �α��� ��й�ȣ
		log_pw = scan.nextInt();
		
		// 1. ���̵� ������ 
		if(join_id == log_id) {
			//1-1. ���̵� ������ ��й�ȣ�� ������
			if(join_pw == log_pw) {
				System.out.println("�α���");
			}
			//1-2. ���̵� ������ ��й�ȣ�� �ٸ��� 
			if(join_pw != log_pw) {
				System.out.println("�α��ν���");
			}
		}
		// 2. ���̵� �ٸ��� 
		if(join_id != log_id) {
			System.out.println("�α��ν���");
		}
		
		
		
		
		
		
		scan.close();

	}

}
