package kadanesAlgorithmMaxSubarraySum;
import java.util.*;
public class CircularKadaneWithIndices {
	public static class Result {
        public int maxSum;
        int startIndex;
        int endIndex;
        List<Integer> subarray;

        public Result(int maxSum, int startIndex, int endIndex, List<Integer> subarray) {
            this.maxSum = maxSum;
            this.startIndex = startIndex;
            this.endIndex = endIndex;
            this.subarray = subarray;
        }

        @Override
        public String toString() {
            return "Max Sum: " + maxSum +
                   "\nStart Index: " + startIndex +
                   "\nEnd Index: " + endIndex +
                   "\nSubarray: " + subarray;
        }
    }

    public static Result maxCircularSubarray(int[] nums) {
        int total = 0;

        int maxSum = nums[0], curMax = nums[0];
        int maxStart = 0, maxEnd = 0, tempStart = 0;

        int minSum = nums[0], curMin = nums[0];
        int minStart = 0, minEnd = 0, tempMinStart = 0;

        total = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            total += num;

            // Max subarray logic
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

            // Min subarray logic
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

        // All negative edge case
        if (maxSum < 0) {
            List<Integer> sub = Collections.singletonList(maxSum);
            return new Result(maxSum, -1, -1, sub);
        }

        int wrapSum = total - minSum;

        if (wrapSum > maxSum) {
            // Wrapped subarray: two parts
            List<Integer> wrapSub = new ArrayList<>();
            for (int i = minEnd + 1; i < nums.length; i++) {
                wrapSub.add(nums[i]);
            }
            for (int i = 0; i < minStart; i++) {
                wrapSub.add(nums[i]);
            }

            // Wrapped case: start is minEnd+1, end is minStart-1 (circular)
            int start = (minEnd + 1) % nums.length;
            int end = (minStart - 1 + nums.length) % nums.length;

            return new Result(wrapSum, start, end, wrapSub);
        } else {
            List<Integer> sub = new ArrayList<>();
            for (int i = maxStart; i <= maxEnd; i++) {
                sub.add(nums[i]);
            }
            return new Result(maxSum, maxStart, maxEnd, sub);
        }
    }
    
    // WITH RANDOM 
    public static int[] generateRandomArray(int size, int min, int max) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(max - min + 1) + min;
        }
        return arr;
    }
}
