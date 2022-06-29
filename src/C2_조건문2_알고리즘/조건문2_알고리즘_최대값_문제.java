package C2_조건문2_알고리즘;

import java.util.Scanner;

public class 조건문2_알고리즘_최대값_문제 {

	public static void main(String[] args) {
		/*
		 * [문제] 최대값 구하기 
		 * 1. 숫자 3개를 입력받는다. 
		 * 2. 입력받은 3개의 수를 비교한다. 
		 * 3. 가장 큰 수(MAX)를 출력한다.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자1 : ");
		int n1 = scan.nextInt();
		
		System.out.println("숫자2 :");
		int n2 = scan.nextInt();
		
		System.out.println("숫자3 : ");
		int n3 = scan.nextInt();
		/*//반복횟수가 너무 많아서 안좋음
		if(n1> n2 && n1 > n3) {
			System.out.println("가장 큰 수 : " + n1);
		}
		if(n2> n1 && n2 > n3) {
			System.out.println("가장 큰 수 : " + n2);
		}
		if(n3> n1 && n3 > n2) {
			System.out.println("가장 큰 수 : " + n3);
		}
		*/
		int max = n1; //처음 입력받은 값을 가장 큰값에 넣어준다.
		if(max < n2) { //두번째와 비교해서 값이 작다면 두번째값을 max에 넣어줌
			max = n2;
		}
		if(max < n3) { //세번째와 비교해서 값이 작다면 세번째값을 max에 넣어줌
			max = n3;
		}
		System.out.println("max : " + max); // 최종적으로 가장 큰값 출력
		
		
		scan.close();

	}

}
