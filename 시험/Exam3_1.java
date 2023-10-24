package exam_1;

import java.util.Scanner;

public class Exam3_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		
		while(run) {
		System.out.print("학년 입력:(학년:1~4학년): ");
		int grade = sc.nextInt();
		
		System.out.println("");
		
		System.out.print("점수 입력(점수:0~100): ");
		int jumsu = sc.nextInt();
		
		System.out.println("");
		
		switch(grade) {
		
		case 1:
			if(jumsu >= 60 && jumsu <= 100 ) {
				System.out.println("합격입니다.");
			}else if(jumsu >= 0 && jumsu < 60) {
				System.out.println("불합격입니다.");
			}
			System.out.println("");
			break;
			
		case 2:
			if(jumsu >= 60 && jumsu <= 100 ) {
				System.out.println("합격입니다.");
			}else if(jumsu >= 0 && jumsu < 60) {
				System.out.println("불합격입니다.");
			}
			System.out.println("");
			break;
			
		case 3:
			if(jumsu >= 60 && jumsu <= 100 ) {
				System.out.println("합격입니다.");
			}else if(jumsu >= 0 && jumsu < 60) {
				System.out.println("불합격입니다.");
			}
			System.out.println("");
			break;
			
		case 4:
			if(jumsu >= 80 && jumsu <= 100 ) {
				System.out.println("졸업입니다.");
			}else if(jumsu >= 0 && jumsu < 80) {
				System.out.println("재시험입니다.");
			}
			System.out.println("");
			break;
		
		default :
			System.out.println("잘못된 값을 입력하셨습니다. 다시 입력해 주세요.");
			System.out.println("");
		}
		
	}
	}
}
