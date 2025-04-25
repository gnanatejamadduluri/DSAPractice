package kadanesAlgorithmMaxSubarraySum;

public class KadanesWithIndices {
	 public static int[] maxSubArrayWithIndices(int[] nums) {
	        int currentMax = nums[0];
	        int maxSoFar = nums[0];
	        int start = 0, begin = 0, end = 0;

	        for (int i = 1; i < nums.length; i++) {
	            if (nums[i] > currentMax + nums[i]) {
	                currentMax = nums[i];
	                start = i; // Start new subarray
	            } else {
	                currentMax = currentMax + nums[i]; // Extend subarray
	            }

	            if (currentMax > maxSoFar) {
	                maxSoFar = currentMax;
	                begin = start;
	                end = i;
	            }
	        }

	        // Return array: [maxSum, startIndex, endIndex]
	        return new int[]{maxSoFar, begin, end};
	    }

}
