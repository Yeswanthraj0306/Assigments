package week6.Day2Assignment;

public class Palindrome {

	public static void main(String[] args) {

		String value1="madam";
		String value2="";
		
		for(int i=0;i<value1.length();i++)
		{
			value2=value1.charAt(i)+value2;
		}
		if(value1.equalsIgnoreCase(value2))
		{
			System.out.println("The given string is palindrome");
		
		}
		else
		{
			System.out.println("The given string is not palindrome");
		}
	}

}
