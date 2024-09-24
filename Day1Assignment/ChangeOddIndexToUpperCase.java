package week6.Day1Assignment;

public class ChangeOddIndexToUpperCase {


	    public static void main(String[] args) {
	        // Declare String Input
	        String str = "changeme";
	        
	        // Convert the String to character array
	        char[] charArray = str.toCharArray();
	        
	        // Traverse through each character
	        for (int i = 0; i < charArray.length; i++) {
	            // Find the odd index
	            if (i % 2 != 0) {
	                // Change the character to uppercase if the index is odd
	                charArray[i] = Character.toUpperCase(charArray[i]);
	            }
	        }
	        
	        
	        // Print the result
	        System.out.println(charArray);
	    }
	}


