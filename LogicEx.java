package hi;

import java.util.Scanner;

public class LogicEx {
	public static void main(String[] args) {
		
		//주민번호 뒷자리가 1 또는 3으로 시작하면 남자, 2 또는 4로 시작하면 여자로 표시하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력하시오: ");
		String jumin = sc.next();
		
		int gender = Integer.parseInt(jumin.substring(7, 8));
		if (gender % 2 == 0) {
			System.out.println("여자입니다.");
		}
		else {
			System.out.println("남자입니다.");
		}
		}

	}


