package week6.Day1Assignment;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] words = test.split(" ");
		String str = "";

		for (int i = 0; i < words.length; i++) {

			if (i % 2 != 0) {
				for (int j = words[i].length() - 1; j >= 0; j--) {
					str = str + words[i].charAt(j);
				}
				words[i] = str;
			}

		}

		for (int i = 0; i < words.length; i++) {
			System.out.print(words[i] + " ");
		}

	}
}