package week2Day3;

public class LearnVariables {

	String name = "SivaKarthikeyan";

	static int number = 35;

	// Global Variable

	public void acting() {

		name = "Vinoth";

		String str = "Sudharsan";
		System.out.println(str);

		System.out.println(name);

	}

	static void sleeping() {

		int a = 10;

		System.out.println(a + 20);

		System.out.println(number);

		number = 19;

		System.out.println(number);
	}

	public static void main(String[] args) {

		LearnVariables var = new LearnVariables();
		var.acting();

		System.out.println(var.number);

		LearnVariables.sleeping();

		System.out.println(LearnVariables.number);

		System.out.println(var.name);
		var.sleeping();

		
	}

}

