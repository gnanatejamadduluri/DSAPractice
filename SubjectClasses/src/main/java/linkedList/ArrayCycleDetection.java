package linkedList;

public class ArrayCycleDetection {
	public static boolean hasCycle(int[] nums) {
        int slow = 0;
        int fast = 0;

        while (true) {
            slow = nums[slow];              // move 1 step
            fast = nums[nums[fast]];        // move 2 steps

            if (slow == fast) return true;  // cycle found

            // If we go out of bounds, break
            if (slow >= nums.length || fast >= nums.length || nums[fast] >= nums.length) {
                return false;
            }
        }
    }
}
