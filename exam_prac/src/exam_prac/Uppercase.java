package exam_prac;

import java.util.Scanner;

public class Uppercase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영문자 작성: ");
		String str = sc.next();
		
		System.out.println("기존 영문자: "+ str);
		
		System.out.println("대문자로 변경된 영문자: " + str.toUpperCase());
		
		
	}

}
