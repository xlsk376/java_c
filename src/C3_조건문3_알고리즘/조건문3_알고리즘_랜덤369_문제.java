package C3_조건문3_알고리즘;

import java.util.Random;

public class 조건문3_알고리즘_랜덤369_문제 {

	public static void main(String[] args) {
		/*
		 * [문제]
		 * 
		 * 	[369게임]
		 * 
		 * 1. 1~50 사이의 랜덤 숫자를 저장한다.
		 * 2. 위 수에 369의 개수가
		 * 	1) 2개이면, 짝짝을 출력한다.
		 *  2) 1개이면, 짝을 출력한다.
		 *  3) 0개이면, 해당 숫자를 출력한다.
		 * 예)
		 * 		33	 : 짝짝
		 * 		16	 : 짝
		 * 		 7	 : 7       
		 */
		// [힌트] 십의 자리, 일의 자리 분리하면 계산하기 쉽다.
		Random ran = new Random();
		/*
		int r = ran.nextInt(50)+1;
		System.out.println(r);
		int dTen = r/10; // 십의자리
		int dOne = r%10; // 일의자리
		//나머지 구하기가 필요 없음, 369여서 해당되는 숫자만 체크되면 됨
		if(dTen%3 == 0 || dTen%6 ==0 || dTen%9 == 0) { 
			System.out.println("짝");
			if(dOne%3 == 0 || dOne%6 == 0 || dOne%9 == 0) {
				System.out.println("짝짝");
			}
		}
		*/
		int num = ran.nextInt(50); // 50개 ==> 0~49
		num = num + 1;
		System.out.println(num);
		
		int a = num / 10; // 10의 자리
		int b = num % 10; // 1의 자리
		int count = 0;
		if(a == 3 || a == 6 || a == 9) {
			count = count + 1;
		}
		if(b == 3 || b == 6 || b == 9) {
			count = count + 1;
		}
			
		if(count == 2) {
			System.out.println("짝짝");
		}else if(count == 1) {
			System.err.println("짝");
		}else {
			System.out.println(num);
		}
		

	}

}
