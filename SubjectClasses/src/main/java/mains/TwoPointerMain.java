package mains;
import java.util.*;
import twoPointers.TwoSumSorted;
import twoPointers.MergeSortedArrays;
import twoPointers.PalindromeChecker;
import twoPointers.RemoveDuplicates;

public class TwoPointerMain {
	static Scanner S1 = new Scanner(System.in);
	
	public class PDC extends PalindromeChecker{
		public static void main(String[] args) {
			
	        // PalindromeChecker
	        System.out.println("PalindromeChecker");
	        System.out.println(isPalindrome("racecar")); // true
	        System.out.println(isPalindrome("hello"));   // false
		}
	}

	public class TSS extends TwoSumSorted {
	
		public static void main(String[] args) {
		//Two Sum Sorted
		System.out.println("Two Sum Sorted");
		int[] nums = {1, 2, 3, 4, 6, 8, 9};
        int target = 3;

        System.out.println(Arrays.toString(twoSum(nums, target)));
	}

}
	
	public class RDP extends RemoveDuplicates {
		
		 public static void main(String[] args) {
		        int[] nums = {1, 1, 2, 2, 3, 4, 4};
		        int length = removeDuplicates(nums);

		        for (int i = 0; i < length; i++) {
		            System.out.print(nums[i] + " ");
		        }
		    }
		
	}
	
	public class MSA extends MergeSortedArrays {
		public static void main(String[] args) {
	        int[] arr1 = {1, 3, 5};
	        int[] arr2 = {2, 4, 6};

	        System.out.println(Arrays.toString(merge(arr1, arr2)));
	    }
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Choose from the below options of Two Pointer's implementation \n 1. PalindromeCheck 2. Two Sum Sorted 3. RemoveDuplicates \n");
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
