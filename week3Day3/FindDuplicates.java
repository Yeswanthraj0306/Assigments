package week3Day3;

public class FindDuplicates {

	public static void main(String[] args) {
		int[] nums = { 2, 5, 7, 7, 5 ,9, 2, 3 , };

		   for(int i = 0 ; i < nums.length ; i++){
	            int k  = nums[i];
	            //System.out.println(k);
	            for(int j = 0 ; j < nums[j] ; j++){
	                if(k == nums[j]){

	                    System.out.println("dupilcate value-------->"+k);
	                    break;
	                    

				}
			}
		}
	}
}
