package C2_���ǹ�2_�˰���;

import java.util.Scanner;

public class ���ǹ�2_�˰���_�ִ밪_���� {

	public static void main(String[] args) {
		/*
		 * [����] �ִ밪 ���ϱ� 
		 * 1. ���� 3���� �Է¹޴´�. 
		 * 2. �Է¹��� 3���� ���� ���Ѵ�. 
		 * 3. ���� ū ��(MAX)�� ����Ѵ�.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("����1 : ");
		int n1 = scan.nextInt();
		
		System.out.println("����2 :");
		int n2 = scan.nextInt();
		
		System.out.println("����3 : ");
		int n3 = scan.nextInt();
		/*//�ݺ�Ƚ���� �ʹ� ���Ƽ� ������
		if(n1> n2 && n1 > n3) {
			System.out.println("���� ū �� : " + n1);
		}
		if(n2> n1 && n2 > n3) {
			System.out.println("���� ū �� : " + n2);
		}
		if(n3> n1 && n3 > n2) {
			System.out.println("���� ū �� : " + n3);
		}
		*/
		int max = n1; //ó�� �Է¹��� ���� ���� ū���� �־��ش�.
		if(max < n2) { //�ι�°�� ���ؼ� ���� �۴ٸ� �ι�°���� max�� �־���
			max = n2;
		}
		if(max < n3) { //����°�� ���ؼ� ���� �۴ٸ� ����°���� max�� �־���
			max = n3;
		}
		System.out.println("max : " + max); // ���������� ���� ū�� ���
		
		
		scan.close();

	}

}
