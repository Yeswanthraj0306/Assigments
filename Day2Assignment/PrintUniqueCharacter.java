package week6.Day2Assignment;

import java.util.HashSet;

public class PrintUniqueCharacter {
    public static void main(String[] args) {
        
        System.out.println("Enter your name: ");
        String name = "babu";
        System.out.println(name);
        char[] charArray = name.toCharArray();
        
        HashSet<Character> uniqueChars = new HashSet<>();
        
        for (char c : charArray) {
            if (uniqueChars.contains(c)) {
                uniqueChars.remove(c); // Remove if already present
            } else {
                uniqueChars.add(c); // Add if not present
            }
        }
        
        System.out.println("Unique characters: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
        
    }
}
