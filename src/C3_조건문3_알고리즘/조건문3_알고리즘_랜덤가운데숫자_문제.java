package C3_���ǹ�3_�˰���;

import java.util.Random;
import java.util.Scanner;

public class ���ǹ�3_�˰���_�����������_���� {

	public static void main(String[] args) {
		/*
		 * [����]
		 * 
		 * 	[��� ���� ���߱� ����]
		 * 
		 * 1. 150~250 ������ ���� ���� �����Ѵ�.
		 * 2. ���� ������ ��� ���ڸ� ���� �Է��Ͽ� ���ߴ� �����̴�.
		 * ��)
		 * 		249		: 4
		 */
		
		Random ran = new Random();
		/*
		Scanner scan = new Scanner(System.in);
		int num = ran.nextInt(101); // 0 ~ 100
		num = num + 150;
		*/
		/*
		System.out.println(num);
		
		int h = num/100;
		int t = num%100/10;
		int o = num%100%10;
		System.out.println(h);
		System.out.println(t);
		System.out.println(o);
		*/
		
		/*
		int t = num%100/10;
		System.out.print("���� �Է��ϼ��� : ");
		int n1 = scan.nextInt();
		
		if(n1 == t) {
			System.out.println("�����Դϴ�.");
		}else if (n1 != t){
			System.out.println("Ʋ�Ƚ��ϴ�.");
			//System.out.println(t);
		}else {
			System.out.println("������ : " + t);
		}
		*/
		int num = ran.nextInt(101); // 0~100
		num = num + 150;		
		System.out.println(num);
		
		int a = num % 100;
		System.out.println(a);
		int b = a / 10;
		System.out.println(b);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է� : ");
		int me = scan.nextInt();
		
		if(b == me) {
			System.out.println("����");
		}else {
			System.out.println("��");
		}
		
		

	}

}
