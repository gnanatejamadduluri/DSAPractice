package kadanesAlgorithmMaxSubarraySum;

public class KadanesAlgorithm {
	public static int maxSubArray(int[] nums) {
        // Start with the first element
        int currentMax = nums[0];
        int maxSoFar = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Either start new subarray at nums[i] or extend previous one
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }

        return maxSoFar;
    }

}
