package prefixSumDifferenceArrays;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class PrefixSumExample {
	 public static LinkedHashMap<String, String> main(String[] args) {
		 LinkedHashMap<String,String> response = new LinkedHashMap<>();
	        int[] arr = {2, 4, 6, 8, 10};
	        int[] prefixSum = new int[arr.length];

	        // Initialize the first element
	        prefixSum[0] = arr[0];

	        // Build the Prefix Sum Array
	        for (int i = 1; i < arr.length; i++) {
	            prefixSum[i] = prefixSum[i - 1] + arr[i];
	        }

	        // Print the Prefix Sum Array
	        for (int sum : prefixSum) {
	            System.out.print(sum + " ");
	        }
	        response.put("Given Array ", Arrays.toString(arr));
	        response.put("PreixSum-Array ", Arrays.toString(prefixSum));
	        return response;
	    }
}
