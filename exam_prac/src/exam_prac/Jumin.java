package exam_prac;

import java.util.Scanner;

public class Jumin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하시오: ");
		String jumin = sc.next();
		
		int gender = Integer.parseInt(jumin.substring(7,8));
//		System.out.println(jumin.substring(7, 8));
		
		if(gender % 2 == 0) {
			System.out.println("여자입니다.");
		}else {
			System.out.println("남자입니다");
		}
		
	}

}
