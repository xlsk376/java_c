package C1_조건문1_알고리즘;

import java.util.Scanner;

public class 조건문1_알고리즘_더큰숫자_문제 {

	public static void main(String[] args) {
		/*
		 * [문제] 숫자 2개를 입력받고 더 큰 숫자의 값을 출력하시오.
		 * 
		 * (1) 숫자1을 입력 : 
		 * (2) 숫자2를 입력 : 
		 * (3) 더큰숫자는 ? 입니다.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자1 입력 : ");
		int n1 = scan.nextInt();
		
		System.out.print("숫자2 입력 : ");
		int n2 = scan.nextInt();
		
		if (n1 > n2) {
			System.out.println("숫자1 :" + n1);
			System.out.println("숫자1이 더 크다");
		}
		if (n1 < n2) {
			System.out.println("숫자2 :" + n2);
			System.out.println("숫자2가 더 크다");
		}

	}

}
