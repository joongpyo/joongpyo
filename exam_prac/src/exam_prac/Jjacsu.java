package exam_prac;

import java.util.Random;
import java.util.Scanner;

public class Jjacsu {
	public static void main(String[] args) {



		Random random = new Random();
		final int mInt = 10;
		final int rInt = 100;
		final int a = random.nextInt(mInt);
		
		int[] num = new int[a];

		System.out.print("짝수 출력: ");
		
		for (int i = 0; i < num.length ; ++i) {
			num[i] = random.nextInt(rInt) + 1;
			
			if (num[i] % 2 == 0) {
				System.out.print(num[i]+ " ");
			}

		}

	}

}
