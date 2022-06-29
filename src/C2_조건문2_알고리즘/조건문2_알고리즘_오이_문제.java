package C2_조건문2_알고리즘;

import java.util.Scanner;

public class 조건문2_알고리즘_오이_문제 {

	public static void main(String[] args) {
		/*
		 * [문제]
		 * 
		 * 마트에서 오이를 3개씩 묶어서 1500원에 판매한다. 
		 * 오이가 14개 필요하다. 필요한 금액을 출력하시오. 
		 * 단, 오이는 묶음으로만 판매한다.
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		/*
		int 오이3 = 1500;
		int 오이 = 오이3/3;
		
		System.out.println("필요한 갯수를 입력하세요 : ");
		int 갯수 = scan.nextInt();
		
		int 오이묶음 = 갯수/3;
		int sum = 오이*갯수;
		if(갯수%3 == 0) {
			System.out.print("오이 묶음은 : "+ 오이묶음);
			System.out.print("필요 금액 : " + sum);
		}
		*/
		int 오이 = 3;
		int 필요한오이 = 11;
		
		int 개수 = 필요한오이 / 오이; //총 필요묶음을 계산(묶음 단위로 판매)
		if(필요한오이 % 오이 > 0) {
			개수 = 개수 + 1; // 묶음으로만 판매하기 때문에 나머지가 0보다 크면 + 1
		}
			
		System.out.println(개수 * 1500);
		
		
		scan.close();

	}

}
