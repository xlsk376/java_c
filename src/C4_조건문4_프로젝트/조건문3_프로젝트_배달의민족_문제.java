package C4_���ǹ�4_������Ʈ;

import java.util.Random;
import java.util.Scanner;

public class ���ǹ�3_������Ʈ_����ǹ���_���� {

	public static void main(String[] args) {
		/*
		[����]
		
			[����� ����]

			 ö���� �����ֹ��� �ް� ����Ϸ��� �Ѵ�. 
			 ���� ö���� y : 0 , x : 0 �� ��ġ�� �ִ�. 
			 
			 ���ڴ� 2�� �� �Է¹޴´�. 
			 ����1�� ������ �����ϴ°��̴�.
			 ����2�� �̵��Ÿ��� �����ϴ°��̴�.
			 
			 [����]
			 	1) �̵��ؾ��� ������ ���� 0 ~ 3 ���� ǥ���Ѵ�. 
			 	2) �� ������ �ǹ̴� (�� : 0) ,(�� : 1) , (�� : 2) , (�� : 3) �̴�.
			 [�̵��Ÿ�]
			 	1) �̵��� �Ÿ��� 1~10 �����̴�. 


			 ���� ��� ������ 3 �̰� , �Ÿ��� 8�̸� 	
			 
			 ù��° ���� 3�� �����̹Ƿ� "����" �̰� ,
			 �ι�° ���� 8�� �Ÿ��� �̹Ƿ�, �ᱹ x �� -8 �̵ȴ�.  
			 �̵��Ұ��� x : -8 , y : 0 �̴�.
			
			-----------------------------------------------------------------------------
			 �������� ����(0~3) �� �Ÿ�(1~10)�� �����ϰ� ����� ��ġ�� ����Ͻÿ�.
			 ��) ������ 2 ,  �Ÿ��� 3 ==> (y = -3 , x = 0)
		
		*/
		
		int ����;
		int �Ÿ�;
		int x = 0;
		int y = 0;
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		���� = ran.nextInt(4);
		�Ÿ� = ran.nextInt(9)+1;
		System.out.printf("���� : %d, �Ÿ� : %d", ����,�Ÿ�);
		System.out.println();
		
		/*
		System.out.println("(�� : 0) ,(�� : 1) , (�� : 2) , (�� : 3)");
		���� = scan.nextInt();
		System.out.println("�̵��Ÿ�(1~10) : ");
		�Ÿ� = scan.nextInt();
		*/
		
		if(���� >= 0 && ���� <= 3) {
			if(���� == 2) {
				y = y - �Ÿ�;
				//System.out.printf("x = %d, y = -%d", x, y);
			}else if(���� == 3) {
				x = x - �Ÿ�;
				//System.out.printf("x = -%d, y = %d", x, y);
			}else if(���� == 0) {
				y = y + �Ÿ�;
				//System.out.printf("x = %d, y = %d", x, y);
			}else if(���� == 1) {
				x = x + �Ÿ�;
				//System.out.printf("x = %d, y = %d", x, y);
			}
			System.out.printf("%d, %d", x, y);
			
		}
		else {
			System.out.println("�������");
		}
		
		/*
		Scanner scan = new Scanner(System.in);
		int ����;
		int �Ÿ�;
		int x = 0;
		int y = 0;
		int �� = 0;
		int �� = 1;
		int �� = 2;
		int �� = 3;
		
		System.out.println("���� [0~3] �� �Է� : ");
		���� = scan.nextInt();
		if(���� < 0 || ���� >3) {
			System.out.println("����");
		}else {
			System.out.println("�̵� [1~10] �� �Է� : ");
			�Ÿ� = scan.nextInt();
			if(�Ÿ� < 1 || �Ÿ� > 10) {
				System.out.println("����");
			}else {
				if(���� == ��) {
					y += �Ÿ�;
				}else if(���� == ��) {
					x += �Ÿ�;
				}else if(���� == ��) {
					y = y - �Ÿ�;
				}else if(���� == ��) {
					x -= �Ÿ�;
				}
			}
		}
		
		System.out.println(y + " " + x);
		*/
		

	}

}
