package C3_���ǹ�3_�⺻�̷�;

public class ���ǹ�3_�⺻�̷�2_�߰�ȣ���� {

	public static void main(String[] args) {
		/*
		 * ���ǹ��� ������ �ش��ϴ� {} �߰�ȣ�� �����Ҽ��ִ�. ��, 1�ٸ� ���Ǹ� ��Ȯ���ڵ����������� ��������ʴ°��� ����.
		 */

		int a = 10;
		int b = 10;
		if (a == b)
			System.out.println("���� 0 (1)");

		if (a == b) {
			System.out.println("���� 0 (2)");
		}

		System.out.println("----------------------------------");

		if (a != b)
			System.out.println("���� x (1)");
			System.out.println("���� x (2) "); // ���ٸ� ����ǹǷ� ��µȴ�.

		if (a != b) {
			System.out.println("���� x (3)");
			System.out.println("���� x (4) ");
		}

	}

}
