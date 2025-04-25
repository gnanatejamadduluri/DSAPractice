package kadanesAlgorithmMaxSubarraySum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CircularKadaneWithSubarray {
	public static List<Integer> maxCircularSubarray(int[] nums) {
        int total = 0;

        // 1. Normal Kadane’s
        int maxSum = nums[0], curMax = nums[0];
        int maxStart = 0, maxEnd = 0, tempStart = 0;

        // 2. Min Subarray for Circular Case
        int minSum = nums[0], curMin = nums[0];
        int minStart = 0, minEnd = 0, tempMinStart = 0;

        total = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            total += num;

            // Max Kadane’s
            if (curMax + num < num) {
                curMax = num;
                tempStart = i;
            } else {
                curMax += num;
            }

            if (curMax > maxSum) {
                maxSum = curMax;
                maxStart = tempStart;
                maxEnd = i;
            }

            // Min Kadane’s (for wrap-around)
            if (curMin + num > num) {
                curMin = num;
                tempMinStart = i;
            } else {
                curMin += num;
            }

            if (curMin < minSum) {
                minSum = curMin;
                minStart = tempMinStart;
                minEnd = i;
            }
        }

        // Edge case: all elements negative
        if (maxSum < 0) {
            return Arrays.asList(maxSum);
        }

        int wrapSum = total - minSum;

        // If wrapping gives better result
        if (wrapSum > maxSum) {
            List<Integer> wrappedSubarray = new ArrayList<>();

            // From end of min to start of array
            for (int i = minEnd + 1; i < nums.length; i++) {
                wrappedSubarray.add(nums[i]);
            }
            // From start of array to start of min
            for (int i = 0; i < minStart; i++) {
                wrappedSubarray.add(nums[i]);
            }
            wrappedSubarray.add(0, wrapSum); // add sum at index 0
            return wrappedSubarray;
        } else {
            // Return normal max subarray
            List<Integer> subarray = new ArrayList<>();
            for (int i = maxStart; i <= maxEnd; i++) {
                subarray.add(nums[i]);
            }
            subarray.add(0, maxSum); // add sum at index 0
            return subarray;
        }
    }

}
