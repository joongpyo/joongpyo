package hi;

import java.util.Scanner;

public class Tut01Ex {

	public static void main(String[] args) {
		//아이디와 비밀번호가 모두 일치하면 "회원님 안녕하세요. 마이페이지로 이동합니다."
		//					"로그인 포인트 적립 100점!"
		//					"현재 보유한 포인트 1000+100점"
		//일치하지 않으면 "로그인 정보를 확인하세요 회원가입 페이지로 이동합니다."
		//			"현재 보유한 포인트 1000점"
		Scanner sc = new Scanner(System.in);
		
		//가입되어있는 로그인 정보
		String db_userid = "imjay";
		String db_passwd = "123456";
		
		int point = 1000;
		int plusPnt = 100;
		
		System.out.print("아이디를 입력하세요: ");
		String id = sc.next();
		
		System.out.print("비밀번호를 입력하세요: ");
		String passwd = sc.next();
		
		if (db_userid.equals(id) && db_passwd.equals(passwd)) {
			System.out.println
			(db_userid+"회원님 안녕하세요. 마이페이지로 이동합니다.\n로그인 포인트 적립 "+plusPnt+"점!\n현재 보유한 포인트 "+point+"점.");
		}
		else {
			System.out.println("로그인 정보를 확인하세요.\n회원가입 페이지로 이동합니다.\n현재 보유한 포인트 "+point+"점");
		}
		
		
				
	
	
	}			

}
