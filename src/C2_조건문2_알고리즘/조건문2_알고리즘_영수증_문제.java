package C2_���ǹ�2_�˰���;

import java.util.Scanner;

public class ���ǹ�2_�˰���_������_���� {

	public static void main(String[] args) {
		/*
		 * [����]
		 * 
		 * [������ ���] 1. �޴����� ����Ѵ�. 2. ����ڴ� �ֹ��ϰ��� �ϴ� �޴��� ��ȣ�� �Է��Ѵ�. 3. ������ �Է¹޴´�. 4. �Է¹���
		 * ���ݰ� �޴������� Ȯ����, �������� ����Ѵ�. 5. ��, ������ ������ ��� "������ �����մϴ�."��� �޼����� ����Ѵ�.
		 */

		Scanner scan = new Scanner(System.in);
		/*int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		int menu1 = 1;
		int menu2 = 2;
		int menu3 = 3;

		System.out.println("=== �Ե����� ===");
		System.out.println("1.�Ұ�� ���� : " + price1 + "��");
		System.out.println("2.����    ���� : " + price2 + "��");
		System.out.println("3.��         �� : " + price3 + "��");

		System.out.print("�޴��� ��ȣ�� �Է��ϼ��� : ");
		int menu = scan.nextInt();

		System.out.print("�ݾ��� �Է��ϼ��� : ");
		int cash = scan.nextInt();

		int sum1 = cash - price1;
		int sum2 = cash - price2;
		int sum3 = cash - price3;
		if (menu == menu1) {
			if (cash >= 8700) {
				System.out.println("�Ž������� " + sum1);
			}
			if (cash < 8700) {
				System.out.println("������ �����մϴ�.");
			}

		}
		if (menu == menu2) {
			if (cash >= 6200) {
				System.out.println("�Ž������� " + sum2);
			}
			if (cash < 6200) {
				System.out.println("������ �����մϴ�.");
			}

		}
		if (menu == menu3) {
			if (cash >= 1500) {
				System.out.println("�Ž������� " + sum3);
			}
			if (cash < 1500) {
				System.out.println("������ �����մϴ�.");
			}

		}
		*/
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;		
		System.out.println("=== �Ե����� ===");
		System.out.println("1.�Ұ�� ���� : " + price1 + "��");
		System.out.println("2.����    ���� : " + price2 + "��");
		System.out.println("3.��         �� : " + price3 + "��");
		System.out.println("��ȣ�� �Է��ϼ��� (1~3) ");
		int sel = scan.nextInt();
		
		//1. ���ù�ȣ�� 1�̸� 
		if(sel == 1) {
			//1-1 : �ȳ� ����
			System.out.println("�����Է� : ");
			//1-1 : �Է� ����
			int money = scan.nextInt();
			//1-1 : �Ž����� ���
			int �Ž����� = money - price1;
			//1-1 : �Ž������� ����ϸ�
			if(�Ž����� >= 0) {
				System.out.println("���� : " + money);
				System.out.println("�Ұ����� :" + price1);
				System.out.println("�Ž����� : " + �Ž�����);
			}
			//1-2 : �Ž������� �����ϸ� 
			if(�Ž����� < 0) {
				System.out.println("���̺����մϴ�.");
			}			
		}
		if(sel == 2) {
			System.out.println("�����Է� : ");
			int money = scan.nextInt();
			int �Ž����� = money - price2;
			if(�Ž����� >= 0) {
				System.out.println("���� : " + money);
				System.out.println("������� :" + price2);
				System.out.println("�Ž����� : " + �Ž�����);
			}
			if(�Ž����� < 0) {
				System.out.println("���̺����մϴ�.");
			}			
		}
		if(sel == 3) {
			System.out.println("�����Է� : ");
			int money = scan.nextInt();
			int �Ž����� = money - price3;
			if(�Ž����� >= 0) {
				System.out.println("���� : " + money);
				System.out.println("�ݶ� :" + price3);
				System.out.println("�Ž����� : " + �Ž�����);
			}
			if(�Ž����� < 0) {
				System.out.println("���̺����մϴ�.");
			}			
		}
		//4.���¹�ȣ ����ó��
		if(sel < 1 || sel > 3) {
			System.out.println("����");
		}
		scan.close();

	}

}
