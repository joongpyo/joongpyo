package exam_1;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		
		while(run) {
		System.out.println("A(a). 입력 | Q(q).종료");
		System.out.print("선택 > ");
		char choice = sc.next().charAt(0);
		System.out.println("");
		
		if(choice == 'A' || choice == 'a') {
			System.out.print("영어입력(띄어쓰기 없이) > ");
			String str = sc.next();
			System.out.println("");
			System.out.println(str.toUpperCase());
			System.out.println("");
		
		}else if(choice == 'Q' || choice == 'q'){
			System.out.println("프로그램 종료");
			System.exit(0);
			System.out.println("");
		
		}else {
			System.out.println("잘못된 메뉴 선택입니다.");
			System.out.println("");
		}
		
		
		
		}

	}

}