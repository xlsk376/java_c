package C2_조건문2_알고리즘;

import java.util.Scanner;

public class 조건문2_알고리즘_영수증_문제 {

	public static void main(String[] args) {
		/*
		 * [문제]
		 * 
		 * [영수증 출력] 1. 메뉴판을 출력한다. 2. 사용자는 주문하고자 하는 메뉴의 번호를 입력한다. 3. 현금을 입력받는다. 4. 입력받은
		 * 현금과 메뉴가격을 확인해, 영수증을 출력한다. 5. 단, 현금이 부족한 경우 "현금이 부족합니다."라는 메세지를 출력한다.
		 */

		Scanner scan = new Scanner(System.in);
		/*int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		int menu1 = 1;
		int menu2 = 2;
		int menu3 = 3;

		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우    버거 : " + price2 + "원");
		System.out.println("3.콜         라 : " + price3 + "원");

		System.out.print("메뉴의 번호를 입력하세요 : ");
		int menu = scan.nextInt();

		System.out.print("금액을 입력하세요 : ");
		int cash = scan.nextInt();

		int sum1 = cash - price1;
		int sum2 = cash - price2;
		int sum3 = cash - price3;
		if (menu == menu1) {
			if (cash >= 8700) {
				System.out.println("거스름돈은 " + sum1);
			}
			if (cash < 8700) {
				System.out.println("현금이 부족합니다.");
			}

		}
		if (menu == menu2) {
			if (cash >= 6200) {
				System.out.println("거스름돈은 " + sum2);
			}
			if (cash < 6200) {
				System.out.println("현금이 부족합니다.");
			}

		}
		if (menu == menu3) {
			if (cash >= 1500) {
				System.out.println("거스름돈은 " + sum3);
			}
			if (cash < 1500) {
				System.out.println("현금이 부족합니다.");
			}

		}
		*/
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우    버거 : " + price2 + "원");
		System.out.println("3.콜         라 : " + price3 + "원");
		System.out.println("번호를 입력하세요 (1~3) ");
		int sel = scan.nextInt();
		
		//1. 선택번호가 1이면 
		if(sel == 1) {
			//1-1 : 안내 현금
			System.out.println("현급입력 : ");
			//1-1 : 입력 현금
			int money = scan.nextInt();
			//1-1 : 거스름돈 계산
			int 거스름돈 = money - price1;
			//1-1 : 거스름돈이 충분하면
			if(거스름돈 >= 0) {
				System.out.println("현금 : " + money);
				System.out.println("불고기버거 :" + price1);
				System.out.println("거스름돈 : " + 거스름돈);
			}
			//1-2 : 거스름돈이 부족하면 
			if(거스름돈 < 0) {
				System.out.println("돈이부족합니다.");
			}			
		}
		if(sel == 2) {
			System.out.println("현급입력 : ");
			int money = scan.nextInt();
			int 거스름돈 = money - price2;
			if(거스름돈 >= 0) {
				System.out.println("현금 : " + money);
				System.out.println("새우버거 :" + price2);
				System.out.println("거스름돈 : " + 거스름돈);
			}
			if(거스름돈 < 0) {
				System.out.println("돈이부족합니다.");
			}			
		}
		if(sel == 3) {
			System.out.println("현급입력 : ");
			int money = scan.nextInt();
			int 거스름돈 = money - price3;
			if(거스름돈 >= 0) {
				System.out.println("현금 : " + money);
				System.out.println("콜라 :" + price3);
				System.out.println("거스름돈 : " + 거스름돈);
			}
			if(거스름돈 < 0) {
				System.out.println("돈이부족합니다.");
			}			
		}
		//4.없는번호 예외처리
		if(sel < 1 || sel > 3) {
			System.out.println("오류");
		}
		scan.close();

	}

}
