package C2_���ǹ�2_�˰���;

import java.util.Scanner;

public class ���ǹ�2_�˰���_����_���� {

	public static void main(String[] args) {
		/*
		 * [����]
		 * 
		 * ��Ʈ���� ���̸� 3���� ��� 1500���� �Ǹ��Ѵ�. 
		 * ���̰� 14�� �ʿ��ϴ�. �ʿ��� �ݾ��� ����Ͻÿ�. 
		 * ��, ���̴� �������θ� �Ǹ��Ѵ�.
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		/*
		int ����3 = 1500;
		int ���� = ����3/3;
		
		System.out.println("�ʿ��� ������ �Է��ϼ��� : ");
		int ���� = scan.nextInt();
		
		int ���̹��� = ����/3;
		int sum = ����*����;
		if(����%3 == 0) {
			System.out.print("���� ������ : "+ ���̹���);
			System.out.print("�ʿ� �ݾ� : " + sum);
		}
		*/
		int ���� = 3;
		int �ʿ��ѿ��� = 11;
		
		int ���� = �ʿ��ѿ��� / ����; //�� �ʿ乭���� ���(���� ������ �Ǹ�)
		if(�ʿ��ѿ��� % ���� > 0) {
			���� = ���� + 1; // �������θ� �Ǹ��ϱ� ������ �������� 0���� ũ�� + 1
		}
			
		System.out.println(���� * 1500);
		
		
		scan.close();

	}

}
