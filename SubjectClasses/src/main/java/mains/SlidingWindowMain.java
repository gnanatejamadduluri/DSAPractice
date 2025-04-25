package mains;
import java.util.Scanner;

import slidingWindow.BruteForceMaxSum;
import slidingWindow.SlidingWindowMaxSum;
import slidingWindow.SlidingWindowMinSubarray;
public class SlidingWindowMain {
	static Scanner S1 = new Scanner(System.in);
	
	public class BFM extends BruteForceMaxSum {
		public static void main(String[] args) {
	        int[] nums = {2, 1, 5, 1, 3, 2};
	        int k = 3;
	        System.out.println(maxSum(nums, k)); // Output: 9
	    }
	}
	public class SWMS extends SlidingWindowMaxSum {
		public static void main(String[] args) {
	        int[] nums = {2, 1, 5, 1, 4, 2};
	        int k = 3;
	        System.out.println(maxSum(nums, k)); // Output: 10
	    }
	}
	
	public class SWMSub extends SlidingWindowMinSubarray {                      
		public static void main(String[] args) {
	        int[] nums = {2, 3, 1, 2, 4, 3};
	        int target = 7;
	        System.out.println(minSubarrayLen(target, nums)); // Output: 2
	    }
	}
	
	public static void main(String[] args) {
		System.out.println("Choose from the below options of Sliding Window implementation \n 1. BruteForceMaxSum 2. SlidingWindowMaxSum 3. SlidingWindowMinSubarrayLength \n");
		int a = S1.nextInt();
		while (a!=-1) {
		if (a==1) {BFM.main(args); a=0;}
		else if (a==2) {SWMS.main(args);a=0;}
		else if (a==3) {SWMSub.main(args);a=0;}
		else {break;}
	}
}
}