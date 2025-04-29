package mains;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

import kadanesAlgorithmMaxSubarraySum.CircularKadaneWithIndices;
import kadanesAlgorithmMaxSubarraySum.CircularKadaneWithSubarray;
import kadanesAlgorithmMaxSubarraySum.CircularKadanes;
import kadanesAlgorithmMaxSubarraySum.KadanesAlgorithm;
import kadanesAlgorithmMaxSubarraySum.KadanesWithIndices;

public class KadanesAlgorithmMaxSubarraySumMain {
	static Scanner S1 = new Scanner(System.in);
	
	public class KA extends KadanesAlgorithm {
		
		public static LinkedHashMap<String, String> main(String[] args) {
	        LinkedHashMap<String,String> response = new LinkedHashMap<>();
			int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
	        System.out.println("Maximum Subarray Sum: " + maxSubArray(nums));
	        response.put("Given Array ", Arrays.toString(nums));
	        response.put("Maximum Subarray Sum ", Integer.toString(maxSubArray(nums)));
	       return response; 
		}
	}
	
	public class KAI extends KadanesWithIndices {
		public static LinkedHashMap<String, String> main(String[] args) {
			LinkedHashMap<String,String> response = new LinkedHashMap<>();
	        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
	        int[] result = maxSubArrayWithIndices(nums);

	        int maxSum = result[0];
	        int start = result[1];
	        int end = result[2];

	        System.out.println("Maximum Subarray Sum: " + maxSum);
	        System.out.println("Start Index: " + start + ", End Index: " + end);

	        // Extract the subarray
	        int[] subarray = Arrays.copyOfRange(nums, start, end + 1);
	        System.out.println("Subarray: " + Arrays.toString(subarray));
	        response.put("Given Array ", Arrays.toString(nums));
	        response.put("Maximum Subarray Sum ", Integer.toString(maxSum));
	        response.put("Start Index ",Integer.toString(start));
	        response.put("End Index ",Integer.toString(end));
	        response.put("Subarray ", Arrays.toString(subarray));
	        return response;
	    }
	}

	public class CK extends CircularKadanes {
		 public static LinkedHashMap<String, String> main(String[] args) {
			 LinkedHashMap<String,String> response = new LinkedHashMap<>();
		        int[] nums1 = {5, -3, 5};
		        int[] nums2 = {-2, -3, -1}; // all negative

		        System.out.println("Max Circular Sum (Example 1): " + maxSubarraySumCircular(nums1)); // 10
		        System.out.println("Max Circular Sum (Example 2): " + maxSubarraySumCircular(nums2)); // -1
		        response.put("Given Array1 ", Arrays.toString(nums1));
		        response.put("Max Circular Sum1 ", Integer.toString( maxSubarraySumCircular(nums1)));
		        response.put("Given Array2 ", Arrays.toString(nums2));
		        response.put("Max Circular Sum2 ", Integer.toString( maxSubarraySumCircular(nums2)));
		        return response;
		 }
	}
	
	public class CKWS extends CircularKadaneWithSubarray {
		 public static LinkedHashMap<String, String> main(String[] args) {
			 LinkedHashMap<String,String> response = new LinkedHashMap<>();
		        int[] nums1 = {5, -3, 5};               // wrap case: [5,5] = 10
		        int[] nums2 = {-2, -3, -1};             // all negative: [-1]
		        int[] nums3 = {8, -1, -3, 8, -6, 8};    // wrap case: [8,8,8] = 24

		        System.out.println("Result: " + maxCircularSubarray(nums1)); // [10, 5, 5]
		        System.out.println("Result: " + maxCircularSubarray(nums2)); // [-1]
		        System.out.println("Result: " + maxCircularSubarray(nums3)); // [24, 8, 8, 8]
		        response.put("Given Array1 # wrap case: [5,5] ", Arrays.toString(nums1));
		        response.put("Max Circular Sub Array1 ",Arrays.asList(maxCircularSubarray(nums1)).toString());
		        response.put("Given Array2 #all negative ", Arrays.toString(nums2));
		        response.put("Max Circular Sub Array2 ", Arrays.asList(maxCircularSubarray(nums2)).toString());
		        response.put("Given Array3 #wrap case: [8,8,8] ", Arrays.toString(nums3));
		        response.put("Max Circular Sub Array3 ", Arrays.asList(maxCircularSubarray(nums3)).toString());
		        return response;
		 }
	}
	
	public class CKWI extends CircularKadaneWithIndices {
		public static LinkedHashMap<String, String> main(String[] args) {
			LinkedHashMap<String,String> response = new LinkedHashMap<>();
	        int[] nums1 = {5, -3, 5};               // wrap
	        int[] nums2 = {-2, -3, -1};             // all negative
	        int[] nums3 = {8, -1, -3, 8, -6, 8};    // wrap

	        System.out.println("Example 1:\n" + maxCircularSubarray(nums1));
	        System.out.println("\nExample 2:\n" + maxCircularSubarray(nums2));
	        System.out.println("\nExample 3:\n" + maxCircularSubarray(nums3));
	        
	        response.put("Given Array1 # wrap ", Arrays.toString(nums1));
	        response.put("Max Circular Sub Array1 ",Arrays.asList(maxCircularSubarray(nums1)).toString());
	        response.put("Given Array2 #all negative ", Arrays.toString(nums2));
	        response.put("Max Circular Sub Array2 ", Arrays.asList(maxCircularSubarray(nums2)).toString());
	        response.put("Given Array3 #wrap case ", Arrays.toString(nums3));
	        response.put("Max Circular Sub Array3 ", Arrays.asList(maxCircularSubarray(nums3)).toString());

	    
	        // WITH RANDOM
	        int[] bigArray = generateRandomArray(100, -20, 20);
	        Result bigResult = maxCircularSubarray(bigArray);
	        System.out.println("WITH RANDOM ARRAY i.e.., Big Array of (10000, -20, 20) - Result: Max Sum = " + bigResult.maxSum);
	        response.put("Given Randome Array ", Arrays.toString(bigArray));
	        response.put("Max Circular Sub Array Ran ", Arrays.asList(maxCircularSubarray(bigArray)).toString());
	        System.out.println(response);
	        return response;
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("Choose from the below options of Kadane’s Algorithm (Max Subarray Sum)\r\n"
				+ "\r\n"
				+ " \n 1. KadanesAlgorithm 2. KadanesWithIndices 3. CircularKadanes 4. CircularKadaneWithSubarray \n 5. CircularKadaneWithIndices \n");
		int a = S1.nextInt();
		while (a!=-1) {
		if (a==1) {KA.main(args); a=0;}
		else if (a==2) {KAI.main(args);a=0;}
		else if (a==3) {CK.main(args);a=0;}
		else if (a==4) {CKWS.main(args);a=0;}
		else if (a==5) {CKWI.main(args);a=0;}
		else {break;}
	}
}
}
