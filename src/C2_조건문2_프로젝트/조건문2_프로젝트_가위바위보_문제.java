package C2_조건문2_프로젝트;

import java.util.Scanner;

public class 조건문2_프로젝트_가위바위보_문제 {

	public static void main(String[] args) {
		/*
		 * [문제]
		 * 		[가위(0) 바위(1) 보(2) 게임]
		 * 1. player1 은 0~2 사이의 숫자를 입력받는다. 
		 * 2. player2 는 0~2 사이의 숫자를 입력받는다. 
		 * 3. 가위,바위,보를 아직문자로는 표현할수없으므로  0,1,2 숫자로 대신표현한다.
		 * 4. player1과 player2를 비교해, 1) 비겼다. 2) 내가 이겼다. 3) 내가 졌다. 를 출력한다.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		// ↓ 일관성있게 작성해야해서 보류, p1을 기준으로 이기고 지고 판단
//		System.out.print("player1 : ");
//		int p1 = scan.nextInt();
//		System.out.print("player2 : ");
//		int p2 = scan.nextInt();
//		
//		if(p1 >= 0 && p1 <= 2 && p2 >= 0 && p2 <= 2) {
//			if(p1 == p2) {
//				System.out.println("비겼다.");
//			}
//			if(p1 > p2) {
//				System.out.println("player1이 이겼다.");
//			}
//			if(p1 < p2) {
//				System.out.println("player2가 이겼다.");
//			}
//		}
//		if(p1 < 0 || p1 > 2 || p2 < 0 || p2 > 2) {
//			System.out.println("다시 입력해주세요.");
//		}
		
		System.out.println("p1 (가위0 바위1 보2) : ");
		int p1 = scan.nextInt();
		
		System.out.println("p2 (가위0 바위1 보2) : ");
		int p2 = scan.nextInt();
		
		if(p1 == p2) {
			System.out.println("비겼다."); // 00 11 22
		}
		if(p1 == 0 && p2 == 1) {
			System.out.println("p1 졌다.");
		}
		if(p1 == 0 && p2 == 2) {
			System.out.println("p1 이겼다.");
		}
		if(p1 == 1 && p2 == 0) {
			System.out.println("p1 이겼다.");	
		}
		if(p1 == 1 && p2 == 2) {
			System.out.println("p1 졌다.");
		}
		if(p1 == 2 && p2 == 0) {
			System.out.println("p1 졌다.");
		}
		if(p1 == 2 && p2 == 1) {
			System.out.println("p1 이겼다.");	
		}

	}

}
