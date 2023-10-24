package exam_1;

public class exam1_2 {

	public static void main(String[] args) {
	
		System.out.print("1000미만의 자연수에서 3, 5의 배수가 아닌 수의 총합: ");
		
		int sum = 0;
		
		for(int i = 0; i <= 1000; i++) {
			if(i % 3 == 0 || i% 5 == 0) {
				continue; 
			}
			sum += i;
		}
		System.out.println(sum);
	}

}
