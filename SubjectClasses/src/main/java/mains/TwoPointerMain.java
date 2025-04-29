package mains;
import java.util.*;
import twoPointers.TwoSumSorted;
import twoPointers.MergeSortedArrays;
import twoPointers.PalindromeChecker;
import twoPointers.RemoveDuplicates;

public class TwoPointerMain {
	static Scanner S1 = new Scanner(System.in);
	
	public class PDC extends PalindromeChecker{
		public static LinkedHashMap<String, String> main(String[] args) {
			LinkedHashMap<String,String> response = new LinkedHashMap<>();	
	        // PalindromeChecker
	        System.out.println("PalindromeChecker");
	        System.out.println(isPalindrome("racecar")); // true
	        System.out.println(isPalindrome("hello"));   // false
	        response.put("Palindrome Checker ", "True/false");
	        response.put("RacecaR", Boolean.toString(isPalindrome("racecar")));
	        response.put("HellO", Boolean.toString(isPalindrome("hello")));
	        return response;
		}
	}

	public class TSS extends TwoSumSorted {
	
		public static LinkedHashMap<String, String> main(String[] args) {
		LinkedHashMap<String,String> response = new LinkedHashMap<>();
		//Two Sum Sorted
		System.out.println("Two Sum Sorted");
		int[] nums = {1, 2, 3, 4, 6, 8, 9};
        int target = 3;

        System.out.println("Two Sorted Sum : "+Arrays.toString(twoSum(nums, target)));
        response.put("Array Taken ", Arrays.toString(nums));
        response.put("Target ", Integer.toString(target));
        response.put("Two Sorted Sum ", Arrays.toString(twoSum(nums, target)));
        return response;
	}

}
	
	public class RDP extends RemoveDuplicates {
		
		 public static LinkedHashMap<String, String> main(String[] args) {
			 LinkedHashMap<String,String> response = new LinkedHashMap<>();  
			 int[] nums = {1, 1, 2, 2, 3, 4, 4};
		     int length = removeDuplicates(nums);
		     int[] s = new int[length];
		        response.put("Array Taken ", Arrays.toString(nums));
		        response.put("Length", Integer.toString(length));
		        for (int i = 0; i < length; i++) {
		        	s[i] = nums[i]; 
		            System.out.print(nums[i] + " ");
		        }
		        System.out.println("After Removing duplicates : "+Arrays.toString(s));
		        response.put("After Removing duplicates ", Arrays.toString(s));
		    return response;}
		
	}
	
	public class MSA extends MergeSortedArrays {
		public static LinkedHashMap<String, String> main(String[] args) {
	        LinkedHashMap<String,String> response = new LinkedHashMap<>();
			int[] arr1 = {1, 3, 5};
	        int[] arr2 = {2, 4, 6};
	        response.put("Array1 ", Arrays.toString(arr1));
	        response.put("Array2 ", Arrays.toString(arr2));
	        response.put("Merged Array ", Arrays.toString(merge(arr1,arr2)));
	        System.out.println("Merged Array ="+Arrays.toString(merge(arr1, arr2)));
			return response;
	    }
	}
	
	
	public static void main(String[] args) {
		System.out.println("Choose from the below options of Two Pointer's implementation \n 1. PalindromeCheck 2. Two Sum Sorted 3. RemoveDuplicates 4. Merge Sorted Arrays \n");
		int a = S1.nextInt();
		while (a!=-1) {
		if (a==1) {PDC.main(args); a=0;} 
		else if (a==2) {TSS.main(args);a=0;}
		else if (a==3) {RDP.main(args);a=0;}
		else if (a==4) {MSA.main(args);a=0;}
		else {break;}
		}
	}
}
