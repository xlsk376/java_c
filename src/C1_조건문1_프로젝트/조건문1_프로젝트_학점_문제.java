package C1_조건문1_프로젝트;

import java.util.Scanner;

public class 조건문1_프로젝트_학점_문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * [문제]
		 * 
		 * 	[학점]
		 * 	시험점수를 입력받는다. 
		 * 	시험점수에 해당하는 학점을 출력하시오.
		 * 	아래는 점수표이다.
		 * 		100~91 이면 A학점,
		 * 		90~81  이면 B학점,
		 * 		80이하는 "재시험"
		 * 		
		 * 		단, 만점이거나, A학점과 B학점의 일의 자리가 7점이상이면 + 추가하시오.
		 * 		A학점과 B학점의 일의 자리가 3점이하이면 - 추가하시오.
		 * 
		 * 	예) 
		 * 		100 => A+
		 *     	87 ==> B+
		 *     	82 ==> B-
		 *     	23 ==> 재시험
		 */
		int num = 0;
		
		System.out.print("점수를 입력하세요 : ");
		num = scan.nextInt();
		
		if (91 <= num && num <= 100) {
			if(num >= 97) {
				System.out.println("A+");
			}
			if(num <= 93) {
				System.out.println("A-");
			}
			if(93 < num && num < 97) {
				System.out.println("A");
			}
		}
		
		if (81 <= num && num <= 90) {
			if(num >= 87) {
				System.out.println("B+");
			}
			if(num <= 83) {
				System.out.println("B-");
			}
			if(83 < num && num < 87) {
				System.out.println("B");
			}
		}
		if (num <= 80) {
			System.out.println("재시험");

		}
		
		scan.close();

	}

}
