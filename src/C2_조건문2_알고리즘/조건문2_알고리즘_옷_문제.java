package C2_���ǹ�2_�˰���;

public class ���ǹ�2_�˰���_��_���� {

	public static void main(String[] args) {
		/*
		[����] 
			�������� 24600�� ¥�� ��������ϴ�.
			1000��¥�� ����θ� �ʰ��� ���ٸ� ������ �ʿ��Ѱ���?
		 */
		
		//õ�����θ� �����ؾ���
		int price = 24600;
		int money = 1000;
		
		int �� = price/money;
		if(price % money > 0) {
			�� += 1;
		}
		System.out.println("õ�� : " + ��);

	}

}
