package C1_���ǹ�1_�⺻�̷�;

import java.util.Scanner;

public class ���ǹ�1_�⺻�̷�1_���ǹ� {

	public static void main(String[] args) {
		/*
		 * [���ǹ�] if
		 * 1) if => Ű����
		 * 2) (���ǽ�) => ������ ������� �Ǻ��Ѵ�.
		 * 3) {���} => �������� ������� ����� �����Ѵ�.
		 * 
		 * if(���ǽ�){
		 * 		���ǽ��� ��(true)�� �� ������ ����;
		 * }
		 */
		
		/*int a = 10;
		int b = 10;
		if(a == b) {
			System.out.println("���� X"); //�̺κ��� ������ �ȵȴ�.
		}
		*/
		//��) Ȧ¦
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num = scan.nextInt();
		
		if(num%2 == 0) {
			System.out.println("¦��");
		}
		if(num%2 != 0) {
			System.out.println("Ȧ��"); //�� �κ��� ������ �ȵȴ�.
		}

	}

}
