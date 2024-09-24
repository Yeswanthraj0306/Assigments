package week6.Day2Assignment;
import java.util.Arrays;
import java.util.Collections;

public class SortingUsingCollection {

    public static void main(String[] args) {
        String[] companies = {"HCL", "Wipro", "Aspire Systems", "CTS"};
        
        int length = companies.length;
        System.out.println("Length of the array: " + length);
        
        Arrays.sort(companies, Collections.reverseOrder());
        
        for (String company : companies) {
            System.out.print(company + ", ");
        }
    }
}
