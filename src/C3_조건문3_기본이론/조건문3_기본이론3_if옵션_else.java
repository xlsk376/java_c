package C3_���ǹ�3_�⺻�̷�;

public class ���ǹ�3_�⺻�̷�3_if�ɼ�_else {

	public static void main(String[] args) {
		/*
		 * [if ���� �ɼ� 2����]
		 * 
		 * - else 
		 * - else if 
		 * ������ 2�����ΰ�� else �� �̿��ؼ� 2��° ������ �����Ҽ��ִ�.
		 */
		
		int num = 11;
		if (num % 2 == 0) {
			System.out.println("¦��");
		}
		if (num % 2 == 1) {
			System.out.println("Ȧ��");
		}
		
		System.out.println("---------------------------");
		
		if (num % 2 == 0) {
			System.out.println("¦��");
		}
		else { // if�� ������ �ƴϸ� ������ �����Ѵ�.
			System.out.println("Ȧ��");
		}

	}

}
