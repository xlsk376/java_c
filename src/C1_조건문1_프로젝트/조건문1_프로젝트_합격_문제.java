package C1_조건문1_프로젝트;

import java.util.Scanner;

public class 조건문1_프로젝트_합격_문제 {

	public static void main(String[] args) {
		/*
		 * [문제]
		 *  [점수 유효성 검사]
		 * 1. 점수2개를 입력받아 평균을 구한다.
		 * 2. 평균이  60점 이상이면 합격, 60점 미만이면 불합격이다.
		 * 3. 조건1)  입력받은 정수가 
		 *    음수이거나 100점을 초과하면, 예외 메세지를 출력한다.
		 *    예) 점수를  잘못 입력했습니다.
		 * 4. 조건2) 평균이 60 이상이라도 , 한과목이라도 50미만이면 불합격을 출력한다.
		 */
		Scanner scan = new Scanner(System.in);
		/*
		System.out.println("과목1점수를 입력하세요 : ");
		int score1 = scan.nextInt();
		if (score1 < 0 ) {
			System.out.println("점수를 잘못입력하였습니다.");
		}
		if (score1 > 100 ) {
			System.out.println("점수를 잘못입력하였습니다.");
		}
		System.out.println("과목2점수를 입력하세요 : ");
		int score2 = scan.nextInt();
		if (score2 < 0 ) {
			System.out.println("점수를 잘못입력하였습니다.");
		}
		if (score2 > 100 ) {
			System.out.println("점수를 잘못입력하였습니다.");
		}
		int sum = score1 + score2;
		double 평균 = sum/2.0;
		
		if(평균 >= 60) {
			
			if(score1 < 50) {
				System.out.println("불합격");
			}
			if(score2 < 50) {
				System.out.println("불합격");
			}
			
			if(score1 >= 50 && score2 >= 50) {
				System.out.println("합격");
			}
			
			
		}
		if(평균 < 60) {
			System.out.println("불합격");
		}
		
		scan.close();
		*/
		
		System.out.println("점수 1 : ");
		int s1 = scan.nextInt();		
		System.out.println("점수 2 : ");
		int s2 = scan.nextInt();
		double 평균 = (s1 + s2)/2.0;
		//1. 모든 입력받은 점수가 0~100 사이에 있어야한다.		
		if(s1 >= 0 && s1 <= 100 && s2 >= 0 && s2 <= 100) {
			//1-1. 평균이 60이상이고 각점수가 전부 50이상이면
			if(평균 >= 60 && s1 >= 50 && s2 >= 50) {
				System.out.println("합격");
			}
			//1-2. 평균이 60미만이거나, 각점수중 하나라도 50미만이면
			if(평균 < 60 || s1 < 50 || s2 <50) {
				System.out.println("불합격");
			}
		}
		//2. 모든 점수중 하나라도 잘못입력되었다면
		if(s1 < 0 || s1 > 100 || s2 < 0 || s2 >100) {
			System.out.println("오류");
		}
		

	}

}
