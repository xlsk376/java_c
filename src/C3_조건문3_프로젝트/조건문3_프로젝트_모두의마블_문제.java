package C3_���ǹ�3_������Ʈ;

import java.util.Random;
import java.util.Scanner;

public class ���ǹ�3_������Ʈ_����Ǹ���_���� {

	public static void main(String[] args) {
		/*
		[����]
		
		[����Ǹ������] 
		
		 - ö���� ���� ����Ǹ�������� �ϰ��ִ�.
		 - ������ 0 ~ 20���� �̵��Ҽ��ִ°Ÿ����ִ�.
		 - ���� ö���� �����̰� , ������ ��ġ�� 
		 - ���������κ���  9 ��ŭ �̵��ߴ�.		 
		 - 1 ~ 6�� ������ �ִ� �ֻ��� 2���� ������.
		 - �ֻ��� ������  �ո�ŭ �̵��Ѵ�. 
		 - ���� �̵��� ö���� ��ġ�� ����Ͻÿ�.
	
		 [����]
		 1) �� �ֻ��� ���ڰ� ���δٸ����� ������ġ����
		 		�ֻ������� �ո�ŭ �̵��Ѵ�. ��) 3, 5 ==> 8 ��ŭ�̵��Ѵ�.
	
		 2) �� �ֻ��� ���ڰ� ������� ���ʽ� �̵��Ÿ� 6 �߰��Ѵ�.
		      ��) 2 , 2  ==> 4 + 6 ��ŭ�̵��Ѵ�.
	
		 3) 14,15,16 ���� ��ġ�� ������ �ִ�. 
			  ������ �ɸ��� �ֻ���2���� �ٽ� ������ 
			  ������ 6�����̸� [�г�Ƽ] ó����ġ(0)�� �̵��Ѵ�.
	          ������ 7�̻��̸� ����Ż��[�г�Ƽ����]
	
		 4) 20 �̻��� ���� ������ "�¸�" �� ����Ѵ�.
		 */
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		/*int n1 = ran.nextInt(6);		
		int n2 = ran.nextInt(6);
		n1 = n1 + 1;
		n2 = n2 + 1;
		int sum = 0;
		System.out.println(n1);
		System.out.println(n2);		
		*/
		
		int ö�� = 9;
		System.out.print("�ֻ���1 : ");
		int n1 = scan.nextInt();
		System.out.print("�ֻ���2 : ");
		int n2 = scan.nextInt();
		
		int sum = 0;
		
		if(n1 == n2) {
			sum = n1+n2+6+ö��;
			if(sum>= 20) {
				System.out.println("�¸�");
			}else if(sum == 14 || sum ==15 || sum == 16) {
				System.out.println(sum);
				System.out.print("�ֻ���1 : ");
				n1 = scan.nextInt();
				System.out.print("�ֻ���2 : ");
				n2 = scan.nextInt();
				if(n1 + n2 >= 7) {
					System.out.println("����Ż��");
				}else if(n1 + n2 <= 6) {
					System.out.println("ó������");
				}
			}
			if(sum < 20) {
				sum = n1 + n2 +6 + ö��;
				System.out.println(sum);
			}
		}else {
			sum = n1+n2+ö��;
			if(sum >= 20) {
				System.out.println("�¸�");
			}else if(sum == 14 || sum == 15 || sum ==16) {
				System.out.println(sum);
				System.out.print("�ֻ���1 : ");
				n1 = scan.nextInt();
				System.out.print("�ֻ���2 : ");
				n2 = scan.nextInt();
				if(n1 + n2 >= 7) {
					System.out.println("����Ż��");
				}else if(n1 + n2 <= 6) {
					System.out.println("ó������");
				}
			}
			if(sum < 20) {
				sum = n1 + n2 + ö��;
				System.out.println(sum);
			}
		}
				
		/*

		int sum = 0;
		if(n1 == n2) {
			sum = n1 + n2 + 6;
			System.out.println(sum);
			if(sum == 14 || sum == 15 || sum == 16) {
				System.out.println("�ֻ����� �ٽ� ��������");
				//int n3 = ran.nextInt(6);
				//int n4 = ran.nextInt(6);
				System.out.println("�ֻ���1 : ");
				int n3 = scan.nextInt();
				System.out.println("�ֻ���2 : ");
				int n4 = scan.nextInt();
				int sum2 = n3 + n4;
				if(sum2 <= 6) {
					System.out.println("ó����ġ�� �̵�");
				}else if(sum2 >= 7) {
					System.out.println("����Ż��");
				}
			}
		}
		if(n1 != n2) {
			sum = n1 + n2;
			System.out.println(sum);
		}
		*/
	 
		
		

	}

}
