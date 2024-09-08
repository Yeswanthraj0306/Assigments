package week2Day2;

public class Fibonacci {

	public static void main(String[] args) {
		int fnum = 0;
		int snum = 1;
		int sum;

		for (int i = 0; i < 10; i++) {
			sum = fnum + snum;
			System.out.println(sum );
			
			fnum = snum;
			snum = sum;
		}
	}
}
