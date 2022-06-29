package C4_조건문4_알고리즘;

import java.util.Random;
import java.util.Scanner;

public class 조건문4_알고리즘_홀짝게임_문제 {

	public static void main(String[] args) {
		/*
		 * [문제]
		 * 
		 * 	[홀짝 게임]
		 * 
		 * 1. 1~10개의 숫자중 랜덤으로 한개의 숫자를 저장한다.
		 * 2. 랜덤의 숫자가 [1.홀수][2.짝수] 인지 맞추는게임이다.
		 */
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		/*
		int num = ran.nextInt(10)+1;
		System.out.println(num);
		System.out.println("[1.홀수][2.짝수]"); //선택하는거 기준으로 프로그래밍 1~2벗어나면 오류
		int select = scan.nextInt();
		if(num%2 == 0) {
			if(select == 2) {
				System.out.println("맞습니다.");
			}else {
				System.out.println("틀렸습니다.");
			}
		}else {
			if(select == 1) {
				System.out.println("맞습니다.");
			}else {
				System.out.println("틀렸습니다.");
			}
		}
		
		scan.close();
		*/
		int r = ran.nextInt(10) + 1;
		//System.out.println(r);
		System.out.println("[1] 홀수 , [2] 짝수 입력 : ");
		int sel = scan.nextInt();
		if(sel == 1) {
			if(r % 2 != 0) {
				System.out.println("정답");
			}else {
				System.out.println("오답");
			}
			
		}else if(sel == 2) {
			if(r % 2 == 0) {
				System.out.println("정답");
			}else {
				System.out.println("오답");
			}
		}else {
			System.out.println("오류");
		}
		System.out.println(r);

	}

}
