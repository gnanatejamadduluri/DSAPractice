package kadanesAlgorithmMaxSubarraySum;

public class CircularKadanes {
	public static int maxSubarraySumCircular(int[] nums) {
        int total = 0;
        int maxKadane = nums[0];
        int currentMax = nums[0];
        int minKadane = nums[0];
        int currentMin = nums[0];

        total = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            total += num;

            // Regular Kadane’s
            currentMax = Math.max(num, currentMax + num);
            maxKadane = Math.max(maxKadane, currentMax);

            // Inverted Kadane’s for minimum subarray
            currentMin = Math.min(num, currentMin + num);
            minKadane = Math.min(minKadane, currentMin);
        }

        // Case where all numbers are negative: avoid total - minKadane = 0
        if (maxKadane < 0) return maxKadane;

        return Math.max(maxKadane, total - minKadane);
    }
}
