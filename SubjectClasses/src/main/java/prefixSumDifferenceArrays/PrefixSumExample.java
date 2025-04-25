package prefixSumDifferenceArrays;

public class PrefixSumExample {
	 public static void main(String[] args) {
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
	    }
}
