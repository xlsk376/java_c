package C4_���ǹ�4_������Ʈ;

import java.util.Random;
import java.util.Scanner;

public class ���ǹ�3_������Ʈ_�����ڱ�ȣ_���� {

	public static void main(String[] args) {
		/*
		 * [����]
		 * 
		 * 	[������ ��ȣ ���߱� ����]
		 * 1. 1~10 ������ ���� ���� 2���� a�� b�� ���� �����Ѵ�. ��) a = 3 , b = 4 
		 * 
		 * 2. 1~4 ������ ���� ���� 1���� op�� �����Ѵ�.  ��) op = 3
		 * 
		 * 3. op�� ����  ������ ��ȣ�� �ش�ȴ�. ��) op�ǰ��� 3�̸� ���ϱ� �̴�.
		 * 	  [1] + [2] - [3] * [4] % 
		 * 
		 * 4. ȭ�鿡 ���ڵΰ��� ���� ����Ѵ�.(��, ��ȣ�� ����ϸ�ȵȴ�.)
		 *    �׸��� �Ʒ� ������ ���⸦ ����Ѵ�.
		 * ��) 
		 * 		3 ? 4  = 12
		 *    	[1] + [2] - [3] * [4] % 
		 *    
		 * 5. ����ڴ� ��ȣ�� ���߸�ȴ�. ��) 3 ==> ����
		 *    
		 *  �ƽ��Ե� ���� ������ ���ü��ִ�. ������ �����Ұ����ϰ�, ���Ŀ� ���������ϴ�.  
		 *  
		 */
		/*
		int a=0;
		int b=0;
		int op=0;
		int add=0,sub=0,mul=0,div=0;
		int temp = 0;
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		a = ran.nextInt(10)+1;
		b = ran.nextInt(10)+1;
		op = ran.nextInt(4)+1;
		
		if(op == 1) {
			add = a + b; 
			temp = add;
		}else if(op == 2) {
			sub = a - b;
			temp = sub;
		}else if(op == 3) {
			mul = a*b;
			temp = mul;
		}else if(op == 4) {
			div = a%b;
			temp = div;
		}
		System.out.println(op);
		System.out.println(a+" ? " + b +"=" + temp  );
		
		System.out.println("��ȣ�� ��ȣ�� �Է��ϼ���");
		int p1 = scan.nextInt();
		if(p1 == op) {
			System.out.println("�����Դϴ�.");
		}else {
			System.out.println("Ʋ�Ƚ��ϴ�.");
		}
		*/
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int a;
		int b;
		int op;
		int ���ϱ� = 1;
		int ���� = 2;
		int ���ϱ� = 3;
		int ������ = 4;		
		a = ran.nextInt(10) + 1;
		b = ran.nextInt(10) + 1;
		op = ran.nextInt(4) + 1;
		int c = 0;
		if(op == ���ϱ�) {
			c = a + b;
		}else if(op ==����) {
			c = a - b;
		}else if(op == ���ϱ�) {
			c = a * b;
		}else if(op == ������) {
			c = a % b;
		}	
		System.out.printf("%d ? %d = %d\n", a , b , c);
		System.out.println("[1] + [2] - [3] * [4] %");
		int sel = scan.nextInt();
		if(sel < 1 || sel >4) {
			System.out.println("����");
		}else {
			if(op == sel) {
				System.out.println("���� : " + op);
			}else {
				System.out.println("�� : "  + op);
			}
		}
		
	}

}
