package C3_조건문3_프로젝트;

import java.util.Random;
import java.util.Scanner;

public class 조건문3_프로젝트_모두의마블_문제 {

	public static void main(String[] args) {
		/*
		[문제]
		
		[모두의마블게임] 
		
		 - 철수는 지금 모두의마블게임을 하고있다.
		 - 게임은 0 ~ 20까지 이동할수있는거리가있다.
		 - 지금 철수의 차례이고 , 현재의 위치는 
		 - 시작점으로부터  9 만큼 이동했다.		 
		 - 1 ~ 6의 눈금이 있는 주사위 2개를 던진다.
		 - 주사위 숫자의  합만큼 이동한다. 
		 - 다음 이동할 철수의 위치를 출력하시오.
	
		 [조건]
		 1) 두 주사위 숫자가 서로다를경우는 현재위치에서
		 		주사위숫자 합만큼 이동한다. 예) 3, 5 ==> 8 만큼이동한다.
	
		 2) 두 주사위 숫자가 같은경우 보너스 이동거리 6 추가한다.
		      예) 2 , 2  ==> 4 + 6 만큼이동한다.
	
		 3) 14,15,16 번의 위치에 함정이 있다. 
			  함정에 걸리면 주사위2개를 다시 던지고 
			  그합이 6이하이면 [패널티] 처음위치(0)로 이동한다.
	          그합이 7이상이면 함정탈출[패널티없음]
	
		 4) 20 이상의 값이 나오면 "승리" 를 출력한다.
		 */
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		/*int n1 = ran.nextInt(6);		
		int n2 = ran.nextInt(6);
		n1 = n1 + 1;
		n2 = n2 + 1;
		int sum = 0;
		System.out.println(n1);
		System.out.println(n2);		
		*/
		
		int 철수 = 9;
		System.out.print("주사위1 : ");
		int n1 = scan.nextInt();
		System.out.print("주사위2 : ");
		int n2 = scan.nextInt();
		
		int sum = 0;
		
		if(n1 == n2) {
			sum = n1+n2+6+철수;
			if(sum>= 20) {
				System.out.println("승리");
			}else if(sum == 14 || sum ==15 || sum == 16) {
				System.out.println(sum);
				System.out.print("주사위1 : ");
				n1 = scan.nextInt();
				System.out.print("주사위2 : ");
				n2 = scan.nextInt();
				if(n1 + n2 >= 7) {
					System.out.println("함정탈출");
				}else if(n1 + n2 <= 6) {
					System.out.println("처음으로");
				}
			}
			if(sum < 20) {
				sum = n1 + n2 +6 + 철수;
				System.out.println(sum);
			}
		}else {
			sum = n1+n2+철수;
			if(sum >= 20) {
				System.out.println("승리");
			}else if(sum == 14 || sum == 15 || sum ==16) {
				System.out.println(sum);
				System.out.print("주사위1 : ");
				n1 = scan.nextInt();
				System.out.print("주사위2 : ");
				n2 = scan.nextInt();
				if(n1 + n2 >= 7) {
					System.out.println("함정탈출");
				}else if(n1 + n2 <= 6) {
					System.out.println("처음으로");
				}
			}
			if(sum < 20) {
				sum = n1 + n2 + 철수;
				System.out.println(sum);
			}
		}
				
		/*

		int sum = 0;
		if(n1 == n2) {
			sum = n1 + n2 + 6;
			System.out.println(sum);
			if(sum == 14 || sum == 15 || sum == 16) {
				System.out.println("주사위를 다시 던지세요");
				//int n3 = ran.nextInt(6);
				//int n4 = ran.nextInt(6);
				System.out.println("주사위1 : ");
				int n3 = scan.nextInt();
				System.out.println("주사위2 : ");
				int n4 = scan.nextInt();
				int sum2 = n3 + n4;
				if(sum2 <= 6) {
					System.out.println("처음위치로 이동");
				}else if(sum2 >= 7) {
					System.out.println("함정탈출");
				}
			}
		}
		if(n1 != n2) {
			sum = n1 + n2;
			System.out.println(sum);
		}
		*/
	 
		
		

	}

}
