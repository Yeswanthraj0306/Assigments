package week6.Day1Assignment;

public class Students {

	public void getStudentInfo() {
		int id = 1;
		System.out.println("Student ID: " + id);
	}

	public void getStudentInfo(int id) {
		System.out.println("Student ID: " + id);
	}

	public void getStudentInfo(String name) {
		System.out.println("Student Name: " + name);
	}

	public void getStudentInfo(int id, String name) {
		System.out.println("Student ID: " + id + ", Name: " + name);
	}

	public void getStudentInfo(String email, String phoneNumber) {
		System.out.println("Email: " + email + ", Phone Number: " + phoneNumber);
	}

	public void getStudentInfo(int id, String name, String email, String phoneNumber) {
		System.out.println(
				"Student ID: " + id + ", Name: " + name +","+ " Email: "
		+ email + ", Phone Number: " + phoneNumber);
	}

	public static void main(String[] args) {
		Students student = new Students();

		student.getStudentInfo();
		student.getStudentInfo(1);
		student.getStudentInfo("Yeswanth Raj");
		student.getStudentInfo(1, "Yeswanth Raj");
		student.getStudentInfo("yeswaraj0306@example.com", "1234567890");
		student.getStudentInfo(1, "Yeswanth Raj", "yeswaraj0306@example.com", "1234567890");

	}
}
