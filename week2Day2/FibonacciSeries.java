package week2Day2;

public class FibonacciSeries {

	public static void main(String[] args) {

		int range = 8;
		int firstNum = 0;
		int secNum = 1;
		int sum;

		System.out.print(firstNum + ",");
		

		
		for (int i = 1; i<range; i++) {

			sum = firstNum + secNum;

			System.out.print(sum);

			if (i < range - 1) {
				System.out.print(",");
			}

			firstNum = secNum;

			
			secNum = sum;
		}
	}
}
