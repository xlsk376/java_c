package C3_조건문3_프로젝트;

import java.util.Random;

public class 조건문3_프로젝트_일주일_문제 {

	public static void main(String[] args) {
		/*
		 * [문제]
		 * 
		 *  [요일 맞추기]
		 *  
		 * 	이번달 1일이 수요일이라고 할때, 
		 *  랜덤으로 1~31을 저장하고 해당 요일 출력한다. 
		 *  
		 *  예) 3일 ==> 금요일
		 */
		
		Random ran = new Random();
		int day = ran.nextInt(31)+1; // 1 ~ 31
		int week = day % 7;
		System.out.println(day);
		if(week == 1) {
			System.out.println("수요일");
		}
		if(week == 2) {
			System.out.println("목요일");
		}
		if(week == 3) {
			System.out.println("금요일");
		}
		if(week == 4) {
			System.out.println("토요일");
		}
		if(week == 5) {
			System.out.println("일요일");
		}
		if(week == 6) {
			System.out.println("월요일");
		}
		if(week == 0) {
			System.out.println("화요일");
		}
		long a = System.currentTimeMillis();
		System.out.println(a); // 1970년1월1일 0초부터 지금까지 의 초

	}

}
