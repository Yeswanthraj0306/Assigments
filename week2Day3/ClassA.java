package week2Day3;

public class ClassA {

	void methodName() {

		System.out.println("Default");

	}

	public void reading() {
		System.out.println("Public");
	}

	private void writtingTest() {

		System.out.println("Private");
	}

	
	protected void chatting() {
		System.out.println("Protected");
		
	}
	
	
	public static void main(String[] args) {
		ClassA obj = new ClassA();
		obj.writtingTest();
		obj.chatting();
		obj.methodName();
		obj.reading();

	}

}
