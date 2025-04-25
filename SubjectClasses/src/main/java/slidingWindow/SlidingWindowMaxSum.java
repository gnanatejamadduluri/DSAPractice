package slidingWindow;

public class SlidingWindowMaxSum {
	public static int maxSum(int[] nums, int k) {
        int maxSum = 0, windowSum = 0;

        // Compute sum of first k elements
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        maxSum = windowSum;

        // Slide the window
        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i] - nums[i - k]; // Add next, remove previous
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}
