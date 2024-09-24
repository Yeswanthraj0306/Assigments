package week6.Day2Assignment;

import java.util.Arrays;

public class FindSecondLargest {
public static void main(String[] args) {

		
		int[] data = {3,2,11,4,6,7};
		
		Arrays.sort(data);
		
		System.out.println("The Second Largest number is "+data[data.length-2]);
		
	}


}
