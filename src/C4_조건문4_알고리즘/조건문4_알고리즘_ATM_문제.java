package C4_���ǹ�4_�˰���;

import java.util.Scanner;

public class ���ǹ�4_�˰���_ATM_���� {

	public static void main(String[] args) {
		/*
		 * [����] 
		 * 
		 * [ATM]
		 *  
		 *   [��������]
		 *   cash ==> �������ִ� ������ ǥ���Ѵ�.
		 *   balance ==> ������ ǥ���Ѵ�.
		 *   joinId ==> �̹� ������ ���̵�
		 *   joinPw ==> �̹� ������ �н�����
		 *  
		 *   [Ư�̻���] ==>  �α��� ���Ŀ� ���ο� �޴��� �������� �Ѵ�.
		 *   
		 *   	[1.�α���] 
		 *  	    [1-1. �α��μ���] ==> ���ο�Ŵ����� ==> [1.�Ա�] [2.���] 	
		 *              [1-1-1.�Ա�] ==> ������ �پ��� ������ �þ��.
		 *              [1-1-2.���] ==> ������ �پ��� ������ �þ��.
		 *  		[1-2. �α��ν���] ==> ����
		 *  	[0.����]
		 *  
		 *   [��������� ����Ͻÿ�]
		 *  
		 */
		Scanner scan = new Scanner(System.in);
		
		int cash = 20000;    
		int balance = 30000; 
		int joinId = 11111; 
		int joinPw = 1234;  
		/*
		System.out.println("===MEGA ATM===");
		System.out.println("[1.�α���] [0.����]");
		int select = scan.nextInt();
		if (select == 1) {
			System.out.print("ID : ");
			int dbId = scan.nextInt();
			if(joinId == dbId) {
				System.out.print("PW :");
				int dbPw = scan.nextInt();
				if(joinPw == dbPw) {
					System.out.println("�α��ο� �����Ͽ����ϴ�.");
					System.out.println("[1.�Ա�] [2.���]");
					int count = scan.nextInt();
					if(count == 1) {
						balance = balance + cash;
						System.out.println("�Ա� : " + cash);
						System.out.println("�ܾ� : " + balance);
					}
					if(count == 2) {
						balance = balance - cash;
						System.out.println("��� : " + cash);
						System.out.println("�ܾ� : " + balance);
					}
				}else {
					System.out.println("PW�� Ʋ�Ƚ��ϴ�.");
				}
			}
			else {
				System.out.println("ID�� Ʋ�Ƚ��ϴ�.");
			}
			
		}else if (select == 0) {
			System.out.println("����");
		}
		*/
		System.out.println("===MEGA ATM===");
		System.out.println("[1.�α���] [0.����]");
		int select = scan.nextInt();
		if (select == 1) {
			System.out.println("���̵� �Է� : ");
			int id = scan.nextInt();
			System.out.println("��й�ȣ �Է� : ");
			int pw = scan.nextInt();
			if(joinId == id && joinPw == pw) {
				System.out.println("�α��μ���");
				System.out.println("[1.�Ա�][2.���]");
				select = scan.nextInt();
				if(select == 1) {
					System.out.println("�Ա��� �ݾ� : ");
					int money = scan.nextInt();
					int charge = cash - money;
					if(charge >= 0) {
						cash = cash - money;
						balance = balance + money;
						System.out.println(cash + " " + balance);					
					}else {
						System.out.println("����");
					}
					
				}else if(select == 2) {
					System.out.println("����� �ݾ� : ");
					int money = scan.nextInt();
					int charge = balance - money;
					if(charge >= 0) {
						balance = balance - money;
						cash = cash + money;
						System.out.println(cash + " " + balance);					
					}else {
						System.out.println("����");
					}
				
				}else {
					System.out.println("����");
				}
				
				
			}else {
				System.out.println("�α��ν���");
			}
			
			
			
		}else if (select == 0) {
			System.out.println("����");
		}
	}

}
