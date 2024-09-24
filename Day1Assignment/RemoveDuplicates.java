package week6.Day1Assignment;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		int count;
		String[] words = text.split(" ");
		String result = "";

		for (int i = 0; i < words.length; i++) {
			count = 0;
			for (int j = 0; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
				}
			}
			if (count == 1) {
				result += words[i] + " ";

			}
		}
		System.out.println("String without duplicate words: " + result);
	}
}
