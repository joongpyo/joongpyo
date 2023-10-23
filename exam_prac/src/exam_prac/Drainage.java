package exam_prac;

import java.util.Scanner;

public class Drainage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("3의 배수 프로그램: ");
		int c1 = sc.nextInt();

		for (int i = 1; i < c1; ++i) {
			if (i % 3 == 0) {
				System.out.print(i +" ");
			}
		}
		
		System.out.println("");
		System.out.println("--------------------");
		
	System.out.print("5의 배수 프로그램: ");
		
		
		int c2 = sc.nextInt();
		
		for (int i = 1; i < c2; ++i) {
			if(i%5 == 0) {
				System.out.print(i + " "); 
			
			}
		}

		
	}

}
