package twoPointers;

public class TwoSumSorted {
	  public static int[] twoSum(int[] nums, int target) {
	        int left = 0;                  // Pointer at the start
	        int right = nums.length - 1;    // Pointer at the end

	        while (left < right) {
	            int sum = nums[left] + nums[right];

	            if (sum == target) {
	                return new int[]{nums[left], nums[right]}; // Found the pair
	            } else if (sum < target) {
	                left++;  // Move left pointer to increase sum
	            } else {
	                right--; // Move right pointer to decrease sum
	            }
	        }

	        return new int[]{-1, -1}; // Return if no valid pair found
	    }
}
