package C2_���ǹ�2_�˰���;

import java.util.Scanner;

public class ���ǹ�2_�˰���_������_���� {

	public static void main(String[] args) {
		/*
		 * [����]
		 * ������ ����
		 * 1. ������ ������ �����ϱ� ����, ���� 2���� �Է¹޴´�.
		 * 2. �Է¹��� ���ڸ� ���� ������ ������ ����Ѵ�.
		 * ��) 3 x 7 = ?
		 * 3. ������ �ش��ϴ� ������ �Է¹޴´�.
		 * 4. ������ �� "����" �Ǵ� "��" �� ����Ѵ�.
		 */
		
		Scanner scan = new Scanner(System.in);
		/*
		System.out.print("����1 : ");
		int n1 = scan.nextInt();
		System.out.print("����2 : ");
		int n2 = scan.nextInt();
		
		int mu = n1 * n2;
		System.out.println(n1 + "x" + n2 + " = " + "?");
		System.out.println("������? " );
		int cor = scan.nextInt();
		
	
		if (cor == mu) {
			System.out.println("����");
		}
		if (cor != mu) {
			System.out.println("��");
		}
		*/
		
		System.out.println("���� 1 : ");
		int a = scan.nextInt();
		
		System.out.println("���� 2 : ");
		int b = scan.nextInt();
		
		System.out.printf("%d * %d = " , a , b);
		int c = scan.nextInt();
		
		if(a*b == c) {
			System.out.println("����");
		}
		if(a*b != c) {
			System.out.println("��");
		}
		
		scan.close();
		
		
		
		
		

	}

}
