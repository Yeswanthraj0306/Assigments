package week2Day3;
public class Variables {
	String name = "yeswa";
	static int number = 20;
	public void reading() {
		name = "yeswaraj";
		String str = "vicky";
		System.out.println(name);
		System.out.println(str);
	}
	static void writing() {
		int a = 20;
		System.out.println(a + 20);
		System.out.println(number);
		number = 25;
		System.out.println(number);
	}
	public static void main(String[] args) {

		Variables obj = new Variables();
		obj.reading();
		System.out.println(Variables.number);
		obj.writing();
		System.out.println(obj.name);
		Variables.writing();
	}
}
