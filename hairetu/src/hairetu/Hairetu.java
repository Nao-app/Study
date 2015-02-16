package hairetu;

public class Hairetu {

	public static void main(String[] args) {
		int[] score = {20,30,40,50,60,80,};
		int sum = 0;
		for(int i = 0; i<score.length; i++){
			System.out.println(score[i]);
			sum += score[i];
		}
		System.out.println(sum);
	}

}
