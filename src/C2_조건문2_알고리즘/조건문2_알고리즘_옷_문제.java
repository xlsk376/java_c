package C2_조건문2_알고리즘;

public class 조건문2_알고리즘_옷_문제 {

	public static void main(String[] args) {
		/*
		[문제] 
			상점에서 24600원 짜리 옷을샀습니다.
			1000원짜리 지폐로만 옷값을 낸다면 몇장이 필요한가요?
		 */
		
		//천원으로만 지불해야함
		int price = 24600;
		int money = 1000;
		
		int 장 = price/money;
		if(price % money > 0) {
			장 += 1;
		}
		System.out.println("천원 : " + 장);

	}

}
