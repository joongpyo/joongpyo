package exam_1;


class Cals{
	public double avg(int[] scores) {
		int sum = 0;   
		for(int i = 0; i < scores.length; ++i) {
			sum += scores[i];
		}
		
		return (double)sum / scores.length;
	}
}

public class Avg {

	public static void main(String[] args) {
		
		int[] scores = new int[] {8, 3, 1, 6, 2, 4, 5, 9};
		
		Cals c  = new Cals(); 
		
		
		c.avg(scores);
		
		System.out.println(String.format( ("평균은 %.2f입니다."),c.avg(scores) ) );
		
		
		
	}
}

