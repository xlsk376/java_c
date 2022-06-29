package C1_조건문1_알고리즘;

import java.util.Scanner;

public class 조건문1_알고리즘_회원가입_문제 {

	public static void main(String[] args) {
		/*
		 * [문제]
		 * 
		 * 	[회원가입 과 로그인] 
		 * 1. 먼저 아이디와 비밀번호를 입력해서 회원가입한다. 
		 * 2. 이후 로그인을 위해 다시 아이디와 비밀번호를 입력받는다.
		 * 3. 가입된 아이디와 비밀번호와 로그인시 입력한 아이디와 비밀번호를 비교한다.
		 * 4. "로그인" 또는 "로그인실패" 를 출력하세요. 
		 * 
		 */
		/*Scanner scan = new Scanner(System.in);
		
		int joind_id = 0;
		int joind_pw = 0;
		
		System.out.print("회원가입 아이디 입력 : ");
		int join_id = scan.nextInt();
		
		System.out.print("회원가입 비번 입력 : ");
	    int join_pw = scan.nextInt();
		
		int a = join_id;
		int b = join_pw;
		
		
		System.out.print("아이디 입력 : ");
		int log_id = scan.nextInt();
		
		System.out.print("비번 입력 : ");
		int log_pw = scan.nextInt();
		
		if (a != log_id || b != log_pw) {
			System.out.println("로그인 실패");
		}
		if (a == log_id && b == log_pw) {
			System.out.println("로그인");
		}
		*/
		int join_id = 0;
		int join_pw = 0;
		
		int log_id = 0;
		int log_pw = 0;
		// scan
		Scanner scan = new Scanner(System.in);
		// 안내 회원가입 아이디
		System.out.println("회원가입 아이디 입력 : ");
		// 입력 회원가입 아이디
		join_id = scan.nextInt();
		
		// 안내 회원가입 비밀번호
		System.out.println("회원가입 비밀번호 입력 : ");
		// 입력 회원가입 비밀번호
		join_pw = scan.nextInt();
		// 안내 로그인 아이디
		System.out.println("로그인 아이디 입력 : ");
		// 입력 로그인 아이디
		log_id = scan.nextInt();
		// 안내 로그인 비밀번호
		System.out.println("로그인 비밀번호 입력 : ");
		// 입력 로그인 비밀번호
		log_pw = scan.nextInt();
		
		// 1. 아이디가 같으면 
		if(join_id == log_id) {
			//1-1. 아이디가 같은데 비밀번호가 같으면
			if(join_pw == log_pw) {
				System.out.println("로그인");
			}
			//1-2. 아이디 같은데 비밀번호가 다르면 
			if(join_pw != log_pw) {
				System.out.println("로그인실패");
			}
		}
		// 2. 아이디가 다르면 
		if(join_id != log_id) {
			System.out.println("로그인실패");
		}
		
		
		
		
		
		
		scan.close();

	}

}
