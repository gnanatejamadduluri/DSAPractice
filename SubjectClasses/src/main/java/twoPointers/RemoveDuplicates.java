package twoPointers;

public class RemoveDuplicates {
	public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int uniqueIndex = 0; // Slow pointer

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) { 
                uniqueIndex++; 
                nums[uniqueIndex] = nums[i]; 
            }
        }
        return uniqueIndex + 1; // Length of unique elements
    }
}
