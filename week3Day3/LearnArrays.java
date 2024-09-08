package week3Day3;

import java.util.Arrays;

public class LearnArrays {


		public static void main(String[] args) {

	/*		int b = 10;

			int num[] = { 10, 20, 30, 40, 50, 677, 877, 886, 333 };
			// index 0 1 2 3 4 5 6 7 8

			for (int i = 0; i <num.length; i++) {

				// i=0 9
				System.out.println(num[i]);
			}
			System.out.println(b);*/
			int num[] = { 20, 44, 55, 77, 88, 221, 6556, 879, 7678698};

			// to order the values

			// 1 2 3 5 6 7 8 9

			Arrays.sort(num);
			

			// 1 2 3 5 6 7 8 9
	//num[]	// 0 1 2 3 4 5 6 7
			//
			int length = num.length;

			System.out.println("SecondLargestNumber is: " + num[length - 2]);
				

				}

		

	
	}

	
