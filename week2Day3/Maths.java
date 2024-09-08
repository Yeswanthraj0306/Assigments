package week2Day3;

public class Maths {
	int a = 20;
	int b = 10;

	private void add() {
		System.out.println("ADDING TWO NUMBERS");
		System.out.println(a + b);

	}

	private void multiply() {
		System.out.println("MULTIPY TWO NUMBERS");

		System.out.println(a * b);
	}

	private void division() {
		System.out.println("DIVIDE TWO NUMBERS");

		System.out.println(a / b);
	}

	public static void main(String[] args) {
		Maths m1 = new Maths();
		m1.add();
		m1.multiply();
		m1.division();
	}
}
